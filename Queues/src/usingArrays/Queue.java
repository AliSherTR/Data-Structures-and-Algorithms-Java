package usingArrays;


/* The following are the primitive operations in a queue
* 1) isFull
* 2) isEmpty
* 3) size
* 4) enqueue
* 5) dequeue
* 6) front
*/

public class Queue <T> {
    int head = 0 , tail = -1;
    T[] arr = (T[]) new Object[7];
    public boolean isEmpty(){
        return tail <= -1;
    }
    public boolean isFull(){
        return tail >= arr.length -1;
    }
    public void enqueue(T val){
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        tail++;
        arr[tail] = val;
    }
    // this method will remove the item at head but will shrink the size of the queue
    public T dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        } else if (head > tail) {
            System.out.println("No more items left in the queue");
            return null;
        }
        return arr[head++];
    }
    private void moveForward() {
        for(int i = 1 ; i <= tail ; i++) {
            arr[i-1] = arr[i];
        }
        tail--;
    }
    // this method will not shrink the size of the queue and remove the item from the head
    public T dequeueWithMoreComplexity() {
        if(isEmpty()) {
            return null;
        }
        T val = arr[head];
        moveForward();
        return val;
    }
    public T front() {
        return arr[head];
    }
    public int size() {
        return tail + 1;
    }
}
