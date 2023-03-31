import java.util.Scanner;

public class Lista01Exe04_AlgoritmoGeometriaPlana_TrianguloEquilatero {

     final static Scanner LER = new Scanner(System.in); 
     public static void main(String[] args) { 
        
        float altura = 0f;
        float area = 0f;
        double perimetro = 0f;
        float lado = 0f;
        altura = lerAltura(altura);

        lado = lerLado(lado);

        area = calcArea(lado);

        perimetro = calcPerimetro(lado);

        imprimirArea(area);

        imprimirPerimetro(perimetro);

    }

  
    public static float lerAltura(float altura) {

        System.out.println("Digite a altura do triangulo: "); 
        altura = LER.nextFloat(); 
        return altura;
    }

    public static float lerLado(float lado){
        System.out.println("Digite o lado do triangulo: "); 
        lado = LER.nextFloat(); 
        return lado;
    }
    
    public static float calcArea(float lado) {

        float area = 0f; 
        float raiz3 = 1.74f;

        area = ((lado*lado) * raiz3) / 4;

        return area; 

    }

    public static float calcPerimetro(float lado) {

        float perimetro = 0;

        perimetro = 3*lado;

        return perimetro; 

    }

    
    public static void imprimirArea(float area) {
        System.out.printf("A área do triangulo é:  %.2f %n", area); 
    }

    public static void imprimirPerimetro(double perimetro) {
        System.out.printf("O perímetro do triangulo é:  %.2f %n", perimetro); 
    }
}