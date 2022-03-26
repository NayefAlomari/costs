package Array_based_stack;

import java.util.Scanner;
import java.util.Stack;

public class Lab3_1 {
    static int evaluatePostfix(String express)
    {

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<express.length();i++)
        {
            char x=express.charAt(i);

            if(Character.isDigit(x))
                stack.push(x - '0');

            else {
                int Operand = stack.pop();
                int Operand2 = stack.pop();
                switch(x)
                {case '+': stack.push(Operand2+Operand);
                        break;
                    case '-': stack.push(Operand2- Operand);
                        break;
                    case '/': stack.push(Operand2/Operand);
                        break;
                    case '*': stack.push(Operand2*Operand);
                        break;
                    case '^': stack.push( (int) Math.pow(Operand2,Operand));
                        break;
                }}}
        return stack.pop();
    }
    public static void main(String[] args)
    {Scanner in = new Scanner(System.in);
        System.out.println("Enter an expression to express on POSTFIX!.");
        String express=in.nextLine();
        System.out.println("The \"POSTFIX!\"expression entered = "+express +" .");
        System.out.println("Postfix evaluation = "+evaluatePostfix(express)); }
}

