package java1000q;

import java.util.Scanner;

class ConsoleEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String prompt = ">>";
			System.out.print(prompt);
			String input = scan.nextLine();
			
			if(input.equalsIgnoreCase("q")) break;
			System.out.println(input);
			
			/*
			 * 
			 * ������ ���� ������ �ڵ带 ��������.
			 * 
			 * 1. ȭ�����κ��� ���δ����� �Է¹޴´�. - java.util.ScannerŬ���� ��� 2. q �Ǵ� Q�� �Է��ϸ� ���������Ѵ�.
			 * 
			 */

		} // while(true)
	} // main
} // class
