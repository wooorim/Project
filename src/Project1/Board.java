package Project1;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Board {

	public static void main(String[] args) {
		HashMap<Integer, BoardBody> map = new HashMap<>();
		Date nowDate = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		String showDate = date.format(nowDate);
		Set<Integer> ks = map.keySet();
		BoardBody boardbody;

		int PostingId = 1;

		System.out.println("<<게시물>>");
		System.out.println("==프로그램 시작==");

		while (true) {
			System.out.println('\n' + "1.목록  2.등록  3.내용  4.삭제  5.종료 ");
			System.out.print("번호를 선택하세요 : ");
			try {
				Scanner sc = new Scanner(System.in);
				int seq = sc.nextInt();
				sc.nextLine();

				if (seq == 5) {
					System.out.println();
					System.out.println("==프로그램 종료==");
					sc.close();
					System.exit(0);
				} else if (seq == 2) {
					System.out.println('\n' + "--게시물 등록--");
					System.out.print("제목: ");
					String title = sc.nextLine();
					System.out.print("내용: ");
					String body = sc.nextLine();
					System.out.print("작성자: ");
					String name = sc.nextLine();

					boardbody = new BoardBody(title, body, name, showDate);
					map.put(PostingId, boardbody);

					System.out.println('\n' + "번호: " + PostingId + " " + boardbody.toString());
					System.out.println("새 글이 정상적으로 등록되었습니다.");

					PostingId++;

				} else if (seq == 1) {
					System.out.println('\n' + "--게시글 전체조회--");
					if (map.isEmpty()) {
						System.out.println("게시글이 없습니다.");

					} else {
						for (Map.Entry<Integer, BoardBody> e : map.entrySet()) {
							System.out.println("번호 : " + e.getKey() + " " + "제목: " + e.getValue().title + " " + "작성자: "
									+ e.getValue().name + " " + "작성일: " + e.getValue().date + " ");
						}
					}

				} else if (seq == 3) {
					System.out.println('\n' + "게시글 번호를 입력하세요: ");
					int choice = sc.nextInt();
					sc.nextLine();

					for (Integer key : ks) {
						if (key.equals(choice)) {
							System.out.println("번호: " + choice + " " + map.get(choice));
						}
					}
				} else if (seq == 4) {

					System.out.println('\n' + "삭제할 게시물 번호를 입력하세요: ");
					int choice = sc.nextInt();
					sc.nextLine();
					if (map.isEmpty()) {
						System.out.println("삭제할 게시글이 없습니다.");
					} else {
						map.remove(choice);
						System.out.println("삭제 되었습니다.");
					}
				}else {
					System.out.println("잘못된 입력입니다.");
					continue;
				}

			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}

		}

	}
}
