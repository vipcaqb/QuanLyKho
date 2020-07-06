package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class QuanLyKhachHang extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyNCC frame = new QuanLyNCC();
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
	/**
	 * 
	 */
	public QuanLyKhachHang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 10, 103, 42);
		contentPane.add(btnNewButton);

		JButton btnSa = new JButton("Sửa");
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSa.setBounds(105, 10, 103, 42);
		contentPane.add(btnSa);

		JButton btnNewButton_1_1 = new JButton("Xóa");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(205, 10, 103, 42);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("Tìm");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(304, 10, 103, 42);
		contentPane.add(btnNewButton_1_2);

		JButton btnClose = new JButton("Đóng");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClose.setBounds(406, 10, 103, 42);
		contentPane.add(btnClose);
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		

		JLabel lblNewLabel = new JLabel("Mã khách hàng");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(37, 63, 97, 25);
		contentPane.add(lblNewLabel);

		JLabel lblSinThoi = new JLabel("Số điện thoại");
		lblSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSinThoi.setBounds(37, 99, 97, 25);
		contentPane.add(lblSinThoi);

		JLabel lblTnNcc = new JLabel("Tên khách hàng");
		lblTnNcc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTnNcc.setBounds(426, 63, 112, 25);
		contentPane.add(lblTnNcc);

		JLabel lblaCh = new JLabel("Địa chỉ");
		lblaCh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblaCh.setBounds(426, 99, 97, 25);
		contentPane.add(lblaCh);

		textField = new JTextField();
		textField.setBounds(138, 63, 269, 25);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(138, 99, 269, 25);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(530, 65, 269, 25);
		contentPane.add(textField_3);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(530, 99, 269, 25);
		contentPane.add(textField_5);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 294, 2, 2);
		contentPane.add(scrollPane);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(37, 180, 762, 208);
		contentPane.add(scrollPane_1);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"NCC01", "Shop sneaker", "TP Hu\u1EBF", "012345678", "45678745456"},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Ma KH", "T\u00EAn KH", "\u0110\u1ECBa ch\u1EC9", "SDT", "FAX"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(149);
		table.getColumnModel().getColumn(1).setMinWidth(20);
		scrollPane_1.setViewportView(table);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(138, 135, 269, 25);
		contentPane.add(textField_1);
		
		JLabel lblFax = new JLabel("FAX");
		lblFax.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFax.setBounds(37, 135, 97, 25);
		contentPane.add(lblFax);
	}
}
