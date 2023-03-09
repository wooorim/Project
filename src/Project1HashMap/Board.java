package Project1HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Board {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, BoardBody> map = new HashMap<>();
		Action action = null;

		System.out.println("<<�Խù�>>");
		System.out.println("==���α׷� ����==");

		while (true) {
			System.out.println('\n' + "1.���  2.���  3.����  4.����  5.���� ");
			System.out.print("��ȣ�� �����ϼ��� : ");
			String seq = sc.nextLine();

			switch (Integer.parseInt(seq)) {
			case 1:
				action = new ListPost();
				try {
					action.action(map);
				} catch (Exception e) {
					System.out.println("ListPost Error");
				}

				break;

			case 2:
				action = new InsertPost();
				try {
					action.action(map);
				} catch (Exception e) {
					System.out.println("InsertPost Error");
				}
				break;

			case 3:
				action = new DetailPost();
				try {
					action.action(map);
				} catch (Exception e) {
					System.out.println("DetailPost Error");
				}

				break;

			case 4:
				action = new DeletePost();
				try {
					action.action(map);
				} catch (Exception e) {
					System.out.println("Delete Error");
				}

				break;

			case 5:
				System.out.println("==���α׷� ����==");
				sc.close();
				System.exit(0);

				break;

			default:
				System.out.println("�߸� �����ϼ̽��ϴ�.");
				break;
			}

		}

	}
}
