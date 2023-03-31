import java.util.Scanner;

public class Lista01Exe04_AlgoritmoGeometriaPlana_Retangulo {

     final static Scanner LER = new Scanner(System.in); 
     public static void main(String[] args) { 
        

        float base = 0f;
        float altura = 0f;
        float area = 0f;
        float perimetro = 0f;

        base = lerBase(base);

 
        altura = lerAltura(altura);


        area = calcArea(base, altura);

        perimetro = calcPerimetro(base, altura);

        imprimirArea(area);

        imprimirPerimetro(perimetro);

    }

 
    public static float lerBase(float base) {

        System.out.println("Digite a base do retangulo: "); 
        base = LER.nextFloat(); 
        return base; 
    }

  
    public static float lerAltura(float altura) {

        System.out.println("Digite a altura do retangulo: "); 
        altura = LER.nextFloat(); 
        return altura;
    }

    
    public static float calcArea(float base, float altura) {

        float area = 0f; 

        area = base * altura;

        return area; 

    }

    public static float calcPerimetro(float base, float altura) {

        float perimetro = 0f; 

        perimetro = (2 *base) + (2*altura);

        return perimetro; 

    }

    
    public static void imprimirArea(float area) {
        System.out.println("A área do retangulo é: " + area);
    }

    public static void imprimirPerimetro(float perimetro) {
        System.out.println("O perímetro do retangulo é: " + perimetro);
    }
}