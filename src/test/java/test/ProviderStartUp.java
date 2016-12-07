package test;

import java.util.concurrent.locks.LockSupport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bucuoa.west.rpc.tags.Consumer;
import com.bucuoa.west.rpc.tags.Provider;

public class ProviderStartUp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

		Provider p3 = (Provider) ctx.getBean("provider");
		System.out.println(p3.getId());
		System.out.println(p3.getAlias());
		System.out.println(p3.getInterfac3());
		
		System.out.println("provider is started");

		LockSupport.park();

	}
}
