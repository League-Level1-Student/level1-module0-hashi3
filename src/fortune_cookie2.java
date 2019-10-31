import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




public class fortune_cookie2 implements ActionListener  {

		//1.  declare all JComponents
	
	
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	JButton button = new JButton("open");
	

	
	

	
	
	
	
		

		//2.  call your createUI method (shown below)
		public static void main(String[] args){
			new fortune_cookie2().createUI();
		}

		//3.  make a createUI() method (shown below)
		void createUI(){
		//4.  initialize all JComponents


		//5.  add them all together
			
			frame.add(panel);
			panel.add(button);
			button.addActionListener(this);
			
		

		//6.  add any listeners
			
			


		//7.  pack frame and setVisible
			frame.pack();
			frame.setVisible(true);
		}

		
		
		//8.  add "implements ActionListener" to the class declaration (shown above) 
		//9.  import ActionListener, then click on the name of the class and select "add unimplemented methods" (this will add the actionPerformed method shown below)
		public void actionPerformed(ActionEvent e){
			//check which button was pressed and do something (shown below)
			if(e.getSource() == button){
				Random r = new Random();
				 
				int choice = r.nextInt(5);
				
				if(choice == 0) {
					JOptionPane.showMessageDialog(null, "you will win a million dollars" );
				}
				
				else if(choice == 1) {
					
					JOptionPane.showMessageDialog(null, " you have bad luck for life" );
					
					
				}
				
				else if(choice == 2) {
					
					JOptionPane.showMessageDialog(null, " your courage will lead you to greatness" );
					
				}
				
				else if(choice == 3) {
					
					JOptionPane.showMessageDialog(null, " your turtle will comeout of it's shell" );
					
				}
				
				else if(choice == 4 ) {
					
					JOptionPane.showMessageDialog(null, " your turtle wont comeout of its shell" );
					
				}
				
				
				

}
		}

}
