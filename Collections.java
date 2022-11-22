import java.util.*;

public class Collections {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); // append data to the of arraylist
        arr.add(2);
        arr.set(0, 5); // set(index,value) used to set a data at particular index
        int num = arr.get(1); // get [data at index] from arraylist by passing index value into get
        int sizeAList = arr.size(); // to get the size of arrayList
        int removedData = arr.remove(0); // remove data by providing it's index

        // how to loop on ArrayList
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // optional
        System.out.println(num);
        System.out.println(sizeAList);
        System.out.println(removedData);
        System.out.println();
        System.out.println(arr);

        /*-----------------------------------------------------------------------------------------------------------------------------*/

        // LinkedList
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(1); // append data to the end of list
        lst.addFirst(2); // add data to the front of list
        lst.addLast(5); // add data to the last of list
        int val1 = lst.get(0); // get value from a particular index
        int val2 = lst.getFirst(); // get value from first index
        int val3 = lst.getLast(); // get value from last index
        lst.removeLast(); // remove data from last
        lst.removeFirst(); // remove from front of list
        lst.remove(0); // remove data from a particular index
        int size = lst.size(); // get the size of list
        // linkedlist can be looped exactly like arraylist

        /*-------------------------------------------------------------------------------------------------------------------------------*/

        // NOTE: all the maps are [key:value] pairs and has all same methods like
        // {put(),get(),containsKey()}

        // HashMap [not sorted]
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 45); // puts a [key:value] pair into map
        map.put("pakistan", 7);
        int val = map.get("India"); // returns a value for key or (null if key is not present)
        map.remove("pakistan"); // removes(key)=> removes a [key:value] value
        Boolean b = map.containsKey("pakistan"); // returns true if key is present

        // how to loop on hashmap
        for (String key : map.keySet()) {
            int data = map.get(key);
            System.out.println("hm" + data);
        }

        // optional
        System.out.println(val);
        System.out.println(b);
        System.out.println(map);

        /*----------------------------------------------------------------------------------------------------------------------------------*/

        // TreeMap [sorted]
        // NOTE: TreeMap is exactly same as HashMap
        // only difference is "TreeMap is sorted and HashMap is not"
        TreeMap<Integer, Integer> tMap = new TreeMap<>();
        tMap.put(1, 100);
        tMap.put(2, 200);
        tMap.put(0, 10000);
        int tval = tMap.get(1); // return value for a key
        tMap.remove(1); // removes(key)=> removes a [key:value] value
        Boolean ifPresent = tMap.containsKey(0); // returns true if key is present

        // how to loop on hashmap
        for (int key : tMap.keySet()) {
            int data = tMap.get(key);
            System.out.println("hm" + data);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------*/

        // HashSet
        HashSet<Integer> has = new HashSet<>();
        has.add(1); // adds a value to the set
        has.add(0);
        has.remove(0); // removes provided val from set and returns true/false
        int hasSize = has.size();
        boolean ifPre = has.contains(1); // return true if val is present

        // how to loop hashSet
        for (int n : has) {
            System.out.println(n);
        }
        has.remove(0);
    }
}
