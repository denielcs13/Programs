
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Ideone {
	
static int binaryToDecimal(String n)
    {
        String num = n;
        int dec_value = 0;
        int base = 1;
     
        int len = num.length();
        for (int i = len - 1; i >= 0; i--)
        {
            if (num.charAt(i) == '1'){
            	dec_value += base;
            	dec_value = dec_value%1000000007;
            }
            base = base << 1;
            base = base %1000000007;
        }
     
        return dec_value;
    }
    
        public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0){
			t--;
			boolean flag=true;
			long n = Integer.parseInt(br.readLine());
			String[] strArr = br.readLine().split(" ");
			int[] intArr = Arrays.asList(strArr).stream().mapToInt(Integer::parseInt).toArray();
			int num1=0; 
			for(int i:intArr){
				if(i==1)
					num1+=1;
			}
			if(num1 == 0){
				System.out.println("0");
				flag=false;
				continue;
			}
			if(num1%3!=0){
				System.out.println("-1");
				flag=false;
				continue;
			}
			int[] zeroArr = new int[num1];
			int num0=0;
			int x = num1-1;
			for(int i=intArr.length-1; i>=0; i--){
				if(intArr[i]==1){
					zeroArr[x]=num0;
					num0=0;
					x-=1;
					continue;
				}
				num0+=1;
			}
			int b= num1/3;
			if(zeroArr[3*b-1]>zeroArr[b-1] && zeroArr[3*b-1]>zeroArr[2*b-1]){
				System.out.println("-1");
				flag=false;
				continue;
			}else{
				for(int i = 0; i<b-1;i++){
					if(zeroArr[i]==zeroArr[i+b] && zeroArr[i]==zeroArr[i+(2*b)]){
						continue;
					}
					else{
						System.out.println("-1");
						flag=false;
						break;
					}
				}
			}
			if(!flag){
			    continue;
			}
			String binaryString = "";
			for(int i=num1-b;i<num1;i++){
				if(zeroArr[i]==0){
					binaryString +='1';
				}
				else{
					binaryString +='1';
					for(int j=0;j<zeroArr[i];j++){
						binaryString +='0';
					}
				}
			}
			if(flag){
			    System.out.println(binaryToDecimal(binaryString));
			}
		}
	}

}