package com.springboot.studyjoohong.web.dto.board;

import com.springboot.studyjoohong.domain.board.Board;

import lombok.Data;

@Data
public class CreateBoardReqDto {
	
	private String title;
	private int usercode;
	private String content;
	
	public Board toEntity() {
		return Board.builder()
					.title(title)
					.usercode(usercode)
					.content(content)
					.build();
	}
}
