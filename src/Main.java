public class Main {
    public static void main(String[] args) {
        long FirstBalance = 100;
        long PayAmount = 2000;
        int BonusPrice= 100;
        int Bonus =0;

        if (PayAmount > 1000) {
            System.out.println("начисляем бонус");
            Bonus =(int) PayAmount/BonusPrice;
            System.out.println("сумма бонуса "+ Bonus);
        }
        else {System.out.println("не начисляем бонус");}
        FirstBalance = FirstBalance+PayAmount+Bonus;
        System.out.println("текущий счет клиента "+FirstBalance);
    }
}