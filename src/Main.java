public class Main {
    public static void main(String[] args) {
        int firstBalance = 100;
        int payAmount = 2000;
        int bonusPrice= 100;
        int bonus =0;

        if (payAmount > 1000) {
            System.out.println("начисляем бонус");
            bonus =payAmount/bonusPrice;
            System.out.println("сумма бонуса "+ bonus);
        }
        else {System.out.println("не начисляем бонус");}
        firstBalance = firstBalance+payAmount+bonus;
        System.out.println("текущий счет клиента "+firstBalance);
    }
}
