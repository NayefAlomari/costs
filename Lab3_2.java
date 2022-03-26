package Array_based_stack;

import java.util.Stack;

public class Lab3_2 {
    private Stack<Object> x = new Stack<>();
    Stack<Object> y = new Stack<>();


    public static void main(String[] args) {

        Lab3_2 z= new Lab3_2();

        z.x.push("x");  z.x.push(2);  z.x.push(3);  z.x.push(4);

        System.out.println("Stack S="+z.x);

        System.out.println("S.size ="+z.x.size());

        int t =z.x.size();

        for (int i = 0; i <t ; i++) {
            z.y.push(z.x.pop());
        }
        System.out.println("Stack T="+z.y);
    }
}
