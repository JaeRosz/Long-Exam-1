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

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Main() {		
		
		// Setting up the frame
		super("E-Portfolio"); 
		setResizable(false); // Disable the resize frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(100, 100, 1145, 750); // Sets the position and size of the frame on the screen
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane); 
		contentPane.setLayout(null); // Disables the layout manager for the content pane, allowing manual positioning of components
		
		ImageIcon logo = new ImageIcon("icon.png");
        setIconImage(logo.getImage()); // Set the application icon image to the specified image file
        
		JButton btnProceed = new JButton("");
		
		//
		btnProceed.setContentAreaFilled(false); 
		btnProceed.setBorderPainted(false); 
		btnProceed.setBackground(null); 
		
		
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				
				Profile ProfileFrame = new Profile();
				ProfileFrame.setVisible(true); 
				
				dispose(); 
				
			}
		});
		
		// Sets the icon of the button to an image located at the specified file path
		btnProceed.setIcon(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\button (2).png"));
	
		// Sets the position and size of the button on the content pane
		btnProceed.setBounds(529, 415, 72, 55); 		

		// Adds the button to the content pane
		contentPane.add(btnProceed);
		
		// Creates a new JLabel for the variable "lblMainImage" and sets its properties
		JLabel lblMainImage = new JLabel("");	
		
		lblMainImage.setIcon(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Portfolio\\1st.png"));
		lblMainImage.setBounds(0, 0, 1129, 711);
		
		// Adds the label to the content pane

		contentPane.add(lblMainImage);
		setLocationRelativeTo(null); // Sets the location of the frame to the center of the screen

		
		
	}
}
