import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Getting stuck
 */
public class WordWrapTest {

    @Test
    public void wrap() throws Exception {
        assertThat(wrap("word word", 4), is("word\nword"));
        assertThat(wrap("a dog", 5), is("a dog"));

        assertThat(wrap("a dog with a bone", 6), is("a dog\nwith a\nbone"));
        // Test를 성공시키려면 private String wrap(String s, int width)의 대대적인 수정이 불가피함
    }

    private String wrap(String s, int width) {
        return s.length() <= width ? s : s.replaceAll(" ", "\n");
    }

    /**
     * Getting stuck 해결
     * 사소한 테스트부터 한다
     * Getting stuck에 걸리면 테스트코드를 처음부터 다시 작성하는게 좋다
     */
    WordWrap wordWrap;

    @Before
    public void setUp() throws Exception {
        wordWrap = new WordWrap();
    }

    @Test
    public void wrap2() throws Exception {
        assertWraps(null, 1, "");
        assertWraps("", 1, "");
        assertWraps("x", 1, "x");
        assertWraps("xx", 1, "x\nx");
        assertWraps("xxx", 1, "x\nx\nx");
        assertWraps("x x", 1, "x\nx");
        assertWraps("x xx", 3, "x\nxx");
        assertWraps("four score and seven years ago our fathers brought forth upon this continent", 7, "four\nscore\nand\nseven\nyears\nago our\nfathers\nbrought\nforth\nupon\nthis\ncontine\nnt");

    }

    private void assertWraps(String s, int width, String value) {
        assertThat(wordWrap.wrap2(s, width), is(value));
    }

}
