import java.util.Scanner;

public class EliminatoriasNatacao {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int idade = 0;

        idade = lerIdade(idade);

        imprimirCategoria(idade);
    }

    public static int lerIdade(int idade){
        System.out.println("Digite a idade do indivíduo: ");
        idade = LER.nextInt();
        return idade;
    }

    public static void imprimirCategoria(int idade){
        if(5<idade && idade<7){
            System.out.println("Infantil A");
        }else if(8<idade && idade<10){
            System.out.println("Infantil B");
        }else if(11<idade && idade<13){
            System.out.println("Juvenil A");
        }else if(14<idade && idade<17){
            System.out.println("Juvenil B");
        }else if(18<idade){
            System.out.println("Senior");
        }
    }
}