
# Iterator Pattern

## Introduction

The **Iterator Pattern** is a behavioral design pattern that allows sequential traversal through a collection of elements without exposing the underlying structure of the collection. The pattern provides a way to access the elements of an aggregate object (like an array or list) sequentially without exposing its internal implementation.

The main idea behind the Iterator Pattern is to separate the logic of iteration from the collection itself, thus promoting clean code and ease of maintenance.

### Structure

The pattern typically consists of the following components:

1. **Iterator Interface**: Defines the methods required for accessing and traversing elements.
    - `hasNext()`: Checks if there are more elements in the collection.
    - `next()`: Returns the next element.
    - `current()`: Returns the current element.

2. **Concrete Iterator**: Implements the `Iterator` interface and is responsible for iterating over the elements of the collection.

3. **Aggregate (or Collection) Interface**: Defines a method to create an iterator (usually called `createIterator()`).

4. **Concrete Aggregate (Collection)**: Implements the `Aggregate` interface and stores the collection elements. It provides a way to create an iterator for the collection.

### UML Diagram

```plaintext
+-----------------+          +---------------------+
|   Client        |          |   Aggregate         |
|                 |          |                     |
+-----------------+          | + createIterator()  |
        |                    +---------------------+
        |                           |
        |                           |
+------------------+           +---------------------+
|  Iterator        |<----------| ConcreteAggregate   |
|                  |           |                     |
| + hasNext()      |           +---------------------+
| + next()         |                     |
| + current()      |                     |
+------------------+                     |
                                          |
+------------------+                 +---------------------+
|  ConcreteIterator|                 | Collection           |
|                  |                 | - elements[]         |
| + hasNext()      |                 |                     |
| + next()         |                 | + createIterator()  |
| + current()      |                 +---------------------+
+------------------+     
```

### Example Code

Here’s a simple Java implementation of the Iterator Pattern for a `BrowserHistory` class:

```java
package iterator;

public interface Iterator {
    boolean hasNext();
    String current();
    void next();
}

public class BrowserHistory {

    private List<String> urls = new ArrayList<>();

    public void setUrls(String url) {
        urls.add(url);
    }

    public String[] getUrls() {
        return urls.toArray(new String[0]);
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    private class ArrayIterator implements Iterator {

        private BrowserHistory history;
        private int index;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.getUrls().length;
        }

        @Override
        public String current() {
            return history.getUrls()[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
```

### Key Points

1. **Encapsulation of Collection Details**: The client interacts with the iterator without knowing the underlying structure of the collection.

2. **Multiple Iterators**: You can create multiple iterators on the same collection, each maintaining its own state (position).

## Where It Is Used

The Iterator Pattern is widely used in various scenarios where you need to traverse collections, particularly when the structure of the collection is complex or when you want to hide the collection’s implementation from the client.

Here are some common examples:

### 1. **Collections Framework (Java, C#)**:
- In languages like Java and C#, iterators are used to traverse data structures such as `List`, `Set`, `Map`, etc. The `Iterator` interface in Java (`java.util.Iterator`) is an application of the Iterator Pattern.

Example in Java:
   ```java
   List<String> names = new ArrayList<>();
   names.add("Alice");
   names.add("Bob");
   
   Iterator<String> iterator = names.iterator();
   while (iterator.hasNext()) {
       System.out.println(iterator.next());
   }
   ```

### 2. **Tree Traversal**:
- The Iterator Pattern is commonly used to traverse non-linear data structures such as trees. Iterators can be implemented to traverse a tree in-order, pre-order, post-order, etc.

### 3. **Custom Data Structures**:
- When building custom data structures, you can implement your own iterators to allow the client to traverse through the elements without exposing the internal workings of the structure.

### 4. **User Interfaces (Composite Pattern)**:
- The Iterator Pattern is often used in conjunction with the Composite Pattern to iterate over UI components such as windows, panels, buttons, etc. For example, iterating over elements in a tree-like UI structure.

### 5. **Database Cursors**:
- In database systems, cursors can be seen as iterators over the rows of a result set. They allow navigation through the rows, providing methods like `hasNext()`, `next()`, etc.

## Benefits of Iterator Pattern

- **Separation of Concerns**: The iterator encapsulates the traversal logic, keeping it separate from the collection’s internal structure.
- **Multiple Iterations**: Allows multiple iterations over the same collection.
- **Flexible**: Works with different types of collections without changing the underlying logic in the client.
- **Simplifies Code**: Clients can traverse collections without needing to understand how the collection is implemented.

## Drawbacks of Iterator Pattern

- **Increased Complexity**: While the Iterator Pattern simplifies traversal, it can also add complexity when used unnecessarily in simple collections.
- **Potential Performance Overhead**: In some cases, iterators can introduce a small performance overhead, especially in time-critical systems.