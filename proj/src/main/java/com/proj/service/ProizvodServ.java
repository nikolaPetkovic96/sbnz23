package com.proj.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.dto.NoviProizvodDTO;
import com.proj.repository.ProizvodRep;

import model.Proizvod;
@Service
public class ProizvodServ {
    private final KieContainer kieContainer;
	public ProizvodServ(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }
	@Autowired ProizvodRep pRep;
	
	public Proizvod noviProizvod(NoviProizvodDTO dto) {
		Proizvod novi= new Proizvod(dto);
		
		KieSession kieSession = kieContainer.newKieSession();
        //kieSession.setGlobal("customerType", customerType);
        kieSession.insert(novi);
        kieSession.insert(pRep);
        kieSession.fireAllRules();
        kieSession.dispose();    
		
        if(!novi.getNaziv().equals(""))
        novi=pRep.save(novi);
        else novi=null;
        
		return novi;		
	}
}
