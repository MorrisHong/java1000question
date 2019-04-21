package java1000q;

import java.util.Scanner;

class ConsoleEx1 {
	static String[] argArr; // 입력한 매개변수를 담기위한 문자열배열

	public static void main(String[] args) {
		while (true) {
			String prompt = ">>";
			System.out.print(prompt);

			// 화면으로부터 라인단위로 입력받는다.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();

			input = input.trim();
			argArr = input.trim().split(" +");
			
			
			if (input.equalsIgnoreCase("Q")) { // q 또는 Q를 입력하면 실행종료한다.
				System.exit(0);
			} else {
				for (int i = 0; i < argArr.length; i++) {
					System.out.println(argArr[i]);
				}
				/*
				 * 위의 코드를 향상된 for문으로 변경하면 다음과 같다. for(String arg : argArr) {
				 * System.out.println(arg); }
				 */
			}
		} // while(true)
	} // main
} // class
