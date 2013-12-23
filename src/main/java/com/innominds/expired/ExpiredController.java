package com.innominds.expired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpiredController {

	@RequestMapping(value = "expired")
	public String signin() {
        return "expired/expired";
    }
}
