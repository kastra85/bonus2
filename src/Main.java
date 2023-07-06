public class Main {
    public static void main(String[] args) {

        int score = 10;
        int replenishment = 1200;

        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println ("Сумма счета " + (score + replenishment + bonus) + " рублей");
        System.out.println ("Сумма бонуса " + bonus + " рублей");
    }
}


