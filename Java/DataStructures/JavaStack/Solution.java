package HackerRank.Java.DataStructures.JavaStack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by kaima on 6/7/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {
            Stack<Character> stack = new Stack<>();
            char[] input = scan.next().toCharArray();
            boolean valid = true;
            int index = 0;

            while(index < input.length && valid)
            {
                if(stack.isEmpty())
                    stack.add(input[index]);
                else
                    switch(input[index]){
                        case ')':
                            if(stack.peek() == '(')
                                stack.pop();
                            else
                                valid = false;
                            break;
                        case '}':
                            if(stack.peek() == '{')
                                stack.pop();
                            else
                                valid = false;
                            break;
                        case ']':
                            if(stack.peek() == '[')
                                stack.pop();
                            else
                                valid = false;
                            break;
                        default:
                            stack.add(input[index]);
                    }
                index++;
            }

            System.out.println(valid && stack.isEmpty());
        }
    }
}
