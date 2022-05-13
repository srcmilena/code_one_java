public class C08_arrays01 {

    // all elements inside an array. has to be the same data type, we can't add  and mix different types

    public static void main(String[] args) {
        /*int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;*/

        int[] numbers = new int[5]; // array of int numbers. als has an unchanging size. here we are declaring its size as 5
        // in arrays we have indices
        // [] = n | the end = n - 1
        // [0] [1] [2] [3] [4]

        // manipulating arrays/data
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        // to access elements inside an array, we use loops structures
        for (int i = 0; i < numbers.length; i++){ // where i = control variable (very usual to use "i")
            System.out.println(numbers[i]);
        }

        //System.out.println(numbers); // output = [I@27f674d, where "[" says it is an array, "I" means that it is an indice and "@" shows the local of memory where this array is being executed (memory address)



    }
}
