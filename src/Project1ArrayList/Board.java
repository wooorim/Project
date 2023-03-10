package Project1ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<BoardBody> list = new ArrayList<BoardBody>();
		Action action = null;

		System.out.println("<<게시물>>");
		System.out.println("==프로그램 시작==");

		while (true) {
			System.out.println('\n' + "1.목록  2.등록  3.내용  4.삭제  5.종료 ");
			System.out.print("번호를 선택하세요 : ");
			String seq = sc.nextLine();

			switch (Integer.parseInt(seq)) {
			case 1:

				action = new ListPost();
				try {
					action.action(list);
				} catch (Exception e) {
					System.out.println("ListPost Error");
				}
				break;
			case 2:

				action = new InsertPost();
				try {
					action.action(list);
				} catch (Exception e) {
					System.out.println("InsertPost Error");
				}
				break;
			case 3:

				action = new DetailPost();
				try {
					action.action(list);
				} catch (Exception e) {
					System.out.println("DetailPost Error");
				}
				break;
			case 4:
				
				action = new DeletePost();
				try {
					action.action(list);
				} catch (Exception e) {
					System.out.println("Delete Error");
				}
				break;
			case 5:
				System.out.println("==프로그램 종료==");
				sc.close();
				System.exit(0);
				break;
			}
		}

	}
}
