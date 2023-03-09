package Project1HashMap;

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

		for (Integer key : ks) { //해쉬 맵에 담겨져 있는 키를 기준으로 반복문 돈다.
			if (choice == key) { //입력한 번호와 키의 키워드가 일치하면 실행
				System.out.print("번호: " + choice + " ");
				System.out.print("제목: " + map.get(choice).getTitle() + " " + " 내용: " + map.get(choice).getBody() + " "
						+ " 작성자: " + map.get(choice).getName() + " " + "작성일: " + map.get(choice).getDate() + '\n');
			}else if (map.get(choice) == null) { //해쉬 맵에 입력한 번호가 없으면 밑에 코드 출력
				System.out.println("선택한 게시물이 없습니다.");
			}
		}

	}
}
