class Addition
{
    void add()
    {
        System.out.println("Haii");
    }
}
class Subtraction extends Addition
{
    void sub()
    {
        System.out.println("Hello");
    }
    
}
class Main
{
    public static void main(String[] args)
    {
        Subtraction s = new Subtraction();
        s.add();
        s.sub();
    }
}
