package com.springboot.studyjoohong.service.board;

import com.springboot.studyjoohong.web.dto.board.CreateBoardReqDto;
import com.springboot.studyjoohong.web.dto.board.CreateBoardRespDto;
import com.springboot.studyjoohong.web.dto.board.ReadBoardRespDto;

public interface BoardService {
	public CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	public ReadBoardRespDto readBoard(int boardcode) throws Exception;
	public ReadBoardRespDto readBoardList(int page) throws Exception;
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean deleteBoard(int boardcode) throws Exception;
	
}
