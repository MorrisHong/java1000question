package java1000q;

class WordScrambleEx1 {
    public static void main(String[] args) {
          String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

          String answer = getAnswer(strArr);
          String question = getScrambledWord(answer);

          System.out.println("Question:"+question);
          System.out.println("Answer:"+answer);
    } // main

    public static String getAnswer(String[] strArr) { 
    	return strArr[(int)(Math.random() * strArr.length)];

    }
   
    public static String getScrambledWord(String str) { 
    	char[] charArr = str.toCharArray();
    	for(int i = 0; i < str.length() * 2; i++) {
    		int ranIndex = (int)(Math.random() * charArr.length);
    		char tmp = charArr[0];
    		charArr[0] = charArr[ranIndex];
    		charArr[ranIndex] = tmp;
    	}
    	return new String(charArr);
    	

    } // scramble(String str)
}
