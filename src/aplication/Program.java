package aplication;

import java.util.Locale;
import java.util.Scanner;
import entity.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite o nome do aluno e as notas dos 3 trimestres: ");
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		double media = student.media();
		double calcMedia = student.calculoMedia(media);
		
		System.out.printf("Final Grade: " + "%.2f%n", media);
		if (student.teste()) {
			System.out.println("PASS");
		}
		else {
			System.out.printf("FAILED" + "%n" + "MISSING " + "%.2f" + " POINTS", calcMedia);
		}
		
		
		sc.close();

	}

}
