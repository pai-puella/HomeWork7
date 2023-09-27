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

        System.out.println("Задача 2");
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int population = 12000000;
        for (int year = 1; year <= 10; year++) {
            int births = (int) (population * 0.017);
            int deaths = (int) (population * 0.008);

            population += (births - deaths);

            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();
    }
}
