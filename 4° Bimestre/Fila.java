import java.util.ArrayList;
import java.util.Scanner;

public class Pilha {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int escolha = 0;

        ArrayList<String> ingredientes = new ArrayList<String>();

        do {
            escolha = imprimirMenu();

            if (escolha == 0) {
                System.out.println("Até logo...!");
                break;
            }

            switch (escolha) {
                case 1:
                    adicionarIng(ingredientes);
                    break;
                case 2:
                    removerIng(ingredientes);
                    break;
                case 3:
                    mostrarIng(ingredientes);
                    break;
                case 4:
                    limparIng(ingredientes);
                    break;
                default:
                    break;
            }
        } while (escolha != 0);

    }

    public static int imprimirMenu() {

        int escolha = 0;

        System.out.println("SANDUICHE MAKER");
        System.out.println("");
        System.out.println("Opção 1 - Adicionar ingrediente");
        System.out.println("opcao 2 - Remover ingrediente");
        System.out.println("Opção 3 - Mostrar os ingredientes");
        System.out.println("Opção 4 - Remover todos os ingredientes");
        System.out.println("Opção 0 - Sair");

        escolha = lerEscolha(escolha);

        return escolha;
    }

    public static String lerIng() {
        String ingred = null;
        System.out.println("Digite o ingrediente: ");
        ingred = LER.next();
        return ingred;
    }

    public static int lerEscolha(int escolha) {
        escolha = LER.nextInt();
        return escolha;
    }

    public static void adicionarIng(ArrayList<String> ingredientes) {
        String ingrediente = null;
        ingrediente = lerIng();
        ingredientes.add(ingrediente);
    }

    public static void removerIng(ArrayList<String> ingredientes) {
        ingredientes.remove(0);
    }

    public static void mostrarIng(ArrayList<String> ingredientes) {
        System.out.println("");
        System.out.println("Seu Sanduiche esta assim: ");
        System.out.println(ingredientes);
        System.out.println("");
    }

    public static void limparIng(ArrayList<String> ingredientes) {
        System.out.println("");
        System.out.println("Sanduiche descartado!");
        ingredientes.clear();
        System.out.println("");
    }
}
