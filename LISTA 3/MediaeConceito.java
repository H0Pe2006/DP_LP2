import java.util.Scanner;

public class MediaeConceito {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args){
        int codigoIdent = 0;
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;

        codigoIdent = lerCod(codigoIdent);
        nota1 = lerNota1(nota1);
        nota2 = lerNota2(nota2);
        nota3 = lerNota3(nota3);
    }

    public static int lerCod(int codigoIdent){
        System.out.println("Digite seu n° de identificação: ");
        codigoIdent = LER.nextInt();
        return codigoIdent;
    }

    public static double lerNota1(double nota1){
        System.out.println("Digite o valor da sua primeira nota: ");
        nota1 = LER.nextDouble();
        return nota1;
    }

    public static double lerNota2(double nota2){
        System.out.println("Digite o valor da sua segunda nota: ");
        nota2 = LER.nextDouble();
        return nota2;
    }

    public static double lerNota3(double nota3){
        System.out.println("Digite o valor da sua terceira nota: ");
        nota3 = LER.nextDouble();
        return nota3;
    }


}