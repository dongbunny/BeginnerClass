package sample2;
/***
 * Matcher 类也提供了appendReplacement 和 appendTail 方法用于文本替换：
 *
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*public class RegexMatches {
    private static String REGEX ="dog";
    private static String INPUT = "The dog says meow." + "All dogs say meow.";
    private static String REPLACE = "cat";


    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        //get a matcher object

        Matcher matcher = pattern.matcher(INPUT);
        INPUT =matcher.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}*/

public class RegexMatches{
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoobkkk";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        //matcher対象を取得する
        Matcher matcher = pattern.matcher(INPUT);
        StringBuffer sb = new StringBuffer();

        while(matcher.find()) {
            matcher.appendReplacement(sb, REPLACE);
        }
        matcher.appendTail(sb);
        System.out.println(sb.toString());

    }
}
