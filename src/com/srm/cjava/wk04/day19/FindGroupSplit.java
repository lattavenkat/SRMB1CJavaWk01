import java.util.regex.*;
import java.util.Scanner;

public class FindGroupSplit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1, str2, str3;
        Pattern pattern1, pattern2;
        Matcher matcher1, matcher2;
        
        // find

        System.out.println("FIND");
        System.out.println("Enter Regex String: ");
        str1 = sc.nextLine();
        pattern1 = Pattern.compile(str1);
        System.out.println("Enter string to be matched: ");
        str2 = sc.nextLine();
        matcher1 = pattern1.matcher(str2);
        System.out.println(matcher1.find());

        // group

        System.out.println("GROUP");
        String regex = "(sd*)";
        pattern2 = Pattern.compile(regex);
        System.out.println("Enter string to be matched: ");
        str3 = sc.nextLine();
        matcher2 = pattern2.matcher(str3);
        MatchResult result = matcher2.toMatchResult();
        System.out.println("Current Matcher: " + result);

        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
      
        // split

        System.out.println("SPLIT");
        System.out.println("Enter Regex String: ");
        str1 = sc.nextLine();
        System.out.println("String before applying split(): " );
        String[] arrOfStr = str1.split(" ", 0);
        System.out.println("String after applying split(): "+str1);
        for (String a : arrOfStr)
            System.out.println(a);
        sc.close();
    }
}
