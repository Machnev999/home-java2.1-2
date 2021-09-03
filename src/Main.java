public class Main {
    public static void main(String[] args) {
        int account = 100; // RUB
        int put = 1000; //RUB
        int result = put;
        int less = 1000;
        int percent;
        if (put > less) {
            percent = 1;
        } else {
            percent = 0;
        }
        long amount = result;
        long bonus = amount * percent / 100;
        System.out.println(bonus + amount + account);
        System.out.println("Bonus is: " + bonus);
    }
}
