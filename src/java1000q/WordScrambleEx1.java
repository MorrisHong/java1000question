package java1000q;

import java.util.Scanner;

class WordScrambleEx1 {
    public static void main(String[] args) {
          String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};
          Scanner scan = new Scanner(System.in);
          
          outter:
          while(true) {
        	  String answer = getAnswer(strArr);
              String question = getScrambledWord(answer);
        	  while(true) {
                  
            	  System.out.println("Question:"+question);
            	  System.out.print("Your Answer is : " );
            	  String myAnswer = scan.nextLine();
            	  
            	  if(myAnswer.equalsIgnoreCase("q")) {
            		  System.out.println("프로그램 종료.");
            		  break;
            	  }else if(myAnswer.equalsIgnoreCase(answer)) {
            		  System.out.println("정답입니다.");
            		  continue outter;
            	  }else {
            		  System.out.println(myAnswer+"는/은 정답이 아닙니다. 다시 시도해주세요.");
            		  continue;
            	  }
        	  }
        	  
          }
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
