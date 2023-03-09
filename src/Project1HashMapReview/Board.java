package Project1HashMapReview;

import java.util.HashMap;
import java.util.Scanner;

public class Board {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, BoardBody> map = new HashMap<>();
		Action action = null;

		System.out.println("<<게시물>>");
		System.out.println("==프로그램 시작==");

		while (true) {
			System.out.println('\n' + "1.목록  2.등록  3.내용  4.삭제  5.종료 ");
			System.out.print("번호를 선택하세요 : ");
			String seq = sc.nextLine();

			switch (Integer.parseInt(seq)) { //string타입을 int타입으로 변환해줌.
			case 1: //키보드 입력값이 1일 때
				action = new ListPost(); //다형성을 적용시켰기 때문에 action객체로 ListPost객체를 불러옴.
				try {
					action.action(map); //action객체에 있는 action함수를 불러와서 해쉬 맵 객체를 담아 호출.
				} catch (Exception e) {
					System.out.println("ListPost Error");
				}

				break;

			case 2: //입력값이 2일 때
				action = new InsertPost(); //등록 InsertPost객체 담아줌
				try {
					action.action(map);
				} catch (Exception e) {
					System.out.println("InsertPost Error");
				}
				break;

			case 3: //입력값이 3일 때
				action = new DetailPost(); //내용 DetailPost객체 담아줌
				try {
					action.action(map);
				} catch (Exception e) {
					System.out.println("DetailPost Error");
				}

				break;

			case 4: //입력값이 4일 때
				action = new DeletePost(); //삭제 DeletPost객체 담아줌
				try {
					action.action(map);
				} catch (Exception e) {
					System.out.println("Delete Error");
				}

				break;

			case 5: //입력값이 5일 때
				System.out.println("==프로그램 종료==");
				sc.close();
				System.exit(0);

				break;

			default:
				System.out.println("잘못 선택하셨습니다.");
				break;
			}

		}

	}
}
