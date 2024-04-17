package usingArray;

public class Stack <T>{
    int top = -1;
   T[] arr = (T[]) new Object[10];


   // check if the top is less than or equal to -1, if so that means stack is empty
   private boolean isEmpty() {
       return top <= -1;
   }

   // check if the top is equal to length-1 of the array
   private boolean isFull() {
       return top >= arr.length-1;
   }

   // method to get the top-most value
   public T pop() {
       if(isEmpty()) {
           System.out.println("Stack is underflown");
           return null;
       }
       return arr[top--];
   }

   // method to add a value in the stack
  public void push(T val) {
        if(isFull()) {
            System.out.println("Stack is overflown");
        }
        else {
            top++;
            arr[top] = val;
        }

  }

  // method to return the top value of the stack
  public T peek(){
       if(isEmpty()) {
           return null;
       }
       return arr[top];
  }

  // method to get the size of the stack
  public int size(){
       return top + 1;
  }

}
