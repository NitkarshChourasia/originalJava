package Edureka;
import java.util.Scanner;
public class Nitkarsh {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of entered number is: "+factorial);
        System.out.println("I love everything, fire spreading all around me, It's hard to believe and that's alright")
    }
    static int fact(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
        output = fact(n-1)* n;
        return output;
    }
}
