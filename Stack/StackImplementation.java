package Stack;
/*
        @author : Aayush Gulia
        @email : aayushgulia07@outlook.com


        top(index) --> 0 1 2 3 4
        position -->   5 4 3 2 1

        position = {(top - position + 1)};

        All these methods have time complexity O(1).
 */

public class StackImplementation {
    static final int MAX = 100;
    int top=-1; //-1 is empty condition
    int[] a = new int[MAX];

    public static void main(String[] args) {
        StackImplementation st = new StackImplementation();
        st.push(165);
        st.push(345);
        st.push(57);
        st.push(115);
        st.push(876);
        System.out.println("Stack empty : "+st.isEmpty());
        System.out.println("Stack full : "+st.isFull());
        System.out.println("Stack top : "+st.stackTop());
        System.out.println("Element at pos 1 : "+st.peek(1));
    }
    int stackTop(){
        if (!isEmpty()){
            return a[top];
        }
        else
            return -1;
    }
    boolean isFull(){
        if (top == MAX-1){
            return true;
        }
        else
            return false;
    }
    boolean isEmpty(){
        if (top==-1){
            return true;
        }
        else
            return false;
    }
    int peek(int position){
        if (top - position +1 < 0){
            System.out.println("Invalid Position");
            return -1;
        }
        else
            return a[top-position+1];
    }

    void display(){
        int i;
        for(i=top;i>=0;i--){
            System.out.println(a[i]);
        }
    }

    boolean push (int x){
        if (top == MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top]=x;
            System.out.println("Element "+x+" pushed in stack");
            return true;
        }
    }

    int pop(){
        int x=-1;
        if (top < 0){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            x = a[top];
            top--;
            return x;
        }
    }



//    static void push(int [] a, int element){
//
//    }
}
