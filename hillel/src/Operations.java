/**
 * Created by OGlovatskaya on 24.09.2015.
 */
public class Operations {
    public static void main(String[]args) {
       int res = 5 + 89;

        res = res + 1;
        res +=1;
        res++;
        ++res;

        print(res++);
        print(++res);

        int mod = 5 % 4;
        print(mod);



        boolean canAttend = paid() | advert(); // || - операц€ "коротка€ логика"
        System.out.println("can attend classes: " + canAttend);

        canAttend = paid() & hasEnoughtKnowledge();
        System.out.println("can attend classes: " + canAttend);

        int bitResult = 10 | 5;
        bitResult &= 50;

        boolean priorities = (paid() | advert()) & hasEnoughtKnowledge();

        int message = 100;
        int key = 31;
        System.out.println("message is " + message);

        int crypted = message ^ key;
        System.out.println("crypted message is " + crypted);

        int uncripted = crypted ^ key;
        System.out.println("uncripted message is " + uncripted);


    }

    public  static boolean paid() {
        System.out.println("in paid method");
        return true;
    }
    public static boolean advert() {
        System.out.println("in advert method");
        return false;
    }

    public static boolean hasEnoughtKnowledge() {
        System.out.println("in hasEnoughtKnowledge method");
        return false;
    }


    public static void print(int i) {
        System.out.println(i);
    }
}
