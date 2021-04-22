
public class CodingExercises {

		//Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.


		//luckySum(1, 2, 3) → 6
		//luckySum(1, 2, 13) → 3
		//luckySum(1, 13, 3) → 1	

		public int luckySum(int a, int b, int c) {
			if(a==13)return 0;
  			if(b==13)return a;
  			if(c==13)return (a+b);
  			return (a+b+c);		  
		}

		/*
		Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. 
		Return 0 if they both go over.

		blackjack(19, 21) → 21
		blackjack(21, 19) → 21
		blackjack(19, 22) → 19
		*/

		public int blackjack(int a, int b) {
			int temp = 0;
			int temp2 = 0;
			if (a <= 21) {
				temp = a;
			}
			if (b <= 21) {
				temp2 = b;
			}
			if (temp > temp2) {
				return temp;
			}
			return temp2;
		}
}
