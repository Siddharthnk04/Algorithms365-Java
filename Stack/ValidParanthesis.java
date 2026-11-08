public class ValidParanthesis 
{
    static boolean isBalancedExpression(String exp)
    {
        if (exp == null)
            return false;

        Stack stack = new Stack(exp.length());

        for (int i = 0; i < exp.length(); i++)
        {
            if (exp.charAt(i) == '(')
                stack.push(exp.charAt(i));

            if (exp.charAt(i) == ')')
            {
                if (stack.isEmpty())
                    return false;
                
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = ")2+5((8*(8))";

        System.out.println(isBalancedExpression(str));
    }
}
