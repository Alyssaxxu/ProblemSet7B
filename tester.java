
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class tester
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to see all the prime numbers");
        String response = input.nextLine();
        int num =Integer.parseInt(response);
        System.out.println(Driver.eratosthenes(num));

        System.out.println( "Check this num:");
        String ans = input.nextLine();
        int n = Integer.parseInt(ans);
        Driver.goldbachConjecture(n);

        System.out.println("ADD first num:");
        String answer1 = input.nextLine();
        int x = Integer.parseInt(answer1);
        System.out.println("ADD second num:");
        String answer2 = input.nextLine();
        int y = Integer.parseInt(answer2);
        Driver.bigInts(x,y);

    }
}
