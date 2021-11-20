package kr.smhrd.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.Board;
import kr.smhrd.mapper.BoardMapper;

// POJO
// 아래 클래스가 컨크롤러가 되려면 @Controller를 위쪽에다 붙여주어야한다
@Controller
public class BoardController {
	//이미 메모리에 만들어진 객체를 가져오는 기법(DI(Dependency Injection) => 의존성 주입)
	@Autowired
	BoardMapper mapper;
	
	//HandlerMapping(*)
	@RequestMapping("/boardList.do")
	public String boardList(HttpServletRequest request) {
		//DB연동  >> (Model)이 있어야한다 즉, 만들어주어야 한다.
		List<Board> list = mapper.boardList();
		//boardList.jsp
		request.setAttribute("list", list);
		//                    ViewResolver
		return "boardList";  // ==> /WEB-INF/views/boardList.jsp
		
	}
	
	@RequestMapping("/boardInsert.do")
	public void boardInsert() {
		System.out.println("인서트 실행!");
	}
	
}
