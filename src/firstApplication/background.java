package firstApplication;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JTextField;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class background extends game {
	
	
	
	public int sum = 2 ;
	
	
	game obj = new game();
	//String threepointer = obj.basket1();
	//String insideTheArc = obj.basket2();
	//String freeThrows = obj.basket3();
     
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			// changes done
			public void run() {
				try {
					background window = new background();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public background() {
		
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		JLabel background;
	    
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		


		frame.setBounds(100, 100, 797, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		frame.setBounds(100, 100, 782, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("3 pointer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = Integer.toString(basket1());
				
			  textField.setText(s);
			 
				
			}
		});
		btnNewButton.setBounds(13, 140, 125, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("insideTheArc");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = Integer.toString(basket2());
				  textField.setText(s);
					
			}
		});
		btnNewButton_1.setBounds(13, 223, 125, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("freeThrows");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = Integer.toString(basket3());
				  textField.setText(s);
					
			}
		});
		btnNewButton_2.setBounds(13, 306, 125, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(13, 70, 125, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("TEAM A");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(37, 13, 74, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTeamB = new JLabel("TEAM B");
		lblTeamB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTeamB.setBounds(588, 13, 74, 31);
		frame.getContentPane().add(lblTeamB);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(553, 70, 125, 22);
		frame.getContentPane().add(textField_1);
		
		JButton button = new JButton("3 pointer");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = Integer.toString(basket4());
				 textField_1.setText(s1);
				
			}
		});
		button.setBounds(553, 140, 125, 25);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("insideTheArc");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = Integer.toString(basket5());
				 textField_1.setText(s1);
				
			}
		});
		button_1.setBounds(553, 223, 125, 25);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("freeThrows");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = Integer.toString(basket6());
				 textField_1.setText(s1);
				
			}
		});
		button_2.setBounds(553, 306, 125, 25);
		frame.getContentPane().add(button_2);
		
		JLabel image = new JLabel("New label");
		image.setIcon(new ImageIcon(background.class.getResource("/firstApplication/Image/background-1.jpg")));
		image.setBounds(0, 0, 2200, 1200);
		image.setBackground(null);
		
		frame.getContentPane().add(image);
		background = new JLabel("",JLabel.CENTER);
		image.add(background);
		image.setVisible(true);
		
	
		
		

	}
}
