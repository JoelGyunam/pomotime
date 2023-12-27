package kr.co.pomotime;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping()
	public Map<String,String> whoAreyou() {
		Map<String, String> response = new HashMap<>();
		response.put("message", "it's pomotime.");
		return response;
	}
}
