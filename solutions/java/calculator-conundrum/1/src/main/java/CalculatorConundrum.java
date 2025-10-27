class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        
        if (operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.equals("")){        
            throw new IllegalArgumentException("Operation cannot be empty");
}
        if (operation.equals("*")){
            int res = operand1 * operand2;
            return operand1 + " * " + operand2 + " = " + res;
        }
        if (operation.equals("+")){
            int res = operand1 + operand2;
            return operand1 + " + " + operand2 + " = " + res;
        }
        if (operation.equals("/")){
            try{
            int res = operand1 / operand2;
            return operand1 + " / " + operand2 + " = " + res;}
            catch (ArithmeticException e){
                throw new IllegalOperationException("Division by zero is not allowed",e);
            }
        }


        else{
            throw new IllegalOperationException("Operation '"+operation+"' does not exist");
        }
    
}}
