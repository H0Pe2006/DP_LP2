import java.util.Scanner; // importação do pacote Scanner

public class DescontoProgressivo { // Classe do programa

    // Mecanismo responsável por gerenciar as entradas do teclado e colocar nas variáveis
    final static Scanner LER = new Scanner(System.in);

    // método principal do programa aqui que tudo inicia
    public static void main(String[] args) {


        // chamada e passagem do parâmetro para o método lerIdade
        String nome = lerNome(nome);
        float precoProdut = lerPreco(precoProdut);
        int quantProdut = lerQuantidade(quantProdut);

        // chamada e passagem do parâmetro para o método imprimirClasseEleitoral
        imprimirPreco(precoTotal);
        descontProdut(precoTotal, quantProdut);

    }

    // Definição do método lerIdade que recebe como parâmetro a variável idade e retorna ela com o valor digitado
    public static String lerNome(String nome) {

        System.out.println("Digite o nome do produto: "); // Mensagem para o usuário
        nome = LER.next(); // LER pega o próximo int do teclado para colocar na variável idade

    }

    // Definição do método classificarEleitor que recebe como parâmetro a idade e retorna a string classe eleitoral
    public static Float lerPreco(float precoProdut) {
        System.out.println("Digite o preço do produto: ");
        precoProdut = LER.nextFloat();
        return precoProdut;
    }

    public static int lerQuantidade(int quantProdut){
        System.out.println("Digite a quantidade comprada: "); // Mensagem para o usuário
        quantProdut = LER.nextInt(); // LER pega o próximo int do teclado para colocar na variável idade
        return quantProdut;
    } 

    public static void precoTotal(int quantProdut, float precoProdut){
        Float precoTotal = quantProdut * precoProdut;
        System.out.println("O preço total sem o desconto foi de: "+precoTotal);
    } 

    public static void totalPagar(float precoTotal, float descont){
        Float totalPagar= precoTotal * descont;
        System.out.println("O preço total sem o desconto foi de: "+precoTotal);
    }

    public static float descont(int quantProdut, float precoTotal){
        if(quantProdut <= 5){
            float descont = (precoTotal * 0.02);
            return descont;
        }if(quantProdut > 5){
            float descont = (precoTotal * 0.03);
            return descont;
        }if(quantProdut > 10){
            float descont = (precoTotal * 0.05);
            return descont;
        }
    }
}
