package kr.ac.kopo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import kr.ac.kopo.dto.BankUser;
import kr.ac.kopo.service.BankUserService;

@Controller
@RequestMapping("/member")
public class BankUserController {
	
	@Autowired
	private BankUserService bankUserService;
	
	@RequestMapping(value = "/bankUser")
	public ModelAndView showUser () {
		
		ModelAndView modelAndView = new ModelAndView();
		
		List<BankUser> user = bankUserService.selectBankUserList();
		
		modelAndView.addObject("member" , user);
		
		modelAndView.setViewName("/user");
		
		return modelAndView;
		
	}
	
}
