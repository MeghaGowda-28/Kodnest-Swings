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

public class ReverseWordsWindow extends JFrame {

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
					ReverseWordsWindow frame = new ReverseWordsWindow();
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
	public ReverseWordsWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Reverse Words of Sentence");
		heading.setBackground(new Color(220, 20, 60));
		heading.setForeground(new Color(255, 250, 250));
		heading.setFont(new Font("Arial Black", Font.PLAIN, 18));
		heading.setBounds(84, 11, 271, 26);
		contentPane.add(heading);
		
		JLabel lbla = new JLabel("Enter Sentence :");
		lbla.setForeground(new Color(0, 255, 255));
		lbla.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lbla.setBounds(37, 72, 148, 21);
		contentPane.add(lbla);
		
		tf = new JTextField();
		tf.setBackground(new Color(240, 255, 255));
		tf.setBounds(222, 74, 172, 20);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JLabel lblb = new JLabel("Reversed Sentence :");
		lblb.setForeground(new Color(0, 255, 255));
		lblb.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblb.setBounds(37, 192, 167, 20);
		contentPane.add(lblb);
		
		tfres = new JTextField();
		tfres.setBackground(new Color(240, 248, 255));
		tfres.setColumns(10);
		tfres.setBounds(222, 192, 172, 20);
		contentPane.add(tfres);
		
		JButton btnrs1 = new JButton("REVERSE SENTENCE");
		btnrs1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d1=tf.getText();
				String a[]=d1.split(" ");
				String revsentence="";
				for(int i=0;i<=a.length-1;i++){
					String word=a[i];
					String rev="";
					for(int j=word.length()-1;j>=0;j--){
						rev=rev+word.charAt(j);
					}
					revsentence=revsentence+rev+" ";
				}
				tfres.setText(revsentence);
			}
		});
		btnrs1.setBackground(new Color(255, 182, 193));
		btnrs1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnrs1.setBounds(133, 128, 172, 25);
		contentPane.add(btnrs1);
	}

}
