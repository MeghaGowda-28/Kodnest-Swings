import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class firstWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstWindow frame = new firstWindow();
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
	public firstWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CALCULATOR");
		heading.setForeground(Color.BLUE);
		heading.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		heading.setBounds(169, 11, 96, 20);
		contentPane.add(heading);
		
		JLabel lbla = new JLabel("A");
		lbla.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		lbla.setForeground(Color.RED);
		lbla.setBounds(159, 44, 11, 20);
		contentPane.add(lbla);
		
		tfa = new JTextField();
		tfa.setBounds(192, 44, 86, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel lblb = new JLabel("B");
		lblb.setForeground(Color.RED);
		lblb.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		lblb.setBounds(159, 81, 11, 20);
		contentPane.add(lblb);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(192, 81, 86, 20);
		contentPane.add(tfb);
		
		JLabel lblresult = new JLabel("Result");
		lblresult.setForeground(Color.RED);
		lblresult.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		lblresult.setBounds(122, 114, 48, 20);
		contentPane.add(lblresult);
		
		tfres = new JTextField();
		tfres.setColumns(10);
		tfres.setBounds(192, 116, 86, 20);
		contentPane.add(tfres);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1+var2;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		btnAdd.setBackground(Color.ORANGE);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAdd.setForeground(Color.DARK_GRAY);
		btnAdd.setBounds(19, 192, 65, 27);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("SUB");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1-var2;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		btnSub.setForeground(Color.DARK_GRAY);
		btnSub.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSub.setBackground(Color.ORANGE);
		btnSub.setBounds(94, 192, 65, 27);
		contentPane.add(btnSub);
		
		JButton btnAdd_1_1 = new JButton("MUL");
		btnAdd_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1*var2;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		btnAdd_1_1.setForeground(Color.DARK_GRAY);
		btnAdd_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAdd_1_1.setBackground(Color.ORANGE);
		btnAdd_1_1.setBounds(169, 192, 69, 27);
		contentPane.add(btnAdd_1_1);
		
		JButton btnAdd_1_1_1 = new JButton("DIV");
		btnAdd_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1/var2;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		btnAdd_1_1_1.setForeground(Color.DARK_GRAY);
		btnAdd_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAdd_1_1_1.setBackground(Color.ORANGE);
		btnAdd_1_1_1.setBounds(252, 192, 59, 27);
		contentPane.add(btnAdd_1_1_1);
		
		JButton btnAdd_1_1_1_1 = new JButton("REM");
		btnAdd_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1%var2;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		btnAdd_1_1_1_1.setForeground(Color.DARK_GRAY);
		btnAdd_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAdd_1_1_1_1.setBackground(Color.ORANGE);
		btnAdd_1_1_1_1.setBounds(329, 192, 69, 27);
		contentPane.add(btnAdd_1_1_1_1);
	}
}
