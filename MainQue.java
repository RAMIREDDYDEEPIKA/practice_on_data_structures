public class MainQue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new Queue<>();
        numbers.enqueue(10);
        numbers.enqueue(20);
        numbers.enqueue(30);

        System.out.println("Dequeued element: " + numbers.dequeue());
        System.out.println("Front element: " + numbers.peek());
        System.out.println("Queue size: " + numbers.size());

        Queue<String> words = new Queue<>();
        words.enqueue("Deepika");
        words.enqueue("Lakshmi");

        System.out.println("Dequeued element: " + words.dequeue());
        System.out.println("Front element: " + words.peek());
        System.out.println("Queue size: " + words.size());
    }
}
