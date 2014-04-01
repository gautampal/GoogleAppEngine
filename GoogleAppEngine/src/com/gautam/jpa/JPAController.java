/**
 * 
 */
package com.gautam.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gautam.helper.Superhero;

/**
 * @author Gautam Pal
 *
 */
@Controller
public class JPAController {

	@RequestMapping("/")
	@ResponseBody
	public String printHello() {

	    return "<html><head><title>Gautam test</title></head><body><H1>" + Superhero.get() + "</H1></body></html>";
	}
	
}
