package com.csi.coreconcept;

public class ArithmeticConcept {
public static void main(String[] args) {
	

	ArithmeticConcept a= new ArithmeticConcept();
	
	System.out.println("\n result is "+a.add(5,454));
	System.out.println("changes");

	a.show();
	System.out.println("\n result "+sub(4, -8));//sub is static method so no need to write object 'a', if u write then also okay, but there is no need
     System.out.println("\n Multiplication is "+a.mul(56, 2));
     System.out.println("\n Division is a "+a.division(90, 3));

}
//break point in which fn f6 use for next line abd fn f8 use for go inside the method
int add(int n, int m)
{
	return n+m;
	
}
void show()
{
	System.out.println("\n Welcome Here!!!");
}
static double sub(int n, int m)
{
	return n-m;//this is upcasting so not issues to execute means double to int means higher to lower
}
float mul(float n, float m)
{
	return n*m;
	
}
double division(double n, double m)
{
	return n/m;
}
}
