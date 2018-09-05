import java.util.*;
public class hack4 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        char c[] = s.toCharArray();
        boolean ok = true;
        int i=0;
        int j = s.length()-1;
        while(i<j){
            if(c[i]!=c[j]){
                ok = false;
                break;
            }
            i++;
            j--;
        }
        if(ok==true) System.out.print("Yes");
        else System.out.print("No");

        //https://www.hackerrank.com/challenges/java-string-reverse/problem
    }
}
