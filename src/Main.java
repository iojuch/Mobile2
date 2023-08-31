public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int amount = 1100;
        int bonus = 100;
        int bonus2;

        if (amount > 1000) {
            bonus2 = amount / bonus;
        } else {
            bonus2 = 0;
        }
        System.out.println("На счету:" + (balance + amount + bonus2));
        System.out.println("Полученные бонусы:" + bonus2);
    }
}