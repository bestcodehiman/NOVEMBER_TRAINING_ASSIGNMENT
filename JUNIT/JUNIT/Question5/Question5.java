package JUNIT.Question5;

import java.util.Stack;

public class Question5 {
	public Integer findExpressionResult(String expression) {
		char[] CharArr = expression.toCharArray();

        // Declaring a stack to collect all the numbers.

       Stack<Integer> AllValues = new Stack<Integer>();

       // Declaring a stack to collect all the operators.
       Stack<Character> AllOpts = new Stack<Character>();

       for (int i = 0; i < CharArr.length; i++){

           // Skip the space
           if (CharArr[i] == ' ')
               continue;

           // Push the number to the stack
           if (CharArr[i] >= '0' && CharArr[i] <= '9') { // Checking whether its a number
               StringBuffer MyBuf = new  StringBuffer(); // Declaring a string buffer

               // Pushing multidigit number to stack
               while (i < CharArr.length && CharArr[i] >= '0' && CharArr[i] <= '9')
                   MyBuf.append(CharArr[i++]);
               AllValues.push(Integer.parseInt(MyBuf.toString()));  // Converting string to int.

                 i--;
           }

           // Push all operators to stack
           else if (CharArr[i] == '(')
               AllOpts.push(CharArr[i]);

           // Working with braces
           else if (CharArr[i] == ')') {
               while (AllOpts.peek() != '(')
                 AllValues.push(applyOp(AllOpts.pop(), AllValues.pop(), AllValues.pop()));
                 AllOpts.pop();
           }

           // Push all mathematical operator to stack
           else if (CharArr[i] == '+' || CharArr[i] == '-' || CharArr[i] == '*' || CharArr[i] == '/'){
               while (!AllOpts.empty() && FindPrecedence(CharArr[i], AllOpts.peek())) AllValues.push(applyOp(AllOpts.pop(),
                                  AllValues.pop(),
                                AllValues.pop()));

               // Push the current operator.
               AllOpts.push(CharArr[i]);
           }
       }

       while (!AllOpts.empty())
           AllValues.push(applyOp(AllOpts.pop(), AllValues.pop(), AllValues.pop()));

       return AllValues.pop();
   }

   public static boolean FindPrecedence(char Opt1, char Opt2){
       if (Opt2 == '(' || Opt2 == ')')
           return false;
       if ((Opt1 == '*' || Opt1 == '/') &&
           (Opt2 == '+' || Opt2 == '-'))
           return false;
       else
           return true;
   }

   // Performing necessary mathematical operations
   public static int applyOp(char Opt, int b, int a){
       switch (Opt){
       case '+':
           return a + b;
       case '-':
           return a - b;
       case '*':
           return a * b;
       case '/':
           if (b == 0)
               throw new
               UnsupportedOperationException(
                     "Invalid Calculation !!!");
           return a / b;
       }
       return 0;
	}

}
