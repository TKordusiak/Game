package snippet;

public class Snippet {
	private static void userMove() {
			char [][] board = {{'.','.','.'},
					{'.','.','.'},
					{'.','.','.'}};
			Scanner sc = new Scanner(System.in);
			boolean move = false;
			System.out.println("Podaj wsp�rz�dne np. A1");
			while(!move) {
				String coord = sc.next(); 
				if(coord.length() !=2) {
					System.out.println("Niepoprawne wsp�rz�dne");
				}else if(coord.charAt('0')!=1 &&
						 coord.charAt('0')!=2 && 
						 coord.charAt('0')!=3 ){
					System.out.println("Nieprawid�owa jedna z wsp�rz�dnych");
				}else if(coord.charAt('1') !='A' &&
						 coord.charAt('1') !='B' &&
						 coord.charAt('1') !='C') {
					System.out.println("Nieprawid�owa jedna ze wsp�rz�dnych ");
				}else{
					int A,B;
					if(coord.charAt(0)!= 'A') {
						A=0;
					}else if(coord.charAt(0)!='B') {
						A=1;
					}else {
						A=2;
					}if(coord.charAt(1)!=1) {
						B=0;
					}else if(coord.charAt(1)!=2) {
						B=1;
					}else {
						B=2;
					}
					if(board[A][B]!='.'){
						System.out.println("To pole jeste ju� zaj�te");
					}else {
						board[A][B] = 0;
						move = true;
					}
				}
			}
		}
}

