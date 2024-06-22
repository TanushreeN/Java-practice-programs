class Addition {
    static class Calculator{
        int num1;
        int num2;
        public int add(int num1, int num2){
            int result = num1 + num2;
            return result;
        }
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int sum = c.add(6,4);
        System.out.println("The sum of " + 6 + " and " + 4 + " is: " + sum);
    }
}

// op: The sum of 6 and 4 is: 10
