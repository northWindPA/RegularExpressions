public class Test {
    public static void main(String[] args) {

        /*
            \\d - one digit
            \\w - one letter = [a-zA-Z]

            + - 1 or more digits
            * - 0 or more digits
            ? - 0 or 1 symbols before

            (x|y|z) - one string from the set of strings(logical 'or')

            [a-zA-Z] - all english letters
            [0-9] = \\d
            [^abc] - all symbols except "abc"
            . - any symbol

            {2} - 2 symbols before (\\d{2})
            {2,} - 2 or more symbols (\\d{2,})
            {2, 4} - from 2 to 4 symbols (\\d{2,4})
         */

        String a = "-246235";
        String b = "246235";
        String c = "+12125";
        System.out.println(a + " " + a.matches("(-|\\+)?\\d*"));
        System.out.println(b + " " + b.matches("(-|\\+)?\\d*"));
        System.out.println(c + " " + c.matches("(-|\\+)?\\d*"));

        String d = "aasfa2sfasf13759716";
        System.out.println(d + " " + d.matches("[a-zA-Z1-9]+\\d+"));

        String e = "asdf";
        System.out.println(e + " " + e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url1 = "http://www.yandex.ru";
        String url2 = "Hello World!";
        System.out.println(url + " " + url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url1 + " " + url1.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2 + " " + url2.matches("http://www\\..+\\.(com|ru)"));

        String f = "123";
        System.out.println(f + " \\\\d{2} " + f.matches("\\d{2}"));
        System.out.println(f + " \\\\d{2,} " + f.matches("\\d{2,}"));
    }
}
