import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JEditorPane;
import javax.swing.UIManager;

public class DesignedLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesignedLogin window = new DesignedLogin();
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
	public DesignedLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1439, 786);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 1430, 822);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 1362, 730);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("LOGIN CREDENTIALS");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		lblNewLabel_6.setBounds(688, 164, 449, 116);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("LIKE IT!!");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_5.setBounds(50, 477, 339, 51);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("ENJOY THE WAY YOU");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_4.setBounds(29, 398, 390, 102);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\SejalDoshi\\Downloads\\WhatsApp Image 2021-05-15 at 1.18.10 PM (2).png"));
		lblNewLabel_3.setBounds(40, 201, 333, 240);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBackground(new Color(224, 255, 255));
		textField.setBounds(740, 355, 348, 32);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(224, 255, 255));
		passwordField.setBounds(740, 398, 348, 32);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("USER");
		lblNewLabel.setBounds(593, 355, 117, 32);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(561, 396, 129, 32);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(860, 453, 129, 32);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN CREDENTIALS");
		lblNewLabel_2.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(0, 0, 1369, 730);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Capture (1).png"));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\SejalDoshi\\Downloads\\abstract-blurred-colorful-ferris-wheel-260nw-722285554.png"));
		panel_1.add(lblNewLabel_2);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/parkzia (1) (1).png"));
		
	}
}
