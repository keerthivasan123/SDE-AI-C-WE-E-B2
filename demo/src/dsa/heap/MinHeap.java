package dsa.heap;

// Java program to implement Min Heap

// Main class
public class MinHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    // Constructor to initialize an
    // empty max heap with given maximum
    // capacity
    public MinHeap(int maxsize)
    {
        // This keyword refers to current instance itself
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }

    // Method 1
    // Returning position of parent
    private int parent(int pos) { return (pos - 1) / 2; }

    // Method 2
    // Returning left children
    private int leftChild(int pos) { return (2 * pos) + 1; }

    // Method 3
    // Returning right children
    private int rightChild(int pos)
    {
        return (2 * pos) + 2;
    }

    // Method 4
    // Returning true if given node is leaf
    private boolean isLeaf(int pos)
    {
        if (pos >= (size / 2) && pos < size) {
            return true;
        }
        return false;
    }

    // Method 5
    // Swapping nodes
    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    // Method 6
    // Recursive function to max heapify given subtree
    private void minHeapify(int pos)
    {
        if (isLeaf(pos))
            return;

        if (Heap[pos] > Heap[leftChild(pos)]
                || Heap[pos] > Heap[rightChild(pos)]) {

            if (Heap[leftChild(pos)]
                    < Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                minHeapify(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                minHeapify(rightChild(pos));
            }
        }
    }

    // Method 7
    // Inserts a new element to min heap
    public void insert(int element)
    {
        Heap[size] = element;

        // Traverse up and fix violated property
        int current = size;
        while (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }

    // Method 8
    // To display heap
    public void print()
    {

        for (int i = 0; i < size / 2; i++) {

            System.out.print("Parent Node : " + Heap[i]);

            if (leftChild(i)
                    < size) // if the child is out of the bound
                // of the array
                System.out.print(" Left Child Node: "
                        + Heap[leftChild(i)]);

            if (rightChild(i)
                    < size) // the right child index must not
                // be out of the index of the array
                System.out.print(" Right Child Node: "
                        + Heap[rightChild(i)]);

            System.out.println(); // for new line
        }
    }

    // Method 9
    // Remove an element from min heap
    public int extractMin()
    {
        int popped = Heap[0];
        Heap[0] = Heap[--size];
        minHeapify(0);
        return popped;
    }

    // Method 10
    // main driver method
    public static void main(String[] arg)
    {
        // Display message for better readability
        System.out.println("The MinHeap is ");

        MinHeap minHeap = new MinHeap(15);

        // Inserting nodes
        // Custom inputs
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);

        // Calling minHeap() as defined above
        minHeap.print();

        // Print and display the min value in heap
        System.out.println("The min val is "
                + minHeap.extractMin());

        minHeap.print();

        System.out.println("The min val is "
                + minHeap.extractMin());
    }
}

