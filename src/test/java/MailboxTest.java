import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by jojonari on 2017. 5. 22..
 */
public class MailboxTest {
    @Test
    public void newMailBox_should_empty(){
        MailBox mailBox = new MailBox();
        assertThat(mailBox.messageCount(), is(0));
    }
}
