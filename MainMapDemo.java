public class MainMapDemo {

    public static void main(String[] args) {

        MyMap<String, Integer> map = new MyMap<>();

        map.put("Deepika", 30);
        map.put("Lakshmi", 25);
        map.put("Ramya", 35);
        map.put("Seetha",20);

        System.out.println("All entries in the map:");
        map.display();
        System.out.println("Lakshmi's age: " + map.get("Lakshmi"));

        System.out.println("Contains key 'Deepika': " + map.containsKey("Deepika"));

        System.out.println("Contains value 35: " + map.containsValue(35));

        map.remove("Ramya");
        System.out.println("After removing 'Ramya':");
        map.display();
    }
}
