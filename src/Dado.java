import java.util.Scanner;


public class Dado {

	public static void main(String[] args) {

		while(true) {

		Scanner in = new Scanner(System.in);
		in.nextLine();

		
			int num = gerarNum();

			switch (num) {
			case 1:
				System.out.println(" _______\r\n"
						+ "|       |\r\n"
						+ "|   *   |\r\n"
						+ "|_______|");
				break;
			case 2:
				System.out.println(" _______\r\n"
						+ "|     * |\r\n"
						+ "|       |\r\n"
						+ "|_*_____|");
				break;
			case 3:
				System.out.println(" _______\r\n"
						+ "|     * |\r\n"
						+ "|   *   |\r\n"
						+ "|_*_____|");
				break;
			case 4:
				System.out.println(" _______\r\n"
						+ "| *   * |\r\n"
						+ "|       |\r\n"
						+ "|_*___*_|");
				break;
			case 5:
				System.out.println(" _______\r\n"
						+ "| *   * |\r\n"
						+ "|   *   |\r\n"
						+ "|_*___*_|");
				break;
			case 6:
				System.out.println(" _______\r\n"
						+ "| *   * |\r\n"
						+ "| *   * |\r\n"
						+ "|_*___*_|");
				break;

				
				}
			
		}

		
	}

	

	





	public static int gerarNum() {
		int min = 1;
		int max = 6;

		int random = (int)Math.floor(Math.random()*(max-min)+min);
		return random;



	}
}