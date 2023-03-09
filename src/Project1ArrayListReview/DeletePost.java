package Project1ArrayListReview;

import java.util.List;
import java.util.Scanner;

public class DeletePost implements Action {
	public void action(List<BoardBody> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println('\n' + "삭제할 게시물 번호를 입력하세요: ");
		int choice = sc.nextInt();
		sc.nextLine();

		if (list.isEmpty()) {
			System.out.println("삭제할 게시글이 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (choice == list.get(i).getNum()) {
					list.remove(i);
				}
			}

			System.out.println(choice + "번 게시글이 삭제 되었습니다.");
		}
	}
}
