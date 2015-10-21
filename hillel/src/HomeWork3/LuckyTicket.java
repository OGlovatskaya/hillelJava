package HomeWork3;

/**
 * Created by user on 04.10.2015.
 */
public class LuckyTicket {
    public static void main(String[] args ){

        int ticketNumber;
        int LuckyNumberCounter = 0;

    for(ticketNumber = 1; ticketNumber < 1000000; ticketNumber++) {
        int left1 = ticketNumber / 100000 % 10;
        int left2 = ticketNumber / 10000 % 10;
        int left3 = ticketNumber / 1000 % 10;
        int right1 = ticketNumber / 100 % 10;
        int right2 = ticketNumber / 10 % 10;
        int right3 = ticketNumber % 10;
        if ((left1 + left2 + left3) == (right1 + right2 + right3)) {
            LuckyNumberCounter++;
        }
    }
    System.out.println(LuckyNumberCounter);
}

}
