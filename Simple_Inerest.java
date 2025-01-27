class Interest 
{
    
    public int result(float p, float t, float r)
    {
        return (int) ((p * t * r)/100);
    }

    public static void main(String[] args) {
        Interest in = new Interest();
         int Result = in.result(1000, 5, 5);
        System.out.print(Result);
    }
}

// OP : 250
