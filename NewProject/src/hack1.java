import java.util.Scanner;
import java.lang.String;
public class hack1 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        String a = inp.next();
        String b = inp.next();
        System.out.println(a.length() + b.length());
        int n = Math.min(a.length(), b.length());
        char [] sa = a.toCharArray();
        char [] sb = b.toCharArray();
        boolean done = false;
        for(int i=0; i<n; i++){
            if(sa[i]<sb[i]){
                System.out.println("No");
                done = true;
                break;
            }
            else if(sa[i]>sb[i]){
                System.out.println("Yes");
                done = true;
                break;
            }
        }
        if(done==false){
            if(a.length()>b.length()){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        a = a.substring(0, 1).toUpperCase() + a.substring(1, a.length());
        b = b.substring(0, 1).toUpperCase() + b.substring(1, b.length());
        System.out.println(a + " " + b);

        //https://www.hackerrank.com/challenges/java-strings-introduction/problem
    }
}
