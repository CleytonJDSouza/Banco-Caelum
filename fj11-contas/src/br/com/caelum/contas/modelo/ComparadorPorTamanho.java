package br.com.caelum.contas.modelo;

import java.util.Comparator;

// DEIXANDO O CÓDIGO MAIS CURTO ...

public class ComparadorPorTamanho implements Comparator<String> {
	
	public int compare(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
	}
}

// ORIGINAL ...

/*public class ComparadorPorTamanho implements Comparator<String> {
	
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s2.length() < s1.length())
			return 1;
		return 0;
	}
}*/
