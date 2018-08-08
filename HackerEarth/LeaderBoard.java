

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class LeaderBoard {
	
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        
        Map<String,Long> map1=new HashMap<String,Long>();
        int t= s.nextInt();
        for(int i=0; i<t; i++){
        	String str1=s.next();
        	String str2=s.next();
        	if(map1.containsKey(str1)){
				long x =map1.get(str1);
				map1.put(str1, x+(120-Long.parseLong(str2)+99999));
			}
			else{
				map1.put(str1, 120-Long.parseLong(str2)+99999);
			}
        }
        TreeMap<String, Long> sorted = new TreeMap<>();
        sorted.putAll(map1); 
        Set<Entry<String, Long>> set = sorted.entrySet();
        List<Entry<String, Long>> list = new ArrayList<Entry<String, Long>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Long>>()
        {
            public int compare( Map.Entry<String, Long> o1, Map.Entry<String, Long> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        int i=0;
        for (Map.Entry<String, Long> entry : list) {
            System.out.println(++i +" "+ entry.getKey());
        }
        s.close();
    }
}
