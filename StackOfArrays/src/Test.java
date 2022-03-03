
public class Test {

    public static void main(String[] args) {
        
        boolean errorBreak = false;
        boolean MatchingBrackets = false;
        String example = "{Hello{{{Java}World5}}}";
        StackOfArrays stack = new StackOfArrays(example.length());
        System.out.println("The string is " + example );
    
    
        for (int i = 0; i < example.length(); i++){
            if (example.charAt(i) == '{'){
                stack.push('{');
            } else if (example.charAt(i) == '}'){
                if (stack.isEmpty()){
                    MatchingBrackets = false;
                    errorBreak = true;
                    break;
                }
                stack.pop();
            }
        }
        System.out.println();
        if ((errorBreak == true)){
            MatchingBrackets = false;
            System.out.println("String Does NOT have matching brackets");
        } else if (stack.isEmpty()) {
            MatchingBrackets = true;
            System.out.println("String Has matching brackets");
        } else System.out.println("String does not have matching brackets");
    }
}