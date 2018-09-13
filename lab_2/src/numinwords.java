import java.util.Scanner;
public class numinwords {
    static String num(int x){
        String ans = "";
        String ones[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String teens[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        String tens[] = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        boolean hund = false;
        int th = x/1000;
        int h = x%1000;
        int te = x%100;
        if(x==0) ans = "zero";
        else{
            if(th!=0){
                if(th>=11 && th<=19){
                    ans = ans + teens[th-11] + " thousands ";
                }
                else if(th<=10 && th>=1){
                    if(th==10) ans = "ten thousands ";
                    else if(th==1) ans = ones[th-1] + " thousand ";
                    else if(th>1 && th<10)ans = ans + ones[th-1] + " thousands ";
                }
                else if(th/10>=2 && th%10==0) ans = ans + tens[th/10-2] + " thousands ";
                else if(th/10>=2 && th%10>0){
                    ans = ans + tens[(th/10)-2] + " " + ones[(th%10)-1] + " thousands ";
                }
            }
            if(h/100!=0){
                hund = true;
                if(h/100==1) ans = ans + ones[h/100-1] + " hundred ";
                else ans = ans + ones[h/100-1] + " hundreds ";
            }
            if(te!=0){
                if(te>=11 && te<=19){
                    if(hund) ans = ans + " [and] " + teens[te-11];
                }
                else if(te>=20){
                    if(hund){
                        if(te%10==0) ans = ans + " [and] " + tens[te/10-2];
                        else ans = ans + " [and] " + tens[te/10-2] + " " + ones[te%10-1];
                    }
                    else{
                        if(te%10==0) ans = ans + " " + tens[te/10-2];
                        else ans = ans + " " + tens[te/10-2] + " " + ones[te%10-1];
                    }
                }
            }
            if(te/10==0 && te%10!=0){
                if(hund){
                    ans = ans + " [and] " + ones[te%10-1];
                }
                else{
                    ans = ans + " " + ones[te%10-1];
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.print(num(n));
    }
}
