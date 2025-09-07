public class Test {

    public static void main(String[] args) {
        // outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer: " + i);
            // inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j);

            }
        }
        System.out.println();
        anotherMethod();
    }

    public static void anotherMethod() {
        for (int c = 1; c <= 3; c++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(c * b + " ");
            }
            System.out.println();
        }
    }
}