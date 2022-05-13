/*
* Java is strongly typing and that is why we can't mix types inside a structure
*/
public class C09_arrays03 {

    public static void main(String[] args) {
        int[] numbers = {9, 10, 12, 25, 2};
        int greater = numbers[0];
        int minor = numbers[0];
        int average = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greater) {
                greater = numbers[i];
            }
            if (numbers[i] < minor) {
                minor = numbers[i];
            }
            average += numbers[i];
        }

        System.out.println("Greater " + greater);
        System.out.println("Minor " + minor);
        System.out.println("Average " + average/numbers.length); // need to fix this sum
    }
}
