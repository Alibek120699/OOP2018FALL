import java.util.Scanner;
public class array6 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = inp.nextInt();
        }
        int c =0;
        for(int i=1; i<n-1; i++){
            if(a[i]>a[i-1] && a[i]>a[i+1]) c++;
        }
        System.out.print(c);
    }
}
