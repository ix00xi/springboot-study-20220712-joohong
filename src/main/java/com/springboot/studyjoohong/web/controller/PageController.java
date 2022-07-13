package com.springboot.studyjoohong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	// 페이지 로드 할때 쓰는 컨트롤러
public class PageController {
	
	@GetMapping({"/", "index"})
	public String indexPage() {
		return "index";
	}
}
