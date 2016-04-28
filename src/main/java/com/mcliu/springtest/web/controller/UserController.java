package com.mcliu.springtest.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mcliu.springtest.web.entity.SysUser;
import com.mcliu.springtest.web.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	@Qualifier("userService")
	private IUserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(SysUser user, Model model) {
		LOGGER.info("===========login   start==================");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
		SysUser record = new SysUser();
		record.setUsername(user.getUsername());
		List<SysUser> sUsers = userService.selectByInfo(record);
		if (sUsers.isEmpty()) {
			model.addAttribute("errMsg", "用户名不存在，请重新输入");
			LOGGER.info("===========login   end==================");
			return "redirect:/";
		}
		if (!user.getPassword().equals(sUsers.get(0).getPassword())) {
			model.addAttribute("errMsg", "用户名或密码错误，请重新输入");
			LOGGER.info("===========login   end==================");
			return "redirect:/";
		}
		LOGGER.info("===========login   end==================");
		return "success";
	}
}
