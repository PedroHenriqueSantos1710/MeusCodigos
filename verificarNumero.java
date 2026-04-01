
import java.util.Scanner;

public class verificarNumero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();


        if(num >= 0 ){
            System.out.println("O numero: (" + num + ") é positivo!");
        }else{
            System.out.println("O numero: " + num + " é negativo");
        }



    }
    
}
