/*
 *Catherine Lin 
 *7th 
 */

import java.awt.image.BufferedImage;
import java.util.EmptyStackException;

public class BufferedImageStack {

    private BufferedImage[] items; // the array holding images
    private int size;              // how many images are in the stack now

    // Start with capacity 2, as required.
    public BufferedImageStack() {
        items = new BufferedImage[2];
        size = 0;
    }

    // If the array is full make a new array of double size and copy over.
    public void push(BufferedImage img) {
        if (img == null) return; // keep it simple and ignore nulls
        if (size == items.length) {
            // double the capacity
            BufferedImage[] bigger = new BufferedImage[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                bigger[i] = items[i];
            }
            items = bigger;
        }
        items[size] = img;
        size++;
    }

    // pop: remove and return the image at the top.
    // Throw EmptyStackException if there is nothing to pop.
    public BufferedImage pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        size--;
        BufferedImage top = items[size];
        items[size] = null; 
        return top;
    }

    // isEmpty returns true if no items in the stack.
    public boolean isEmpty() {
        return size == 0;
    }

    // get: return the image at a specific index.
    // Throw IndexOutOfBoundsException for bad indexes.
    public BufferedImage get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        return items[index];
    }

    // getSize: how many images are currently stored.
    public int getSize() {
        return size;
    }

    // getArraySize: current capacity of the internal array.
    public int getArraySize() {
        return items.length;
    }
}
