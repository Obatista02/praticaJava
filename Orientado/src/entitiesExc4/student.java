package entitiesExc4;

public class student {
	public String name;
	public double n1, n2, n3;
	
	public double soma() {
		return n1+n2+n3;
	}
	
	public double media() {
		if(soma() < 60) {
			return 60 - soma();
		}else {
			return 0 ;
		}
	}
	
}
