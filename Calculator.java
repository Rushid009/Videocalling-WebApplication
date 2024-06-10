//Q1:Create a Calculator class with methods to add, subtract, multiply & divide two numbers. Use if-else if to execute logic based on passed operator.

package Class_object;

import java.util.Scanner;

public class Calculator
{
int a,b;
Scanner ob=new Scanner(System.in);

public void add()
{
	System.out.println("enter the two no addition....");
	a=ob.nextInt();
	b=ob.nextInt();
	System.out.println("addition of two no"+(a+b));	
}
public void sub()
{
	System.out.println("enter the two no substrtion....");
	a=ob.nextInt();
	b=ob.nextInt();
	System.out.println("subtrction of two no..."+(a-b));
}
public void multi()
{
	System.out.println("enter the two no multiplication....");
	a=ob.nextInt();
	b=ob.nextInt();
	System.out.println("multiplication of two no..."+(a*b));
}
public void div()
{
    System.out.println("enter the two no divistion....");
    a=ob.nextInt();
	b=ob.nextInt();
	System.out.println("  divistion of two no..."+(a/b));
}
public static void main(String arg[])
{
	Calculator x=new Calculator();
	Scanner ob=new Scanner(System.in);
	char op;
	System.out.println("Enter the choice");
	System.out.println("Addition press +");
	System.out.println("substraction press -");
	System.out.println("multiplication press *");
	System.out.println("Divistion press /");
	op=ob.next().charAt(0);
	if(op=='+')
	{
       x.add();
       
	}
	else if(op=='-')
	{
		x.sub();
		
	}
	else if(op=='*')
	{
		x.multi();
	}
	else if(op=='/')
	{
		x.div();
		
	}System.out.println("wrong choice");
	}
	 
}

