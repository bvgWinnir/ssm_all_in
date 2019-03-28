package com.sishuok.architecture1.customermgr;

import com.sishuok.architecture1.customermgr.service.ICustomerService;
import com.sishuok.architecture1.customermgr.vo.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceTest {
	@Autowired
	private ICustomerService s = null;
	
	public ICustomerService getS(){
		return s;
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerServiceTest t = (CustomerServiceTest)ctx.getBean("customerServiceTest");
		
		CustomerModel cm = new CustomerModel();
		cm.setCustomerId("c1");
		cm.setPwd("c1");
		cm.setRegisterTime("111");
		cm.setShowName("c1");
		cm.setTrueName("张三");

		
		t.getS().create(cm);

	}
}
