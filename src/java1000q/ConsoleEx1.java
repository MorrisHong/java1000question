package java1000q;

import java.util.Scanner;

class ConsoleEx1 {
	static String[] argArr; // �Է��� �Ű������� ������� ���ڿ��迭

	public static void main(String[] args) {
		while (true) {
			String prompt = ">>";
			System.out.print(prompt);

			// ȭ�����κ��� ���δ����� �Է¹޴´�.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();

			input = input.trim();
			argArr = input.trim().split(" +");
			
			
			if (input.equalsIgnoreCase("Q")) { // q �Ǵ� Q�� �Է��ϸ� ���������Ѵ�.
				System.exit(0);
			} else {
				for (int i = 0; i < argArr.length; i++) {
					System.out.println(argArr[i]);
				}
				/*
				 * ���� �ڵ带 ���� for������ �����ϸ� ������ ����. for(String arg : argArr) {
				 * System.out.println(arg); }
				 */
			}
		} // while(true)
	} // main
} // class
