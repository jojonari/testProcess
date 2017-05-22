import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MyStackTest {

    /**
     * Triangulation Test
     */
    @Test
    public void pop_should_return_pushed_value() throws Exception {
        MyStack stack = new MyStack();
        stack.push(1);
        assertThat(stack.pop(), is(1));
        stack.push(2);
        assertThat(stack.pop(), is(2));

    }

    /**
     * One To Many Test
     */
    @Test
    public void pop_should_return_pushed_value2() throws Exception {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(1));

    }
}
