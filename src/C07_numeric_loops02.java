public class C07_numeric_loops02 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) { // loop into other loop = nested loops
                // more than 4 nested loops is a bad habit
                System.out.println(j + " x " + i + " = " + j * i);
            }
            /*System.out.println(1 * i);
            System.out.println(2 * i);
            System.out.println(3 * i);
            System.out.println(4 * i);
            System.out.println(5 * i);
            System.out.println(6 * i);
            System.out.println(7 * i);
            System.out.println(8 * i);
            System.out.println(9 * i);
            System.out.println(10 * i);*/
        }
    }
}
