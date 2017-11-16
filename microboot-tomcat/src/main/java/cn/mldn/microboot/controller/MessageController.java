package cn.mldn.microboot.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mldn.microboot.service.IMessageService;

@Controller
public class MessageController {
	@Resource
	private IMessageService messageService; 
//	@RequestMapping("/error")
	@ResponseBody
	public Object error() {
		return "出错啦。" ;
	}
	
	@RequestMapping("/show")
	public String show(Model model) {  // 传递参数
		System.err.println(10 / 0); // 出现500错误
		model.addAttribute("msg", this.messageService.echo()) ;
		return "message/message_show" ;   // 要跳转的路径
	}
}
