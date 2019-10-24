import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;




public class fortune_cookie2 {
		//1.  declare all JComponents
	
	
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	JButton button = new JButton();

	
	
	
	
		

		//2.  call your createUI method (shown below)
		public static void main(String[] args){
			new fortune_cookie2().createUI();
		}

		//3.  make a createUI() method (shown below)
		void createUI(){
		//4.  initialize all JComponents


		//5.  add them all together
		

		//6.  add any listeners


		//7.  pack frame and setVisible


		}
		
		//8.  add "implements ActionListener" to the class declaration (shown above) 
		//9.  import ActionListener, then click on the name of the class and select "add unimplemented methods" (this will add the actionPerformed method shown below)
		public void actionPerformed(ActionEvent e){
			//check which button was pressed and do something (shown below)
			if(e.getSource() == button){

}
