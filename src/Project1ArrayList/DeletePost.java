package Project1ArrayList;

import java.util.List;
import java.util.Scanner;

public class DeletePost implements Action {
	public void action(List<BoardBody> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println('\n' + "삭제할 게시물 번호를 입력하세요: ");
		int choice = sc.nextInt();
		sc.nextLine();

		if (list.isEmpty()) { //list에 아무것도 저장되어 있지 않을 때
			System.out.println("삭제할 게시글이 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) { //i는 인덱스 번호, list인덱스를 도는 for문
				if (choice == list.get(i).getNum()) { //입력한 번호에 해당되는 게시글 내용(인데스)에 담겨져있는 게시글 번호 가 일치하면
					list.remove(i); //그 인덱스를 삭제
				}
			}

			System.out.println(choice + "번 게시글이 삭제 되었습니다.");
		}
	}
}
