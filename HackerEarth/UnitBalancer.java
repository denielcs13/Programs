

import java.util.*;

public class UnitBalancer {
	public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        long x =1;
        String large="";
        String small="";
        String[] units=s.nextLine().split(",");
        List<String> unitsList= new ArrayList<String>();
        HashMap<String,String> map = new HashMap<String,String>();
        
        for(int i=0; i<units.length-1; i++){
        	String[] str = s.nextLine().split(" = ");
        	map.put(str[0], str[1]);
        }
        
        s.close();
        
        for(String str1: map.values()){
        	String[] str2=str1.split(" ");
        	unitsList.add(str2[1]);
        }
        
        for (String value: units) {
        	if(!unitsList.contains(value)){
        		large=value;
        	}
        }
        
        for (String key: units) {
        	if(!map.containsKey(key)){
        		small=key;
        	}
        }
        
        System.out.print("1"+large);
        while(!large.equals(small)){
        	String[] str3={"0","0"};
        	if (map.get(large) != null){
        		str3 = map.get(large).split(" ");
        	}
        	x*=Long.parseLong(str3[0]);
        	large=str3[1];
        	System.out.print(" = "+x+large);
        }

    }
}
