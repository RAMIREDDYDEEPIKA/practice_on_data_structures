class Stack<T>
{
    public Node<T> top; // Top of the stack

    public static class Node<T>
    {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T data)
    {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }

    public T pop()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        T poppedData = top.data;
        top = top.next;
        System.out.println("Popped: " + poppedData);
        return poppedData;
    }

    public T peek()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        System.out.println("Top element is: " + top.data);
        return top.data;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public void printStack()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty ");
            return;
        }
        System.out.print("Data present in the Stack : ");
        Node<T> current = top;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println();
    }
}


