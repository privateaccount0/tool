package main;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrame_commencement extends JFrame{
	void screen_main(String title) {
		setTitle(title);
		setBounds(0, 0, 1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JTextField text1 = new JTextField(30);
		JPanel p = new JPanel();
		p.add(text1);

		Container contentPane = getContentPane();
	    contentPane.add(p, BorderLayout.CENTER);

	}

}
