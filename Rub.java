
public class Rub {
	
	private int odVrhaIndex;
	private int doVrhaIndex;
	
	private int duljina;
	
	public Rub(int odVrhaIndex, int doVrhaIndex, int duljina){
		this.odVrhaIndex = odVrhaIndex;
		this.doVrhaIndex = doVrhaIndex;
		this.duljina = duljina;
		
	}

	public int getOdVrhaIndex(){
		return odVrhaIndex;
	}
	public int getDoVrhaIndex(){
		return doVrhaIndex;
	}
	public int getDuljina(){
		return duljina;
	}
	public int getSusjedniIndex(int cvorIndex){
		if(this.odVrhaIndex == cvorIndex){
			return this.doVrhaIndex;
		}else{
			return this.odVrhaIndex;
		}
	}
}
