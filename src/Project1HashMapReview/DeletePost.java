package Project1HashMapReview;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DeletePost implements Action {
	public void action(HashMap<Integer, BoardBody> map) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> ks = map.keySet(); 

		System.out.println('\n' + "삭제할 게시물 번호를 입력하세요: ");
		int choice = sc.nextInt();
		sc.nextLine();

		if (map.isEmpty() || (!ks.contains(choice))) { 
			System.out.println("삭제할 게시글이 없습니다.");
		} else {
			map.remove(choice);
			System.out.println(choice + "번 게시글이 삭제 되었습니다.");
		}
	}
}
