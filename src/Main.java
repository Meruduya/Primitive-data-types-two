public class Main {
    public static void main(String[] args) {

        int x = 100; // колличество рублей на счете
        int y = 1500; // сумма пополнения
        int bonus;

        if (y >= 1000) {
            bonus = y / 100;
        } else {
            bonus = 0;
        }
        int total = x + y + bonus;
        System.out.println("Итоговый счет: " + total);
    }
}