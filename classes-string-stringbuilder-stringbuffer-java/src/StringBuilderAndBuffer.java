public class StringBuilderAndBuffer {

    public static void main(String[] args) {

        long stringStart = System.nanoTime();

        String stringConcat = "value";
        stringConcat += "2";

        for (int i = 0; i < 100_000; i++) {
            stringConcat += i;
        }

        long stringEnd = System.nanoTime();

        System.out.println("String: " + (stringEnd - stringStart) + " ns");

        long builderStart = System.nanoTime();

        StringBuilder builderConcat = new StringBuilder();

        for (int i = 0; i < 100_000; i++) {
            builderConcat.append(i);
        }

        long builderEnd = System.nanoTime();

        System.out.println("StringBuilder: " + (builderEnd - builderStart) + " ns");

        long bufferStart = System.nanoTime();

        StringBuffer bufferConcat = new StringBuffer();

        for (int i = 0; i < 100_000; i++) {
            bufferConcat.append(i);
        }

        long bufferEnd = System.nanoTime();

        System.out.println("StringBuffer: " + (bufferEnd - bufferStart) + " ns");
    }
}

