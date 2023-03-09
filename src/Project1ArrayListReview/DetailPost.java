package Project1ArrayListReview;

import java.util.List;
import java.util.Scanner;

public class DetailPost implements Action {
	public void action(List<BoardBody> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println('\n' + "게시글 번호를 입력하세요: ");
		int choice = sc.nextInt();
		sc.nextLine();

		for (BoardBody post : list) {
			if (post.getNum() == (choice)) {
				System.out.println("번호: " + post.getNum());
				System.out.println("제목: " + post.getTitle() + " 내용: " + post.getBody() + " 작성자: " + post.getName()
						+ " 작성일: " + post.getDate());
			}
		}
	}

}
