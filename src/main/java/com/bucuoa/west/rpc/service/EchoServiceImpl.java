package com.bucuoa.west.rpc.service;

import org.springframework.stereotype.Service;

@Service("echoServiceStub")
public class EchoServiceImpl implements EchoService{
	public String echo(String echo) {
//		try {
//			
		
//			Thread.sleep(new Random().nextInt(1000));
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return "from remote:"+echo;
	}
}
