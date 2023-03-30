
import java.util.Scanner;


public class Lista01Exe04_AlgoritmoGeometriaPlana_Quadrado{

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
    
        float lado = 0f;
        float Area = 0f;
        float Perimetro = 0f;

        lado = lerLado(lado);

        Perimetro = perimetro(lado);

        Area = area(lado);

        resposta(Perimetro,Area);

    }

    public static float lerLado(float x) {

        System.out.println("Digite o lado do quadrado: "); 
        x = LER.nextFloat();

        return x; 
    }

    public static float perimetro(float y) {

        y *= 4;

        return y; 
    }

    public static float area(float z) {

        z ^ z;

        return z;
    }

    public static void resposta(float x, float y) {

        System.out.printf("O perimetro do seu quadrado é: %.1f\n", x);
        System.out.printf("A área do seu quadrado é: %.1f\n", y);
    }
}