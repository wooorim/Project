package Project1HashMap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InsertPost implements Action {
	public static int PostingId = 0; //static으로 선언해줘서 다른 클래스에서도 접근하기 위해서(main에서도 사용하기 때문에)

	public void action(HashMap<Integer, BoardBody> map) {

		Scanner sc = new Scanner(System.in);

		System.out.println('\n' + "--게시물 등록--");
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("내용: ");
		String body = sc.nextLine();
		System.out.print("작성자: ");
		String name = sc.nextLine();

		PostingId++; //게시글 등록할 때마다 번호 1씩 증가, 게시글을 삭제해도 번호는 증가한다.

		BoardBody boardbody = new BoardBody();
		Date nowDate = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		String showDate = date.format(nowDate);
		
		//키보드 입력으로  받은 값을 각각 setter함수에 담아줌
		boardbody.setTitle(title); 
		boardbody.setBody(body);
		boardbody.setName(name);
		boardbody.setDate(showDate);
		//BoardBody객체를 불러와서 setter함수를 사용해 정보를 해쉬 맵에 담아줌
		map.put(PostingId, boardbody);

		System.out.print('\n' + "번호: " + PostingId + " ");
		System.out.println("제목: " + boardbody.getTitle());
		System.out.println("새 글이 정상적으로 등록되었습니다.");
	}
}
