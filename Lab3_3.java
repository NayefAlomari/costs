package Array_based_stack;

public class Lab3_3 {

    static  int counter=0;
    static Stack<Integer> Stack = new Stack<>();

    public static String PopAll()
    {
        if (Stack.isEmpty())
        {
            return "is Empty.";
        }
        else
            while (! Stack.isEmpty())
            {
                Stack.pop();
                counter++;
            }
        return " Stack is Empty."+"\nStack = "+Stack;
    }
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            Stack.push(4);
        }
        System.out.println("Elements pushed to Stack. ");
        System.out.println("Stack = "+Stack);
        System.out.println(PopAll());
        System.out.println("Calling pop() method Times (Element/s Deleted) = "+counter+".");}
}
