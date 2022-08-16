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
	@GetMapping("/checkout.do")
	public void checkout() {
		log.info("-----checkout-----");
	}
	
	@GetMapping("/self-diagnosis.do")
	public void selfdiagnosis() {
		log.info("-----self-diagnosis-----");
	}
	
	@GetMapping("/my_page.do")//
	public void my_page() {
		log.info("-----my_page-----");
	}
	
	@GetMapping("/my_review.do")//
	public void my_review() {
		log.info("-----my_review-----");
	}
	
	@GetMapping("/my_card.do")//
	public void my_card() {
		log.info("-----my_card-----");
	}
	
	@GetMapping("/card.do")//
	public void card() {
		log.info("-----card-----");
	}
	
	@GetMapping("/reservation.do")//
	public void reservation() {
		log.info("-----reservation-----");
	}
	
	@GetMapping("/question.do")//
	public void question() {
		log.info("-----question-----");
	}
	
	@GetMapping("/randc.do")//
	public void randc() {
		log.info("-----randc-----");
	}
	@GetMapping("/delivery.do")//
	public void delivery() {
		log.info("-----delivery-----");
	}
	@GetMapping("/clinic.do")//
	public void clinic() {
		log.info("-----clinic-----");
	}
	@GetMapping("/reserverecord.do")//
	public void reserverecord() {
		log.info("-----reserverecord-----");
	}
	@GetMapping("/terms.do")//
	public void terms() {
		log.info("-----terms-----");
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