package Project1HashMapReview;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DetailPost implements Action {

	public void action(HashMap<Integer, BoardBody> map) {
		Set<Integer> ks = map.keySet(); // key만 담은 Set인터페이스
		Scanner sc = new Scanner(System.in);

		System.out.println('\n' + "게시글 번호를 입력하세요: ");
		int choice = sc.nextInt();
		sc.nextLine();

		for (Integer key : ks) {
			if (choice == key) {
				System.out.print("번호: " + choice + " ");
				System.out.print("제목: " + map.get(choice).getTitle() + " " + " 내용: " + map.get(choice).getBody() + " "
						+ " 작성자: " + map.get(choice).getName() + " " + "작성일: " + map.get(choice).getDate() + '\n');
			}
		}
		if (map.get(choice) == null) {
			System.out.println("선택한 게시물이 없습니다.");
		}

	}
}
