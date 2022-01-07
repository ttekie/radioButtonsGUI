//----------------------------------------------------
// Programmer: Tesfalem Tekie
// Course: COSC 1437 Section 003
// Semester: Summer 2020
// Assignment #: 11
// Due Date: July 8, 2020
//----------------------------------------------------

import javax.swing.JFrame;

public class RadioButtonsTester {

	/**
	
	* @param args
	
	*/

	public static void main(String[] args) {

			// instantiate a frame
			// from the class JFrame
		JFrame frame = new JFrame("Fun with radio buttons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			// the primary panel is added
			// to the frame and made visible
		frame.getContentPane().add(new RadioButtonsGUI());
		frame.pack();
		frame.setVisible(true);
	} // end method main

} // end class RadioButtonsTester