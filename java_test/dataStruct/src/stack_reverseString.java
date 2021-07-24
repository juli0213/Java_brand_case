import java.io.IOException;
public class stack_reverseString {
    private String input;
    private String output;
//    构造函数
    public stack_reverseString(String in) {
        input = in;
    }
    public String doRev() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);
//        先入栈
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
//        出栈，再连接字符串
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }
    public static void main(String[] args)
            throws IOException {
        String input = "www.w3cschool.cc";
        String output;
        stack_reverseString theReverser =
                new stack_reverseString(input);
        output = theReverser.doRev();
        System.out.println("反转前： " + input);
        System.out.println("反转后： " + output);
    }
    class Stack {
        private int maxSize;
        private char[] stackArray;
        private int top;
        public Stack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }
        public void push(char j) {
            stackArray[++top] = j;
        }
        public char pop() {
            return stackArray[top--];
        }
        public char peek() {
            return stackArray[top];
        }
        public boolean isEmpty() {
            return (top == -1);
        }
    }
}
