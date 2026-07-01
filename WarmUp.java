public class WarmUp {

    public static long sum() {

        long total = 0;

        for (int i = 0; i < 100000000; i++) {
            total += i;
        }

        return total;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            long start = System.nanoTime();

            sum();

            long end = System.nanoTime();

            System.out.println((end - start) / 1000000.0 + " ms");
        }

    }

}