package com.board.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.domain.AccomInformVo;
import com.board.domain.BoardVo;
import com.board.domain.BoardVo2;
import com.board.domain.RecommendVo;
import com.board.domain.TrainInformVo;
import com.board.domain.UserVo;

@Mapper
public interface UserMapper {
	// Spring의 service + dao 역할 모두 함
	
	//LoginService.java
	
	UserVo login(HashMap<String, Object> map);
	
	void submit(HashMap<String, Object> map);

	
	// UserService.java
	
	List<UserVo> getUserList();

	UserVo getView(String id);

	 List<UserVo> getViewName(String name);

	void insertReserv(HashMap<String, Object> map);

	List<TrainInformVo> getTrainInform(HashMap<String, Object> map);

	List<AccomInformVo> getAccomReserv(HashMap<String, Object> map);

	void insertAccomReserv(HashMap<String, Object> map);
	
	
	
	
}
