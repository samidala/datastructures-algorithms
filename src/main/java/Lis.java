import java.util.Arrays;

public class Lis {

    static int maxLisRef = 0;
    static int lis(int[] a, int n){

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        int lis = 1;

        for(int i=1;i<n;i++){
            int res = lis(a,i);
            if(a[i-1] < a[n-1] && res + 1 > lis){
                lis = res + 1;
            }
        }

        if(lis > maxLisRef){
            maxLisRef = lis;
        }
        return lis;

    }

    static void lis(int a[]){
        lis(a,a.length);
        System.out.println(maxLisRef);
    }

    static void lisDp(int[] a){

        int n = a.length;

        int[] dp = new int[n];

        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(a[i] > a[j] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
        }

        System.out.println(dp[n-1]);

    }

    static int binarySearch(int[] dp, int high, int k){

        int low = -1;

        while (high - low > 1){
            int mid = low + (high - low) / 2;
            if(dp[mid] >= k){
                high = mid;
            }else{
                low = mid;
            }
        }
        return high;

    }
    static void lisDpV1(int[] a){

        int n = a.length;

        int[] dp = new int[n];
        int len = 1;
        dp[0] = a[0];

        for(int i=1;i<n;i++){
            if(a[i] < dp[0]){
                dp[0] = a[i];
            }else if(a[i] > dp[len -1] ){
                dp[len++] = a[i];
            }else{
                int pos = binarySearch(dp,len-1,a[i]);
                dp[pos] = a[i];
            }
        }
        System.out.println(len);

    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        lis(arr);
        lisDp(arr);
        lisDpV1(arr);
    }
}
