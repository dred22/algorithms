package binarytree;

public class Tree {
    Node root;

    public void addValue(int value){
        if (root == null){
            root = new Node(value);
        } else {
            if (root.getValue() > value){
                addLeft(root, value);
            } else {
                addRight(root, value);
            }
        }
    }



    private void addLeft(Node node, int valueToAdd){
        if (node.getLeftChild() == null){
            node.setLeftChild(new Node(valueToAdd));
        } else if(node.getLeftChild().getValue() > valueToAdd){
            addLeft(node.getLeftChild(), valueToAdd);
        } else {
            addRight(node.getLeftChild(), valueToAdd);
        }
    }
    private void addRight(Node node, int valueToAdd){
        if (node.getRightChild() == null){
            node.setRightChild(new Node(valueToAdd));
        } else if(node.getRightChild().getValue() > valueToAdd){
            addLeft(node.getRightChild(), valueToAdd);
        } else {
            addRight(node.getRightChild(), valueToAdd);
        }
    }


    public Node findMin(){
        Node curent = root;
        while (true){
            if (curent.getLeftChild() == null){
                return curent;
            }
            curent = curent.getLeftChild();
        }
    }
    public Node findMax(){
        Node curent = root;
        while (true){
            if (curent.getRightChild() == null){
                return curent;
            }
            curent = curent.getRightChild();
        }
    }



}
