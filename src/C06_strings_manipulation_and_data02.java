import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class C06_strings_manipulation_and_data02 {

    public static void main(String[] args) {
        // Hello, {name}. Today is {week day}, good morning

        String name = "Milena";

        // ISO 8601
        LocalDate today = LocalDate.now(); // this file (LocalDate) is in other package, that is why we need to export
        Locale brazil = new Locale("pt", "BR"); // if we try to copy and paste the terms "language" and "country", it won't work because it is a tool by itellij, and not part of the code itself
        //result when we try to copy: ("pt", "BR")

        //System.out.println(today.getDayOfWeek().getDisplayName(TextStyle.FULL,brazil)); // TextStyle = full name of the

        String weekDay = today.getDayOfWeek().getDisplayName(TextStyle.FULL,brazil);
        String salute;
        LocalDateTime now = LocalDateTime.now(); // current time

        if (now.getHour() >= 0 && now.getHour() < 12) {
            salute = "good morning";
        } else if (now.getHour() >= 12 && now.getHour() < 24) {
            salute = "good evening";
        } else if (now.getHour() >= 18 && now.getHour() < 24) {
            salute = "good night";
        } else {
            salute = "hello";
        }

        System.out.printf("hello, %s. today is %s, %s.%n", name, weekDay, salute.toUpperCase()); // printf = breaks line manually with %n
    }
}
