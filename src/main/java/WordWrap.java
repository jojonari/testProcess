/**
 * Created by jojonari on 2017. 5. 22..
 */
public class WordWrap {
    String wrap2(String s, int width) {
        if(s == null)
            return "";

        if(s.length() <= width)
            return s;

        int breakpoint = s.lastIndexOf(" ", width);
        if(breakpoint == -1)
            breakpoint = width;

        return s.substring(0, breakpoint) + "\n" + wrap2(s.substring(breakpoint).trim(), width);
    }
}
