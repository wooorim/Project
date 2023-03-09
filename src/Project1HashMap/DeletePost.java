package Project1HashMap;

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

		if (map.isEmpty() || (!ks.contains(choice))) { //해쉬 맵에 아무값도 들어가 있지 않을 때 or 입력한 번호가 해쉬 맵 키에 없을 때
			System.out.println("삭제할 게시글이 없습니다.");
		} else {
			map.remove(choice); //해당 번호와 일치하는 키가 있으면 삭제
			System.out.println(choice + "번 게시글이 삭제 되었습니다.");
		}
	}
}
