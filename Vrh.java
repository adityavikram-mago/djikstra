import java.util.ArrayList;

public class Vrh {
	
	private int udaljenostOdPocetka = Integer.MAX_VALUE;
	private boolean posjecen;
	
	private ArrayList<Rub> rubovi = new ArrayList<Rub>();
	
	public int getUdaljenostOdPocetka(){
		return udaljenostOdPocetka;
	}
	
	public void setUdaljenostOdPocetka(int udaljenostOdPocetka){
		this.udaljenostOdPocetka = udaljenostOdPocetka;
	}
	public boolean jePosjecen(){
		return posjecen;
	}
	public void setPosjecen(boolean posjecen){
		this.posjecen = posjecen;
	}
	
	public ArrayList<Rub> getRubovi(){
		return rubovi;
	}
	public void setRubov(ArrayList<Rub> rubovi){
		this.rubovi = rubovi;
	}
	

}
