import java.util.Scanner;

public class votar {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite Sua Idade: ");
      int idade = sc.nextInt();

      if(idade >= 18){
        System.out.println("Maior de idade! Pode votar!");
      }else{
        System.out.println("Menor de idade! Não pode votar!");
      }
        

    }
}
