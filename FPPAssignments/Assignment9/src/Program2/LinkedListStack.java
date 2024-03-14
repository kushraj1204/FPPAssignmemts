package Program2;

/**
 * @author kush
 */
public class LinkedListStack {
    class Node{
        Object data;
        Node next;
        Node(Object item){data=item;}

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
    //top node is made just a reference pointer and doesn't count as an element
    private Node top;

    public LinkedListStack() {
        this.top=new Node(0);
    }

    public void push(Object item) {
        Node temp=new Node(item);
        Node currentTopElement=this.top.next;
        temp.next=currentTopElement;
        this.top.next=temp;
    }

    public boolean isEmpty() {
        return top.next==null;
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Node secondTopElement=this.top.next.next;
        this.top.next=secondTopElement;
        return secondTopElement==null?null:secondTopElement.data;
    }

    public Object peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return this.top.next.data;
    }

    public int size(){
        Node current=this.top;
        int counter=0;
        while(current.next!=null){
            counter++;
            current=current.next;
        }
        return counter;
    }

    @Override
    public String toString() {
        return "LinkedListStack{" +
                "top=" + top +
                '}';
    }

    public static void main(String[] args) {
        LinkedListStack stack=new LinkedListStack();
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(7);
        stack.push(9);
        stack.push(8);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
