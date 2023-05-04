package com.proj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.dto.NovaNamirnicaDTO;
import com.proj.repository.NamirnicaRep;

import model.Namirnica;

@Service
public class NamirnicaServ {
	@Autowired NamirnicaRep nRep;
	
	public Namirnica novaNamirnica(NovaNamirnicaDTO dto) {
		Namirnica n= new Namirnica(dto);
		n=nRep.save(n);
		return n;
	}
	
}
