package Project1HashMapReview;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InsertPost implements Action {
	public static int PostingId = 0;

	public void action(HashMap<Integer, BoardBody> map) {

		Scanner sc = new Scanner(System.in);

		System.out.println('\n' + "--게시물 등록--");
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("내용: ");
		String body = sc.nextLine();
		System.out.print("작성자: ");
		String name = sc.nextLine();

		PostingId++;

		BoardBody boardbody = new BoardBody();
		Date nowDate = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		String showDate = date.format(nowDate);

		boardbody.setTitle(title);
		boardbody.setBody(body);
		boardbody.setName(name);
		boardbody.setDate(showDate);
		map.put(PostingId, boardbody);

		System.out.print('\n' + "번호: " + PostingId + " ");
		System.out.println("제목: " + boardbody.getTitle());
		System.out.println("새 글이 정상적으로 등록되었습니다.");
	}
}
