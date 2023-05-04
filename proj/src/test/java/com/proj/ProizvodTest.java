package com.proj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.proj.dto.NovaNamirnicaDTO;
import com.proj.dto.NoviKorDTO;
import com.proj.dto.NoviProizvodDTO;
import com.proj.dto.NoviSastojakDTO;
import com.proj.service.KorisnikServ;
import com.proj.service.ProizvodServ;

import model.Korisnik;
import model.NamirnicaTip;
import model.Proizvod;
import model.UkusTip;
import model.kategorije.StarostKat;

@SpringBootTest
class ProizvodTest {
	@Autowired ProizvodServ pServ;

	
	@Test
	void addProizvod() {
		NovaNamirnicaDTO n1= new NovaNamirnicaDTO("govedina", NamirnicaTip.MESO, UkusTip.NONE, 250);
		NovaNamirnicaDTO n2= new NovaNamirnicaDTO("sargarepa", NamirnicaTip.POVRCE, UkusTip.NONE, 70);
		NovaNamirnicaDTO n3= new NovaNamirnicaDTO("krompir", NamirnicaTip.POVRCE, UkusTip.NONE, 130);

		ArrayList<NoviSastojakDTO> mapa= new ArrayList<NoviSastojakDTO>();
		mapa.add(new NoviSastojakDTO(n1, 300));
		mapa.add(new NoviSastojakDTO(n2, 70));
		mapa.add(new NoviSastojakDTO(n3, 130));
		
		NoviProizvodDTO pdto= new NoviProizvodDTO("govedina s povrcem", mapa, 790F);
		
		Proizvod p = pServ.noviProizvod(pdto);
		assertNotEquals(p,null);
	}
	@Test
	void addProizvodPostojeci() {
		NovaNamirnicaDTO n1= new NovaNamirnicaDTO("govedina", NamirnicaTip.MESO, UkusTip.NONE, 250);
		NovaNamirnicaDTO n2= new NovaNamirnicaDTO("sargarepa", NamirnicaTip.POVRCE, UkusTip.NONE, 70);
		NovaNamirnicaDTO n3= new NovaNamirnicaDTO("krompir", NamirnicaTip.POVRCE, UkusTip.NONE, 130);

		ArrayList<NoviSastojakDTO> mapa= new ArrayList<NoviSastojakDTO>();
		mapa.add(new NoviSastojakDTO(n1, 300));
		mapa.add(new NoviSastojakDTO(n2, 70));
		mapa.add(new NoviSastojakDTO(n3, 130));
		
		NoviProizvodDTO pdto= new NoviProizvodDTO("govedina s povrcem", mapa, 790F);
		
		Proizvod p = pServ.noviProizvod(pdto);
		assertEquals(null,p);
	}
}
