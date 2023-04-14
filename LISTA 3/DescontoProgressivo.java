import java.util.Scanner; // importação do pacote Scanner

public class DescontoProgressivo { // Classe do programa

    // Mecanismo responsável por gerenciar as entradas do teclado e colocar nas variáveis
    final static Scanner LER = new Scanner(System.in);

    // método principal do programa aqui que tudo inicia
    public static void main(String[] args) {


        // chamada e passagem do parâmetro para o método lerIdade
        String nome = lerNome(nome);
        Double precoProdut = lerPreco(precoProdut);
        int quantProdut = lerQuantidade(quantProdut);
        Double precoTotal = 0d;
 
        // chamada e passagem do parâmetro para o método imprimirClasseEleitoral
        imprimirPreco(precoTotal);
        descontProdut(precoTotal, quantProdut);

    }

    // Definição do método lerIdade que recebe como parâmetro a variável idade e retorna ela com o valor digitado
    public static String lerNome(String nome) {

        System.out.println("Digite o nome do produto: "); // Mensagem para o usuário
        nome = LER.next(); // LER pega o próximo int do teclado para colocar na variável idade
        return nome;
    }

    // Definição do método classificarEleitor que recebe como parâmetro a idade e retorna a string classe eleitoral
    public static double lerPreco(double precoProdut) {
        System.out.println("Digite o preço do produto: ");
        precoProdut = LER.nextDouble();
        return precoProdut;
    }

    public static int lerQuantidade(int quantProdut){
        System.out.println("Digite a quantidade comprada: "); // Mensagem para o usuário
        quantProdut = LER.nextInt(); // LER pega o próximo int do teclado para colocar na variável idade
        return quantProdut;
    } 

    public static void precoTotal(int quantProdut, double precoProdut){
        double precoTotal = quantProdut * precoProdut;
        System.out.println("O preço total sem o desconto foi de: "+precoTotal);
    } 

    public static Double totalPagar(double precoTotal, double descont){
        Double totalPagar= precoTotal * descont;
        System.out.println("O preço total sem o desconto foi de: "+precoTotal);
        return totalPagar;
    }

    public static Double descontProdut(int quantProdut, Double precoTotal, Double Descont){
        if(quantProdut <= 5){
            Descont = (precoTotal * 0.02);
        }else if(quantProdut > 5){
            Descont = (precoTotal * 0.03);
        }else if(quantProdut > 10){
            Descont = (precoTotal * 0.05);
        }
        return Descont;
    }

    public static void imprimirPreco
}
