import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args){
        //DO-WHILE-LOOP
        Scanner sc = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Input a Number: ");
            number = sc.nextInt();
            System.out.println("here is your number: ");
            System.out.println(number);
        } while(number >= 0);

        System.out.println("The End");

    }
}
