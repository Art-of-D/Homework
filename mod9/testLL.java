import java.util.HashMap;


public class testLL {
    public static void main(String[] args) {

        MyHashMap<Integer, String> hM = new MyHashMap<>();
        hM.put(1, "first");
        hM.put(2, "second");
        hM.put(3, "third");
        //System.out.println(hM.remove(1));
        System.out.println(hM.size());
        hM.clear();
        System.out.println(hM.size());
    }
}
