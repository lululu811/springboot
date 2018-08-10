package net.xdclass.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherHttpController {

	private Map<String ,Object> param=new HashMap<>();
	
	@PostMapping(value="v1/save_users")
	public Object saveUser(String name,String pwd) {
		return param;
	}
}
