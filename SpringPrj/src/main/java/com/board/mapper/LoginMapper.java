package com.board.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.domain.BoardVo;
import com.board.domain.UserVo;

@Mapper
public interface LoginMapper {
	// Spring의 service + dao 역할 모두 함
	
	//글쓰기
	public UserVo getUserVo(String userid);
	
}
