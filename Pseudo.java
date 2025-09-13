/*Pseudocode:


- prompt the user to enter a number;
- assign the number to a variable a;
- declare a variable b equals to 0;
- inside the loop:
  declare a variable c that equals to 0; 
  compare c and a;
- print b.
*/




import java.util.Scanner;
	public class Pseudo{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int a = input.nextInt();
	int b= 0;
		
	for (int c=0;c<a;c++){
	b+=a;
}
	System.out.print(b);
	


}
}