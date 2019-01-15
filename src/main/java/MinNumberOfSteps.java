import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class MinNumberOfSteps {

    static class Position{
        int x;
        int y;
        int distance;
        public Position(int x, int y, int distance){
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

   // static int dx[] = {-2,-1,1,2,-2,-1,1,2};
    //static int dy[] = {-1,-2,-2,1,1,2,2,-1};

    static int dx[] = {-2,-1,1,2,-2,-1,1,2};
    static int dy[] = {-1,-2,-2,-1,1,2,2,1};
    static int minSteps(int[] src,int[] dest){

        int minDistance = Integer.MIN_VALUE;

        Set<Position> positions = new HashSet<>();
        boolean visited[][] = new boolean[N+1][N+1];

        visited[src[0]][src[1]] = true;

        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(src[0],src[1],0));
        //positions.add(new Position(src[0],src[1],0));
        while (!queue.isEmpty()){
            Position position = queue.poll();

            if(position.x == dest[0] && position.y == dest[1]){
                positions.add(position);
                minDistance = position.distance;
            }
            for (int i=0;i<8;i++){
                int x = position.x + dx[i];
                int y = position.y + dy[i];

                if( isValid(x,y) && !visited[x][y]){
                    visited[x][y] = true;
                    queue.offer(new Position(x,y,position.distance+1));
                    positions.add(position);
                }

            }

        }


        for(Position position :positions){
            System.out.print("("+position.x+","+position.y+") ->");
        }
        System.out.println();
        return minDistance;
    }
    static boolean isValid(int x, int y){
        if(x>=1 && x <= N && y >= 1 && y <=N){
            return true;
        }
        return  false;
    }

    static int N = 6;



    public static void main(String[] args) {
         N = 6;
        int src[] = {2, 4};
        int dest[] = {6, 1};
        int minSteps = minSteps(src,dest);
        System.out.println(minSteps);

         N = 30;
        int knightPos[] = {1, 1};
        int targetPos[] = {30, 30};

        minSteps = minSteps(knightPos,targetPos);
        System.out.println(minSteps);

    }
}
