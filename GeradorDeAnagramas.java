import java.util.ArrayList;
import java.util.List;

public class GeradorDeAnagramas {

    /**
     * 
     * Gera as combinacoes de letras possiveis a partir de um grupo de letras
     * 
     * @param letras O input de letras
     * @return Retorna uma lista com todos os anagramas possiveis
     * @throws IllegalArgumentException Lanca excecao se a entrada nao for valida (vazia ou possuir caracteres nao alfabeticos).
     */
    public static List<String> gerarAnagramas(String letras) {
        // Validacao basica
        if (letras == null || letras.isEmpty()) {
            throw new IllegalArgumentException("Entrada invalida: conteudo vazio!");
        }
        if (!letras.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Entrada invalida: caracteres nao alfabeticos!");
        }

        List<String> anagramas = new ArrayList<>();
        gerarAnagramasHelper(letras.toCharArray(), 0, anagramas);
        return anagramas;
    }

    /**
     * Metodo auxiliar para gerar anagramas recursivamente usando backtracking
     *
     * @param letras Array de letras para combinar
     * @param indice Indice atual no array
     * @param anagramas Lista para armazenar os anagramas gerados
     */
    private static void gerarAnagramasHelper(char[] letras, int indice, List<String> anagramas) {
        if (indice == letras.length - 1) {
            anagramas.add




