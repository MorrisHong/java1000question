package java1000q;

import java.util.Arrays;

public class QuizEx1 {
	public static void main(String[] args) {
		String[] data = {
                "다음 중 키워드가 아닌 것은?`2`final`True`if`public",
                "다음 중 자바의 연산자가 아닌 것은?`5`&`|`++`!=`/`^",
                "다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false",
          }; 

          for(int i=0;i<data.length;i++) {
        	  String[] temp = data[i].split("`", 2);
        	  String question = temp[0];
        	  String[] temp2 = temp[1].split("`", 2);
        	  String answer = temp2[0];
        	  String[] selection = temp2[1].split("`");
        	  
        	  System.out.println(question);
        	  for(int j = 0; j<selection.length; j++) {
        		  System.out.printf("%d)%s\t\t" , j+1, selection[j]);
        	  }
        	  System.out.println();
        	  
        	  
        	  
        	     // 1. String클래스의 String[] split(String regex, int limit)를 사용해서 문제와 선택지를 나누세요.
                 // 2. 문제를 출력하세요.
                 // 3. 선택지를 나누기 위해 String[] split(String regex)를 사용하세요.
                 // 4.반복문을 이용해서 선택지를 출력하세요.

          }
    	 
    } // main
}