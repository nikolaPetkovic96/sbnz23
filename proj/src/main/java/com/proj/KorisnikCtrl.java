package com.proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.service.KorisnikServ;


@RestController
@RequestMapping("/kor")

public class KorisnikCtrl {
	@Autowired KorisnikServ kServ;
	
	@GetMapping("/test")
	public String test() {
		return "TEST Restorani2";
	}
}
