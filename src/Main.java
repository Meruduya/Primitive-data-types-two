public class Main {
    public static void main(String[] args) {

        int balance = 100; // колличество рублей на счете
        int topUp = 1500; // сумма пополнения
        int bonus;

        if (topUp >= 1000) {
            bonus = topUp / 100;
        } else {
            bonus = 0;
        }
        int total = balance + topUp + bonus;
        System.out.println("Итоговый счет: " + total);
    }
}