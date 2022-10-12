BY GULSHAN SHARMA
	A THIRD YEAR (5TH SEM STUDENT OF U.I.E.T (M.D.U))
	
THIS IS THE CODE FOR BINARY SEARCHING OF A NUMBER IN A ARRAY
IT CONSTITUE OF 4 CLASSES 
	ONE OF THE MAIN METHOD
	SECOND FOR INPUTTING THE ARRAY
	THIRD FOR SORTING THE ARRAY
	FOURTH FOR APPLYING THE BINARY SEARCH ON IT

13:17 8 OCTOBER 2022 MDU CENTRAL LIBRARY (FIRST FLOOR)

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;


public class First_gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui first = new Gui();	
	}   
}
class Gui extends JFrame{
	public Gui() {
		setLayout(new FlowLayout());
		JLabel text = new JLabel("Number 1");
		JLabel t2 = new JLabel("Number 2");
		JTextField t5 = new JTextField(50);
		JTextField t6 = new JTextField(50);
		JButton t7 = new JButton("Result");
		add(t7);
		add(t5);
		add(t6);           
		add(text);
		add(t2);
		
		setVisible(true);
		setSize(600 , 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}	
