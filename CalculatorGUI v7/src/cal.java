import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cal extends JFrame {

	private JPanel contentPane;
	private JTextField fld;
	private JTextField tfld;
	private double answer,num;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal frame = new cal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void result() {
		switch(operation) {
		case 1:
			answer = num + Double.parseDouble(fld.getText());
			fld.setText(Double.toString(answer));
			break;
		case 2:
			answer = num - Double.parseDouble(fld.getText());
			fld.setText(Double.toString(answer));
			break;
		case 3:
			answer = num * Double.parseDouble(fld.getText());
			fld.setText(Double.toString(answer));
			break;
		case 4:
			answer = num / Double.parseDouble(fld.getText());
			fld.setText(Double.toString(answer));
			break;	
		}
	}

	/**
	 * Create the frame.
	 */
	public cal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel tpanel = new JPanel();
		tpanel.setBounds(10, 11, 366, 62);
		contentPane.add(tpanel);
		tpanel.setLayout(null);
		
		fld = new JTextField();
		fld.setHorizontalAlignment(SwingConstants.RIGHT);
		fld.setFont(new Font("Tahoma", Font.BOLD, 20));
		fld.setEditable(false);
		fld.setBounds(0, 20, 366, 42);
		tpanel.add(fld);
		fld.setColumns(10);
		
		tfld = new JTextField();
		tfld.setHorizontalAlignment(SwingConstants.RIGHT);
		tfld.setEditable(false);
		tfld.setFont(new Font("Tahoma", Font.BOLD, 13));
		tfld.setBounds(226, 0, 140, 19);
		tpanel.add(tfld);
		tfld.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 83, 366, 370);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fld.setText(fld.getText()+"7");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fld.setText(fld.getText()+"8");
			}
			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fld.setText(fld.getText()+"9");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(fld.getText());
				operation = 1;
				tfld.setText(fld.getText()+"+");
				fld.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton);
		
		JButton btnNewButton_3_1 = new JButton("4");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fld.setText(fld.getText()+"4");
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_3 = new JButton("5");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fld.setText(fld.getText()+"5");
			}
		});
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_2 = new JButton("6");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fld.setText(fld.getText()+"6");
			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_6 = new JButton("-");
		btnNewButton_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(fld.getText());
				operation = 2;
				tfld.setText(fld.getText()+"-");
				fld.setText("");
				
			}
		});
		btnNewButton_3_6.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_3_6);
		
		JButton btnNewButton_3_5 = new JButton("1");
		btnNewButton_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fld.setText(fld.getText()+"1");
			}
		});
		btnNewButton_3_5.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_3_5);
		
		JButton btnNewButton_3_4 = new JButton("2");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fld.setText(fld.getText()+"2");
			}
		});
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_3_4);
		
		JButton btnNewButton_3_7 = new JButton("3");
		btnNewButton_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fld.setText(fld.getText()+"3");
			}
		});
		btnNewButton_3_7.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_3_7);
		
		JButton btnNewButton_3_9 = new JButton("x");
		btnNewButton_3_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(fld.getText());
				operation = 3;
				tfld.setText(fld.getText()+"x");
				fld.setText("");
			}
		});
		btnNewButton_3_9.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_3_9);
		
		JButton btnNewButton_3_8 = new JButton("=");
		btnNewButton_3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result();
			}
		});
		btnNewButton_3_8.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_3_8);
		
		JButton btnNewButton_3_10 = new JButton("0");
		btnNewButton_3_10.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_3_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fld.setText(fld.getText()+"0");
				
			}
		});
		panel.add(btnNewButton_3_10);
		
		JButton btnNewButton_3_11 = new JButton("C");
		btnNewButton_3_11.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_3_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fld.setText("");
			}
		});
		panel.add(btnNewButton_3_11);
		
		JButton btnNewButton_3_12 = new JButton("%");
		btnNewButton_3_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(fld.getText());
				operation = 4;
				tfld.setText(fld.getText()+"%");
				fld.setText("");
			}
		});
		btnNewButton_3_12.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(btnNewButton_3_12);
	}
}
