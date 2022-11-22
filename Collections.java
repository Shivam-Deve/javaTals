import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(2);
        // int a = arr.get(1);
        // System.out.println(a);
        // System.out.println(arr.remove(arr.size() - 1));
        // System.out.println(arr);

        // LinkedList<Integer> lst = new LinkedList<>();

        // lst.add(1);
        // lst.addFirst(2);
        // lst.removeLast();
        // lst.remove(0);
        // System.out.println(lst.size());

        // HashMap<String, Integer> map = new HashMap<>();

        // map.put("India", 45);
        // map.put("pakistan", 7);

        // int val = map.get("India");
        // System.out.println(val);

        // Boolean b = map.containsKey("pakistan");
        // System.out.println(b);

        // System.out.println(map);

        // TreeMap<Integer, Integer> map = new TreeMap<>();

        // map.put(1, 100);
        // map.put(2, 200);
        // map.put(0, 10000);

        // System.out.println(map);

        // HashSet

        HashSet<Integer> has = new HashSet<>();
        has.add(1);
        has.add(0);

        for (int n : has) {
            System.out.println(n);
        }

        // has.remove(0);

        // int num = 5;
        // Integer n;
        // n = num; // boxing

        // int b = n; // unboxing
    }
}
