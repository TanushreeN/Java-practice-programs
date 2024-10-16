import java.util.Scanner;


class HelloWorld 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Num1:");
        int Num1 = sc.nextInt();
        
        System.out.println("Select the operator:");
        sc.nextLine();
        String operator = sc.nextLine();
        
        System.out.println("Enter the Num2:");
        int Num2 = sc.nextInt();
       
        switch(operator)
        {
        case "+": 
            System.out.println("Result: " +(Num1 + Num2));
            break;
        case "-":
            System.out.println("Result: "+(Num1 - Num2));
            break;
        case "*":
            System.out.println("Result: "+(Num1 * Num2));
            break;
        case "/":
            if(Num2 != 0)
            {
                System.out.println("Result: "+(Num1 / Num2));
            }
            else
            {
                System.out.println("Error !!!, Cannot Divide by zero");
            }
            break;
        default:
            System.out.println("Ooops....The opration is not taken here");
        
        }
        sc.close();
    }
}


// OP1:Enter the Num1:
// 3
// Select the operator:
// +
// Enter the Num2:
// 5
// Result: 8


// OP2: Enter the Num1:
// 4
// Select the operator:
// %
// Enter the Num2:
// 5
// Ooops....The opration is not taken here
