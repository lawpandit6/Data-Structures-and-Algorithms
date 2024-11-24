package in.law.interviewProblems;

import java.util.HashMap;
import java.util.Map;

public class FabonacciSeries {
	public static void main(String[] args) {
		FabonacciSeries fb = new FabonacciSeries();
		int fibo = fb.fibo(5);
		int fiboDynamic = fb.fiboDynamic(5);
		System.out.println("output==>" + fibo);
		System.out.println("count without dynamic program==>" + count);
		System.out.println("output==>" + fiboDynamic);
		System.out.println("count with dynamic program==>" + countDynamic);
	}

	static int count = 0;

	// Normal fibonacci series
	public int fibo(int n) {
		count++;
		if (n == 0 || n == 1)
			return n;
		else
			return fibo(n - 1) + fibo(n - 2);
	}

	// With dynamic programming
	static int countDynamic = 0;
	static int sum;
	Map<String, Integer> m = new HashMap<>();

	public int fiboDynamic(int n) {
		countDynamic++;

		if (m.containsKey("fiboDynamic" + n)) {
			return m.get("fiboDynamic" + n);
		}

		if (n == 0 || n == 1) {
			m.put("fiboDynamic" + n, n);
			return n;
		} else {
			sum = fiboDynamic(n - 1) + fiboDynamic(n - 2);
			m.put("fiboDynamic" + n, sum);
			return sum;
		}
	}
}
