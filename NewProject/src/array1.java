import java.util.Scanner;
public class array1 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int [] a;
        a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = inp.nextInt();
            if(i%2==0) System.out.print(a[i] + " ");
        }
    }
}
