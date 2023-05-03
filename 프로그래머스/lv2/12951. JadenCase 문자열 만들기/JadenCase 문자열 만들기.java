import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public String solution(String s) {
        Pattern pattern = Pattern.compile("(^|\\s)(\\w)");
        Matcher matcher = pattern.matcher(s.toLowerCase());
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1) + matcher.group(2).toUpperCase());
        }
        matcher.appendTail(sb);

        return sb.toString();
    }
}