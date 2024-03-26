public class Main {
    public static void main(String ...args) throws Exception {
        var arr = new StaticArray<Integer>(8);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        arr.insert(60);
        arr.print();
        arr.insert(25, 2);
        arr.print();
        arr.insert(35, 4);
        arr.print();
        arr.delete(3);
        arr.delete(6);
        arr.delete(0);
        arr.print();
    }
}