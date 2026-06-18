public class MetodosBatalha {

    public static int tamanho = 10;
    public static char agua = '~';
    public static char navio = 'N';
    public static char acerto = 'X';
    public static char erro = 'O';

    public static char[][] inicializarTabuleiro() {
        char[][] tabuleiroInicial = new char[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                tabuleiroInicial[i][j] = agua;
            }
        }

        return tabuleiroInicial;
    }

    public static void exibirInstrucoesDefensor() {
        System.out.println("-- Instruções do Defensor --");
        System.out.println("- Deve-se usar as coordenadas para posicionar seus navios;");
        System.out.println("Você possui os seguintes navios:");
        System.out.println("- 1 Porta-Aviões de tamanho 4;");
        System.out.println("- 1 Fragata de tamanho 3;");
        System.out.println("- 3 Submarinos de tamanho 2;");
        System.out.println("- 3 Botes de tamanho 1;");
        System.out.println("- Os navios podem ser posicionados na vertical, horizontal ou diagonal.");
    }

    public static void exibirTabuleiro(char[][] tabuleiro, String titulo) {
        System.out.println("\n== " + titulo + " ==");

        // Cabeçalho das colunas
        System.out.print("  ");
        for (int j = 0; j < tamanho; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Linhas do tabuleiro
        for (int i = 0; i < tamanho; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tamanho; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
}