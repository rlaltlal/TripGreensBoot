package com.board.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.BoardVo;
import com.board.domain.BoardVo2;
import com.board.domain.RecommendVo;

@Mapper
public interface BoardMapper2 {
	// Spring의 service + dao 역할 모두 함
	
	int countArticle(String searchOption, String keyword, String subcategory, String menu_id);

	List<BoardVo2> listAll(int start, int end, String searchOption, String keyword, String subcategory, String menu_id);

	void boardInsert(BoardVo2 boardVo);

	BoardVo2 getBoard(HashMap<String, Object> map);

	BoardVo2 getBoard2(HashMap<String, Object> map);

	void boardDelete(HashMap<String, Object> map);

	void boardUpdate(HashMap<String, Object> map);


	List<BoardVo2> listAll2( @Param("subcategory") String subcategory, @Param("menu_id") String menu_id );

	List<RecommendVo> getRecommend(HashMap<String, Object> map); 

	void insertRecommend(HashMap<String, Object> map);
	
}
