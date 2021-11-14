package kr.smhrd.mapper;

import java.util.List;

import kr.smhrd.domain.Board;

// JDBC(Java + SQL) --> 생산성이 떨어진다. , 유지보수가 어렵다. 

public interface BoardMapper {
	//board table에서 게시판 리스트를 가져오는 동작구현(boardList)
	// 게시글의 대한 전체 정보를 반환해야 하므로 List타입으로 반환되는 함수 구현
	public List<Board> boardList();  //SQL문은 별도로 분리된 공간에 만들어준다.
}
