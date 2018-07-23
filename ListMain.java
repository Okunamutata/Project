import java.util.Scanner;
import java.util.Vector;



public class ListMain extends List{
	
	
	
	
	
	
	
	public ListMain(String item) {
	items.addElement(item);
	System.out.println(items);
	}
	
	public boolean removeItem(String item) {
		if(item != null) {
		items.remove(items.indexOf(item));
		return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your item here: ");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		for(int i = 0; i < items.size(); i++) {
			
			System.out.println(items.get(i));
		}
		
	}
}
