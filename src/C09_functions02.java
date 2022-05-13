public class C09_functions02 {

    public static void main(String[] args) {
        int result = sum(2, 3); // that is okay if we call the function before declaring the function itself
        System.out.print(result);
    }

    public static int sum(int a, int b) {
        return a + b; // define the action of this function
    }
}
