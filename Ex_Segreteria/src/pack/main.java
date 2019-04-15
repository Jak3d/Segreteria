package pack;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String input = myObj.nextLine();
		// TODO Auto-generated method stub
		
		insegnante ins1 = new insegnante(11,"Savona","Matematica");
		ins1.setSti();
		insegnante ins2 = new insegnante(4,"Milano","Italiano");
		ins2.setSti();
		insegnante ins3 = new insegnante(26,"Roma","Storia");
		ins3.setSti();
		
		
	}

}
