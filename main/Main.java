package main;

import java.util.Scanner;

import entities.Chanel;
import entities.Televison;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Televison television = new Televison();
		int chanelQuantity, chanelN;
		
		System.out.println(television);
		System.out.println("Ligando a televisão.");
		television.turnOnTV();
		
		System.out.print("Informe quantos canais deseja configurar: ");
		chanelQuantity = sc.nextInt();
		
		for (int i = 0; i < chanelQuantity; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do canal: ");
			String chanelName = sc.nextLine();
			System.out.print("Digite o número do canal: ");
			int chanelNumber = sc.nextInt();
			Chanel chanel = new Chanel(chanelNumber, chanelName);
			television.addChanel(chanel);
		}
		
		System.out.print("Informe o canal que deseja acessar: ");
		chanelN = sc.nextInt();
		
		television.changeChanel(chanelN);
		
		television.increaseVolume();
		television.decreaseVolume();
		television.decreaseVolume();
		television.increaseVolume();
		television.increaseVolume();
		television.increaseVolume();
		television.increaseVolume();
		television.increaseVolume();
		
		System.out.println(television);
		
		television.turnOffTV();
		
		System.out.println("Desligando a televisão.");
		
		System.out.println(television);
		
		
		
		sc.close();
	}

}
