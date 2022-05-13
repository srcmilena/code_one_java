public class C05_conditional_structures02 {

    public static void main(String[] args) {

        int grade = 50;
        String graduation;

        // A 80 B 70 C 60 D 0
        if (grade >= 70) {
            graduation = "A";
            //System.out.println("Graduation A");
        } else if (grade < 80 && grade >= 70) {
            graduation = "B";
            //System.out.println("Graduation B");
        } else if (grade < 70 && grade >= 60) {
            graduation = "C";
            //System.out.println("Graduation C");
        } else if (grade < 60 && grade >= 0) {
            graduation = "D";
            //System.out.println("Graduation D");
        } else {
            graduation = ""; //null; // missing a valid graduation
            //System.out.println("Invalid grade");
        }

        switch (graduation) {
            case "A":
            case "B":
                System.out.println("Student approved");
                break;

            case "C":
            case "D":
                System.out.println("Student not approved");
                break;

            default:
                System.out.println("Graduation invalid"); // vai gerar um bug se não houver o break

        }
    }
}
