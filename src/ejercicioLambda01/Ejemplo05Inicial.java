package ejercicioLambda01;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ejemplo05Inicial extends JFrame {
	/*
	 * Esta es la forma mas sencilla, incomoda e ineficaz de hacer
	 * algo asi
	 */

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo05Inicial frame = new Ejemplo05Inicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void hazAlgo(int i) {
		System.out.println(i);
	}

	/**
	 * Create the frame.
	 */
	public Ejemplo05Inicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cajero");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 42, 86, 30);
		contentPane.add(lblNewLabel);

		JLabel lblPin = new JLabel(" ");
		lblPin.setBounds(29, 109, 46, 14);
		contentPane.add(lblPin);

		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hazAlgo(1);
			}
		});
		btnNewButton.setBounds(184, 31, 60, 60);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hazAlgo(2);
			}
		});
		btnNewButton_1.setBounds(247, 31, 60, 60);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hazAlgo(3);
			}
		});
		btnNewButton_2.setBounds(311, 31, 60, 60);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hazAlgo(4);
			}
		});
		btnNewButton_3.setBounds(184, 102, 60, 60);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hazAlgo(5);
			}
		});
		btnNewButton_1_1.setBounds(247, 102, 60, 60);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hazAlgo(6);
			}
		});
		btnNewButton_2_1.setBounds(311, 102, 60, 60);
		contentPane.add(btnNewButton_2_1);

		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hazAlgo(7);
			}
		});
		btnNewButton_4.setBounds(184, 173, 60, 60);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hazAlgo(8);
			}
		});
		btnNewButton_1_2.setBounds(247, 173, 60, 60);
		contentPane.add(btnNewButton_1_2);

		JButton btnNewButton_2_2 = new JButton("9");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hazAlgo(9);
			}
		});
		btnNewButton_2_2.setBounds(311, 173, 60, 60);
		contentPane.add(btnNewButton_2_2);

		JButton btnNewButton_4_1 = new JButton("0");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hazAlgo(0);
			}
		});
		btnNewButton_4_1.setBounds(247, 238, 60, 60);
		contentPane.add(btnNewButton_4_1);
	}

}
