package base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.toString());
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("4", 4);
        map.put("3", 2);
        System.out.println(map.toString());
        
        list = null;
        
        Set<String> set = new HashSet<String>(list);
        Set<String> treeSet = new TreeSet<String>(list);
        
        
        System.out.println(set);
        System.out.println(treeSet);
    }
}
