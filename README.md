[![Build Status](https://travis-ci.com/mtumilowicz/java11-collections-navigableset-subset-methods.svg?branch=master)](https://travis-ci.com/mtumilowicz/java11-collections-navigableset-subset-methods)

# java11-collections-navigableset-methods

# preface
* `interface NavigableSet<E> extends SortedSet<E>`
* referring https://github.com/mtumilowicz/java11-collections-sortedset-subset-methods
could be useful
* `ClassCastException` policy similar to `SortedSet`
* `class TreeSet<E> implements NavigableSet<E>`

# methods
* `E lower(E e)` returns the greatest element less than `e`,
or null if there is no such element
* `E floor(E e)` returns the greatest element less than or equal to 
`e`, or null if there is no such element
* `E ceiling(E e)` - floor in `descendingSet()`
* `E higher(E e)` - lower in `descendingSet()`
* `E pollFirst()`
* `E pollLast()`
* `NavigableSet<E> descendingSet()` - a reverse order **view** of this set
* `NavigableSet<E> subSet(E fromElement, boolean fromInclusive,
                           E toElement,   boolean toInclusive)`
* `NavigableSet<E> headSet(E toElement, boolean inclusive)`
* `NavigableSet<E> tailSet(E fromElement, boolean inclusive)`

# project description
We will provide tests for above mentioned methods
* subset / headset / tailset -> similar methods are covered in
`SortedSet` project.
* ceiling / higher is like floor / lower in reversed order
* lower
    ```
    NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));
    
    assertThat(ints.lower(3), is(2));
    assertThat(ints.lower(2), is(1));
    assertThat(ints.lower(1), is(nullValue()));
    ```
* floor
    ```
    NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));
    
    assertThat(ints.floor(3), is(2));
    assertThat(ints.floor(2), is(2));
    assertThat(ints.floor(0), is(nullValue()));
    ```
* pollFirst
    ```
    NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));
    
    assertThat(ints.pollFirst(), is(1));
    assertEquals(Set.of(2, 4), ints);
    ```
* pollLast
    ```
    NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));
    
    assertThat(ints.pollLast(), is(4));
    assertEquals(Set.of(1, 2), ints);
    ```
* descendingSet
    ```
    NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));
    
    assertEquals(Set.of(4, 2, 1), ints);
    ```
* modifying descendingSet modify source
    ```
    NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));
    var reversed = ints.descendingSet();
    reversed.add(3);
    
    assertEquals(Set.of(4, 3, 2, 1), ints);
    assertEquals(Set.of(4, 3, 2, 1), reversed);
    ```
* modifying source modify descendingSet
    ```
    NavigableSet<Integer> ints = new TreeSet<>(Arrays.asList(1, 2, 4));
    
    var reversed = ints.descendingSet();
    ints.add(3);
    
    assertEquals(Set.of(4, 3, 2, 1), ints);
    assertEquals(Set.of(4, 3, 2, 1), reversed);
    ```