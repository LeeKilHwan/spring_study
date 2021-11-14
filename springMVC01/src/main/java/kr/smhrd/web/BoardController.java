package kr.smhrd.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// POJO
// 아래 클래스가 컨크롤러가 되려면 @Controller를 위쪽에다 붙여주어야한다
@Controller
public class BoardController {

	//HandlerMapping(*)
	@RequestMapping("/boardList.do")
	public void boardList() {
		//DB연동  >> (Model)이 있어야한다 즉, 만들어주어야 한다.
	}
	
	@RequestMapping("/boardInsert.do")
	public void boardInsert() {
		System.out.println("인서트 실행!");
	}
	
}
