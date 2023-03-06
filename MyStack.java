class StackNode{
    int data;
    StackNode next;

    public StackNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class MyStack{
    StackNode top;

    public MyStack(){
        this.top = null;
    }
    public void push(int data){
        StackNode newNode = new StackNode(data);
        if(top == null){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }

    public StackNode pop(){
        if(top == null){
            return null;
        }
        else {
            StackNode temp;
            temp = top;
            top = top.next;
            return temp;
        }
    }
    public void display(){
        System.out.println("stack element:");
        StackNode current = top;
        while(current != null){
            System.out.println(" "+current.data);
            current = current.next;
        }
        System.out.println(" ");
    }

    public StackNode peek(){
        return top;
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        else{
            return false;
        }
    }

}