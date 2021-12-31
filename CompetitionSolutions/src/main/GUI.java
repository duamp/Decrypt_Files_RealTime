package main;

import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class GUI {
	boolean fileAdded = false;
	String filepath; 
	
	JFrame f = new JFrame(); //creating instance of JFrame  
	JButton b=new JButton("Add Encrypted file"); //creating instance of JButton  
	JButton quitButton = new JButton("Quit");
	
	/*create GUI */
	public void createGUI() {
		b.setBounds(100,100,200, 40); //x axis, y axis, width, height  
		          
		f.add(b); //adding button 
		f.add(quitButton);
		quitButton.addActionListener((event) -> System.exit(0));
		
		quitButton.setBounds(150,250,100, 40); //x axis, y axis, width, height 
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible 
	}
	
	/* Add File to GUI*/
	public void openFile() {
		final JFileChooser fc = new JFileChooser(); //Add file to decode
		int result = fc.showOpenDialog(f);
		if (result == JFileChooser.APPROVE_OPTION) {
		    File selectedFile = fc.getSelectedFile();
		    filepath = selectedFile.getAbsolutePath();
		    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
		}
		
	}
	
	public void isButtonPressed() {
		if(b.getModel().isPressed()) {
			openFile();
			fileAdded = true;
			}
	}

}
