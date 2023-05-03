package com.proj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.proj.dto.NoviKorDTO;
import com.proj.service.KorisnikServ;

import model.Korisnik;
import model.kategorije.StarostKat;

@SpringBootTest
class ProjApplicationTests {
	@Autowired KorisnikServ kServ;
	@Test
	void contextLoads() {
		assertEquals(true,true);
	}
	
	@Test
	void addUser() {
		Date datum= new Date(1996, 5, 22);
		NoviKorDTO dto= new NoviKorDTO("user1", "sifra1", "npele96@gmail.com", "Nikola", "Petkovic", datum);
		Korisnik kk= kServ.dodajKor(dto);
		
		assertEquals(kk.getKategorije().getStarost(), StarostKat.ODRASTAO);
		
		
	}
}
