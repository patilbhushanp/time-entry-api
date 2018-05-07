package com.sanbhu.api.controller.html;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.api.controller.BaseHtmlController;

@Controller
public class ClicktimeController extends BaseHtmlController {
	
	@RequestMapping("/showRestCallEditor")
	public String showRestCallEditor(Map<String, Object> model) {
		return "restCall/restCallEditor";
	}
}
