package Project1ArrayList;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class InsertPost implements Action {
	
	public static int nextNum = 1;
	
	public void action(List<BoardBody> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println('\n' + "--게시물 등록--");
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("내용: ");
		String body = sc.nextLine();
		System.out.print("작성자: ");
		String name = sc.nextLine();

		BoardBody post = new BoardBody();
		Date nowDate = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		String showDate = date.format(nowDate);

		
		post.setNum(nextNum++); //게시글이 추가될 때마다 1씩 증가, static으로 선언해서 다른 객체에서도 사용가능
		//게시글을 삭제해도 번호는 증가된다. 

		post.setTitle(title);
		post.setBody(body);
		post.setName(name);
		post.setDate(showDate);
		list.add(post);

		System.out.println('\n' + "번호: " + post.getNum() + " " + "제목: " + post.getTitle());
		System.out.println("새 글이 정상적으로 등록되었습니다.");

	}
}
