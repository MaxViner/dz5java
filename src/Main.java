

import java.util.*;

public class Main {


    public static void main(String[] args) {
        HashMap<Integer, String > map =
                new HashMap<>();
        map.put(1,"red");
        map.put(2,"green");
        map.put(3,"blue");
        System.out.println(map.values());
        String val;

        for(int i=1; i<=map.values().size();i++){
            val=map.get(i)+"!";
            map.replace(i,val);
        }
        System.out.println(map.values());

        int rand_ind;

        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(1,"red");
        tmap.put(2, "green");
        tmap.put(3, "blue" );

        for(int i=1; i<=tmap.values().size();i++){
            val=tmap.get(i)+"!";
            tmap.replace(i,val);
        }
        System.out.println(tmap.values());

        TreeMap<Integer, String> test_map = new TreeMap<>();

        for(int i=1; i<=1000;i++){
            rand_ind= (int) (Math.random()*10000);
            test_map.put(rand_ind,"one_more_string");
        }

        long time = System.currentTimeMillis();

        for (Integer key: test_map.keySet())
            System.out.println(key+" = "+test_map.get(key));



        long time2 = System.currentTimeMillis();
        Set<Integer> keys = test_map.keySet();
        System.out.println(keys);
        // получить набор всех значений
        Collection<String> values = test_map.values();
        System.out.println(values);

        System.out.println("      время последовательного перебора в ms");
        System.out.println(System.currentTimeMillis() - time);


        System.out.println("      время получения всехзначений независимо друг от друга в ms");
        System.out.println(System.currentTimeMillis() - time2);


    }
}

