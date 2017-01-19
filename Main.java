
public class Main {
	
	public static void main(String[] args){
		Rub[] rubovi = {
				new Rub(0,3,5), 
				new Rub(0,6,5), 
				new Rub(0,4,10), 
				new Rub(0,2,10), 
				new Rub(0,8,10), 
				new Rub(1,7,5), 
				new Rub(1,14,25), 
				new Rub(1,15,20), 
				new Rub(2,7,10), 
				new Rub(2,10,5), 
				new Rub(2,12,15), 
				new Rub(3,13,10), 
				new Rub(3,5,10), 
				new Rub(4,10,15),
				new Rub(5,6,10),
				new Rub(6,13,5),
				new Rub(7,9,10),
				new Rub(8,14,15),
				new Rub(8,12,15),
				new Rub(9,15,10),
				new Rub(9,13,20),
				new Rub(10,9,20),
				new Rub(10,11,5),
				new Rub(11,12,5),
				new Rub(15,6,15)	
		};
		Graf g = new Graf(rubovi);
		g.izracunajNajkracePuteve();
		g.Rezultati();
	}

}
