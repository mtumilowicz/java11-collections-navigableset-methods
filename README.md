# java11-collections-navigableset-methods

# preface
* `interface NavigableSet<E> extends SortedSet<E>`
* referring https://github.com/mtumilowicz/java11-collections-sortedset-subset-methods
could be useful
* `ClassCastException` in situations described in SortedSet or
similar

# methods
* `E lower(E e)`
* `E floor(E e)`
* `E ceiling(E e)`
* `E higher(E e)`
* `E pollFirst()`
* `E pollLast()`
* `NavigableSet<E> descendingSet()`
* `NavigableSet<E> subSet(E fromElement, boolean fromInclusive,
                           E toElement,   boolean toInclusive)`
* `NavigableSet<E> headSet(E toElement, boolean inclusive)`
* `NavigableSet<E> tailSet(E fromElement, boolean inclusive)`