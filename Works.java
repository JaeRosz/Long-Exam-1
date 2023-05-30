package portfolio;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Works extends Main {

    private JPanel contentPane;


    public Works() {
    	
	        setPreferredSize(new Dimension(1150, 750));
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	
	        // Create a JScrollPane and set its viewport view to the content panel
	        JScrollPane scrollPane = new JScrollPane(); 
	        scrollPane.setBounds(164, 126, 800, 530); 
	        scrollPane.setPreferredSize(new Dimension(800, 530));
	        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER); 
	        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	        contentPane.add(scrollPane);
	
	        // Create the content panel to hold the images
	        JPanel contentPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
	
	        /* Create JLabels for the images and Sets the icon 
	         of the button to an image located at the specified file path */
	        
	        JLabel lblIMG1 = new JLabel(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Photos\\img1.jpg"));
	        JLabel lblIMG2 = new JLabel(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Photos\\img2.jpg"));
	        JLabel lblIMG3 = new JLabel(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Photos\\img3.jpg"));
	        JLabel lblIMG4 = new JLabel(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Photos\\img4.jpg"));
	        JLabel lblIMG5 = new JLabel(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Photos\\img5.jpg"));
	        JLabel lblIMG6 = new JLabel(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Photos\\img6.jpg"));

        // Add the JLabels to the content panel
        contentPanel.add(lblIMG1);
        contentPanel.add(lblIMG2);
        contentPanel.add(lblIMG3);
        contentPanel.add(lblIMG4);
        contentPanel.add(lblIMG5);
        contentPanel.add(lblIMG6);

        // Set the viewport view of the scroll pane to the content panel
        scrollPane.setViewportView(contentPanel);
        
        JButton btnNextWorks = new JButton("");
        btnNextWorks.setContentAreaFilled(false); // Makes the content area of the button transparent
        btnNextWorks.setBorderPainted(false);  // Removes the border of the button
        btnNextWorks.setBackground(null); // Removes the background color making it transparent
		
				
        btnNextWorks.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
				NextWorks NextFrame = new NextWorks();
				NextFrame.setVisible(true);
				
				dispose();
        	}
        });
        btnNextWorks.setBounds(1046, 641, 60, 38);
        contentPane.add(btnNextWorks);
        
        JButton btnContacts = new JButton("");
        btnContacts.setContentAreaFilled(false); // Makes the content area of the button transparent
		btnContacts.setBorderPainted(false); // Removes the border of the button
		btnContacts.setBackground(null); // Removes the background color making it transparent
		
        btnContacts.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
		        // Create a new instance of the Works class

        		Contacts InfoFrame = new Contacts();
				InfoFrame.setVisible(true); // Make the Contacts frame visible
				
				dispose();
        		
        	}
        });
        btnContacts.setBounds(742, 40, 111, 38);
        contentPane.add(btnContacts);
        
        JButton btnAboutMe = new JButton("");
        btnAboutMe.setContentAreaFilled(false); // Makes the content area of the button transparent
        btnAboutMe.setBorderPainted(false); // Removes the border of the button
        btnAboutMe.setBackground(null); // Removes the background color making it transparent
		
        btnAboutMe.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
		        // Create a new instance of the Works class
        		AboutMe AboutMeFrame = new AboutMe();
				AboutMeFrame.setVisible(true); // Make the AboutMe frame visible
				
				dispose();
        	}
        });
        btnAboutMe.setBounds(423, 48, 111, 23);
        contentPane.add(btnAboutMe);
        
        JButton btnProfile = new JButton("");
		btnProfile.setContentAreaFilled(false); // Makes the content area of the button transparent
		btnProfile.setBorderPainted(false); // Removes the border of the button
		btnProfile.setBackground(null); // Removes the background color making it transparent
		
        btnProfile.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Profile ProfileFrame = new Profile();
				ProfileFrame.setVisible(true);
				
				dispose();
        	}
        });
        btnProfile.setBounds(276, 48, 89, 23);  // Set the position and size of the button on the content pane
        contentPane.add(btnProfile);
        
        JLabel lblNewLabel = new JLabel("New label");
        
		// Sets the icon of the button to an image located at the specified file path
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Portfolio\\Works1.png"));
        lblNewLabel.setBounds(0, 0, 1134, 711);
        contentPane.add(lblNewLabel);

        // Set the frame properties
        setTitle("Works");
        pack();
    }
}
