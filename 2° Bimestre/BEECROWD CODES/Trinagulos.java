import java.util.Scanner;

public class Main{

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args){
        double A = 0;
        double B = 0;
        double C = 0;

        A = lerA(A);
        B = lerB(B);
        C = lerC(C);

        String ClassificacaoNormal = determinarClassifNormal(A,B,C);
        String ClassificacaoEspecial = determinarClassifEspecial(A,B,C);
        imprimirClassifNormal(ClassificacaoNormal);
        imprimirClassifEspecial(ClassificacaoEspecial);
    }

    public static double lerA(double A){
        A = LER.nextDouble();
        return A;
    }

    public static double lerB(double B){
        B = LER.nextDouble();
        return B;
    }

    public static double lerC(double C){
        C = LER.nextDouble();
        return C;
    }

    public static String determinarClassifNormal(double A, double B, double C){

        String ClassificacaoNormal = null;

        if(A >= B+C){
            ClassificacaoNormal = "NAO FORMA TRIANGULO";
        }else if((A*A) == (B*B) + (C*C)){
            ClassificacaoNormal = "TRIANGULO RETANGULO";
        }else if((A*A) > (B*B) + (C*C)){
            ClassificacaoNormal = "TRIANGULO OBTUSANGULO";
        }else if((A*A) < (B*B) + (C*C)){
            ClassificacaoNormal = "TRIANGULO ACUTANGULO";
        }return ClassificacaoNormal;
    }

    public static String determinarClassifEspecial(double A, double B, double C){

        String ClassificacaoEspecial = null;

        
        if(A == B && A == C && B == A && B == C && C == B && C == A){
            ClassificacaoEspecial = "TRIANGULO EQUILATERO";
        }else if(A == B || A == C || B == A || B == C ||C == B || C == A){
            ClassificacaoEspecial = "TRIANGULO ISOSCELES";
        }return ClassificacaoEspecial;
    }

    public static void imprimirClassifNormal(String ClassificacaoNormal){
        System.out.println(ClassificacaoNormal);
    }

    public static void imprimirClassifEspecial(String ClassificacaoEspecial){
        System.out.println(ClassificacaoEspecial);
    }
}
