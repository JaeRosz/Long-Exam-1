package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutMe extends Main {

	private JPanel contentPane;

	public AboutMe() {
				
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);  // Set the content pane of the frame to the specified panel
		contentPane.setLayout(null); // Set the layout manager of the content pane to null, allowing manual positioning of components

		
		JButton btnWorks = new JButton("");
		btnWorks.setContentAreaFilled(false); // Makes the content area of the button transparent
		btnWorks.setBorderPainted(false); // Remove the border around the button
		btnWorks.setBackground(null);  // Remove the solid colors and make it transparent
		
		// Add an ActionListener to the button
		btnWorks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        // Create a new instance of the Works class
				Works MainWorks = new Works();
				MainWorks.setVisible(true);      // Make the Works frame visible

				dispose(); // Dispose the current frame (the one containing this button)
				
			}
		});
		btnWorks.setBounds(598, 61, 97, 23);  // Set the position and size of the button on the content pane
		contentPane.add(btnWorks);
		
		JButton btnContacts = new JButton("");
		btnContacts.setContentAreaFilled(false); // Makes the content area of the button transparent
		btnContacts.setBorderPainted(false); // Remove the border around the button
		btnContacts.setBackground(null); // Remove the background color or solid color and make it transparent
		
		btnContacts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        // Create a new instance of the Works class
				Contacts InfoFrame = new Contacts();
				InfoFrame.setVisible(true);  // Make the Contacts frame visible
				
				dispose();   // Dispose the current frame (the one containing this button)

			}
		});
		btnContacts.setBounds(743, 61, 110, 23); // Set the position and size of the button on the content pane
		contentPane.add(btnContacts); // Add the button to the content pane

		
		JButton btnProfile = new JButton("");
		btnProfile.setContentAreaFilled(false); // Makes the content area of the button transparent
		btnProfile.setBorderPainted(false);  // Remove the border around the button
		btnProfile.setBackground(null); // Remove the background color or solid color and make it transparent
		
		btnProfile.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
		        // Create a new instance of the Works class
				Profile ProfileFrame = new Profile();
				ProfileFrame.setVisible(true); // Make the Profile frame visible
				
				dispose(); // Dispose the current frame (the one containing this button)
			}
		});
		btnProfile.setBounds(269, 61, 89, 23); // Set the position and size of the button on the content pane
		contentPane.add(btnProfile);
		
		JButton btnBack = new JButton("");
		btnBack.setContentAreaFilled(false); // Makes the content area of the button transparent
		btnBack.setBorderPainted(false); // Remove the border around the button
		btnBack.setBackground(null); // Remove the background color or solid color and make it transparent
		
		
		// This button goes back to the previous frame which is the Profile frame
		btnBack.addActionListener(new ActionListener() { 
        	public void actionPerformed(ActionEvent e) {
        		
        		Profile ProfileFrame = new Profile();
				ProfileFrame.setVisible(true); // Make the Profile frame visible
				
				dispose();
        	}
        });
		
		btnBack.setBounds(23, 669, 56, 31);  // Set the position and size of the button on the content pane
		contentPane.add(btnBack); 
		
		JLabel Lbl_imgAboutMe = new JLabel("New label");
		Lbl_imgAboutMe.setIcon(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Portfolio\\3rd.png"));
		Lbl_imgAboutMe.setBounds(0, 0, 1129, 711);
		contentPane.add(Lbl_imgAboutMe);
		
	}
}
