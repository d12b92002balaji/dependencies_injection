package com.spring1.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class samsung {
	@Autowired
	@Qualifier("mediatek")
	mobileProcessor cpu;
	
	public mobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(mobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("octa Core ,4 gb ram, 12 mp camera");
		cpu.process();
	}

}
