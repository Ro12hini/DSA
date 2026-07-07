import java.util.Scanner;

// Input: s = "()(()())(())"

// Output: "()()()"

// Explanation:

// Primitive decomposition: "()" + "(()())" + "(())"

// After removing outermost parentheses: "" + "()()" + "()"

// Final result: "()()()".

public class RemoveBrackets {

    public static String removeOuterParentheses(String s) {
        // Your code goes here
        StringBuilder res = new StringBuilder();
        int open = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                if(open > 0){
                    res.append(c);
                }
                open++;
            }else if(c == ')'){
                open--;
                if(open > 0){
                    res.append(c);
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        System.out.println(removeOuterParentheses(s));
    }
}


