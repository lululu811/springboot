package net.xdclass.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.demo.domain.User;

@RestController
public class GetController {

	private Map<String, Object> params = new HashMap<>();

	/**
	 * function:测试
	 * 
	 * @param cityId
	 * @param userId
	 * @return
	 */
	@RequestMapping(path = "/{city_id}/{user_id}", method = RequestMethod.GET)
	public Object findUser(@PathVariable("city_id") String cityId, @PathVariable("user_id") String userId) {
		params.clear();
		params.put("cityId", cityId);
		params.put("userId", userId);
		return params;
	}

	@GetMapping(value = "/v1/page_user1")
	public Object pageUser(int from, int size) {
		params.clear();
		params.put("from", from);
		params.put("size", size);
		return params;
	}

	@GetMapping(value = "/v1/page_user2")
	public Object pageUserV2(@RequestParam(defaultValue="0",name="page") int from,int size) {
		params.clear();
		params.put("from", from);
		params.put("size", size);
		
		return params;
	}
	
	/**
	 * 
	 *1. content-type 为application/json
	 *2.使用body传输数据
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/v1/save_user")
	public Object saveUser(@RequestBody User user) {
		params.clear();
		params.put("user", user);
		return params;
	}
	
	@GetMapping(value="/v1/test_servlet")
	public Object testServlet(HttpServletRequest request) {
		params.clear();
		params.put("id", request.getParameter("id"));
		return params;
		
	}
}
