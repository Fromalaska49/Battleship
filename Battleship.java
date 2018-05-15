import java.util.* ;
public class Temp {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int numRows = 10;
		int numCols = 10;
		String columnDividers = "|";
		String rowDividers = "+";
		for(int col = 0; col < numCols; col++) {
			columnDividers += "   |";
			rowDividers += "---+";
	    }
		System.out.println(rowDividers);
		String printableRow =  columnDividers + "\n   " + rowDividers + "\n";
		for(int row = 0; row < numRows; row++) {
			System.out.print(printableRow); 
	    }
		System.out.println("\n");
	 }
}
