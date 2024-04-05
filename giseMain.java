package com.gise;

import java.util.Scanner;

public class giseMain {

	public static void main(String[] args) {
		tcknKonrol tckn=new tcknKonrol();
		Scanner scanner = new Scanner(System.in);
		System.out.println("GİŞEYE HOŞGELDİNİZ1");
		System.out.print("Lütfen TCKN giriniz: ");
		String tckno=scanner.nextLine();
		tckn.setTckn(tckno);
		
		
	}

}
