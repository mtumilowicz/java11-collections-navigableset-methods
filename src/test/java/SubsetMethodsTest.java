import org.junit.Test;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2019-02-16.
 */
public class SubsetMethodsTest {

    @Test
    public void lower() {
        NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));

        assertThat(ints.lower(3), is(2));
        assertThat(ints.lower(2), is(1));
        assertThat(ints.lower(1), is(nullValue()));
    }

    @Test
    public void floor() {
        NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));

        assertThat(ints.floor(3), is(2));
        assertThat(ints.floor(2), is(2));
        assertThat(ints.floor(0), is(nullValue()));
    }

    @Test
    public void pollFirst() {
        NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));

        assertThat(ints.pollFirst(), is(1));
        assertEquals(Set.of(2, 4), ints);
    }

    @Test
    public void pollLast() {
        NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));

        assertThat(ints.pollLast(), is(4));
        assertEquals(Set.of(1, 2), ints);
    }

    @Test
    public void descendingSet() {
        NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));

        assertEquals(Set.of(4, 2, 1), ints);
    }
}
