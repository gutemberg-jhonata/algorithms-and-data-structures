package hash;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.print();
        map.put("Alice", "NYC");
        map.put("Brad", "Chicago");
        map.put("Collin", "Seattle");
        map.print();
        System.out.println(map.get("Daronko"));
        System.out.println(map.get("Collin"));
        map.remove("Alice");
        map.print();
        System.out.println(map.get("Brad"));
    }
}