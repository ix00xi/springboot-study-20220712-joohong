package com.springboot.studyjoohong.web.controller.api.board;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studyjoohong.service.board.BoardService;
import com.springboot.studyjoohong.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	// 게시글 작성						
	@PostMapping("/content")
	public ResponseEntity<?> addBoard(CreateBoardReqDto createBoardReqDto) {
		boolean reponseData = false;
		try {
			reponseData = boardService.createBoard(createBoardReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(reponseData);
		}
		return ResponseEntity.ok().body(reponseData);
//		return new ResponseEntity<>(title + "게시글 작성 성공",headers, HttpStatus.BAD_REQUEST);
		
	}
	
	// 게시글 조회
	
	// 게시글 수정
	
	// 게시글 삭제
}
