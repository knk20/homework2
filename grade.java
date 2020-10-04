import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The program assumes that the student has 5 grades and need to 
		 * take the average of the 5 grades and conclude what would be 
		 * the final grade based on the average*/
		char grade_assign;
		float grade[] = new float[5];
		int a;
		float total=0, avg=0;
		Scanner grade_scanner = new Scanner(System.in);
		
		for (a=0;a<5;a++) {
			System.out.print("Enter value for grade"+(a+1)+" = ");
			grade[a] = grade_scanner.nextFloat();
			total = total + grade[a];
			
			
		}
		grade_scanner.close();
		avg = total/5;
		//System.out.println("The average final Student grade is: "+avg);
		if (avg >= 90.00) {grade_assign = 'A';}
		else if (avg >=80 && avg <=89.99) {grade_assign = 'B';}
		else if (avg >=70 && avg <=79.99) {grade_assign = 'C';}
		else  {grade_assign = 'F';}
		System.out.println();
		switch(grade_assign) {
			case 'A':
				System.out.println("A: Fantastic Job!");
				break;
			case 'B':
				System.out.println("B: Good!");
				break;
			case 'C':
				System.out.println("C: Please try more next time!");
				break;
			case 'F':
				System.out.println("F: Unfortunately you failed!");
				break;
			default:
				System.out.println("Given grades are not valid !!!");
		}
	}

}
