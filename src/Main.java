import java.util.Scanner;
public class Main {

    //exponentiation =üs alma
    //base= taban
    //exponent = üs değer
    static int exponentiation(int base,int exponent)
    {
        if (exponent==0)
            return 1;
        else if(base==1)
            return 1;
        else
            return base * exponentiation(base, exponent-1);

    }
    public static void main(String[] args) {
       int number1 , number2 ;
        Scanner input= new Scanner(System.in);
        System.out.print("Taban değerini girin: ");
        number1=input.nextInt();

        System.out.print("Üs değerini girin: ");
        number2=input.nextInt();

        System.out.println("Sonuç: "+exponentiation(number1,number2));
    }
}