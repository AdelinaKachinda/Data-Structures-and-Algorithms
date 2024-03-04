package BinaryTrees;
import java.util.*;

public class BinaryTree 
{
    static Node root;

    // adds a node to the tree.
    public void addNode(int key)
    {
        // changes the int value to a Node so it can be added to the Tree
        Node newNode = new Node(key);

        // we need to check for the null edge case as in do we have a tree to add to already or not 
        if (root == null)
        {   
            // if no tree exists then the current key becones our root and parent node
            root = newNode;
        } else {
            // otherwise we need some focusNode we can move around down the tree
            Node focusNode = root;
            Node parent;

            // we loop recursively or infinetly till we find where to add the node
            while(true){

                // parent just holds the current focusNode 
                parent = focusNode;

                //trying to tell whether to take the key to the left or right

                if (key < focusNode.val)
                {
                    /* we go all the way to the farthest left while parent stores the previous one and
                     focusNode keeps moving forward until it reaches null, because parent stored the previous value
                     before we got to null we can say parent.left = the newNode. focusNode gets lost, but we add succesfully */


                    focusNode = focusNode.left;
                    if (focusNode == null){
                        parent.left = newNode;
                        return;
                    }
                        
                } else {
                    
                    // same explanation as the left one above.
                    focusNode = focusNode.right;
                    if (focusNode == null){
                        parent.right = newNode;
                        return;
                        }
                    }
                }

            }
            
        }

    // Search a binary tree for given target
    public int searchTree(int element)
    {
        Node focusNode = root;
    
        while(focusNode.val != element){
            if (focusNode.val > element){
                focusNode = focusNode.left;
            } else {
                focusNode = focusNode.right;
            }

            if (focusNode == null){
                return 0;
            }
        }

        return focusNode.val;
   
    }

    // PRE ORDER TRVERSAL (ROOT LEFT RIGHT)
    public void preOrderTraversal(Node focusNode)
    {   
        if (focusNode != null){
            System.out.print(" ");
            System.out.print(focusNode.val);
            System.out.print("-->");
            preOrderTraversal(focusNode.left);
            preOrderTraversal(focusNode.right);

        }
    }


    // IN ORDER TRAVERSAL (LEFT ROOT RIGHT)
    public void inOrderTraversal(Node focusNode)
    {   
        if (focusNode != null){
            inOrderTraversal(focusNode.left);
            System.out.print(" ");
            System.out.print(focusNode.val);
            System.out.print("-->");
            inOrderTraversal(focusNode.right);

        }
    }

    // POST ORDER TRAVERAL (LEFT RIGHT ROOT)
    public void postOrderTraversal(Node focusNode)
    {   
        if (focusNode != null){
            postOrderTraversal(focusNode.left);
            postOrderTraversal(focusNode.right);
            System.out.print(" ");
            System.out.print(focusNode.val);
            System.out.print("-->");

        }
    }

    // LEVEL ORDER TRAVERSAL

    public ArrayList<ArrayList<Integer>> levelOrderTraveral(Node focusNode)
    {

        if (focusNode == null) return new ArrayList<>(); 

        Queue<Node> queue = new LinkedList<Node>();
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();

        queue.add(focusNode);

        while (!queue.isEmpty())
        {
            ArrayList<Integer> store = new ArrayList<>();

            for (int i = 0; i < queue.size(); i++) 
            {
                Node current = queue.poll();
                store.add(current.val);

                if (current.left != null)
                {
                    queue.add(current.left);
                }

                if (current.right != null)
                {
                    queue.add(current.right);
                } 
            }
            output.add(store);
        }

        return output;

    }

 
    // Testing and running my code
    public static void main(String[] args)
    {
        BinaryTree myTree = new BinaryTree();
        myTree.addNode(50);
        myTree.addNode(15);
        myTree.addNode(25);
        myTree.addNode(8);
        myTree.addNode(75);
        myTree.addNode(85);
        myTree.addNode(1);

        System.out.println("preOrderTraversal");
        myTree.preOrderTraversal(root);
        System.out.println(" ");
        System.out.println("inOrderTraversal");
        myTree.inOrderTraversal(root);
        System.out.println(" ");
        System.out.println("postOrderTraversal");
        myTree.postOrderTraversal(root);
        System.out.println(" ");
        System.out.println("levelOrderTraveral");
        System.out.println(" ");
        System.out.println(myTree.levelOrderTraveral(root));
        System.out.println("Found: " + myTree.searchTree(15));

    }

}

// Creates a Node with default left and right children as null,
class Node
{
    int val;
    Node left;
    Node right;
 
    // gives each created node basic properties of left and right children.
    public Node(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }

}
