package ejercicioLambda01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
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

		Dimension dimension = new Dimension(60, 60);
		Position position = new Position();
		for (int i = 1; i < 10; i++) {
			insertarBoton(String.valueOf(i), new Rectangle(position.getPoint(coordinate), dimension));
		}
		// TODO
		insertarBoton("0", null);

		

		JButton btnNewButton_4_1 = new JButton("0");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hazAlgo(0);
			}
		});
		btnNewButton_4_1.setBounds(247, 238, 60, 60);
		contentPane.add(btnNewButton_4_1);
	}

	private void insertarBoton(String order, Rectangle rectangle) {
		JButton btnNewButton = new JButton(order);
		btnNewButton.addActionListener(e -> {
			hazAlgo(Integer.valueOf(order));
		});
		btnNewButton.setBounds(rectangle);
		contentPane.add(btnNewButton);
	}

}
