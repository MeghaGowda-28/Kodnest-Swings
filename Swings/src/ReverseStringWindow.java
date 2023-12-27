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

public class ReverseStringWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private JTextField tfres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseStringWindow frame = new ReverseStringWindow();
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
	public ReverseStringWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("REVERSE STRING");
		heading.setBackground(new Color(30, 144, 255));
		heading.setForeground(new Color(255, 215, 0));
		heading.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.BOLD, 20));
		heading.setBounds(136, 11, 159, 25);
		contentPane.add(heading);
		
		JLabel lbla = new JLabel("Enter String");
		lbla.setForeground(new Color(255, 192, 203));
		lbla.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lbla.setBounds(63, 58, 101, 23);
		contentPane.add(lbla);
		
		tf = new JTextField();
		tf.setBounds(217, 61, 150, 20);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JLabel lblres = new JLabel("Reversed String");
		lblres.setForeground(new Color(255, 192, 203));
		lblres.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblres.setBounds(63, 192, 122, 22);
		contentPane.add(lblres);
		
		tfres = new JTextField();
		tfres.setColumns(10);
		tfres.setBounds(217, 195, 150, 20);
		contentPane.add(tfres);
		
		JButton btnrs = new JButton("Reverse String");
		btnrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d1=tf.getText();
				char a[]=d1.toCharArray();
				char b[]=new char[a.length];
				int j=0;
				for(int i=a.length-1;i>=0;i--){
						b[j]=a[i];
						j++;
				}
				String res=new String(b);
				tfres.setText(res);
			}
		});
		btnrs.setForeground(new Color(255, 0, 0));
		btnrs.setFont(new Font("Elephant", Font.BOLD, 15));
		btnrs.setBounds(97, 123, 229, 27);
		contentPane.add(btnrs);
	}

}
