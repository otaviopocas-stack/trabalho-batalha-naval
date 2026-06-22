import java.util.Scanner;

public class MetodosBatalha {

    public static int tamanho = 10;
    public static char agua = '~';
    public static char navio = 'N';
    public static char acerto = 'X';
    public static char erro = 'O';
    public static Scanner leitura = new Scanner(System.in);
    public static int totalCasasNavio = 16;
    public static int limiteTentativas = 30;
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
        System.out.println("- Informe linha e coluna inicial do navio;");
        System.out.println("- Escolha uma direção para o navio:");
        System.out.println("  H = Horizontal --");
        System.out.println("  V = Vertical |");
        System.out.println("  D = Diagonal Principal");
        System.out.println("  S = Diagonal Secundária /");
        System.out.println();
        System.out.println("Você possui os seguintes navios:");
        System.out.println("- 1 Porta-Aviões de tamanho 4;");
        System.out.println("- 1 Fragata de tamanho 3;");
        System.out.println("- 3 Submarinos de tamanho 2;");
        System.out.println("- 3 Botes de tamanho 1;");
        System.out.println("- Os navios podem ser posicionados na vertical, horizontal, diagonal principal ou diagonal secundária.");
        System.out.println("-Só é escolhida a posição inicial, após vai ser somada sempre 1 posição dependendo do tamanho do Navio");
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

    public static boolean posicionarNavio(char[][] tabuleiro, int linha, int coluna, int tamanhoNavio, char direcao) {

    // Verificação das posições
    for (int i = 0; i < tamanhoNavio; i++) {

        int novaLinha = linha;
        int novaColuna = coluna;

        if (direcao == 'H' || direcao == 'h') {
            novaColuna = coluna + i;
        }
        else if (direcao == 'V' || direcao == 'v') {
            novaLinha = linha + i;
        }
        else if (direcao == 'D' || direcao == 'd') {
            novaLinha = linha + i;
            novaColuna = coluna + i;
        }
        else if (direcao == 'S' || direcao == 's') {
            novaLinha = linha + i;
            novaColuna = coluna - i;
        }
        else {
            System.out.println("Direção inválida.");
            return false;
        }

        // Verificar se saiu do tabuleiro
        if (novaLinha >= tamanho || novaColuna >= tamanho || novaColuna < 0 || novaLinha < 0) {
            System.out.println("O navio ultrapassa o limite do tabuleiro.");
            return false;
        }

        // Verificar sobreposição
        if (tabuleiro[novaLinha][novaColuna] != agua) {
            System.out.println("Já existe um navio nessa posição.");
            return false;
        }
    }

    // Posiciona o navio
    for (int i = 0; i < tamanhoNavio; i++) {

        int novaLinha = linha;
        int novaColuna = coluna;

    if (direcao == 'H' || direcao == 'h') {
        novaColuna = coluna + i;
    }
    else if (direcao == 'V' || direcao == 'v') {
        novaLinha = linha + i;
    }
    else if (direcao == 'D' || direcao == 'd') {
        novaLinha = linha + i;
        novaColuna = coluna + i;
    }
    else if (direcao == 'S' || direcao == 's') {
        novaLinha = linha + i;
        novaColuna = coluna - i;
    }

        tabuleiro[novaLinha][novaColuna] = navio;
    }

    System.out.println("Navio posicionado com sucesso!");
    return true;
    }

    public static void posicionarPortaAvioes(char[][] tabuleiro) {
        boolean resultado = false;

        while (resultado == false) {
            System.out.println("\nPosicionando Porta-Aviões (Tamanho 4)");

            System.out.print("Linha: ");
            int linha = leitura.nextInt();

            System.out.print("Coluna: ");
            int coluna = leitura.nextInt();

            System.out.print("Direção (H/V/D/S): ");
            char direcao = leitura.next().charAt(0);

            resultado = posicionarNavio(tabuleiro, linha, coluna, 4, direcao);
            atualizarTabuleiroDefensor(tabuleiro, resultado);
        }
    }

    public static void posicionarFragata(char[][] tabuleiro) {
        boolean resultado = false;

        while (resultado == false) {

            System.out.println("\nPosicionando Fragata (Tamanho 3)");

            System.out.print("Linha: ");
            int linha = leitura.nextInt();

            System.out.print("Coluna: ");
            int coluna = leitura.nextInt();

            System.out.print("Direção (H/V/D/S): ");
            char direcao = leitura.next().charAt(0);

            resultado = posicionarNavio(tabuleiro, linha, coluna, 3, direcao);
            atualizarTabuleiroDefensor(tabuleiro, resultado);
    }
}

