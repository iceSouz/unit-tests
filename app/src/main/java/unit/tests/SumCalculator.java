package unit.tests;

public class SumCalculator {
    public long sum(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("This method doesn't accept the number 0!");
        }

        if (n == 1) {
            return 1;
        }

        return sum(n - 1) + n;
    }
}
