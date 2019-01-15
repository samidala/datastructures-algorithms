public class SearchInRowWiseColWiseSortedMatrix {

    static void search(int[][] a,int k){

        int i = 0;
        int n = a.length;
        int j = n -1;

        while ( i < n && j >= 0){
            int currentEle = a[i][j];
            if(currentEle == k){
                System.out.println(i+ " "+ j);
                return;
            }else if(currentEle > k){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("not found");


    }

    public static void main(String[] args) {
        int[][] mat = {{10, 20, 30, 33},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        search(mat, 37);
    }
}
