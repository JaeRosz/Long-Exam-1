package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Profile extends Main {

	private JPanel contentPane;

	
	public Profile() {
		
		contentPane = new JPanel(); 
		contentPane.setBackground(new Color(255, 255, 255)); // Sets background color of the content pane
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // Remove the border of the content pane 

		setContentPane(contentPane);
		contentPane.setLayout(null); 
		
		// Sets the appearance or design of the button
		JButton btnAbout = new JButton("");
		
		btnAbout.setContentAreaFilled(false); // Makes the content area of the button transparent
		btnAbout.setBorderPainted(false); // Remove the border of the button
		btnAbout.setBackground(null); // Removes the background color and making it transparent
		
		
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create a new instance of the AboutMe class and make it visible
				AboutMe AboutMeFrame = new AboutMe(); 
				AboutMeFrame.setVisible(true); 
				
				dispose(); // Dispose the current frame
				
			}
		});
		
		btnAbout.setBounds(642, 59, 124, 36); //Sets the position and size of the button "About"
		contentPane.add(btnAbout); 
		
		
		// Creates a JButton object 
		JButton btnWorks = new JButton("");
		
		// Sets the appearance or design of the button
		btnWorks.setContentAreaFilled(false);  // Makes the content area of the button transparent
		btnWorks.setBorderPainted(false); // Remove the border of the button
		btnWorks.setBackground(null); // Removes the background color and making it transparent
			
		// Adds an ActionListener to the button
		btnWorks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Works MainWorks = new Works();
				MainWorks.setVisible(true); // Sets the Works frame to be visible
				
				dispose(); // Dispose the current frame
				
			}
		});
		btnWorks.setBounds(815, 59, 89, 36); // Sets the position and size of the button "Works"
		contentPane.add(btnWorks); // Adds button to the content pane
		
		// Adds an ActionListener to the button
		JButton btnContacts = new JButton("");
		btnContacts.setContentAreaFilled(false); // Makes the content area of the button transparent
		btnContacts.setBorderPainted(false); // Remove the border of the button
		btnContacts.setBackground(null); // Removes the background color and making it transparent
		
		btnContacts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create a new instance of the Contacts class and make it visible
				Contacts InfoFrame = new Contacts(); 
				InfoFrame.setVisible(true);
				
				dispose(); // Disposes the current frame
			}
		});
		btnContacts.setBounds(961, 59, 101, 23); // Sets the position and size of button "Contacts"
		contentPane.add(btnContacts);
		
		JLabel Lbl_Profileimg = new JLabel("");
		
		Lbl_Profileimg.setIcon(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Portfolio\\New 2nd.png"));
		Lbl_Profileimg.setBounds(0, 0, 1129, 711);
		contentPane.add(Lbl_Profileimg);
	}

}
