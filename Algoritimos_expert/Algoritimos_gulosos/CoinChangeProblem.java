import java.util.Arrays;
import java.util.Comparator;

public class CoinChangeProblem {

   public static void main(String[] args) {
      var coins = minimumCoins(37, new Integer[] { 25, 1, 5, 10 });
      System.out.println(coins);
   }

   public static int minimumCoins(int v, Integer[] coins) {
      var list = Arrays.asList(coins);
      // O(N log N)
      list.sort(Comparator.reverseOrder());
      // percorrer moedas e escolher a maior no momento
      int ans = 0;
      for (var coin : list) {
         // Retirando a moeda atual enquanto for possivel
         while (v - coin >= 0) {
            v -= coin;
            ans++;
         }
      }

      return ans;
   }
   // Complexidade de tempo : O(NlogN) + O(N) = O(NlogN)

}
