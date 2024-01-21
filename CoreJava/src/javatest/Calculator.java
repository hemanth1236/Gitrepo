package javatest;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is test");
		int a = 10;
		int b = 20;

		int sum = a + b;
		System.out.println(sum);
		String str = "Clean India Green India";
		System.out.println("total character in the string :" + str.length());
		System.out.println(" Character at 5th position is " + str.charAt(4));

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int total = 0;
		for (int i : arr1) {
			total = total + i;
			System.out.println(i);
		}
		System.out.println("total array of the array is " + total);
		String str2 = "Automation testing using selenium and then finding the number of words using java code";
		int words = 1;
		for (int i = 0; i < str2.length() - 1; i++) {
			if (str2.charAt(i) == ' ') {
				words++;
			}
		}
		System.out.println("the number of words in the str2 are :" + words);

		String str3 = "I am feeling very lucky";
		// reverse of the string
		String strrev = "";
		for (int i = str3.length() - 1; i >= 0; i--) {
			strrev = strrev + str3.charAt(i);
		}
		System.out.println(strrev);

		int num = 12502512;
		int[] num2 = new int[10];
		int d = 0, numadd = 0, i = 0;
		System.out.println("the reverse of the number is :");

		while (num != 0) {
			d = num % 10;
			num = num / 10;
			System.out.print(d);
			num2[i] = d;
			i++;
			numadd = numadd + d;
		}
		System.out.println("the sum of all digits are :" + numadd);
		for (int j = 0; j < num2.length; j++) {
			System.out.print(num2[j]);
		}
	}
}
