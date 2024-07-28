//code

class MethodDemo 
{
    public void myMethod(){
        System.out.println("The code is executing using Method");
    }
    public static void main(String[] args) {
       MethodDemo call = new MethodDemo();
       call.myMethod();
    }
}

// output: The code is executing using Method
