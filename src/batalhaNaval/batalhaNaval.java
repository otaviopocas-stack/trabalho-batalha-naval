public class batalhaNaval { 
public static void main(String[] args) {

    char[][] tabuleiroDefensor = MetodosBatalha.inicializarTabuleiro();

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
    }
}