package Project1HashMap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InsertPost implements Action {
	public static int PostingId = 0; //static���� �������༭ �ٸ� Ŭ���������� �����ϱ� ���ؼ�(main������ ����ϱ� ������)

	public void action(HashMap<Integer, BoardBody> map) {

		Scanner sc = new Scanner(System.in);

		System.out.println('\n' + "--�Խù� ���--");
		System.out.print("����: ");
		String title = sc.nextLine();
		System.out.print("����: ");
		String body = sc.nextLine();
		System.out.print("�ۼ���: ");
		String name = sc.nextLine();

		PostingId++; //�Խñ� ����� ������ ��ȣ 1�� ����, �Խñ��� �����ص� ��ȣ�� �����Ѵ�.

		BoardBody boardbody = new BoardBody();
		Date nowDate = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		String showDate = date.format(nowDate);
		
		//Ű���� �Է�����  ���� ���� ���� setter�Լ��� �����
		boardbody.setTitle(title); 
		boardbody.setBody(body);
		boardbody.setName(name);
		boardbody.setDate(showDate);
		//BoardBody��ü�� �ҷ��ͼ� setter�Լ��� ����� ������ �ؽ� �ʿ� �����
		map.put(PostingId, boardbody);

		System.out.print('\n' + "��ȣ: " + PostingId + " ");
		System.out.println("����: " + boardbody.getTitle());
		System.out.println("�� ���� ���������� ��ϵǾ����ϴ�.");
	}
}
