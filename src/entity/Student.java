package entity;

public class Student {
	
	public String name;
	public double nota1, nota2, nota3;
	
	public double media() {
		return nota1 + nota2 + nota3;
	}
	
	public boolean teste() {
		if ((nota1 + nota2 + nota3)>=60) {
			return true ;
		}
		else {
			return false;
		}
	}
	
	public double calculoMedia(double media) {
		return 60 - media;
	}
}
