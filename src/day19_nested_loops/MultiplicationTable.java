package day19_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(1 + " * " + i + " = " +  (1*i));
        }

        System.out.println();
        for (int j = 1; j <= 10; j++) {

            for (int i = 0; i <= 10; i++) {
                System.out.println(j + " * " + i + " = " +  (j*i));
            }
            System.out.println();
        }
    }
}
