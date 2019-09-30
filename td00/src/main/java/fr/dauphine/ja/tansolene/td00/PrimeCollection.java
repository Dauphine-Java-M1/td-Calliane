package fr.dauphine.ja.tansolene.td00;

import java.util.ArrayList;
import java.util.Random;

import javax.print.attribute.standard.NumberUpSupported;

/**
 * Hello world!
 *
 */
public class PrimeCollection {

	private ArrayList<Integer> numbers;

	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}

	public PrimeCollection() {
		numbers = new ArrayList<Integer>();
	}

	public void initRandom(int n, int m) {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			numbers.add(r.nextInt(m) + 1);
		}
	}

	private boolean isPrime(int p) {
		boolean prime=true;
		int n=2;
		if(p==0 || p==1)
			prime = false;
		while(n < Math.sqrt(p)&& prime) {
			if(p%n==0) {
				prime=false;
			}
		n++;
		}
		return prime;
	}

	public static void main(String[] args) {
		System.out.println("Bonjour!");

	}

}
