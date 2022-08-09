public class Main {
    public static void main(String[] args) {

        int ticketPrice = 3741; // стоимость биллета
        int bonusPerRubble = 20; // количества рублей для одной бонусной милли

        int bonus = ticketPrice / bonusPerRubble; // переменная для количества бонусов

        System.out.println("Стоимость билета: " + ticketPrice + " руб.");
        System.out.println("Вам начисленно бонусных милль: " + bonus);

    }
}
