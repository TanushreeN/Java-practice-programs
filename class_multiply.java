class Multiply {
    static class Calculator{
        int num1;
        int num2;
        public int multiply(int num1, int num2){
            int result = num1 * num2;
            return result;
        }
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int multiply = c.multiply(6,4);
        System.out.println("The Multiplication of " + 6 + " and " + 4 + " is: " + multiply);
    }
}

// OP: The Multiplication of 6 and 4 is: 24
