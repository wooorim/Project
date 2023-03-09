package Project1HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DeletePost implements Action {
	public void action(HashMap<Integer, BoardBody> map) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> ks = map.keySet(); 

		System.out.println('\n' + "������ �Խù� ��ȣ�� �Է��ϼ���: ");
		int choice = sc.nextInt();
		sc.nextLine();

		if (map.isEmpty() || (!ks.contains(choice))) { //�ؽ� �ʿ� �ƹ����� �� ���� ���� �� or �Է��� ��ȣ�� �ؽ� �� Ű�� ���� ��
			System.out.println("������ �Խñ��� �����ϴ�.");
		} else {
			map.remove(choice); //�ش� ��ȣ�� ��ġ�ϴ� Ű�� ������ ����
			System.out.println(choice + "�� �Խñ��� ���� �Ǿ����ϴ�.");
		}
	}
}