/*
* In Java, we barely say "functions" because we mostly use the word "method" instead. We can say that functions and methods are the same SO FAR
*/
public class C09_functions01 {

    public static void main(String[] args) {
        String originalName = "Let's code";
        saluting(originalName); // functions need parameters
    }

    public static void saluting(String parameterName) { //matters having the same name in the same scope, not in different ones
        System.out.println("Hi, " + parameterName);
    }
}

/*
* We can create functions that don't receive parameters and also that receive or return values
* */
