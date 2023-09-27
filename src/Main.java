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

        System.out.println("Задача 4");
        double initialAmount = 15000;
        double targetAmountForVasiliy = 12000000;
        double interestRate = 0.07; // Процент банка

        int monthsCount = 0; // Счетчик месяцев
        double savings = initialAmount; // Текущая сумма накоплений

        // Пока текущая сумма накоплений меньше целевой суммы, продолжаем копить
        while (savings < targetAmountForVasiliy) {
            monthsCount++; // Увеличиваем счетчик месяцев

            double interestPercents = savings * interestRate; // Вычисляем проценты
            savings += interestPercents;

            System.out.println("Месяц " + monthsCount + ", сумма накоплений составляет " + savings);

        }

        System.out.println("Василию потребуется " + monthsCount + " месяцев, чтобы накопить 12000000 рублей");
        System.out.println();

        System.out.println("Задача 5");
        monthsCount = 0;
        savings = initialAmount;
        while (savings < targetAmountForVasiliy) {
            monthsCount++; // Увеличиваем счетчик месяцев

            interest = savings * interestRate; // Вычисляем проценты
            savings += interest;

            if (monthsCount % 6 == 0) { // Выводим результат только для каждого шестого месяца
                System.out.println("Месяц " + monthsCount + ", сумма накоплений составляет " + savings);
            }
        }
        System.out.println();

        System.out.println("Задача 6");
        monthsCount = 0;
        savings = initialAmount;

        // Пока не прошло 9 лет (108 месяцев), продолжаем копить
        while (monthsCount < 108) {
            monthsCount++;

            interest = savings * interestRate;
            savings += interest;

            if (monthsCount % 6 == 0) { // Выводим результат только для каждого шестого месяца
                System.out.println("Месяц " + monthsCount + ", сумма накоплений составляет " + savings);
            }
        }
        System.out.println();

        System.out.println("Задача 7");
        int firstFriday = 6;

        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();

        System.out.println("Задача 8");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for (int year = 0; year <= endYear; year += 79) {
            if (year >= startYear && year <= currentYear) {
                System.out.println(year);
            } else if (year > currentYear) {
                System.out.println(year);
            }
        }
    }
}