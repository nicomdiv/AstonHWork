package HomeWork02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        //----------1
        System.out.println("1. Все транзакции за 2011 год и отсортированные по сумме (от меньшей к большей):");
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);
        System.out.println();

        //----------2
        System.out.println("2. Список неповторяющихся городов, в которых работают трейдеры:");
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        //----------3
        System.out.println("3. Все трейдеры из Кембриджа отсортированные по именам:");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
        System.out.println();

        //----------4
        System.out.print("4. Строка со всеми именами трейдеров, отсортированными в алфавитном порядке: ");
        System.out.println(transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .distinct()
                .collect(Collectors.joining(" "))
        );
        System.out.println();

        //----------5
        System.out.print("5. Существует ли хоть один трейдер из Милана: ");
        long count = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Milan"))
                .count();
        if (count > 0) System.out.println("Да");
        else System.out.println("Нет");
        System.out.println();

        //----------6
        System.out.print("6. Суммы всех транзакций трейдеров из Кембриджа: ");
        System.out.println((Integer) transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue).mapToInt(Integer::intValue).sum());
        System.out.println();

        //----------7
        System.out.print("7. Максимальная сумма среди всех транзакций: ");
        System.out.println(
                transactions.stream()
                        .map(Transaction::getValue).max(Integer::compareTo).get()
        );
        System.out.println();

        //----------8
        System.out.println("8. Транзакция с минимальной суммой:");
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .limit(1)
                .forEach(System.out::println);
    }
}
