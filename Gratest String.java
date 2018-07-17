
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0){
			t--;
			String s = br.readLine();
			int q = Integer.parseInt(br.readLine());
			char[] arr = s.toCharArray();
			int vow= 0;
			if(q==0){
				System.out.println(s);
				continue;
			}
			for(char c:arr){
				if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u' ){
					vow+=1;
				}
			}
			for(int i=0; i<arr.length;i++){
				if(vow>0 && q>0){
					if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u' ){
						arr[i]=(char) ((int)arr[i]+1);
						vow-=1;
						q-=1;
					}
				}
				System.out.print(arr[i]);
			}
			System.out.println();
			
		}
		
	}
}
