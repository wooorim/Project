package Project1HashMapReview;

import java.util.HashMap;

public interface Action {
	public void action(HashMap<Integer, BoardBody> map) throws Exception; 
	//이 함수를 호출 시키는 부분에서 예외처리 던짐.
}
//다형성을 적용하기위해 Action인터페이스를 만들었다.
//HashMap<Integer, BoardBody>형태의 객체를 담을 수 있음 -> 게시물을 담은 해쉬 맵을 불러와서 action()함수를 구현해줌.