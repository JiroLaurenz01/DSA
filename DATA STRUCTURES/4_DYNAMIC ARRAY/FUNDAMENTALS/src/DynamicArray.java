public class DynamicArray {
    int size;                    // Initialize the size of the dynamic array.
    int capacity = 10;           // Initialize the initial capacity as 10.

    Object[] array;              // Declare an array to hold elements.

    public DynamicArray() {
        this.array = new Object[capacity]; // Constructor for creating a DynamicArray with default capacity.
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;         // Constructor for creating a DynamicArray with a specified capacity.
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity)
            grow();   // If the size exceeds the current capacity, increase the array's size.

        array[size++] = data;  // Add the given data to the end of the array and increment the size.
    }

    public void insert(int index, Object data) {
        if (size >= capacity)
            grow();  // If the size exceeds the current capacity, increase the array's size.
        
        for (int i = size; i > index; i--)
            array[i] = array[i - 1]; // Shift elements to make space for the new data.

        array[index] = data; // Insert the new data at the specified index.
        size++;  // Increment the size.
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) 
                    array[i + j] = array[i + j + 1]; // Shift elements to fill the gap left by deleted data.

                array[size - 1] = null; // Set the last element to null and decrement the size.
                size--;

                if (size <= (int)(capacity / 3))
                    shrink();  // If the size is less than one-third of the capacity, reduce the array's size.

                break;
            }
        }
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++)
            if (array[i] == data)
                return i; // Search for the given data and return its index if found.

        return -1; // Return -1 if the data is not found in the array.
    }

    private void grow() {
        int newCapacity = (int)(capacity * 2); // Increase the capacity by doubling it.
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) 
            newArray[i] = array[i]; // Copy elements to the new, larger array.

        capacity = newCapacity;
        array = newArray; // Update the capacity and array reference.
    }
    
    private void shrink() {
        int newCapacity = (int)(capacity / 2); // Decrease the capacity by half.
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) 
            newArray[i] = array[i]; // Copy elements to the new, smaller array.

        capacity = newCapacity;
        array = newArray; // Update the capacity and array reference.
    }

    public boolean isEmpty() {
        return size == 0; // Check if the dynamic array is empty.
    }

    public String toString() {
        String string = "[ ";

        for (int i = 0; i < size; i++)
            string += array[i] + (i + 1 == size ? " ]" : ", "); // Build a string representation of the array.

        if (string == "")
            string = "]"; // If the array is empty, create an empty representation.

        return string;
    }
}


