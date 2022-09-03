public class Main {
    public static void main(String[] args) {
        int balans = 50;
        int summPopoln = 1300;
        if (summPopoln > 1000) {
            int bonus = summPopoln / 100;
            int newBalans = bonus+balans+summPopoln;
            System.out.println("Количество бонусных рублей " + bonus);
            System.out.println("Итоговый счет " + newBalans);

        } else {
            int newBalans = balans+summPopoln;
            System.out.println("Бонусных рублей нет");
            System.out.println("Итоговый счет после пополнения " + newBalans);

        }

    }
}
