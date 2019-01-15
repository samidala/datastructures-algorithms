public class FindRowWithMaxOnes {

    static void findRowWithMaxOnes(int[][] a){

        int rows = a.length;
        int columns = a[0].length;
        int row = 0;
        int column = columns - 1;
        int count = 0;
        int maxCount = 0;
        int selectedRow = 0;
        boolean incr = true;
        for(int i = column; i>=0;){
            if(incr){
                i--;
                if(i < 0){
                    break;
                }
            }


            System.out.println("row "+row +" and rows "+rows);
            if(row >= rows){
                break;
            }
            if(a[row][i] == 1){
                count++;
                incr = true;
                System.out.println("row "+ row + " count "+count +" maxcount "+maxCount);
                if(count > maxCount){
                    maxCount = count;
                    selectedRow = row;
                }
            }else{
                row++;
                incr = false;
            }
        }

        System.out.println(selectedRow);



    }

    public static void main(String[] args) {

        String s = "abcdefghijlmnopqrstuvwxyz";

        for(char c :s.toCharArray()){
            System.out.println(c- 'a');
        }

        int a[][] = { { 0, 0, 0, 0 },
                      { 1, 1, 1, 1 },
                      { 0, 1, 1, 1 }};

        findRowWithMaxOnes(a);
    }
}
