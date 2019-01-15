import java.util.LinkedList;
import java.util.Queue;

public class RightView {

    static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    static void rightView(Node root){
        Queue<Node> q = new LinkedList<>();
        ((LinkedList<Node>) q).offer(root);
        while (!q.isEmpty())
        {
            int n = q.size();
            for(int i=1;i<=n;i++){
                Node temp = q.poll();
                if(i == n){
                    System.out.print(temp.data+" ");
                }
                if(temp.left != null){
                    q.offer(temp.left);
                }

                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
        }
    }

    static void leftView(Node root){
        Queue<Node> q = new LinkedList<>();
        ((LinkedList<Node>) q).offer(root);
        while (!q.isEmpty())
        {
            int n = q.size();
            for(int i=1;i<=n;i++){
                Node temp = q.poll();
                if(i == n){
                    System.out.print(temp.data+" ");
                }


                if(temp.right != null){
                    q.offer(temp.right);
                }
                if(temp.left != null){
                    q.offer(temp.left);
                }
            }
        }
    }



    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);

        rightView(root);
        System.out.println();
        leftView(root);
    }
}
