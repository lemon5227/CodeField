import org.junit.Test;

public class StringDemo1 {


	public String reverse(String str,int startIndex,int endIndex){
		char[] arr = str.toCharArray();
		for(int x=startIndex,y=endIndex;x<y;x++,y--){
			char temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
		return  new String(arr);
	}

	//方法二:使用String的拼接
	public String reverse1(String str,int startIndex,int endIndex){
		String reverseStr = str.substring(0,startIndex);
		for(int i =endIndex;i >= startIndex;i--){
			reverseStr += str.charAt(i);
		}
		reverseStr+=str.substring(endIndex+1);
		return reverseStr;
	}
	@Test
	public void testReverse(){
		String str = "abcdefg";
		String reverse = reverse1(str, 2, 5);
		System.out.println(reverse);
	}

}
