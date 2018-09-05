import java.util.Scanner;
public class array5 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = inp.nextInt();
        }
        boolean ok = false;
        for(int i=0; i<n-1; i++){
            if((a[i]>0 && a[i+1]>0) || (a[i]<0 && a[i+1]<0)) ok = true;
        }
        if(ok==true) System.out.print("YES");
        else System.out.print("NO");
    }
}
