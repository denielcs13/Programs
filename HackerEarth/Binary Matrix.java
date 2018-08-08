

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LargestSquare {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
        int row = Integer.parseInt(str[0]);
        String str1="";
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for(int i=1;i<=row;i++){
        	str1=br.readLine();
        	map.put(i,str1);
        }
        String s=map.get(1);
        int k=1;
        for(@SuppressWarnings("rawtypes") Map.Entry m:map.entrySet()){
        	if(s.compareTo((String) m.getValue())<0){
        		s=(String) m.getValue();
        		k=(int) m.getKey();
        	}
        }
        System.out.println(k);
	}
}
