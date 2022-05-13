public class C07_numeric_loops01 {

    public static void main(String[] args) {

        // 1 2 3 4 5 6 7 8 9 10
        // for a variable starting at 1 and goes to 10, changing 1 to 1, do:

        for (int i = 1; i <= 10; i++) { // declaring var "i" as an iny, limiting to "10", and adding 1 to 1 till 10
            // if we want to add 2 to 2, we could use i as "i+=2" (we will see only odd numbers because we are staring with 1)
            System.out.println(i);
        }
    }
}
