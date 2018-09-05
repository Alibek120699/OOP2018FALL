import java.util.Scanner;
public class array7 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = inp.nextInt();
        }

        for(int i=n-1; i>=0; i-- ){
            System.out.print(a[i] + " ");
        }
    }
}
