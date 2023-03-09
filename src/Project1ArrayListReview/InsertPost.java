package Project1ArrayListReview;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class InsertPost implements Action {
	public static int nextNum = 1;
	public void action(List<BoardBody> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println('\n' + "--�Խù� ���--");
		System.out.print("����: ");
		String title = sc.nextLine();
		System.out.print("����: ");
		String body = sc.nextLine();
		System.out.print("�ۼ���: ");
		String name = sc.nextLine();

		BoardBody post = new BoardBody();
		Date nowDate = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		String showDate = date.format(nowDate);

		
		post.setNum(nextNum++);

		post.setTitle(title);
		post.setBody(body);
		post.setName(name);
		post.setDate(showDate);
		list.add(post);

		System.out.println('\n' + "��ȣ: " + post.getNum() + " " + "����: " + post.getTitle());
		System.out.println("�� ���� ���������� ��ϵǾ����ϴ�.");

	}
}
