public class StockSellingProblem {


    static void sellBuy(int[] prices){

        int count = 0;

        int n = prices.length;
        Interval[] sol = new Interval[n];
        for(int i=0;i<sol.length;i++){
            sol[i] = new Interval();
        }

        int i = 0;
        while(i<n-1){
            while(i < n-1 && prices[i] >= prices[i+1]){
                i++;
            }
            if(i == n-1){
                break;
            }
            sol[count].buy = i;
            i++;
            while (i< n && prices[i] <= prices[i-1]){
                i++;
            }
            sol[count].sell = i - 1;
            count++;
        }

        // print solution
        if (count == 0)
            System.out.println("There is no day when buying the stock will make profitn");
        else
        {
            for ( i = 0; i < count; i++)
                System.out.println(sol[i].buy +" " + sol[i].sell);
        }
    }
    static class Interval{
        int buy;
        int sell;

    }

    public static void main(String args[])
    {


        // stock prices on consecutive days
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        int n = price.length;

        // fucntion call
        sellBuy(price);
    }
}
