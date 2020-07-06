package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class QuanLyHang extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyHang frame = new QuanLyHang();
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
	public QuanLyHang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(33, 10, 103, 42);
		contentPane.add(btnNewButton);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSa.setBounds(128, 10, 103, 42);
		contentPane.add(btnSa);
		
		JButton btnNewButton_1_1 = new JButton("Xóa");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(228, 10, 103, 42);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Tìm");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(327, 10, 103, 42);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnClose = new JButton("Đóng");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClose.setBounds(429, 10, 103, 42);
		contentPane.add(btnClose);
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		JLabel lblMHng = new JLabel("Mã hàng");
		lblMHng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMHng.setBounds(33, 61, 97, 25);
		contentPane.add(lblMHng);
		
		JLabel lblTnHng = new JLabel("Tên hàng");
		lblTnHng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTnHng.setBounds(389, 63, 97, 25);
		contentPane.add(lblTnHng);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(101, 63, 230, 25);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(469, 63, 230, 25);
		contentPane.add(textField_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(33, 166, 716, 262);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Osi", "G\u00F3i", ""},
				{"2", "N\u01B0\u1EDBc ng\u1ECDt", "Chai", ""},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"M\u00E3 h\u00E0ng", "T\u00EAn h\u00E0ng", "\u0110\u01A1n v\u1ECB ", "Ghi ch\u00FA"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(94);
		table.getColumnModel().getColumn(1).setPreferredWidth(153);
		table.getColumnModel().getColumn(2).setPreferredWidth(132);
		table.getColumnModel().getColumn(3).setPreferredWidth(218);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane_1.setViewportView(table);
		
		JLabel lblnVTnh = new JLabel("Đơn vị tính");
		lblnVTnh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblnVTnh.setBounds(33, 91, 97, 25);
		contentPane.add(lblnVTnh);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(101, 95, 230, 25);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(469, 95, 230, 25);
		contentPane.add(textField_3);
		
		JLabel lblGhiCh = new JLabel("Ghi Chú");
		lblGhiCh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGhiCh.setBounds(389, 98, 97, 25);
		contentPane.add(lblGhiCh);
	}

}
