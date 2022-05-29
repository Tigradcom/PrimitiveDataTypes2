public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int bay = 2_754;

        int bonus = bay > 1_000 ? bay / 100 : 0;
        int total = amount + bay + bonus;

        System.out.println("Счет клиента:" + total);
        System.out.println("Начислено бонусов:" + bonus);
    }
}
