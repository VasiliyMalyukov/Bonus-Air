public class Main {
    public static void main(String[] args) {

        int purchase = 5000; // стоимость билета в рублях
        int bonus = 20; // количество рублей за 1 бонус

        System.out.println("Поздравляем! Вы совершили покупку на сайте авиакомпании. Ваш бонусный счёт зачислено:");
        System.out.println((purchase / bonus) + " бонусных миль");

    }
}