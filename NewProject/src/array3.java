import java.util.Scanner;
public class array3 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int [] a = new int[n];
        int c=0;
        for(int i=0; i<n; i++){
            a[i] = inp.nextInt();
            if(a[i]>0) c++;
        }

        System.out.print(c);
    }
}
