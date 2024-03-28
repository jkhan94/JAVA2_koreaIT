package api;

public class APITest3 {

	public static void main(String[] args) {

// 외부 API
// JAR 파일 추가

// Lotto	
// 자동 번호 선택 
		Lotto lotto = new Lotto();
		lotto.getLotto();
		System.out.println();

// Lotto2
// 번호 직접 선택하면 로또 형식 [ 1, 2, ... ,4] 식으로 출력
// 동일한 숫자를 입력할 경우 중복된 번호이니 다시 입력하라고 뜸
		Lotto2 lotto2 = new Lotto2();
		lotto2.buyLotto();

//		JAR를 추가하지 않았지만 네트워크 통신을 통해 사용가능
//		서버에서 응답결과를 보내줌
//		JAR를 추가하지 않았지만 네트워크 통신을 통해 사용가능
//		서버에서 응답결과를 보내서 화면에 뿌려줌
//		eg) 네이버 개발자센터 파파고 API
//		    kakao developers

	}

}
