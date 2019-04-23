package learning_skills;

import java.util.Scanner;
import java.lang.Math;

public class LearningConstant {

	public static void main(String[] args) {
// C�lculo de IMC
		double pessoaAltura = 0, pessoaPeso = 0, imc;
		double pesoNormal, acimaDoPeso, obesidadeI, obesidadeII;
		
				Scanner read = new Scanner(System.in);

		System.out.println("Digite seu peso: ");
		pessoaPeso = read.nextDouble();
		System.out.println("Digite sua altura: ");
		pessoaAltura = read.nextDouble();

		imc = (pessoaPeso) / Math.pow(pessoaAltura, 2);
		
		String resultado = String.format("%.2f", imc);
		System.out.println("Seu IMC �: " + resultado);
	
		if(imc>=18.5 && imc<25) {
			System.out.println("IMC normal");
		}else if(imc>25 && imc<30) {
			System.out.println("Voc� est� acima do peso");
		}else if(imc>30 && imc<35) {
			System.out.println("Voc� est� obeso");
			}else {
				System.out.println("Voc� quebrou a balan�a!");
		
		}
	
	read.close();
}

}
