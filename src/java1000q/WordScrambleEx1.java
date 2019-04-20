package java1000q;

import java.util.Scanner;

class WordScrambleEx1 {
	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };
		Scanner scan = new Scanner(System.in);

		outter: while (true) {
			String answer = getAnswer(strArr);
			String question = getScrambledWord(answer);
			char[] hint = new char[answer.length()];

			for (int i = 0; i < hint.length; i++) {
				hint[i] = '_';
			}

			while (true) {

				System.out.println("Question:" + question);
				System.out.print("Your Answer is : ");
				String myAnswer = scan.nextLine();

				if (myAnswer.equalsIgnoreCase("q")) {
					System.out.println("���α׷� ����.");
					break;
				} else if (myAnswer.equalsIgnoreCase(answer)) {
					System.out.println("�����Դϴ�.");
					continue outter;
				} else {
					System.out.println(myAnswer + "��/�� ������ �ƴմϴ�. �ٽ� �õ����ּ���.");
					System.out.println("Hint : " + getHint(answer, hint));
				}
			}
		}
	} // main

	public static String getAnswer(String[] strArr) {
		return strArr[(int) (Math.random() * strArr.length)];

	}

	public static String getScrambledWord(String str) {
		char[] charArr = str.toCharArray();
		for (int i = 0; i < str.length() * 2; i++) {
			int ranIndex = (int) (Math.random() * charArr.length);
			char tmp = charArr[0];
			charArr[0] = charArr[ranIndex];
			charArr[ranIndex] = tmp;
		}
		return new String(charArr);
	} // scramble(String str)

	public static String getHint(String answer, char[] hint) {
    	int count = 0;	//��Ʈ�� ���Ե� '_'�� ����.
 
    	for(int i = 0; i < hint.length; i++) {
    		if(hint[i] == '_') count++;
    	}
    	
    	while(count > 2) {
    		int ranIndex = (int)(Math.random() * answer.length());
    		
    		if(hint[ranIndex] == '_') {
    			hint[ranIndex] = answer.charAt(ranIndex);
    			break;
    		}else {
    			continue;
    		}
    	}
    	return new String(hint);
    }
}
