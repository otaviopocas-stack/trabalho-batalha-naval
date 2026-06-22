public class batalhaNaval { 
    public static void main(String[] args) {

        char[][] tabuleiroDefensor = MetodosBatalha.inicializarTabuleiro();
        char[][] tabuleiroAtaque = MetodosBatalha.inicializarTabuleiro();

        MetodosBatalha.exibirInstrucoesDefensor();
        MetodosBatalha.posicionarPortaAvioes(tabuleiroDefensor);
        MetodosBatalha.posicionarFragata(tabuleiroDefensor);
        MetodosBatalha.posicionarSubmarino(tabuleiroDefensor, 1);
        MetodosBatalha.posicionarSubmarino(tabuleiroDefensor, 2);
        MetodosBatalha.posicionarSubmarino(tabuleiroDefensor, 3);
        MetodosBatalha.posicionarBote(tabuleiroDefensor, 1);
        MetodosBatalha.posicionarBote(tabuleiroDefensor, 2);
        MetodosBatalha.posicionarBote(tabuleiroDefensor, 3);

        System.out.println("\nTodos os navios foram posicionados!");
        System.out.println("\nO tabuleiro real será ocultado agora. Boa sorte, Atacante!");

        MetodosBatalha.exibirInstrucoesAtacante();

        int tentativas = 0;
        boolean fimDeJogo = false;

        while (!fimDeJogo) {
            MetodosBatalha.exibirTabuleiro(tabuleiroAtaque, "Tabuleiro de Ataques");

            System.out.print("\nLinha do ataque: ");
            int linha = MetodosBatalha.leitura.nextInt();

            System.out.print("Coluna do ataque: ");
            int coluna = MetodosBatalha.leitura.nextInt();

            MetodosBatalha.realizarAtaque(tabuleiroDefensor, tabuleiroAtaque, linha, coluna);

            if (linha >= 0 && linha < MetodosBatalha.tamanho &&
                coluna >= 0 && coluna < MetodosBatalha.tamanho) {
                tentativas++;
            }

            fimDeJogo = MetodosBatalha.verificarFimDeJogo(tabuleiroAtaque, tentativas);
        }

        MetodosBatalha.exibirTabuleiro(tabuleiroAtaque, "Tabuleiro Final de Ataques");
        MetodosBatalha.exibirTabuleiro(tabuleiroDefensor, "Tabuleiro Final do Defensor (revelado)");
    }
}