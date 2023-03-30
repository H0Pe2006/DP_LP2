import java.util.Scanner;

public class Lista01Exe03_AlgoritmoDolar {
    
    final static Scanner LER = new Scanner(System.in); 
    
    public static void main(String[] args) { 
       

        float real = 0f;
        float dolar = 0f;
        float conversao = 0f;

        real = lerReal(real);

        dolar = lerDolar(dolar);

        conversao = calcularConversao(real, dolar);
        
        result(conversao, real);
   }

   

   public static float lerReal(float real) {

        System.out.println("Digite o preço em Reais(R$): "); 
        real = LER.nextFloat(); 

        return real; 
    }

    public static float lerDolar(float dolar) {

        System.out.println("Digite o preço em dolar($): "); 
        dolar = LER.nextFloat(); 

        return dolar; 
    }


    public static float calcularConversao(float real, float dolar) {

        float conversao = 0f;
        
        conversao = real / dolar;

        return conversao; 

    }

    public static void result(float conversao,float real) {
        System.out.printf("O valor de R$ "+real+" para dolar é: %.2f%n", conversao); 
    }
}