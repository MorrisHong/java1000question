package java1000q;

import java.util.Arrays;

public class QuizEx1 {
	public static void main(String[] args) {
		String[] data = {
                "���� �� Ű���尡 �ƴ� ����?`2`final`True`if`public",
                "���� �� �ڹ��� �����ڰ� �ƴ� ����?`5`&`|`++`!=`/`^",
                "���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����?`1`void`null`false",
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
        	  
        	  
        	  
        	     // 1. StringŬ������ String[] split(String regex, int limit)�� ����ؼ� ������ �������� ��������.
                 // 2. ������ ����ϼ���.
                 // 3. �������� ������ ���� String[] split(String regex)�� ����ϼ���.
                 // 4.�ݺ����� �̿��ؼ� �������� ����ϼ���.

          }
    	 
    } // main
}