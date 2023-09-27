public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int targetAmount = 2459000;
        int monthlySaving = 15000;
        double currentAmount = 0;
        int months = 0;
        double interest = 0.12;

        while (currentAmount < targetAmount) {
            currentAmount += monthlySaving;
            currentAmount += currentAmount * interest / 12;
            months++;
        }

        System.out.println("Месяц " + months + ", сумма накоплений равна " + currentAmount + " рублей");
        System.out.println();
    }
}
