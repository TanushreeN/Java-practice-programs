class Subtract
    {
    static class Calculator{
        int num1;
        int num2;
        public int subtract(int num1, int num2){
            int result = num1 - num2;
            return result;
        }
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int subtract = c.subtract(6,4);
        System.out.println("The subtraction of " + 6 + " and " + 4 + " is: " + subtract);
    }
}

//op: The subtraction of 6 and 4 is: 2
