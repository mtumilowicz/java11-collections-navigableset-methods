# java11-collections-navigableset-methods

# preface
* `interface NavigableSet<E> extends SortedSet<E>`
* referring https://github.com/mtumilowicz/java11-collections-sortedset-subset-methods
could be useful
* `ClassCastException` similar to `SortedSet`
* `class TreeSet<E> implements NavigableSet<E>`

# methods
* `E lower(E e)` returns the greatest element less than `e`,
or null if there is no such element
* `E floor(E e)` returns the greatest element less than or equal to 
`e`, or null if there is no such element
* `E ceiling(E e)` returns the least element greater than or equal to `e`,
or null if there is no such element
* `E higher(E e)` returns the least element greater than `e`,
or null if there is no such element
* `E pollFirst()`
* `E pollLast()`
* `NavigableSet<E> descendingSet()` - a reverse order **view** of this set
* `NavigableSet<E> subSet(E fromElement, boolean fromInclusive,
                           E toElement,   boolean toInclusive)`
* `NavigableSet<E> headSet(E toElement, boolean inclusive)`
* `NavigableSet<E> tailSet(E fromElement, boolean inclusive)`

# project description
We will provide tests for above mentioned methods, ignoring:
* subset / headset / tailset -> similar methods are covered in
SortedSet project