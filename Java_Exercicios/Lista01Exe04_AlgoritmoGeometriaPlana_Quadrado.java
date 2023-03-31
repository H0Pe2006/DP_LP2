import java.util.Scanner;

public class Lista01Exe04_AlgoritmoGeometriaPlana_Quadrado {

     final static Scanner LER = new Scanner(System.in); 
     public static void main(String[] args) { 
        

        float lado = 0f;
        float perimetro = 0f;
        float area = 0f;

        lado = lerLado(lado);

        area = calcArea(lado);

        perimetro = calcPerimetro(lado);

        imprimirArea(area);

        imprimirPerimetro(perimetro);

    }

 
    public static float lerLado(float lado) {

        System.out.println("Digite a medida do lado do quadrado: "); 
        lado = LER.nextFloat(); 

        return lado; 
    }

    
    public static float calcArea(float lado) {

        float area = 0f; 

        area = (lado*lado);

        return area; 

    }

    public static float calcPerimetro(float lado) {

        float perimetro = 0f; 

        perimetro = lado * 4;

        return perimetro;

    }

    
    public static void imprimirArea(float area) {
        System.out.println("A área do quadrado é: " + area); 
    }

    public static void imprimirPerimetro(float perimetro) {
        System.out.printf("O perímetro do quadrado é: %.1f %n", perimetro); 
    }
}