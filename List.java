import java.util.Vector;
import javax.swing.*;


public class List extends javax.swing.JFrame{
	
	
	//fields 
	private double itemPrice;
	private int itemCount;
	protected static String itemName;
	public static Vector<String> items = new Vector<String>(5, 1);
	
	///Ui 
	JTextField item = new JTextField("Enter the item name: ", 20);
	JTextArea comments = new JTextArea("Notes",4, 15);
	JButton add = new JButton("Add");
	JButton remove = new JButton("Remove");
	JScrollPane scroll = new JScrollPane(comments, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	JLabel  itemLabel = new JLabel("Items");
	JLabel addLabel = new JLabel("Add");
	JLabel removeLabel = new JLabel("Remove");
	
	
	
	
	
	
	///constructor
	public List() {
		super("Grocery List");
		setSize(500, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel();
		
		
		comments.setLineWrap(true);
		comments.setWrapStyleWord(true);
		
		//pane.add(itemLabel);
		//pane.add(addLabel);
		pane.add(add);
		//pane.add(removeLabel);
		pane.add(remove);
		pane.add(scroll);
		add(pane);
		setContentPane(pane);
		setVisible(true);
		
		
	}
	

	///main method
	public static void main(String[] args) {
		List li = new List();
		
	}
	
}
