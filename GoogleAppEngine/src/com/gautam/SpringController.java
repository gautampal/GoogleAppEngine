/**
 * 
 */
package com.gautam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Gautam Pal
 *
 */
@Controller
public class SpringController {
	
	@RequestMapping("gautam")
	@ResponseBody
	public String printHello() {

	    return "<html><head><title>Gautam test</title></head><body><H1>Spring Controller is up!</H1></body></html>";
	}
	
}
