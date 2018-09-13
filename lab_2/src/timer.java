import java.util.Scanner;
class Time{
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    String toUniversal(){
        String res = "";
        int s = second%60;
        int m = (minute + second/60)%60;
        int h = (hour + minute/60)%24;
        if(h<10 && m>=10 && s>=10) res  = "0" + h + ":" + m + ":" + s;
        else if(m<10 && s>=10 && h>=10) res = h + ":0" + m + ":" + s;
        else if(s<10 && h>=10 && m>=10) res = h + ":" + m + ":0" + s;
        else if(h<10 && m<10 && s>=10) res = "0" + h + ":0" + m + ":" + s;
        else if(h<10 && s<10 && m>=10) res = "0" + h + ":" + m + ":0" + s;
        else if(m<10 && s<10 && h>=10) res = h + ":0" + m + ":0" + s;
        else if(h<10 && m<10 && s<10) res  = "0" + h + ":0" + m + ":0" + s;
        else res = h + ":" + m + ":" + s;
        return res;
    }

    String toStandard(){
        String res = "";
        int s = second%60;
        int m = (minute + second/60)%60;
        int h = (hour + minute/60)%24;
        if(h%12<10 && m>=10 && s>=10) res  = "0" + (h%12) + ":" + m + ":" + s;
        else if(m<10 && h%12>=10 && s>=10) res = (h%12) + ":0" + m + ":" + s;
        else if(s<10 && m>=10 && h%12>=10) res = (h%12) + ":" + m + ":0" + s;
        else if(h%12<10 && m<10 && s>=10) res = "0" + (h%12) + ":0" + m + ":" + s;
        else if(h%12<10 && s<10 && m>=10) res = "0" + (h%12) + ":" + m + ":0" + s;
        else if(m<10 && s<10 && h%12>=10) res = (h%12) + ":0" + m + ":0" + s;
        else if(h%12<10 && m<10 && s<10) res  = "0" + (h%12) + ":0" + m + ":0" + s;
        else res = (h%12) + ":" + m + ":" + s;
        if(h/12>=1) res = res + " AM";
        if(h/12<1) res = res + " PM";
        if(h%12==0) res = 12 + res.substring(2);
        return res;
    }

    void add(Time x){
        second = (second + x.second);
        minute = minute + x.minute + (second/60);
        hour = (hour + x.hour + (minute/60));
        second = second%60;
        minute = minute%60;
        hour = hour % 24;
        System.out.println(toUniversal());
        System.out.println(toStandard());
    }
}

public class timer {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        Time t = new Time(a, b, c);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        int d = inp.nextInt();
        int e = inp.nextInt();
        int f = inp.nextInt();
        Time t2 = new Time(d, e, f);
        t.add(t2);
    }
}
