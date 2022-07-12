package com.springbook.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;

@Controller
@SessionAttributes("boards")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/dataTransform.do")
	@ResponseBody
	public List<BoardVO> dataTransform(BoardVO vo) {
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardsList = boardService.getBoardsList(vo);
		return boardsList;
	}
	
	@RequestMapping("/insertBoards.do")
	public String insertBoards(BoardVO vo) throws IOException {
//		boardDAO.insertBoards(vo);
		
		MultipartFile uploadFile = vo.getUploadFile();
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("D:\\servlet\\image/" + fileName));
		}
		
		boardService.insertBoards(vo);
		return "getBoardsList.do";
	}

	@RequestMapping("/updateBoards.do")
	public String updateBoards(@ModelAttribute("boards") BoardVO vo) {
//		System.out.println("번호 : " + vo.getSeq());
//		System.out.println("제목 : " + vo.getTitle());
//		System.out.println("작성자 : " + vo.getWritter());
//		System.out.println("내용 : " + vo.getContent());
//		System.out.println("등록일 : " + vo.getRegDate());
//		System.out.println("조회수 : " + vo.getCnt());
//		boardDAO.updateBoards(vo);
		boardService.updateBoards(vo);
		return "getBoardsList.do";
	}
	
	@RequestMapping("/deleteBoards.do")
	public String deleteBoards(BoardVO vo) {
//		boardDAO.deleteBoards(vo);
		boardService.deleteBoards(vo);
		return "getBoardsList.do";
	}

	@RequestMapping("/getBoards.do")
	public String getBoards(BoardVO vo, Model model) {
//		mav.addObject("boards", boardDAO.getBoards(vo));
//		mav.setViewName("getBoard.jsp");
//		model.addAttribute("boards", boardDAO.getBoards(vo));
		
		model.addAttribute("boards", boardService.getBoards(vo));
		return "getBoard.jsp";
	}
	
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}
	
	// @RequestMapping
	
//	@RequestMapping("/getBoardsList.do")
//	public String getBoardsList(BoardVO vo, BoardDAO boardDAO, Model model) {
////		mav.addObject("boardsList", boardDAO.getBoardsList(vo));
////		mav.setViewName("getBoardList.jsp");
//		
//		model.addAttribute("boardsList", boardDAO.getBoardsList(vo));
//		return "getBoardList.jsp";
//	}
	
	// RequestParam
	
//	@RequestMapping("/getBoardsList.do")
//	public String getBoardsList(@RequestParam(value="searchCondition", 
//	defaultValue="TITLE", required=false) String condition, 
//			@RequestParam(value="searchKeyword", defaultValue = "", required = false)
//			String keyword, BoardVO vo, BoardDAO boardDAO, Model model) {
//		System.out.println("검색 조건 : " + condition);
//		System.out.println("검색 단어 : " + keyword);
//		model.addAttribute("boardsList", boardDAO.getBoardsList(vo));
//		return "getBoardList.jsp";
	
	
	@RequestMapping("/getBoardsList.do")
	public String getBoardsList(BoardVO vo, Model model) {
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		model.addAttribute("boardsList", boardService.getBoardsList(vo));
		return "getBoardList.jsp";
	}

}













