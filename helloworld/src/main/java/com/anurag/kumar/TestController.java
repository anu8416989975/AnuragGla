package com.anurag.kumar;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller

public class TestController {
     @RequestMapping("/test")
	public String run() {
    
		return "test";
	}
}
