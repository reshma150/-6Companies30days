import java.io.*;
import java.util.*;

class solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<>();
        for(String str : tokens)
        {
            if("+".equals(str))
            {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num1 + num2);
            }
            else if("-".equals(str))
            {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            }
            else if("*".equals(str))
            {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num1 * num2);
            }
            else if("/".equals(str))
            {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            }
            else 
                stack.push(Integer.valueOf(str));
        }
        return stack.peek();
    }
}

class RevPolisNotation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String[] s={ "10", "6", "9",  "3", "+", "-11", "*",
                "/",  "*", "17", "+", "5", "+" };
solution str1=new solution();
int res=str1.evalRPN(s);
System.out.println(res);
}
}
