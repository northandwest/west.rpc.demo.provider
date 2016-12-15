package com.bucuoa.west.rpc.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bucuoa.utils.WestZookeeperClient;


@Service("echoServiceStub")
public class EchoServiceImpl implements EchoService{
	@Resource
	@Qualifier("zkCLient")
	private WestZookeeperClient zkCLient;
	public String echo(String echo) {
		String string = "";
		try {
			 string = zkCLient.get("/server");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		try {
//			
		
//			Thread.sleep(new Random().nextInt(1000));
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return string+"==>from remote:"+echo;
	}
}
