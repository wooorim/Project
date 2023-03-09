package Project1HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DetailPost implements Action {

	public void action(HashMap<Integer, BoardBody> map) {
		Set<Integer> ks = map.keySet(); // key�� ���� Set�������̽�
		Scanner sc = new Scanner(System.in);

		System.out.println('\n' + "�Խñ� ��ȣ�� �Է��ϼ���: ");
		int choice = sc.nextInt();
		sc.nextLine();

		for (Integer key : ks) { //�ؽ� �ʿ� ����� �ִ� Ű�� �������� �ݺ��� ����.
			if (choice == key) { //�Է��� ��ȣ�� Ű�� Ű���尡 ��ġ�ϸ� ����
				System.out.print("��ȣ: " + choice + " ");
				System.out.print("����: " + map.get(choice).getTitle() + " " + " ����: " + map.get(choice).getBody() + " "
						+ " �ۼ���: " + map.get(choice).getName() + " " + "�ۼ���: " + map.get(choice).getDate() + '\n');
			}else if (map.get(choice) == null) { //�ؽ� �ʿ� �Է��� ��ȣ�� ������ �ؿ� �ڵ� ���
				System.out.println("������ �Խù��� �����ϴ�.");
			}
		}

	}
}
