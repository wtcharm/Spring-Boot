package cn.mldn.microboot.service.impl;

import cn.mldn.microboot.service.IMessageService;
public class MessageServiceImpl implements IMessageService {
	@Override 
	public String echo() {
		return "www.mldn.cn" ;
	} 
	
}
