/* 🧭 Main Categories of Collections

Interface	                        Class	                            Description
List	                    ArrayList	                    Resizable array that maintains order and allows duplicates
                            LinkedList	                    List with fast insert and remove operations
Set	                        HashSet	                        Unordered collection of unique elements
                            TreeSet	                        Sorted set of unique elements (natural order)
                        LinkedHashSet	                    Maintains the order in which elements were inserted
Map	                        HashMap	                        Stores key/value pairs with no specific order
                            TreeMap	                        Sorted map based on the natural order of keys
                            LinkedHashMap	                Maintains the order in which keys were inserted


Differences between ArrayList and LinkedList?
ArrayList provides fast random access but slower insertions/deletions. 
LinkedList, on the other hand, uses a doubly-linked list which makes insertions/deletions faster at the cost of slower random access.



Type	    Interface	                                   Common Implementations	                      Description
List	    List	ArrayList, LinkedList, Vector, Stack	Ordered, allows duplicates
Set	        Set	HashSet, LinkedHashSet, TreeSet	            No duplicates
Queue / Deque	Queue, Deque	                       PriorityQueue, ArrayDeque, LinkedList	Follows FIFO/LIFO order
Map	            Map	HashMap, LinkedHashMap, TreeMap, Hashtable, ConcurrentHashMap	            Stores key–value pairs
Others	            —	                    Collections, Iterator, EnumSet, WeakHashMap	Utility and special types
⚙️ 1. List Interface
✅ LinkedList

Doubly-linked list implementation of List.

Faster insertion/deletion than ArrayList (especially in the middle).

Can be used as Queue or Deque.

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.addFirst("C++"); // Add at start
        list.addLast("Go");   // Add at end

        System.out.println(list);
        list.remove("Python");
        System.out.println("After removal: " + list);
    }
}


🖨️ Output:

[C++, Java, Python, Go]
After removal: [C++, Java, Go]

🚫 2. Set Interface
✅ HashSet

No duplicates, unordered.

Backed by a HashMap internally.

Fast operations (O(1)) for add/remove/search.

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple"); // duplicate ignored
        System.out.println(set);
    }
}


🖨️ Output (unordered):

[banana, apple]

✅ LinkedHashSet

Maintains insertion order (unlike HashSet).

No duplicates.

LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
numbers.add(5);
numbers.add(2);
numbers.add(5);
numbers.add(10);
System.out.println(numbers);  // [5, 2, 10]

✅ TreeSet

Sorted and unique elements.

Uses a balanced tree (Red-Black Tree) internally.

O(log n) time for operations.

TreeSet<Integer> tree = new TreeSet<>();
tree.add(30);
tree.add(10);
tree.add(20);
System.out.println(tree); // Sorted automatically → [10, 20, 30]

⏩ 3. Queue and Deque
✅ PriorityQueue

Elements are ordered by priority (natural order or custom Comparator).

Head of queue = smallest element (by default).

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(30);

        System.out.println(pq.poll()); // 10 (lowest)
        System.out.println(pq.poll()); // 30
    }
}

✅ ArrayDeque

Double-ended queue — can add/remove from both ends.

Faster than Stack or LinkedList for stack/queue operations.

ArrayDeque<String> dq = new ArrayDeque<>();
dq.addFirst("Front");
dq.addLast("Back");
dq.add("Middle");
System.out.println(dq); // [Front, Middle, Back]
dq.removeLast();
System.out.println(dq); // [Front, Middle]

🗺️ 4. Map Interface (key-value pairs)
✅ HashMap

Stores key–value pairs.

No duplicate keys, values can repeat.

Unordered.

HashMap<Integer, String> map = new HashMap<>();
map.put(1, "Apple");
map.put(2, "Banana");
map.put(1, "Cherry"); // replaces Apple
System.out.println(map); // {1=Cherry, 2=Banana}

✅ LinkedHashMap

Maintains insertion order.

Great when you need predictable iteration order.

LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
linkedMap.put(3, "Java");
linkedMap.put(1, "Python");
linkedMap.put(2, "C++");
System.out.println(linkedMap); // {3=Java, 1=Python, 2=C++}

✅ TreeMap

Stores keys in sorted order.

Uses a Red-Black Tree internally.

TreeMap<Integer, String> treeMap = new TreeMap<>();
treeMap.put(3, "Apple");
treeMap.put(1, "Orange");
treeMap.put(2, "Banana");
System.out.println(treeMap); // {1=Orange, 2=Banana, 3=Apple}

✅ ConcurrentHashMap (Advanced)

Thread-safe HashMap for multi-threading.

Allows concurrent read/write without locking the entire map.

import java.util.concurrent.*;

public class ConcurrentExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> cmap = new ConcurrentHashMap<>();
        cmap.put(1, "Java");
        cmap.put(2, "Python");
        System.out.println(cmap);
    }
}

🧠 Advanced Notes:

Collection     Type	Allows Duplicates	Maintains Order	        Thread Safe	        Null Allowed
ArrayList	            ✅	             ✅	                        ❌	        ✅
LinkedList	            ✅	             ✅	                        ❌	        ✅
HashSet	                ❌	             ❌	                        ❌	        ✅
LinkedHashSet	        ❌	             ✅	                        ❌	        ✅
TreeSet	                ❌	            Sorted	                      	           ❌
HashMap         	Keys:❌, Values: ✅	❌	                      ❌	           ✅
LinkedHashMap	   Keys: ❌	              ✅	                        ❌	        ✅
TreeMap	           Keys: ❌	            Sorted	                      ❌	          ❌
ConcurrentHashMap  Keys: ❌	              ❌	                        ✅	         ❌
🏁 Summary

List → Ordered, duplicates allowed (ArrayList, LinkedList).

Set → Unique, unordered or sorted (HashSet, TreeSet).

Queue/Deque → FIFO/LIFO (PriorityQueue, ArrayDeque).

Map → Key-value pairs (HashMap, TreeMap).

Concurrent Collections → Thread-safe (ConcurrentHashMap, CopyOnWriteArrayList). */
