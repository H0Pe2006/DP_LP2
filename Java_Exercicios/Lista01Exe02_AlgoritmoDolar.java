public class Lista01Exe02_AlgoritmoDolar {
    
    final static Scanner LER = new Scanner(System.in); 
    public static void main(String[] args) { 
       

       float real = 0f;
       float dolar = 0f;

       real = lerReal(real);


       dolar = lerDolar(dolar);

       ImprimirResult(result);

   }

   
 
   public static float lerReal(float real) {

        System.out.println("Digite a base:"); 
        real = LER.nextFloat(); 

        return base; 
    }


    public static float lerAltura(float altura) {

        System.out.println("Agora digite a altura:"); 
        altura = LER.nextFloat(); 
        return altura;
    }


    public static float calcularArea(float base, float altura) {

    float area = 0f; 

    area = (base * altura) / 2; 

    return area; 

    }


    public static void imprimirArea(float area) {
    System.out.println("A área do seu triangulo é = " + area); 
    }
}
