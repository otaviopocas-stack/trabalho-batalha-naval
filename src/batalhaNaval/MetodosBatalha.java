
public class MetodosBatalha{

    public static int tamanho = 10;
    public static char agua = '~';
    public static char navio = 'N';
    public static char acerto = 'X';
    public static char erro = 'O';
        
    public static void inicializarTabuleiro() {
        char[][] tabuleiroInicial = new char[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                tabuleiroInicial[tamanho][tamanho] = agua;
            }
            
        }
    }
    public static void exibirInstrucoesDefensor(){
        System.out.println("-- Instruções do Defensor --");
        System.out.println("-Deve-se usar as coordenadas para posionar seus Navios;");
        System.out.println("Você possui os seguintes Navios:");
        System.out.println("-1 Porta Aviões de tamanho 4;");
        System.out.println("-1 Fragata de tamanho 3;");
        System.out.println("-3 submarinos de tamanho 2;");
        System.out.println("-3 botes de tamanho 1;");
        System.out.println("--Os Navios podem ser posicionados na vertical, horizontal ou diagonal.");
    }
    public static void exibirTabuleiro(char[][] tabuleiro, String titulo){
        System.out.println(" == " + titulo + " == ");
        for (int j = 0; j < tamanho; j++) {
        }
        System.out.println();

        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++) {
                System.out.println(tabuleiro[i][j]);
            }
        }
    }
}