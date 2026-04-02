import java.util.Scanner;

public class imparOrpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        if(num % 2 == 0 ){
            System.out.println(num + " é par!");
        }else{
            System.out.println(num + " é ímpar!");
        }


    }
}
