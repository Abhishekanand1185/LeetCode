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
        Stack<Integer> operand= new Stack<>();
        Stack<Character> operator = new Stack<>();
        char ch[] = s.toCharArray();
        int i=0;
        while(i < ch.length){
            if(ch[i] >= '0' && ch[i] <= '9'){
                int num = 0;
                while(i < ch.length && ch[i] >= '0' && ch[i] <= '9'){
                    num = num * 10 + (ch[i] - '0');
                    i++;
                }
                operand.push(num);
                i--;
            }

            else if(ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/'){
                if(!operator.isEmpty() && prec(operator.peek()) >= prec(ch[i])){
                    char oprtr = operator.pop();
                    int val2 = operand.pop();
                    int val1 = operand.pop();
                    int cal = calc(val1, val2, oprtr);
                    operand.push(cal);
                }
                operator.push(ch[i]);
            }
            i++;
        }
        while(!operator.isEmpty()){
            char oprtr = operator.pop();
            int val2 = operand.pop();
            int val1 = operand.pop();
            int cal = calc(val1, val2, oprtr);
            operand.push(cal);
        }
    return operand.pop();   
    }
}