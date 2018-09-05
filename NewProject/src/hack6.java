import java.util.*;
public class hack6 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if(n%2==1){
            System.out.print("Weird");
        }
        else if(n%2==0 && n>=2 && n<=5){
            System.out.print("Not Weird");
        }
        else if(n%2==0 && n>=6 && n<=20) System.out.print("Weird");
        else if(n>20) System.out.print("Not Weird");


        // https://www.hackerrank.com/challenges/java-if-else/problem
    }
}
