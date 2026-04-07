import java.util.Scanner;

public class SomaNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int par;
        int num1, num2, num3, num4, num5;

           System.out.println("Digite 5 numeros: ");
           num1 = sc.nextInt();
           System.out.println("Next");
           num2 = sc.nextInt();
           System.out.println("Next");
           num3 = sc.nextInt();
           System.out.println("Next"); 
           num4 = sc.nextInt();
           System.out.println("Next");
           num5 = sc.nextInt();  
        


        if ( num1 % 2 == 0 ) {
            System.out.println("Numero: " + num1 + " é par" );
        }else{
            System.out.println("Numero: " + num1 + " é impar");     
        }if (num2  % 2 == 0) {
            System.out.println("Numero: " + num2 + " é par" );
        }else{
            System.out.println("Numero: " + num2 + " é impar");
        }if (num3 % 2 == 0) {
            System.out.println("Numero: " + num3 + " é par" );
        }else{
            System.out.println("Numero: " + num3 + " é impar");
        }if (num4 % 2 == 0) {
            System.out.println("Numero: " + num4 + " é par" );
        }else{
            System.out.println("Numero: " + num4 + " é impar");
        }if (num5 % 2 == 0) {
            System.out.println("Numero: " + num5 + " é par" );
        }else{
            System.out.println("Numero: " + num5 + " é impar");
        }
        
       
        

    }
}
