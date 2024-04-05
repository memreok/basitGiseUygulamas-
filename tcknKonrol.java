package com.gise;

import java.util.Random;

public class tcknKonrol {

	private String tckn;
	boolean kontrol = false;

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		if (tckn.length() == 11) {
			for (int i = 0; i < tckn.length(); i++) {
				char karakter = tckn.charAt(i);
				if (Character.isDigit(karakter)) {
					kontrol = true;

				} else {
					System.out.println("Geçersiz giriş!\n" + "Lütfen 11 haneli TCKN rakam olacak şekilde giriniz!");
					kontrol = false;
					break;
				}
			}

		} else {
			System.out.println("Geçersiz giriş!\n" + "Lütfen 11 haneli TCKN giriniz!");
		}
		if (kontrol) {
			Random random = new Random();
			int giseNo = random.nextInt(100);
			System.out.println("Gişe numaranız: " + giseNo);

			this.tckn = tckn;
		}

	}

}
