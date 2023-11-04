class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==0){
            return 0;
        }
        Stack<Integer>st = new Stack<>();
        int op1,op2,result;//op1=operand1,op2=operand2 result of the current operation symbol
        char operation;//to hold current operation symbol
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                op2=st.pop();
                op1=st.pop();
                if(tokens[i].equals("+")){
                    result=op1+op2;
                }else if(tokens[i].equals("-")){
                    result=op1-op2;
                }else if(tokens[i].equals("*")){
                    result=op1*op2;
                }else{
                    result=op1/op2;
                }
                st.push(result);
            }else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        return st.pop();
    }
}