
public class MainLikdList {
    public static void main(String[] args) {
        LinkedList<Integer> number=new LinkedList<>();
        number.add(10);
        number.add(30);
        number.add(20);
        number.add(50);
        number.printList();
        System.out.println();
        number.remove(2);
        number.remove(20);
        number.printList();

        System.out.println();
        LinkedList<Character> letters=new LinkedList<>();
        letters.add('d');
        letters.add('e');
        letters.add('a');
        letters.printList();
        System.out.println();
        letters.remove('e');
        letters.printList();
    }
}
