package com.spring.account.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.account.service.AccountServiceImpl;


@Controller("AccountController")
//@RequestMapping("/account")
public class AccountControllerImpl extends MultiActionController implements AccountController  {
	   @Autowired
	   private AccountServiceImpl accService ; 
//	   public void setAccService(AccountServiceImpl accService){
//	     this.accService = accService;
//	   }	
	   @Override
	   @RequestMapping(value="account/sendMoney.do", method = RequestMethod.GET)
	   public ModelAndView sendMoney(HttpServletRequest request, HttpServletResponse response) 
			   throws Exception 
	   {
	      ModelAndView mav=new ModelAndView();
	      accService.sendMoney();
	      mav.setViewName("result");
	      return mav;
	   }
}
