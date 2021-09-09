package com.spring1.springproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragonprocessor implements mobileProcessor{
	public void process()
	{
		System.out.println("world best Cpu");
	}

}
