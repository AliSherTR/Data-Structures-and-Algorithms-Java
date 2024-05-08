package circularQueue;

public class CircularQueue<T> {
    int head , tail = 0;
    int n;
    T[] arr;

    public CircularQueue(int size ) {
        this.n = size;
        this.arr = (T[]) new Object[size];
    }
    private boolean isEmpty() {
        return head == tail;
    }

    private boolean isFull() {
        return (tail - head ) == arr.length;
    }

    public void enqueue( T val) {
        if(isFull()) {
            System.out.println("Dropped " + val);
            return;
        }
        arr[tail % n] = val;
        tail++;
    }

    public T dequeue() {
        if(isEmpty()) {
            return null;
        }
        T val = arr[head % n];
        head++;
        return val;
    }
    public T front() {
        if(isEmpty()) {
            return null;
        }
        return arr[head % n];
    }

    public int size() {
        return tail - head;
    }
}
