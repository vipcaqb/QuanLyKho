package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Connection extends JFrame {

	private JPanel contentPane;
	private JTextField txtsqlexpress;
	private JTextField txtQuanlykho;
	private JTextField txtChngThcCa;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connection frame = new Connection();
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
	public Connection() {
		setTitle("Lựa chọn kết nối cơ sở dữ liệu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Khai báo thông tin kết nối");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(199, 34, 194, 14);
		contentPane.add(lblNewLabel);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(314, 47, 20, 1);
		contentPane.add(horizontalStrut);
		
		JLabel lblNewLabel_1 = new JLabel("Máy chủ SQL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(52, 72, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblBSD = new JLabel("Bộ số liệu");
		lblBSD.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBSD.setBounds(52, 97, 80, 14);
		contentPane.add(lblBSD);
		
		JLabel lblChngThc = new JLabel("Chứng thực");
		lblChngThc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblChngThc.setBounds(52, 122, 80, 14);
		contentPane.add(lblChngThc);
		
		JLabel lblTnngNhp = new JLabel("Tên đăng nhập");
		lblTnngNhp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTnngNhp.setBounds(52, 147, 95, 14);
		contentPane.add(lblTnngNhp);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMtKhu.setBounds(52, 172, 80, 20);
		contentPane.add(lblMtKhu);
		
		txtsqlexpress = new JTextField();
		txtsqlexpress.setText(".\\SQLEXPRESS");
		txtsqlexpress.setBounds(186, 70, 239, 20);
		contentPane.add(txtsqlexpress);
		txtsqlexpress.setColumns(10);
		
		txtQuanlykho = new JTextField();
		txtQuanlykho.setText("QUANLYKHO");
		txtQuanlykho.setColumns(10);
		txtQuanlykho.setBounds(186, 95, 239, 20);
		contentPane.add(txtQuanlykho);
		
		txtChngThcCa = new JTextField();
		txtChngThcCa.setText("Chứng thực của SQL server");
		txtChngThcCa.setColumns(10);
		txtChngThcCa.setBounds(186, 120, 239, 20);
		contentPane.add(txtChngThcCa);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(186, 145, 239, 20);
		contentPane.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(186, 170, 239, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Xác nhận");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menuFrm = new Menu();
				menuFrm.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(new Color(0, 0, 153));
		btnNewButton.setBounds(82, 239, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Hủy");
		btnCancel.setBounds(384, 239, 80, 23);
		contentPane.add(btnCancel);
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				Login lgFrame = new Login();
				lgFrame.setVisible(true);
			}
		});
	}
}
