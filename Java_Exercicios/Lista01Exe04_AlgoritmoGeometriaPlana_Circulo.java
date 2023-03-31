import java.util.Scanner;

public class Lista01Exe04_AlgoritmoGeometriaPlana_Circulo{

     final static Scanner LER = new Scanner(System.in); 
     public static void main(String[] args) { 
        

        float raio = 0f;
        float area = 0f;
        float p = 3.14f;

        area = calcArea(raio);

        comprimento = calcComprimento(raio);

        imprimirArea(area);
        imprimirComprimento(comprimento);

    }

  
    public static float lerRaio(float raio) {

        System.out.println("Diigite o raio da circunferência: "); 
        raio = LER.nextFloat(); 
        return raio;
    }

    
    public static float calcArea(float raio) {

        float area = 0f; 

        area = 3.14*(raio*raio);

        return area; 

    }

    public static float calcComprimento(float raio) {

        float comprimento = 0f;

        comprimento = 2*(pi*raio);

        return comprimento; 

    }

    
    public static void imprimirArea(float area) {
        System.out.println("A área do círculo é: " + area); 
    }

    public static void imprimirComprimento(float comprimento) {
        System.out.println("O comprimento da circunferência é: " + comprimento); 
    }
}