package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class HangTonKho extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textField;
	private JLabel lblTnHng;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HangTonKho frame = new HangTonKho();
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
	public HangTonKho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDanhSchHng = new JLabel("Danh sách hàng tồn kho");
		lblDanhSchHng.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDanhSchHng.setBounds(257, 11, 201, 14);
		contentPane.add(lblDanhSchHng);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 81, 664, 245);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
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
				"M\u00E3 h\u00E0ng", "T\u00EAn h\u00E0ng", "\u0110\u01A1n v\u1ECB t\u00EDnh", "S\u1ED1 l\u01B0\u1EE3ng", "Ghi ch\u00FA"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(69);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(534, 337, 105, 38);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Tìm kiếm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 30, 105, 32);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(203, 40, 436, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblTnHng = new JLabel("Tên hàng");
		lblTnHng.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTnHng.setBounds(139, 43, 61, 14);
		contentPane.add(lblTnHng);
	}
}
