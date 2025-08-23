class Solution {
    public int prec(char a){
        if(a == '*' || a == '/') return 1;
        if(a == '+' || a == '-') return 0;
    return -1;
    }
    public int calc(int a, int b, char c){
        if(c == '+') return a + b;
        else if(c == '-') return a - b;
        else if(c == '*') return a * b;
        else return a / b;
    }
    public int calculate(String s) {
       Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        int i = 0, n = s.length();

        while(i < n){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int num = 0;
                while(i < n && Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                operand.push(num);
                i--;
            }

            else if(c == '+' || c == '-' || c == '*' || c == '/'){
                while(!operator.isEmpty() && prec(operator.peek()) >= prec(c)){
                    char oprtr = operator.pop();
                    int val2 = operand.pop();
                    int val1 = operand.pop();
                    operand.push(calc(val1, val2, oprtr));
                }
                operator.push(c);
            }
            i++;
        }

        while(!operator.isEmpty()){
            char oprtr = operator.pop();
            int val2 = operand.pop();
            int val1 = operand.pop();
            operand.push(calc(val1, val2, oprtr));
        }
        return operand.pop(); 
    }
}