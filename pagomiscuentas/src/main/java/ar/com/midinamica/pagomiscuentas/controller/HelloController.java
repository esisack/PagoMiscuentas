package ar.com.midinamica.pagomiscuentas.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "*",  maxAge = 3600)
@RestController
public class HelloController {
	
	
	@RequestMapping(value = "/consulta", method = RequestMethod.GET)
	public String hello() {
		return "hola mundo";
	}

}
