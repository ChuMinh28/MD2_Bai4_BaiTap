package baitap;

import java.util.Date;

public class Main2 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);
        long time = currentDate.getTime();
        long time2 = System.currentTimeMillis();

        System.out.println(time);
        System.out.println(time2);
    }
}
