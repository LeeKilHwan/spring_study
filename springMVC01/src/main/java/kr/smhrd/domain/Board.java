package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data : 롬복API에서 만들어놓은 라이브러리 >> getter, setter를 만들어


@Data //getter, setter 만들어준다.
@AllArgsConstructor //모든 매개인자를 포함한 생성자를 만들어준다.
@NoArgsConstructor  // 객체생성을 위한 디폴트 생성자를 만들어준다.
public class Board {

	private int idx;
	private String title;
	private String contents;
	private String writer;
	private String indate;
	private int count;
	
	//setter, getter  -> 자동으로 만들수 있다. 
	//lombok(롬복)을 통해서 (getter, setter메소드를 만들지 않고도 자동으로처리할수있다.)
	//MVN REPOSITORY에서 lombok최신버전을 pom.xml을 통해 다운로드 해준다.(자바 소스코드에서 lombok의 라이브러리 이용하기위한 연동)
	// 이클립스와 lombok도 연결해주어야 한다. (연결하면 @Data를 추가하면 자동으로 setter, getter가 생성된다.)
}
