package CH02;

public class exam_001 {

	public static void main(String[] args) {
		byte a = 127;
		//byte가 가질 수 있는 최댓값
		
		int b = a;
		//자동 형변환이 가능, a에 담긴 127숫자가 b에도 담길 수 있다.
		
		float c = b;
		//자동 형변환이 가능, 실수형은 정수형을 담을 수 있다.
		//정수형 숫자 127은 실수형으로 바꾸어도 127.0이 된다.
		//원래의 데이터가 왜곡되지 않는다면 자동 형변환이 가능하다.

	}

}
