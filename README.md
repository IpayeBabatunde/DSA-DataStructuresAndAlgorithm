Data Structure & Algorithm (DSA) - 
Data Structure is a way to organize and store data efficiently in terms of performance and memory.
A data structure is a particular way to arrange data so it can be saved in memory and retrieved for later use 
where as an algorithm is a set of steps for solving a known problem. 
Data Structures and Algorithms is abbreviated as DSA in the context of Computer Science.

Abstract Data Types -
An Abstract Data Type (ADT) is a conceptual model that defines a set of operations and behaviours for a data type, 
without specifying how these operations are implemented or how data is organized in memory. 
The definition of ADT only mentions what operations are to be performed but not how these operations will be implemented.
It does not specify how data will be organized in memory and what algorithms will be used for implementing the operations. 
It is called “abstract” because it provides an implementation-independent view.

Arrays -
An array is a linear data structure that collects elements of the same data type and stores them in contiguous and 
adjacent memory locations. Arrays work on an index system starting from 0 to (n-1), where n is the size of the array.

Applications of Data Structures & Algorithms (DSA)
From the data structure point of view, following are some important categories of algorithms −

Search − Algorithm to search an item in a data structure.

Sort − Algorithm to sort items in a certain order.

Insert − Algorithm to insert item in a data structure.

Update − Algorithm to update an existing item in a data structure.

Delete − Algorithm to delete an existing item from a data structure.

The following computer problems can be solved using Data Structures −
Fibonacci number series
Knapsack problem
Tower of Hanoi
All pair shortest path by Floyd-Warshall
Shortest path by Dijkstra
Project scheduling

Types of Data Structures -
Here are different type of data structures which we are going to learn in this tutorial:
Array Data Structure
String Data Structure
Linked List Data Structure
Double Linked List Data Structure
Circular Linked List Data Structure
Stack Data Structure
Queue Data Structure
Heap Data Structure
Hash Data Structure
Matrix/Grid Data Structure
Graph Data Structure
Tree Data Structure

What is Algorithm?
Algorithm is a step-by-step procedure, which defines a set of instructions to be executed in a certain order to get the desired output.
Algorithms are generally created independent of underlying languages, i.e. an algorithm can be implemented in more than one programming language.

Types of Algorithms
Here are different type of algorithms which we are going to learn in this tutorial:
DSA - Searching Algorithms
DSA - Sorting Algorithms
DSA - Approximation Algorithms
DSA - Divide and Conquer Algorithms
DSA - Greedy Algorithms
DSA - Recursion Algorithm
DSA - Backtracking Algorithm
DSA - Randomized Algorithms
DSA - Dynamic Programming
DSA - Pattern Searching
DSA - Mathematical Algorithms
DSA - Geometric Algorithms
DSA - Bitwise Algorithms
DSA - Branch and Bound Algorithm

Characteristics of a Data Structure -
Correctness − Data structure implementation should implement its interface correctly.
Time Complexity − Running time or the execution time of operations of data structure must be as small as possible.
Space Complexity − Memory usage of a data structure operation should be as little as possible.

Basic DSA Terminologies
Data − Data are values or set of values.
Data Item − Data item refers to single unit of values.
Group Items − Data items that are divided into sub items are called as Group Items.
Elementary Items − Data items that cannot be divided are called as Elementary Items.
Attribute and Entity − An entity is that which contains certain attributes or properties, which may be assigned values.
Entity Set − Entities of similar attributes form an entity set.
Field − Field is a single elementary unit of information representing an attribute of an entity.
Record − Record is a collection of field values of a given entity.
File − File is a collection of records of the entities in a given entity set.

Characteristics of an Algorithm
Not all procedures can be called an algorithm. An algorithm should have the following characteristics −
Unambiguous − Algorithm should be clear and unambiguous. Each of its steps (or phases), and their inputs/outputs should be clear and must lead to only one meaning.
Input − An algorithm should have 0 or more well-defined inputs.
Output − An algorithm should have 1 or more well-defined outputs, and should match the desired output.
Finiteness − Algorithms must terminate after a finite number of steps.
Feasibility − Should be feasible with the available resources.
Independent − An algorithm should have step-by-step directions, which should be independent of any programming code.

Basic Operations in Arrays
The basic operations in the Arrays are insertion, deletion, searching, display, traverse, and update. 
These operations are usually performed to either modify the data in the array or to report the status of the array.

Following are the basic operations supported by an array.
Traverse − print all the array elements one by one.
Insertion − Adds an element at the given index.
Deletion − Deletes an element at the given index.
Search − Searches an element using the given index or by the value.
Update − Updates an element at the given index.
Display − Displays the contents of the array.

What is Linked List?
A linked list is a linear data structure which can store a collection of "nodes" connected together via links i.e. pointers. 
Linked lists nodes are not stored at a contiguous location, rather they are linked using pointers to the different memory locations. 
A node consists of the data value and a pointer to the address of the next node within the linked list.

A linked list is a dynamic linear data structure whose memory size can be allocated or de-allocated at run time based on the operation insertion or deletion, 
this helps in using system memory efficiently. Linked lists can be used to implment various data structures like a stack, queue, graph, hash maps, etc.

Linked Lists
A linked list starts with a head node which points to the first node. Every node consists of data which holds the actual data (value) associated 
with the node and a next pointer which holds the memory address of the next node in the linked list. The last node is called the tail node in the 
list which points to null indicating the end of the list.


Ezoic
Linked Lists vs Arrays
In case of arrays, the size is given at the time of creation and so arrays are of fixed lenghth where as Linked lists are dynamic in size and any number 
of nodes can be added in the linked lists dynamically. An array can accommodate similar types of data types where as linked lists can store various nodes of different data types.

Explore our latest online courses and learn new skills at your own pace. Enroll and become a certified expert to boost your career.

Types of Linked List
Following are the various types of linked list.

Singly Linked Lists
Singly linked lists contain two "buckets" in one node; one bucket holds the data and the other bucket holds the address of the next node of the list. 
Traversals can be done in one direction only as there is only a single link between two nodes of the same list.

Singly Linked Lists
Doubly Linked Lists
Doubly Linked Lists contain three "buckets" in one node; one bucket holds the data and the other buckets hold the addresses of the previous and 
next nodes in the list. The list is traversed twice as the nodes in the list are connected to each other from both sides.

Doubly Linked Lists
Circular Linked Lists
Circular linked lists can exist in both singly linked list and doubly linked list.

Since the last node and the first node of the circular linked list are connected, the traversal in this linked list will go on forever until it is broken.

Circular_Linked_Lists

Ezoic
Basic Operations in Linked List
The basic operations in the linked lists are insertion, deletion, searching, display, and deleting an element at a given key. 
These operations are performed on Singly Linked Lists as given below −

Insertion − Adds an element at the beginning of the list.

Deletion − Deletes an element at the beginning of the list.

Display − Displays the complete list.

Search − Searches an element using the given key.

Delete − Deletes an element using the given key.
