package com.proj.service;

import java.util.ArrayList;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.proj.dto.NoviKorDTO;
import com.proj.repository.KorisnikRep;

import model.Adresa;
import model.KorKategorije;
import model.Korisnik;
import model.Porudzbina;

@Component
public class KorisnikServ {
	@Autowired KorisnikRep kRep;
    private final KieContainer kieContainer;
    public KorisnikServ(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }
    
	public Korisnik dodajKor(NoviKorDTO dto) {
		System.out.println("DodavanjeKor");
		Korisnik k= new Korisnik(dto.getEmail(),dto.getUsername(),dto.getPassword(),
				new Adresa(), dto.getIme(),dto.getPrezime(),
				dto.getDatumRodj(),new ArrayList<Porudzbina>(), new KorKategorije());		
		
		KieSession kieSession = kieContainer.newKieSession();
        //kieSession.setGlobal("customerType", customerType);
        kieSession.insert(k);
        kieSession.fireAllRules();
        kieSession.dispose();
        
        kRep.save(k);
        return k;
	}
}
