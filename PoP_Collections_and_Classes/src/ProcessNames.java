import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProcessNames {

	//Task 1
	
	public ArrayList<String> readNames(String fileName) throws Exception {
		ArrayList<String> names = new ArrayList<String>();
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			names.add(scan.nextLine());
		}
		scan.close();
		return names;
	}

	//Task 2
	
	public ArrayList<String> sortNames(ArrayList<String> names){
		Collections.sort(names);
		return names;
	}

	//Task 3
	
	public boolean findName(String name, ArrayList<String> names) {
		boolean found = false;
		for( int i = 0; i < names.size(); i ++) {
			if( names.get(i) == name) {
				found = true;
				i = names.size();
			}
		}
		return found;
	}

	/*Task4 - find name position
	public ?? findNamePosition(??) {
		??
	}
	 */

	/*Task5 - delete name
	public ?? deleteName(??){
		??
	}
	 */

	/*Task6 - add name
	public ?? addName(??){
		??
	}
	 */

	/*Task7 - modify name 
	public ?? changeName(??){
		??
	}
	 */

	/*Task 8 - write the new data back to the file
	public ?? writeNames(??) {
		??
	}
	 */

}
