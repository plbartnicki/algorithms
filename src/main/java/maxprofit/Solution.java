package maxprofit;

/*
Input: prices = [7,1,5,3,6,4]
Output: 5 = 6 - 1

Input: prices = [7,6,4,3,1]
Output: 0

[1,2,3] -> 2 = 3 - 1

[3,2,1] -> 0

[3, 1, 2] -> 1 = 2 - 1

[x] -> 0

[3,4,2,1] -> 1 = 4 - 3
[3,4,10, 20] -> 10 = 20 - 10
[3,4,2,5] -> 3 = 5 - 2


trzeba znalezc takie min i max, ze min < max

1. znalezc min a nastepnie od inseksu min znalezc max

  def maxProfit(self, prices: List[int]) -> int:
    left_ptr, profit = 0, 0
    for right_ptr in range(1, len(prices)):
      if prices[left_ptr] < prices[right_ptr]:
        profit = max(profit, prices[right_ptr] — prices[left_ptr])
      else:
        left_ptr = right_ptr
    return profit

 */
public class Solution {
    public static int maxProfit(int[] prices) {

            return 0;
    }

    /*
      [4,10,2]
      max = 6
      i = 2

      b = 0
      e = 1

     */

    public static void main(String[] args) {
 //       System.out.println(maxProfit(new int[]{1,2,3}));
        System.out.println(maxProfit(new int[]{10,2}));
        System.out.println(maxProfit(new int[]{4,10,2}));
    }
}


