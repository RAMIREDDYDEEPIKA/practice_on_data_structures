public class LinkedList<T>
{
    public Node<T> head;

    public void add(T data)
    {
        Node<T> newNode = new Node<>(data);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node<T> current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added: " + data);
    }

    public void remove(T data)
    {
        if (head == null)
        {
            System.out.println("List is empty. Nothing to remove.");
            return;
        }

        if (head.data.equals(data))
        {
            head = head.next;
            System.out.println("Removed a element " + data);
            return;
        }

        Node<T> current = head;
        while (current.next != null)
        {
            if (current.next.data.equals(data))
            {
                current.next = current.next.next;
                System.out.println("Removed a element: " + data);
                return;
            }
            current = current.next;
        }
        System.out.println();
        System.out.println("Element not found: " + data);
    }

    public void printList()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        Node<T> current = head;
        System.out.print("LinkedList: ");
        while (current != null)
        {
            System.out.print(current.data + "  ");
            current = current.next;
        }
    }
}
