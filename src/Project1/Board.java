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

		System.out.println("<<�Խù�>>");
		System.out.println("==���α׷� ����==");

		while (true) {
			System.out.println('\n' + "1.���  2.���  3.����  4.����  5.���� ");
			System.out.print("��ȣ�� �����ϼ��� : ");
			try {
				Scanner sc = new Scanner(System.in);
				int seq = sc.nextInt();
				sc.nextLine();

				if (seq == 5) {
					System.out.println();
					System.out.println("==���α׷� ����==");
					sc.close();
					System.exit(0);
				} else if (seq == 2) {
					System.out.println('\n' + "--�Խù� ���--");
					System.out.print("����: ");
					String title = sc.nextLine();
					System.out.print("����: ");
					String body = sc.nextLine();
					System.out.print("�ۼ���: ");
					String name = sc.nextLine();

					boardbody = new BoardBody(title, body, name, showDate);
					map.put(PostingId, boardbody);

					System.out.println('\n' + "��ȣ: " + PostingId + " " + boardbody.toString());
					System.out.println("�� ���� ���������� ��ϵǾ����ϴ�.");

					PostingId++;

				} else if (seq == 1) {
					System.out.println('\n' + "--�Խñ� ��ü��ȸ--");
					if (map.isEmpty()) {
						System.out.println("�Խñ��� �����ϴ�.");

					} else {
						for (Map.Entry<Integer, BoardBody> e : map.entrySet()) {
							System.out.println("��ȣ : " + e.getKey() + " " + "����: " + e.getValue().title + " " + "�ۼ���: "
									+ e.getValue().name + " " + "�ۼ���: " + e.getValue().date + " ");
						}
					}

				} else if (seq == 3) {
					System.out.println('\n' + "�Խñ� ��ȣ�� �Է��ϼ���: ");
					int choice = sc.nextInt();
					sc.nextLine();

					for (Integer key : ks) {
						if (key.equals(choice)) {
							System.out.println("��ȣ: " + choice + " " + map.get(choice));
						}
					}
				} else if (seq == 4) {

					System.out.println('\n' + "������ �Խù� ��ȣ�� �Է��ϼ���: ");
					int choice = sc.nextInt();
					sc.nextLine();
					if (map.isEmpty()) {
						System.out.println("������ �Խñ��� �����ϴ�.");
					} else {
						map.remove(choice);
						System.out.println("���� �Ǿ����ϴ�.");
					}
				}else {
					System.out.println("�߸��� �Է��Դϴ�.");
					continue;
				}

			} catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}

		}

	}
}
