package day43_map;


    import java.util.*;

    public class AllMapObjects {
        public static void main(String[] args) {

            Map<String, String> map =new HashMap<>();  //Order no guaranteed | null as key is OK
            map.put("James", "Java");
            map.put("Tom", "Cartoon");
            map.put("Bond", "Movie");
            map.put("Nadir", "Automation");
            map.put(null, "test");
            map.put("check", null);
            System.out.println(map);

            // map.put("Bond", "Theater");
            // System.out.println(map);


            System.out.println();
            Map <String, String> linked = new LinkedHashMap<>(); // Maintains the Insertion Order | null as key is OK
            linked.put("James", "Java");
            linked.put("Tom", "Cartoon");
            linked.put("Bond", "Movie");
            linked.put("Nadir", "Automation");
            linked.put(null, "test");
            linked.put("check", null);
            System.out.println(linked);


            System.out.println();       // Maintains the SORTER (Ascending) ORDER | null as key is NOT OK
            Map <String, String> treeMap = new TreeMap<>();
            treeMap.put("James", "Java");
            treeMap.put("Tom", "Cartoon");
            treeMap.put("Bond", "Movie");
            treeMap.put("Nadir", "Automation");
            // treeMap.put(null, "test");
            treeMap.put("check", null);
            System.out.println(treeMap);


            System.out.println();
            Map <String, String> tableMap = new Hashtable<>(); // Order is NOT guaranteed | null as key or as value is NOT OK
            tableMap.put("James", "Java");
            tableMap.put("Tom", "Cartoon");
            tableMap.put("Bond", "Movie");
            tableMap.put("Nadir", "Automation");
            // treeMap.put(null, "test");
/*
    .put(key, value);  ---- > this method will add a key and value if the key does not exist in the map. If the key is already in the map, it will just update the value.
    .get(key);          --- > this method will return the value of the matching key, if there is no matching, it will return null
    .containsKey(key);  --- > this method will return boolean if the given key exist among the keys in the map
    .containsValue(value); - > this method will return boolean if the given value exist among the values in the map
    .remove(key);       --- > this method will remove the data (key & value), if the given key is among the keys in the map
    //-----------------------
    .keySet();         ---- > this method will return the set of the key in the map
    .values();         ---- > this method will return the list of values in the map
    .entrySet();       ---- > this method will return a single row map on each iteration
 */            // tableMap.put("check", null);


        }

}
