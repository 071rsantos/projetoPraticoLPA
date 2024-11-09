package projetoPratico1;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int [] senha = new int[4];
		int [] chute = new int[4];
		
		geraSenha(senha);
		
		do {
			preencheChute(chute, sc);
			verificador(senha, chute);
			cont++;
		} while(!verificadorIgualdade(senha, chute) && cont<=3);
		
		if(verificadorIgualdade(senha, chute)) {
			System.out.println("SENHA CORRETA");
		} else {
			System.out.println("Tentativas finalizadas");
		}
	}
	
	public static void preencheChute(int[] v, Scanner sc) {
		System.out.println("Digite seu chute: ");
		String[] chuteStr = sc.nextLine().split(" ");
		for (int i = 0; i < v.length; i++) {
			v[i] = Integer.parseInt(chuteStr[i]);
		}
	}

	public static int[] geraSenha(int [] v) {
		Random r = new Random();
		for(int i = 0; i<v.length; i++) {
			v[i] = r.nextInt(6)+1;
			System.out.print(v[i] + " ");
		}
		System.out.println();
		return v;
	}
	
	public static void verificador(int[] v, int[] c) {
		int contCorreto = 0, contDeslocado = 0;
		int[] v2 = new int[v.length];
		for(int u = 0; u<v.length;u++) {
			v2[u] = v[u];
		}
		for(int i = 0; i < v.length; i++) {
			if(v2[i] == c[i]) {
				contCorreto++;
				v2[i]=-1;
				c[i]=0;
			}
		}	
		for(int i = 0; i<v2.length; i++) {	
			if(verificadorDeslo(c[i], v2)) {
				contDeslocado++;
			}
		}
		System.out.println("Digitos corretos: "+contCorreto);
		System.out.println("Digitos deslocados: "+contDeslocado);
	}
	
	public static boolean verificadorDeslo(int n, int[] v) {
		for (int i = 0; i < v.length; i++) {
            if (n == v[i]) {
                return true;
            }
        }
		return false;
	}
	public static boolean verificadorIgualdade(int[] s, int[]c) {
		int cont = 0;
		for(int i = 0;i<s.length;i++) {
			if (s[i]==c[i]) {
				cont++;
			}
		}
		return cont==4?true:false;
	}
	
}