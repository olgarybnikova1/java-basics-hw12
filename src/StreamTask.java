import java.util.Arrays;


public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        // TODO replace return with your code
        int SumSquareEven = Arrays.stream(numbers)
            .filter(x -> x % 2 == 0)
            .reduce(0, (acc, elem) -> acc + elem * elem);
        return SumSquareEven;
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        // TODO replace return with your code
        int [] oddNumbers = Arrays.stream(numbers)
                .filter(x -> x % 2 == 1 || x % 2 == -1)
                .sorted()
                .toArray();
        return oddNumbers;
    }
}
