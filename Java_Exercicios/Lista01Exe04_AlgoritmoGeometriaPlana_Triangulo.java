import java.util.Scanner;

public class Lista01Exe04_AlgoritmoGeometriaPlana_Triangulo {

     final static Scanner LER = new Scanner(System.in); 
     public static void main(String[] args) { 
        

        float base = 0f;
        float altura = 0f;
        float area = 0f;
        float perimetro = 0f;
        float ladob = 0f;
        float ladoc = 0f;

        base = lerBase(base);

        altura = lerAltura(altura);

        ladob = lerLadoB(ladob);

        ladoc = lerLadoC(ladoc);

        area = calcArea(base, altura);

        perimetro = calcPerimetro(base, ladob, ladoc);

        imprimirArea(area);

        imprimirPerimetro(perimetro);

    }

 
    public static float lerBase(float base) {

        System.out.println("Digite a base do Trinagulo: "); 
        base = LER.nextFloat(); 

        return base; 
    }

  
    public static float lerAltura(float altura) {

        System.out.println("Digite a altura do triangulo: "); 
        altura = LER.nextFloat(); 
        return altura;
    }

    public static float lerLadoB(float ladob){
        System.out.println("Digite o primeiro lado do triangulo: "); 
        ladob = LER.nextFloat(); 
        return ladob;
    }

    public static float lerLadoC(float ladoc){
        System.out.println("Digite o segundo lado do triangulo: "); 
        ladoc = LER.nextFloat(); 
        return ladoc;
    }
    
    public static float calcArea(float base, float altura) {

        float area = 0f; 

        area = (base * altura) / 2;

        return area; 

    }

    public static float calcPerimetro(float base, float ladob, float ladoc) {

        float perimetro = 0f; 

        perimetro = base+ladob+ladoc;

        return perimetro; 

    }

    
    public static void imprimirArea(float area) {
        System.out.println("A área do triangulo é: " + area); 
    }

    public static void imprimirPerimetro(float perimetro) {
        System.out.println("O perímetro do triangulo é: " + perimetro); 
    }
}