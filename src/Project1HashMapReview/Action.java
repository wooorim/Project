package Project1HashMapReview;

import java.util.HashMap;

public interface Action {
	public void action(HashMap<Integer, BoardBody> map) throws Exception; 
	//�� �Լ��� ȣ�� ��Ű�� �κп��� ����ó�� ����.
}
//�������� �����ϱ����� Action�������̽��� �������.
//HashMap<Integer, BoardBody>������ ��ü�� ���� �� ���� -> �Խù��� ���� �ؽ� ���� �ҷ��ͼ� action()�Լ��� ��������.