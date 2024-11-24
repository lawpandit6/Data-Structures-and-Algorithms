/*Greedy means want more among given
	for Ex: coins= {1,2,5,10,20,50,100,500,1000}
	among these coins it will pick highest one 
	
	But in greedy approach it may fail sometime for example
	{9,6,5,1} ==> among these select minimum no. of coins to achieve 11
	so,possibility are:-
	9rs--->1coins , 1rs---->2coins ===> total no. of coins is 3.
		11-9=2 (1 coins of 9 rs)
		2-1=1  (1 coins of 1 rs)
		1-1=1  (1 coins of 1 rs)
   total coins==3
	
	but if we select 
	6rs--->1coins , 5rs---->1 coins ===> total no. of coins is 2. 
	
	above proble can be solved using recursion and dynamic Programming
	
*/

package in.law.greedy;

import java.util.ArrayList;
import java.util.List;

public class CoinsChangeProblem {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
		int requiredCurrency = 93;
		calculateMinCoins(coins, requiredCurrency);
	}

	public static void calculateMinCoins(int[] coins, int requiredCurrency) {
		List<Integer> l = new ArrayList<>();
		for (int i = coins.length - 1; i >= 0; i--) {
			while (requiredCurrency >= coins[i]) {
				l.add(coins[i]);
				requiredCurrency = requiredCurrency - coins[i];
			}
		}
		System.out.println("coins denomination::" + l);
		System.out.println("Min No. of coins required::" + l.size());

	}

}
