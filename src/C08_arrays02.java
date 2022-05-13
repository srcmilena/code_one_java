import java.util.Arrays;

public class C08_arrays02 {

    public static void main(String[] args) {
        /*String[] letters = new String[5];

        letters[0] = "A";
        letters[1] = "B";
        letters[2] = "C";
        letters[3] = "J";
        letters[4] = "X";
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }*/

        String[] letters = { "A", "B", "C", "J", "X"};
        /*for (int i = 0; i < letters.length; i++) {
            //System.out.println(letters[i]);
        }*/

        System.out.print(Arrays.toString(letters));
    }
}
