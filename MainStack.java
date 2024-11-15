public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.printStack();

        numbers.peek();
        numbers.pop();
        numbers.printStack();

        numbers.pop();
        numbers.pop();
        numbers.pop();

        Stack<String> words = new Stack<>();
        words.push("Deepika");
        words.push("Lakshmi");
        words.push("Ramya");
        words.printStack();

        words.pop();
        words.printStack();
    }
}
