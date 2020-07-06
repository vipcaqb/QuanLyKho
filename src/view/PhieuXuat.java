package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.List;
import java.awt.Choice;
import java.awt.Scrollbar;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class PhieuXuat extends JFrame {

	private JPanel contentPane;
	private JTextField txtHKhcThin;
	private JTextField txtKv;
	private JTextField txtNguynHu;
	private JTable table;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhieuXuat frame = new PhieuXuat();
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
	public PhieuXuat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPhiuNhpKh = new JLabel("Phi\u1EBFu xu\u1EA5t kho");
		lblPhiuNhpKh.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPhiuNhpKh.setBounds(240, 11, 231, 61);
		contentPane.add(lblPhiuNhpKh);
		
		JLabel lblHTnNgi = new JLabel("H\u1ECD t\u00EAn ng\u01B0\u1EDDi nh\u1EADn :");
		lblHTnNgi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHTnNgi.setBounds(10, 71, 159, 25);
		contentPane.add(lblHTnNgi);
		
		txtHKhcThin = new JTextField();
		txtHKhcThin.setText("Tr\u1EA7n \u0110\u1EE9c Bo 1");
		txtHKhcThin.setBounds(140, 75, 231, 21);
		contentPane.add(txtHKhcThin);
		txtHKhcThin.setColumns(10);
		
		JLabel lblNhpTiKho = new JLabel("Xu\u1EA5t t\u1EA1i kho:");
		lblNhpTiKho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhpTiKho.setBounds(10, 107, 108, 20);
		contentPane.add(lblNhpTiKho);
		
		txtKv = new JTextField();
		txtKv.setText("KV01");
		txtKv.setBounds(140, 107, 155, 20);
		contentPane.add(txtKv);
		txtKv.setColumns(10);
		
		JLabel lblaim = new JLabel("\u0110\u1ECBa \u0111i\u1EC3m:");
		lblaim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblaim.setBounds(10, 139, 72, 25);
		contentPane.add(lblaim);
		
		txtNguynHu = new JTextField();
		txtNguynHu.setText("77 Nguy\u1EC5n Hu\u1EC7");
		txtNguynHu.setBounds(140, 138, 155, 20);
		contentPane.add(txtNguynHu);
		txtNguynHu.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 175, 628, 123);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"01", "\u00C1o thun", "1", "60", "100000", "6000000"},
				{"02", "X\u00E0 \u0111\u01A1n", "2", "40", "100000", "4000000"},
				{"03", "Gi\u00E0y th\u1EC3 thao", "3", "30", "200000", "6000000"},
				{"04", "M\u0169 ", "4", "100", "100000", "10000000"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"STT", "T\u00EAn s\u1EA3n ph\u1EA9m", "M\u00E3 SP", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1", "Th\u00E0nh ti\u1EC1n"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(41);
		table.getColumnModel().getColumn(1).setPreferredWidth(133);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.getColumnModel().getColumn(3).setPreferredWidth(62);
		scrollPane.setViewportView(table);
		
		JLabel lblTngSTin_1 = new JLabel("T\u1ED5ng s\u1ED1 ti\u1EC1n (vi\u1EBFt b\u1EB1ng s\u1ED1):");
		lblTngSTin_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTngSTin_1.setBounds(10, 326, 180, 28);
		contentPane.add(lblTngSTin_1);
		
		textField_3 = new JTextField();
		textField_3.setText("26000000");
		textField_3.setBounds(204, 331, 198, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnng = new JButton("\u0110\u1ED3ng \u00FD");
		btnng.setBounds(532, 352, 89, 23);
		contentPane.add(btnng);
		
		JButton btnNewButton = new JButton("H\u1EE7y b\u1ECF");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(419, 352, 89, 23);
		contentPane.add(btnNewButton);
	}
}
