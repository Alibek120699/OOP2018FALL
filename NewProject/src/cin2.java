import java.util.Scanner;
public class cin2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("The next number for the number " + n + " is " + (n+1) + ".");
        System.out.println("The previous number for the number " + n + " is " + (n-1) + ".");
    }
}
