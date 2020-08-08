package com.nkseguridad.app.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	@GetMapping("/")
    public String helloWorld(Model modelo) {
		modelo.addAttribute("titulo","El API esta funcionando");
		modelo.addAttribute("fecha", new Date());
        return "home";
    }

}
