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

public class Contacts extends Main {

	private JPanel contentPane;

	// Create the frame.
	 
	// Create the frame.
    public Contacts() {

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane); // Set the content pane of the frame to the created panel
        contentPane.setLayout(null); // Set the layout manager of the content pane to null (absolute positioning)

        // Create a button for the profile
        JButton btnProfile = new JButton("");
        btnProfile.setContentAreaFilled(false);
        btnProfile.setBorderPainted(false);
        btnProfile.setBackground(null);

        // Add an action listener to the profile button
        btnProfile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the Profile frame and make it visible
                Profile ProfileFrame = new Profile();
                ProfileFrame.setVisible(true);

                dispose(); // Close the current frame
            }
        });
        btnProfile.setBounds(274, 60, 89, 23); // Set the position and size of the profile button
        contentPane.add(btnProfile); // Add the profile button to the content pane

        // Create a button for the About Me section
        JButton btnAboutMe = new JButton("");
        btnAboutMe.setContentAreaFilled(false);
        btnAboutMe.setBorderPainted(false);
        btnAboutMe.setBackground(null);

        // Add an action listener to the About Me button
        btnAboutMe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the About Me frame and make it visible
                AboutMe AboutMeFrame = new AboutMe();
                AboutMeFrame.setVisible(true);

                dispose(); // Close the current frame
            }
        });
        btnAboutMe.setBounds(430, 60, 102, 23); // Set the position and size of the About Me button
        contentPane.add(btnAboutMe); // Add the About Me button to the content pane

        // Create a button for the Works section
        JButton btnWorks = new JButton("");
        btnWorks.setContentAreaFilled(false);
        btnWorks.setBorderPainted(false);
        btnWorks.setBackground(null);

        // Add an action listener to the Works button
        btnWorks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the Works frame and make it visible
                Works MainWorks = new Works();
                MainWorks.setVisible(true);

                dispose(); // Close the current frame
            }
        });
        btnWorks.setBounds(619, 60, 65, 23); // Set the position and size of the Works button
        contentPane.add(btnWorks); // Add the Works button to the content pane

        // Create a label for the Contact frame
        JLabel lblContactFrame = new JLabel("");
        
        lblContactFrame.setIcon(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Portfolio\\Contacts.png"));
        lblContactFrame.setBounds(0, 0, 1134, 711); // Set the position and size of the Contact frame label
        contentPane.add(lblContactFrame); // Add the Contact frame label to the content pane
    }
}