package DAY3;

public class EncodetheMessage {
    public static String encode(String message) {
		// Write your code here.

		StringBuilder ans = new StringBuilder();
		for(int i =0;i<message.length();i++){
			char curr = message.charAt(i);
			int count =1;
			while(i<message.length()-1 && curr == message.charAt(i+1)){
				count++;
				i++;
			}
			ans.append(curr);
			ans.append(count);
		}

		return ans.toString();
	}
}
