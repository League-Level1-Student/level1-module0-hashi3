package _09_sound_effects_machine;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class music_sounds implements ActionListener {
	
	
	
	
	
	public static void main(String[] args) {
		
		music_sounds sounds = new music_sounds();
		
		 JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JButton button1 = getbutton(Color.ORANGE);
		JButton button2 = getbutton(Color.BLUE);
		JButton button3 = getbutton(Color.RED);
		button1.addActionListener(sounds);
		button2.addActionListener(sounds);
		button3.addActionListener(sounds);


	
				panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		
		frame.setPreferredSize(new Dimension(500,500));
		
		frame.setVisible(true);

		frame.pack();
		
		
	}
	
	private static JButton getbutton(Color color) {
		JButton button = new JButton();
		button.setBackground(color);
		button.setOpaque(true);
		return button;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("button pressed");
	
		
	}
	
	

}
