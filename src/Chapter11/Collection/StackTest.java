package Chapter11.Collection;

import java.util.ArrayList;
import java.util.Stack;

class Mystack {

    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data){
        arrayStack.add(data);
    }

    public String pop(){
        int len = arrayStack.size();

        if (len == 0){
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return arrayStack.remove(len-1);
    }
}



public class StackTest {
    public static void main(String[] args) {

        Mystack mystack = new Mystack();
        mystack.push("A");
        mystack.push("B");
        mystack.push("C");

        System.out.println(mystack);
        System.out.println();

        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
    }

}
