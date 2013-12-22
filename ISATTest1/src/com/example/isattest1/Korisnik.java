package com.example.isattest1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//ime, prezime, mail, korisnicko ime,
//password, hashpassword, datum zadnjeg logiranja, datum kreiranja naloga.
public class Korisnik {
	public String Ime;
	public String Prezime;
	public String Mail;
	public String KorisnickoIme;
	public String Password;
	public String HashPassword;
	public Date DatumKreiranjaNaloga;
	public Date DatumZadnjegLogiranja;
	
	
	public Korisnik(String ime){
		Ime = ime;
		Prezime = null;
		Mail = null;
		KorisnickoIme = null;
		Password = null;
		HashPassword = null;
		DatumKreiranjaNaloga = null;
		DatumZadnjegLogiranja = null;
	}
	@SuppressWarnings("deprecation")
	public static List<Korisnik> GenrateTestData(int kolicina){
		List<Korisnik> TestnaLista=new ArrayList<Korisnik>();
		
		for (int i=0;i<kolicina;i++)
		{
			TestnaLista.add(new Korisnik("ImeKorisnika"+(i+1),"PrezimeKorisnika"+(i+1), (i+1)+"mail@gmail.com",
					"KorisnickoIme"+(i+1),"Password"+(i+1),"HashPassword"+(i+1),new Date(2013, i, (i+3)),null));
			
		}
		
		return TestnaLista;
	}
	
	public static List<String> GetImenaKorisnika(List<Korisnik> listaKorisnika)
	{
		List<String> listaImena=new ArrayList<String>();
		for(int i=0;i<listaKorisnika.size();i++)
		{
			listaImena.add(listaKorisnika.get(i).Ime);
		}
		return listaImena;
	}
	public String getIme() {
		return Ime;
	}
	public void setIme(String ime) {
		Ime = ime;
	}
	public String getPrezime() {
		return Prezime;
	}
	public void setPrezime(String prezime) {
		Prezime = prezime;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getKorisnickoIme() {
		return KorisnickoIme;
	}
	public void setKorisnickoIme(String korisnickoIme) {
		KorisnickoIme = korisnickoIme;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getHashPassword() {
		return HashPassword;
	}
	public void setHashPassword(String hashPassword) {
		HashPassword = hashPassword;
	}
	public Date getDatumKreiranjaNaloga() {
		return DatumKreiranjaNaloga;
	}
	public void setDatumKreiranjaNaloga(Date datumKreiranjaNaloga) {
		DatumKreiranjaNaloga = datumKreiranjaNaloga;
	}
	public Date getDatumZadnjegLogiranja() {
		return DatumZadnjegLogiranja;
	}
	public void setDatumZadnjegLogiranja(Date datumZadnjegLogiranja) {
		DatumZadnjegLogiranja = datumZadnjegLogiranja;
	}
	public Korisnik(String ime, String prezime, String mail,
			String korisnickoIme, String password, String hashPassword,
			Date datumKreiranjaNaloga, Date datumZadnjegLogiranja) {
		super();
		Ime = ime;
		Prezime = prezime;
		Mail = mail;
		KorisnickoIme = korisnickoIme;
		Password = password;
		HashPassword = hashPassword;
		DatumKreiranjaNaloga = datumKreiranjaNaloga;
		DatumZadnjegLogiranja = datumZadnjegLogiranja;
	}
	
	
}
