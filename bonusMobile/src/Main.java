public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int refill = 1300;
        int bonusPrice = 100;
        int total = balance + refill;
        int bonus;

        if (refill > 1000) {
            bonus = refill / bonusPrice;
        } else {
            bonus = 0;
        }
        System.out.println(total + bonus);
    }
}