    public static void posicionarSubmarino(char[][] tabuleiro, int numero) {
        boolean resultado = false;

        while (resultado == false) {

            System.out.println("\nPosicionando Submarino " + numero + " (Tamanho 2)");

            System.out.print("Linha: ");
            int linha = leitura.nextInt();

            System.out.print("Coluna: ");
            int coluna = leitura.nextInt();

            System.out.print("Direção (H/V/D/S): ");
            char direcao = leitura.next().charAt(0);

            resultado = posicionarNavio(tabuleiro, linha, coluna, 2, direcao);
            atualizarTabuleiroDefensor(tabuleiro, resultado);
    }
}

    public static void posicionarBote(char[][] tabuleiro, int numero) {
        boolean resultado = false;

        while (resultado == false) {
            System.out.println("\nPosicionando Bote " + numero + " (Tamanho 1)");

            System.out.print("Linha: ");
            int linha = leitura.nextInt();

            System.out.print("Coluna: ");
            int coluna = leitura.nextInt();

            System.out.print("Direção (H/V/D/S): ");
            char direcao = leitura.next().charAt(0);

            resultado = posicionarNavio(tabuleiro, linha, coluna, 1, direcao);
            atualizarTabuleiroDefensor(tabuleiro, resultado);
        }
    }

    public static void atualizarTabuleiroDefensor(char[][] tabuleiro, boolean resultado) {
        if (resultado == true) {
            exibirTabuleiro(tabuleiro, "Tabuleiro do Defensor");
        }
    }  
    public static boolean realizarAtaque(char[][] tabuleiroDefensor, char[][] tabuleiroAtaque, int linha, int coluna) {

         if (linha < 0 || linha >= tamanho || coluna < 0 || coluna >= tamanho) {
        System.out.println("Coordenada fora do tabuleiro! Tente Novamente.");
        return false;
    }

         if (tabuleiroAtaque[linha][coluna] == acerto || tabuleiroAtaque[linha][coluna] == erro) {
        System.out.println("Você já atacou essa posição! Escolha outra.");
        return false;
    }

    if (tabuleiroDefensor[linha][coluna] == navio) {
        tabuleiroAtaque[linha][coluna] = acerto;
        tabuleiroDefensor[linha][coluna] = acerto;
        System.out.println("ACERTOU!");
        return true;
    } else {
        tabuleiroAtaque[linha][coluna] = erro;
        System.out.println("ERROU!");
        return false;
    }
}
    public static int contarAcertos(char[][] tabuleiroAtaque) {
    int acertos = 0;
    for (int i = 0; i < tamanho; i++) {
        for (int j = 0; j < tamanho; j++) {
            if (tabuleiroAtaque[i][j] == acerto) {
                acertos++;
            }
        }
    }
    return acertos;
      }
      public static boolean verificarFimDeJogo(char[][] tabuleiroAtaque, int tentativasUsadas) {
    int acertos = contarAcertos(tabuleiroAtaque);

    if (acertos >= totalCasasNavio) {
        System.out.println("\n=== FIM DE JOGO ===");
        System.out.println("O Atacante venceu! Todos os navios foram destruídos em " + tentativasUsadas + " tentativas.");
        return true;
    }

    if (tentativasUsadas >= limiteTentativas) {
        System.out.println("\n=== FIM DE JOGO ===");
        System.out.println("O Criador venceu! O Atacante atingiu o limite de " + limiteTentativas + " tentativas.");
        System.out.println("Navios restantes: " + (totalCasasNavio - acertos) + " casas.");
        return true;
    }

    return false;
    }
    public static void exibirInstrucoesAtacante() {
    System.out.println("\n-- Instruções do Atacante --");
    System.out.println("- Informe a linha e a coluna que deseja atacar;");
    System.out.println("- Coordenadas devem estar entre 0 e " + (tamanho - 1) + ";");
    System.out.println("- Você tem no máximo " + limiteTentativas + " tentativas;");
    System.out.println("- Destrua todos os navios do Criador para vencer!");
  }
  
}


    