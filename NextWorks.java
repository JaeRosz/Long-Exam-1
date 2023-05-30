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

public class NextWorks extends Main {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public NextWorks() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("");
		
		btnBack.setContentAreaFilled(false); // Makes the content area of the button transparent
		btnBack.setBorderPainted(false); // Removes the border of the button
		btnBack.setBackground(null); // Removes the background color making it transparent
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create a new instance of the Work class and make it visible
				Works MainWorks = new Works(); 
				MainWorks.setVisible(true);
				
				dispose(); // Dispose the current frame
			}
		});
		btnBack.setBounds(24, 637, 44, 38);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alenf\\OneDrive\\Pictures\\Portfolio\\Works2.png"));
		lblNewLabel.setBounds(0, 0, 1134, 711);
		contentPane.add(lblNewLabel);
	}

}
