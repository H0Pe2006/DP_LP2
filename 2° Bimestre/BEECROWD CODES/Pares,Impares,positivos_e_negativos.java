import java.util.Scanner;

public class Main {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int x = 0;
        int i = 0;
        int pares = 0;
        int impares = 0;
        int negativos = 0;
        int positivos = 0;
        do{
            x = lerX(x);
            if(par(x)){
                pares++;
            }else if(impar(x)){
                impares++;
            }else if(negativo(x)){
                negativos++;
            }else if(positivo(x)){
                positivos++;
            }
            i++;
        }while(i<5);

        imprimirPares(pares);
        imprimirImpares(impares);
        imprimirPositivos(positivos);
        imprimirNegativos(negativos);
    }

    public static int lerX(int x) {
        
        x = LER.nextInt();
        return x;
        
    }

    public static boolean par(int x){
        if(x%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean impar(int x){
        if(x%2==1){
            return true;
        }else{
            return false;
        }
    } 

    public static boolean positivo(int x){
        if(x>0){
            return true;
        }else{
            return false;
        }
    } 

    public static boolean negativo(int x){
        if(x<0){
            return true;
        }else{
            return false;
        }
    } 

    public static void imprimirPares(int pares){
        System.out.println(pares);
    }

    public static void imprimirImpares(int impares){
        System.out.println(impares);
    }

    public static void imprimirPositivos(int positivos){
        System.out.println(positivos);
    }

    public static void imprimirNegativos(int negativos){
        System.out.println(negativos);
    }
}
