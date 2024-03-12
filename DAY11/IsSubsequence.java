package DAY11;

public class IsSubsequence {
    public static String isSubsequence(String str1, String str2) {    
    	// Write your code here.
		int j=0;
		for(int i=0;i<str1.length();i++){
			boolean a = false;
			while(j<str2.length()){
				if(str1.charAt(i)==str2.charAt(j)){
					a = true;
					j++;
					break;
				}
				j++;
			}

			if(a==false) return "False";
		}

		return "True";	
	}
}
