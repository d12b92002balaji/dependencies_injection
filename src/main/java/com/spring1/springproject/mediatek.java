package com.spring1.springproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class mediatek implements mobileProcessor {
	public void process()
	{
		System.out.println("2nd best cpu");
	}

}
