import java.util.Scanner;

public class bee{

  final static Scanner LER = new Scanner(System.in);
  public static void main(String[] args) {
    
    dizerOla();
    
    String nome=null;

    nome=lerNome(nome);
    imprimNome(nome);
  }

  public static void dizerOla(){
    System.out.println("SALVE FIOTE");
  }

  public static String lerNome(String nome){
    System.out.println("Digite seu nome: ");
    nome=LER.next();
    return nome;
  }

  public static void imprimNome(String nome){
    System.out.println("Seu nome é "+nome+", correto?");
  }
}