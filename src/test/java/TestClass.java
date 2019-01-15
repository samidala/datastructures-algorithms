import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TestClass {
    public static void main(String args[] ) throws Exception {


        int[] a = {1,2,3,5};
        solve(a);
       // System.out.println(a[ceilSearch(a,4)]);
        a = new int[]{1,2,4,5};
        solve(a);
        // System.out.println(a[ceilSearch(a,4)]);

        a = new int[]{1,3};

        //  System.out.println(a[ceilSearch(a,4)]);
        solve(a);
    }

    static void solveV1(int[] arr){

        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();

        int n = arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int v = map.get(arr[i]) + 1;
                map.put(arr[i],v);
            }else{
                map.put(arr[i],1);
            }
        }

        int pairedCount = 0;
        int unpairedCount = 0;
        for(int i=0;i<n;i++){


            int a = 2 * arr[i];
            int b = ceilSearch(arr,a);
            if(b == -1){
                unpairedCount++;
            }else{
                if(map.get(arr[i]) > 0) {
                    pairedCount++;
                    int v = map.get(arr[i]) - 1;
                    map.put(arr[i],v);
                }
            }
        }
        System.out.println(pairedCount +" "+unpairedCount);

    }

    static void solve(int[] arr){

        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();

        int n = arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int v = map.get(arr[i]) + 1;
                map.put(arr[i],v);
            }else{
                map.put(arr[i],1);
            }
        }

        int pairedCount = 0;
        int unpairedCount = 0;
        for(int i=0;i<n;i++){

            int a = 2 * arr[i];
            int b = ceilSearch(arr,a);
            if(b == -1){
                unpairedCount++;
            }else{
                if(map.get(arr[i]) > 0) {
                    pairedCount++;
                    int v = map.get(arr[i]) - 1;
                    map.put(arr[i],v);
                }
            }
        }
        System.out.println(pairedCount +" "+unpairedCount);

    }

    static int ceilSearch(int[] arr,int x){
        return ceilSearch(arr,0, arr.length-1,x);
    }

    public static int ceilSearch(int arr[], int low, int high, int x) {
        int mid;
        if (x <= arr[low])
            return low;
        if (x > arr[high])
            return -1;

        mid = low + (high - low)/2 ;

        if (arr[mid] == x)
            return mid;

        else if (arr[mid] < x) {
            if (mid + 1 <= high && x <= arr[mid + 1])
                return mid + 1;
            else
                return ceilSearch(arr, mid + 1, high, x);
        } else {
            if (mid - 1 >= low && x > arr[mid - 1])
                return mid;
            else
                return ceilSearch(arr, low, mid - 1, x);
        }
    }


}