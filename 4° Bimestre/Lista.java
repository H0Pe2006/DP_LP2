import java.util.ArrayList;
import java.util.Scanner;

public class Fila {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        String ingred = null;
        int escolha = 0;

        System.out.println("SANDUICHE MAKER");
        System.out.println("");
        System.out.println("Opção 1 - Adicionar ingrediente");
        System.out.println("opcao 2 - Remover ingrediente");
        System.out.println("Opção 3 - Mostrar os ingredientes");
        System.out.println("Opção 4 - Remover todos os ingredientes");
        System.out.println("Opção 0 - Sair");
        escolha = lerEscolha(escolha);

        ArrayList<String> ingredientes = new ArrayList<String>();

        do{
        switch (escolha) {
            case 0:
                break;
            case 1:
                adicionarIng(ingredientes, ingred);
                break;
            case 2:
                removerIng(ingredientes, ingred);;
                break;
            case 3:
                mostrarIng(ingredientes);
                break;
            case 4:
                limparIng(ingredientes, ingred);
                break;
            default:
                break;
        }
    }while(escolha != 10);

    }
    public static String lerIng(String ingred){
        ingred = LER.next();
        return ingred;
    }
    public static int lerEscolha(int escolha){
        escolha = LER.nextInt();
        return escolha;
    }
    public static void adicionarIng(ArrayList<String> ingredientes, String ingred){
        ingredientes.add(lerIng(ingred));
    }
    public static void removerIng(ArrayList<String> ingredientes, String ingred){
        ingredientes.remove(0);
    }
    public static void mostrarIng(ArrayList<String> ingredientes){
        System.out.println(ingredientes);
    }
    public static void limparIng(ArrayList<String> ingredientes, String ingred){
        ingredientes.clear();
    }

}
