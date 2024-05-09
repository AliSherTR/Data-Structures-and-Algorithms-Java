package circularQueue;

public class PriorityQueue<T> {
    CircularQueue<T> high = new CircularQueue<>(6);
    CircularQueue<T> medium = new CircularQueue<>(6);
    CircularQueue<T> low = new CircularQueue<>(6);

    public void enqueue(T val , int priority) {
        if(priority == 0) {
            high.enqueue(val);
        }
        else if (priority == 1) {
            medium.enqueue(val);
        }
        else {
            low.enqueue(val);
        }
    }

    public T dequeue() {
        if(!high.isEmpty()) {
            return high.dequeue();
        } else if (!medium.isEmpty()) {
            return medium.dequeue();
        }
        else
            return low.dequeue();
    }

    public int getSize() {
        return (high.size() + medium.size() + low.size());
    }
}
