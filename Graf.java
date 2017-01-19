import java.util.ArrayList;

public class Graf {
	
	private Vrh[] vrhovi;
	private int brojVrhova;
	private Rub[] rubovi;
	private int brojRubova;
	
	
	public Graf(Rub[] rubovi){
		this.rubovi = rubovi;
		
		this.brojVrhova = izracunajBrojVrhova(rubovi);
		this.vrhovi = new Vrh[this.brojVrhova];
		
		for( int n= 0; n<this.brojVrhova; n++){
			this.vrhovi[n] = new Vrh();
		}
		
		this.brojRubova = rubovi.length;
		
		for(int rubZaDodati = 0; rubZaDodati < this.brojRubova; rubZaDodati++){
			this.vrhovi[rubovi[rubZaDodati].getOdVrhaIndex()].getRubovi().add(rubovi[rubZaDodati]);
			this.vrhovi[rubovi[rubZaDodati].getDoVrhaIndex()].getRubovi().add(rubovi[rubZaDodati]);
			
		}
	}
	
	private int izracunajBrojVrhova(Rub[] rubovi) {
		int brojVrhova = 0;
		
		for (Rub r : rubovi){
			if(r.getDoVrhaIndex() > brojVrhova)
				brojVrhova = r.getDoVrhaIndex();
			if(r.getOdVrhaIndex() > brojVrhova)
				brojVrhova = r.getOdVrhaIndex();
		}
		
		brojVrhova++;
		return brojVrhova;
		
	}
	
	public void izracunajNajkracePuteve(){
		
		this.vrhovi[0].setUdaljenostOdPocetka(0);
		int sljedeciVrh = 0;
		
		for(int i=0;i<this.vrhovi.length;i++){
			ArrayList<Rub> trenutniRuboviVrha = this.vrhovi[sljedeciVrh].getRubovi();
			
			for(int pridruzeniRub = 0; pridruzeniRub < trenutniRuboviVrha.size(); pridruzeniRub++){
				int susjedniIndex = trenutniRuboviVrha.get(pridruzeniRub).getSusjedniIndex(sljedeciVrh);
				
				if(!this.vrhovi[susjedniIndex].jePosjecen()){
					int neodredjeni = this.vrhovi[sljedeciVrh].getUdaljenostOdPocetka() + trenutniRuboviVrha.get(pridruzeniRub).getDuljina();
					
					if(neodredjeni < vrhovi[susjedniIndex].getUdaljenostOdPocetka()){
						vrhovi[susjedniIndex].setUdaljenostOdPocetka(neodredjeni);
						
					}
				}
			}
			vrhovi[sljedeciVrh].setPosjecen(true);
			
			sljedeciVrh = getNajkraciPut();
		}
	}
	
	private int getNajkraciPut(){
		int spremljeniIndexCvora = 0;
		int spremljenaUdaljenost = Integer.MAX_VALUE;
		
		for(int i=0; i < this.vrhovi.length; i++){
			int trenutnaUdaljenost = this.vrhovi[i].getUdaljenostOdPocetka();
			
			if(!this.vrhovi[i].jePosjecen() && trenutnaUdaljenost < spremljenaUdaljenost){
				spremljenaUdaljenost = trenutnaUdaljenost;
				spremljeniIndexCvora = i;
			}
		}
		return spremljeniIndexCvora;
	}
	
	public void Rezultati(){
		String output = "Broj pacjenata = " + this.brojVrhova;
	
		
		for(int i=1;i<this.vrhovi.length;i++){
			output += ("\n Najkraca udaljenost od doma do pacjenta " + i + " je " + vrhovi[i].getUdaljenostOdPocetka());
		}
		System.out.println(output);
	}

	public Vrh[] getVrhovi() {
		return vrhovi;
	}
	public int getBrojVrhova() {
		return brojVrhova;
	}
	public Rub[] getRubovi() {
		return rubovi;
	}
	public int getBrojRubova() {
		return brojRubova;
	}

}
