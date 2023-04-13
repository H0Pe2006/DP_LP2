import java.util.Scanner; // importação do pacote Scanner

public class IMC {// Classe do programa
    
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {// método principal do programa aqui que tudo inicia

        // Declaração das variaveis
        double peso = 0f;
        double altura = 0f;

        // chamada e passagem do parâmetro para o método lerPeso
        peso = lerPeso(peso);

        // chamada e passagem do parâmetro para o método lerAltura
        altura = lerAltura(altura);

        // chamada e passagem do parâmetro para o método calcIMC
        double imc = calcIMC(altura,peso);

        // chamada e passagem do parâmetro para o método determinarImc e Classificacao
        determinarImc(imc);
        Classificacao(imc);
    }

    /*Definição do método lerAltura que recebe como parâmetro a variável altura e retorna
    ela com o valor digitado pelo usuário*/
    public static double lerAltura(double altura){
        System.out.println("Digite sua altura: ");
        altura = LER.nextDouble();// LER pega o próximo double do teclado para colocar na variável altura

        return altura;
    }

    /*Definição do método lerPeso que recebe como parâmetro a variável peso e retorna
    ela com o valor digitado pelo usuário*/
    public static double lerPeso(double peso){
        System.out.println("Digite seu peso ");
        peso = LER.nextDouble();// LER pega o próximo double do teclado para colocar na variável peso

        return peso;
    }

    public static double calcIMC(double altura, double peso){
        double imc = peso / (Math.pow(altura, 2)); // calcula o imc
        return imc;
    }

    /*Definição do método determinarImc que recebe como parâmetro imc,
    e não tem retorno (o retorno é void/vazio)*/
    public static void determinarImc(double imc){
        System.out.printf("O seu IMC é: %.2f\n", imc);
    }

    // Define a classificação atraves do imc resultado
    public static void Classificacao(double imc){
        if(imc <= 20){
            System.out.println("Sua classificação é: Abaixo do Peso");
        }else if(25 >= imc && imc >= 20){
            System.out.println("Sua classificação é: Peso Normal");
        }else if(30 >= imc && imc >= 25){
            System.out.println("Sua classificação é: Sobre Peso");
        }else if(40 >= imc && imc >= 30){
            System.out.println("Sua classificação é: Obeso");
        }else if(imc >= 40){
            System.out.println("Sua classificação é: Obeso Mórbido");
        }
    }
}