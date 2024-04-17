package usingArray;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(9);
        st.push(10);
        
        System.out.println(st.size());
        st.pop();

        System.out.println(st.size());
        System.out.println(st.peek());
        st.pop();
        st.pop();
    }
}
