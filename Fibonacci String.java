import java.util.*;
 
class Main
{
	static boolean isDynamic(String s){
		String uniqueChar = "";
		int count=0;
		int temp;
		int[] intArr = new int[(int) s.chars().distinct().count()];
		for(int i=0;i<s.length();i++){
			if(uniqueChar.indexOf(s.charAt(i))==-1)
				uniqueChar+=s.charAt(i);
		}
		for(int i=0; i<uniqueChar.length(); i++){
			for(int j=0;j<s.length();j++){
				if (s.charAt(j) == uniqueChar.charAt(i)){
					count++;
				}
			}
			intArr[i]=count;
			count=0;
		}
		Arrays.sort(intArr);
		if(intArr.length<3)
			return true;
		if(intArr.length>=4 && intArr[3]!=intArr[2]+intArr[1]){
			temp=intArr[0];
			intArr[0]=intArr[1];
			intArr[1]=temp;
		}
		for(int i =2; i<intArr.length; i++){
			if(intArr[i]!=intArr[i-1]+intArr[i-2])
				return false;
		}
	return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++){
			String s = sc.next();
			if(isDynamic(s))
				System.out.println("Dynamic");
			else
				System.out.println("Not");
			
		}
		sc.close();
	}
}