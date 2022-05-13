public class C06_strings_manipulation_and_data01 {

    public static void main(String[] args) {
        // Hello, {name}. Today is {week day}, good morning

        String name = "Milena";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        String otherName = "Milena"; // milena = false
        System.out.println(name.equals(otherName)); // compares name variable to otherName

        String otherName2 = "milena"; // "m" is in lowercase, so, it is not equal
        System.out.println(name.equalsIgnoreCase(otherName2)); // compares name variable to otherName, but ignores if finds a difference between them
        // case = letters captalization (lowercaser, uppercase)

        // (variable name).manipulation we want()
    }
}
