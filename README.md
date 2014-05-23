Figuring out Java builtins

1) What is the difference between a hashmap and a hashset in terms of their use?

   A Hashmap is meant to duplicate a map. Keys point to elements, and therefore, there cannot be duplicate keys, but there may be duplicate elements.

   A Hashset is meant to duplicate a mathematical set. There cannot be any duplicate elements.

2) How are they implemented internally?

   For the Hashmap: there is a main array where each index corresponds to some hash value, which is determined by a hash function. Then each element of the array is the head of a linked list. The linked lists are also modified by some hash function. It is an example of open-hashing.

   For the Hashset: in the hashset, there cannot be duplicates of elements, so its just an array that is modified by a hash function so that each index corresponds to its element in a desired and efficient way. If you try to add an element that is already in the hashset, it will return false, and not add the element.  It is an example of closed-hashing that avoids linear probing or rehashing. 

3) Speed comparison (see included java file for code) 



