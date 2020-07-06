package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Đăng nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 306);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(178, 94, 180, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(95, 97, 73, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblngNhpQu = new JLabel("Đăng nhập quản lý hệ thống");
		lblngNhpQu.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblngNhpQu.setBounds(131, 28, 244, 26);
		getContentPane().add(lblngNhpQu);
		
		JLabel lblPasswords = new JLabel("Passwords:");
		lblPasswords.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPasswords.setBounds(95, 134, 73, 14);
		getContentPane().add(lblPasswords);
		
		JButton btnngNhp = new JButton("Đăng nhập");
		btnngNhp.setBounds(202, 187, 96, 23);
		getContentPane().add(btnngNhp);
		
		btnngNhp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Connection newFrame = new Connection();
				newFrame.setVisible(true);
				dispose();
			}
		});
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(178, 133, 180, 21);
		getContentPane().add(passwordField);
	}
}
