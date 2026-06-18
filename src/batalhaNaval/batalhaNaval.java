public class batalhaNaval {

    public static void main(String[] args) {

        char[][] tabuleiroInicial = MetodosBatalha.inicializarTabuleiro();
        String titulo = "Tabuleiro Inicial";

        MetodosBatalha.exibirInstrucoesDefensor();
        MetodosBatalha.exibirTabuleiro(tabuleiroInicial, titulo);

    }
}