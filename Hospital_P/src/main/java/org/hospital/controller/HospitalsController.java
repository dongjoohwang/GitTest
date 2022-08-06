package org.hospital.controller;

import org.hospital.domain.Criteria;
import org.hospital.domain.HospitalsVO;
import org.hospital.domain.PageDTO;
import org.hospital.service.HospitalsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/hospitals/*")
@AllArgsConstructor
public class HospitalsController {

	private HospitalsService service;
	
	@GetMapping("/hospitalMain.do")
	public void hospitalMain() {
		log.info("-----hospitalMain-----");
	}
	
	@GetMapping("/self-diagnosis.do")
	public void selfdiagnosis() {
		log.info("-----self-diagnosis-----");
	}
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		log.info("cri+ " + cri);
		int total = service.getTotal(cri);
		log.info("total count : " + total);
		
		model.addAttribute("list", service.getList(cri));
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	@GetMapping("/register")
	public void register() {
		
	}
	
	@PostMapping("/register")
	public String register(HospitalsVO vo, RedirectAttributes rttr) {
		log.info("register : " + vo);
		service.register(vo);
		rttr.addFlashAttribute("result", vo.getBno());
		return "redirect:/hospitals/list";
	}
	
	@GetMapping({"/get", "/modify"})
	public void get(Long bno,  @ModelAttribute("cri") Criteria cri , Model model) {
		log.info("--------------get or modify--------------");
		model.addAttribute("hospitals", service.get(bno));
	}
	
	@PostMapping("/remove")
	public String remove(Long bno, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		log.info("remove---------" + bno);
		if(service.remove(bno)==1) {
			rttr.addFlashAttribute("result", "success");
		}
		
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		return "redirect:/hospitals/list";
	}
	
	@PostMapping("/modify")
	public String modify(HospitalsVO vo, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		log.info("modify : " + vo);
		if( service.modify(vo) == 1) {
			rttr.addFlashAttribute("result", "success");
		}
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		return "redirect:/hospitals/list";
	}
	
	
	
	
	
	
		
}