package learning_skills;

import java.util.Scanner;
import java.lang.Math;

public class Imc {
// BMI(Body Mass Index in kilogrammes and centimeteres)
	public static void main(String[] args) {

		double height, weight, bmi;
		Scanner read = new Scanner(System.in);

		System.out.println("Enter with your weight: ");
		weight = read.nextDouble();
		System.out.println("Enter with your heght: ");
		height = read.nextDouble();

		bmi = (weight) / Math.pow(height, 2);

		String result = String.format("%.2f", bmi);
		System.out.println("Seu IMC é: " + result);

		if (bmi <18.5) {
			System.out.println("Underweight");
		}else if (bmi >= 18.5 && bmi < 25){
			System.out.println("Normal weight");
		} else if (bmi > 25 && bmi < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}

		read.close();
	}

}
