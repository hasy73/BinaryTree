
public class dshw4_10056045 { 
    public static TreeNode rootNode;
    public static void main(String[] args) {
        int[] tree = {0, 7, 4, 1, 5, 16, 8, 11, 12, 15, 9, 2};
        System.out.println("Binary Search Tree 內容:");
        for(int i=1;i<tree.length;i++){
            System.out.print("["+tree[i]+"] ");
        }
        System.out.println();
        for(int i=1;i<tree.length;i++){
            insert(tree[i]);
        }
        
        
    }
    class TreeNode{
        int value;
        TreeNode right;
        TreeNode left;
        public TreeNode(int value)
        {
            this.value =value;
            this.right =null;
            this.left =null;
        }
    }
    public static void InOrder(TreeNode rootNode){
        if(rootNode!=null)
        {
            InOrder(rootNode.left);
            System.out.print("["+rootNode.value+"] ");
            InOrder(rootNode.right);
        }
    }
    public static void PreOrder(TreeNode rootNode){
        if(rootNode!=null)
        {
            System.out.print("["+rootNode.value+"] ");
            PreOrder(rootNode.left);
            PreOrder(rootNode.right);
        }
    }
    public static void PostOrder(TreeNode rootNode){
        if(rootNode!=null)
        {
            PostOrder(rootNode.left);
            PostOrder(rootNode.right);
            System.out.print("["+rootNode.value+"] ");
        }
    }
    public static void insert(int value){       //建立一棵二元樹
        if(rootNode==null){             //若二元樹中無節點
            rootNode=new TreeNode(value);
            return;
        }
        TreeNode currentNode=rootNode;
        while(true)
        {
            if(value<currentNode.value){    //較大值放右邊
                if(currentNode.left==null){
                    currentNode.left=new TreeNode(value);
                    return;
                }
                else
                    currentNode=currentNode.left;
            }else{                          //較小值放左邊
                if(currentNode.right==null){
                    currentNode.right=new TreeNode(value);
                    return;
                }else
                    currentNode=currentNode.right;
            }
        }
    }
}




 


   

