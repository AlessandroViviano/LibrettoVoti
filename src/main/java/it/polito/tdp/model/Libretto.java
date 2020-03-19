package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti = new ArrayList<>() ;
	
	public void add(Voto v) {       //prediligo questo tipo di metodo per aggiungere un nuovo voto
		this.voti.add(v) ;
	}
	
	//public void add(String corso, int voto, LocalDate data) {
		//
	//}
	
	public String stampaVotiUguali(int voto) {
		String s = "" ;
		for(Voto v: this.voti) {
			if(v.getVoto()==voto) {
			s += v.toString()+"\n" ;
			}
		}
		return s ;
	}
	
	//più indicato questo tipo di metodo al posto di quello precedente, visto che questo lavora 
	//con degli oggetti al posto che con una stringa
	public Libretto estraiVotiUguali(int voto) {
		Libretto nuovo = new Libretto() ;
		for(Voto v: this.voti) {
			if(v.getVoto()==voto) {
				nuovo.add(v) ;
			}
		}
		return nuovo ;
	}
	
	public String toString() {
		String s = "" ;
		for(Voto v: this.voti) {
			s += v.toString()+"\n" ;
		}
		return s ;
	}

}
