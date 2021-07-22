import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text = "Mr oh winding it enjoyed by between.\n" +
                " The servants securing winter@yandex.ru material goodness her.\n" +
                "Saw principles themselves ten are possession.\n" +
                "So endeavor to continue pasha@gmail.com cheerful doubtful we to.\n" +
                "Turned advice the set vanity why mutual.\n";

        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            // group enumeration -> (1)(2)(3) or (1(2))(3)
            System.out.println(matcher.group());
        }
    }
}
