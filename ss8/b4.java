public class b4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefghij".repeat(100000));
        StringBuffer sbf = new StringBuffer("abcdefghij".repeat(100000));

        long startTime, endTime;

        System.out.println("Testing StringBuilder...");
        startTime = System.nanoTime();
        sb.reverse();
        endTime = System.nanoTime();
        System.out.println("Reverse time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sb.insert(500000, "INSERTED");
        endTime = System.nanoTime();
        System.out.println("Insert time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sb.delete(400000, 400010);
        endTime = System.nanoTime();
        System.out.println("Delete time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sb.replace(300000, 300010, "REPLACED");
        endTime = System.nanoTime();
        System.out.println("Replace time: " + (endTime - startTime) + " ns");

        System.out.println("\nTesting StringBuffer...");
        startTime = System.nanoTime();
        sbf.reverse();
        endTime = System.nanoTime();
        System.out.println("Reverse time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sbf.insert(500000, "INSERTED");
        endTime = System.nanoTime();
        System.out.println("Insert time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sbf.delete(400000, 400010);
        endTime = System.nanoTime();
        System.out.println("Delete time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sbf.replace(300000, 300010, "REPLACED");
        endTime = System.nanoTime();
        System.out.println("Replace time: " + (endTime - startTime) + " ns");
    }
}