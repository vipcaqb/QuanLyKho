package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Panel;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 423);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Trợ giúp");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHThng = new JLabel("Hệ thống");
		lblHThng.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHThng.setBounds(10, 23, 69, 14);
		contentPane.add(lblHThng);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(192, 192, 192));
		desktopPane.setForeground(Color.WHITE);
		desktopPane.setBounds(10, 48, 178, 127);
		contentPane.add(desktopPane);
		
		JButton btnNewButton = new JButton("Thông tin hệ thống");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 11, 158, 23);
		desktopPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Đổi mật khẩu");
		btnNewButton_1.setBounds(10, 45, 158, 23);
		desktopPane.add(btnNewButton_1);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(new Color(192, 192, 192));
		desktopPane_1.setBounds(211, 48, 228, 127);
		contentPane.add(desktopPane_1);
		
		JButton btnXemDanhSch = new JButton("Xem hàng tồn kho");
		btnXemDanhSch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HangTonKho tk = new HangTonKho();
				tk.setVisible(true);
			}
		});
		btnXemDanhSch.setBounds(10, 11, 208, 23);
		desktopPane_1.add(btnXemDanhSch);
		
		JButton btnNewButton_2 = new JButton("Quản lý mặt hàng");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QuanLyHang qlh = new QuanLyHang();
				qlh.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 45, 208, 23);
		desktopPane_1.add(btnNewButton_2);
		
		JLabel lblHngHa = new JLabel("Hàng hóa");
		lblHngHa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHngHa.setBounds(243, 23, 69, 14);
		contentPane.add(lblHngHa);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(new Color(192, 192, 192));
		desktopPane_2.setBounds(468, 48, 178, 127);
		contentPane.add(desktopPane_2);
		
		JButton btnVitPhiuNhp = new JButton("Viết phiếu nhập");
		btnVitPhiuNhp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhieuNhap pn = new PhieuNhap();
				pn.setVisible(true);
			}
		});
		btnVitPhiuNhp.setBounds(10, 11, 158, 23);
		desktopPane_2.add(btnVitPhiuNhp);
		
		JButton btnVitPhiuXut = new JButton("Viết phiếu xuất");
		btnVitPhiuXut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhieuXuat px = new PhieuXuat();
				px.setVisible(true);
			}
		});
		btnVitPhiuXut.setBounds(10, 45, 158, 23);
		desktopPane_2.add(btnVitPhiuXut);
		
		JLabel lblNhpXutKho = new JLabel("Nhập xuất kho");
		lblNhpXutKho.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNhpXutKho.setBounds(468, 23, 101, 14);
		contentPane.add(lblNhpXutKho);
		
		JLabel lblBoCo = new JLabel("Báo cáo");
		lblBoCo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBoCo.setBounds(294, 186, 69, 14);
		contentPane.add(lblBoCo);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(new Color(192, 192, 192));
		desktopPane_3.setBounds(211, 211, 228, 127);
		contentPane.add(desktopPane_3);
		
		JButton btnTngHpHng = new JButton("Tổng hợp hàng bán lẻ ngày");
		btnTngHpHng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BaoCaoBanLeNgay banLe = new BaoCaoBanLeNgay();
				banLe.setVisible(true);
			}
		});
		btnTngHpHng.setBounds(10, 11, 208, 23);
		desktopPane_3.add(btnTngHpHng);
		
		JButton btnTngHpHng_1 = new JButton("Tổng hợp hàng tồn kho");
		btnTngHpHng_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BaoCaoHangTon tonKho = new BaoCaoHangTon();
				tonKho.setVisible(true);
			}
		});
		btnTngHpHng_1.setBounds(10, 45, 208, 23);
		desktopPane_3.add(btnTngHpHng_1);
		
		JButton btnTngHpCc = new JButton("Tổng hợp các giao dịch");
		btnTngHpCc.setBounds(10, 77, 208, 23);
		desktopPane_3.add(btnTngHpCc);
		
		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(Color.LIGHT_GRAY);
		desktopPane_4.setBounds(10, 211, 178, 127);
		contentPane.add(desktopPane_4);
		
		JButton btnQunLDanh = new JButton("Quản lý NCC");
		btnQunLDanh.setBounds(10, 11, 158, 23);
		desktopPane_4.add(btnQunLDanh);
		
		JButton btnKhachHang = new JButton("Quản lý Khách Hàng");
		btnKhachHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyKhachHang kh = new QuanLyKhachHang();
				kh.setVisible(true);
			}
		});
		btnKhachHang.setBounds(10, 45, 158, 23);
		desktopPane_4.add(btnKhachHang);
		btnQunLDanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QuanLyNCC qlNCCFrm =  new QuanLyNCC();
				qlNCCFrm.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Đối tác");
		lblNewLabel.setBounds(10, 187, 69, 14);
		contentPane.add(lblNewLabel);
	}
}
