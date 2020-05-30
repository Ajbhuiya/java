package datastructure;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {

        Map<Integer, String> mp = new HashMap();
        mp.put(1,"aj");
        mp.put(2,"bj");
        mp.put(3,"tj");
        mp.put(4,"cj");
        System.out.println(mp.isEmpty());
        System.out.println(mp.containsValue("rj"));
        System.out.println(mp.size());
        System.out.println(mp.isEmpty());

        for(Map.Entry<Integer, String> item: mp.entrySet()){
            int key = item.getKey();
            String vaue = item.getValue();
            System.out.println(item);


        }





        //System.out.println(mp.get(1));
       // Set<Map.Entry<Integer, String>> ke =mp.entrySet();

        //print map one way
      /*  for(Map.Entry<Integer, String> entry:mp.entrySet()){
          int key = entry.getKey();
          String value = entry.getValue();
            System.out.println("Key: " + key + "value: " + value);*/
           //another way System.out.println(entry.getKey() + entry.getValue());

           // another way
           /* for(Integer key :mp.keySet()){//retreiving the key set
                String value = mp.get(key);//retrieve values
                System.out.println("key:  " + key + ", value: " +value);*/
            }

            //linked map- maintains order they are added

  /*      Map<Integer, String> linkHashMaps = new LinkedHashMap<Integer, String>();

            // Map<Integer, String> treeMaps = new TreeMap<Integer, String>();
            //tree map maintains natural order

        linkHashMaps.put(1,"aj");
        linkHashMaps.put(2,"bj");
        linkHashMaps.put(3,"tj");
        linkHashMaps.put(4,"cj");
*/

        }




