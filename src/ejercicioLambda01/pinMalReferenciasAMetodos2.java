package ejercicioLambda01;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class pinMalReferenciasAMetodos2 extends JFrame {
	/*
	 * Esta es la forma mas sencilla, incomoda e ineficaz de hacer algo asi
	 */

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pinMalReferenciasAMetodos2 frame = new pinMalReferenciasAMetodos2();
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
	public pinMalReferenciasAMetodos2() {
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
		JPanel panel = new JPanel();
		panel.setBounds(184, 30, 216, 244);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 3, 0, 0));
		int cantidad = 10;
		for (int i = 1; i < cantidad; i++) {
			addButton(panel, i);
		}
		panel.add(new JLabel());
		int local = 0;
		addButton(panel, 0);

	}

	private void addButton(JPanel panel, int i) {
		int local = i;
		JButton btnNewButton = new JButton(String.valueOf(local));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				hazAlgo(i);
				
			}
		});
		
	}
}
