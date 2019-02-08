import java.util.*;
import java.util.HashMap;
import java.util.Map.*;

public class Map {
public static void main(String [] args) {
HashMap<Integer,String> map = new HashMap<Integer, String>();     //HashMap is the implementation of Map.
map.put(1,"A");
map.put(2,"B");
map.put(3,"C");
map.put(4,"D");
map.put(5,"E");
//Elements can transverse in any order/

for(HashMap.Entry<Integer, String> m : map.entrySet()) {

System.out.println(m.getKey()+ " " +m.getValue());
}
}
}

