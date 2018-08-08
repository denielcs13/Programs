import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Festival {
    public static void main(String args[] ) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long t = Integer.parseInt(in.readLine());
        while(t>0){
            t-=1;
            long n = Integer.parseInt(in.readLine());
            Map<String, ArrayList<Long>> map = new LinkedHashMap< String, ArrayList<Long>>();
            Map<String, Long> map1 = new LinkedHashMap< String, Long>();
            for(long i=0; i<n; i++){
            	String[] str = in.readLine().split(" ");
            	if(map.containsKey(str[0])){
            		ArrayList<Long> list = map.get(str[0]);
            		list.add((long) Integer.parseInt(str[1]));
            		map.put(str[0], list);
            	}else{
            		map.put(str[0], new ArrayList<>(Arrays.asList( (long) Integer.parseInt(str[1]))));
            	}
            }
            map.forEach((k,v) -> {
            	Collections.sort(v);
            	Collections.reverse(v);
            	long sum=0;
            	for(int j=0; j<v.size() && j<3; j++){
            		sum += v.get(j);
            	}
            	map1.put(k, sum);
            });
            Map<String, Long> treeMap = new TreeMap<String, Long>(map1);
            long max=0;
            for(long l : treeMap.values()){
            	if(l>max){
            		max=l;
            	}
            }
            for(@SuppressWarnings("rawtypes") Map.Entry m:treeMap.entrySet()){
            	if(m.getValue().equals(max)){
            		System.out.println(m.getKey()+" "+m.getValue());
            		break;
            	}
            }
        }
    }
}