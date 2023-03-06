public class Driver2 {
    public static void main(String args[]){
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        s.pop();
        s.display();
        System.out.println(s.peek().data);
        System.out.println(s.isEmpty());
    }
}

