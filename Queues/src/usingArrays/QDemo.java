package usingArrays;

public class QDemo {
    public static void main(String[] args) {
        Queue<Integer> q1 = new Queue<>();
        System.out.println(q1.isEmpty());

        q1.isEmpty();
        q1.isFull();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.enqueue(6);
        q1.enqueue(7);
        System.out.println(q1.dequeueWithMoreComplexity());
        System.out.println(q1.dequeueWithMoreComplexity());
        System.out.println(q1.dequeueWithMoreComplexity());
        System.out.println(q1.dequeueWithMoreComplexity());
        System.out.println(q1.dequeueWithMoreComplexity());
        System.out.println(q1.dequeueWithMoreComplexity());
        System.out.println(q1.dequeueWithMoreComplexity());

        q1.enqueue(9);
        System.out.println(  q1.front());



    }
}
