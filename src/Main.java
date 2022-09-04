public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int creditAmount = 250;
        if (creditAmount > 1000) {
            int bonus = creditAmount / 100;
            int newBalans = bonus + balans + creditAmount;
            System.out.println("Количество бонусных рублей " + bonus);
            System.out.println("Итоговый счет " + newBalans);

        } else {
            int newBalans = balans + creditAmount;
            System.out.println("Бонусных рублей нет");
            System.out.println("Итоговый счет после пополнения " + newBalans);

        }

    }
}
