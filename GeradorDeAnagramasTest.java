import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GeradorDeAnagramasTest {

    @Test
    void testGerarAnagramas() {
        // Caso de teste 1: Entrada normal
        List<String> resultado1 = GeradorDeAnagramas.gerarAnagramas("abc");
        assertEquals(6, resultado1.size());
        assertTrue(resultado1.contains("abc"));
        assertTrue(resultado1.contains("acb"));
        assertTrue(resultado1.contains("bac"));
        assertTrue(resultado1.contains("bca"));
        assertTrue(resultado1.contains("cab"));
        assertTrue(resultado1.contains("cba"));

        // Caso de teste 2: Entrada com uma unica letra
        List<String> resultado2 = GeradorDeAnagramas.gerarAnagramas("a");
        assertEquals(1, resultado2.size());
        assertTrue(resultado2.contains("a"));

        // Caso de teste 3: Entrada vazia (deve lancar uma excecao)
        assertThrows(IllegalArgumentException.class, () -> {
            GeradorDeAnagramas.gerarAnagramas("");
        });

        // Caso de teste 4: Entrada com caracteres nao alfabeticos (deve lancar uma excecao)
        assertThrows(IllegalArgumentException.class, () -> {
            GeradorDeAnagramas.gerarAnagramas("a1b");
        });
    }
}