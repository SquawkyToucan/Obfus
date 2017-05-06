package Stuff;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class Obfus implements MouseListener {
	//Universal
	JPanel panel = new JPanel();
	JFrame options = new JFrame();
	JFrame transInto = new JFrame();
	JFrame transOut = new JFrame();
	JButton encode = new JButton();
	JButton decode = new JButton();
	//Decrypt the Message
	JPanel transoutpanel = new JPanel();
	JTextField inputCode = new JTextField(20);
	JTextField keyToUse = new JTextField(20);
	JTextField outputEng = new JTextField(20);
	JButton submitDecode = new JButton("Decode your Message");
	//Encrpyt a Message
	JPanel transinpanel = new JPanel();
	JTextField inputEng = new JTextField(20);
	JTextField keyToLock = new JTextField(20);
	JTextField outputCode = new JTextField(20);
	JButton submitEncode = new JButton("Encode your Message\n");
	public static void main(String[] args) {
		new Obfus();
	}
	Obfus() {
		options.add(panel);
		panel.add(encode);
		panel.add(decode);
		encode.addMouseListener(this);
		decode.addMouseListener(this);
		encode.setText("Put a string of text into code.");
		decode.setText("Put a string of code into text.");
		options.setVisible(true);
		options.pack();
	}
	public void showEncode() {
		transInto.add(transinpanel);
		transinpanel.add(inputEng);
		transinpanel.add(keyToLock);
		transinpanel.add(submitEncode);
		transinpanel.add(outputCode);
		inputEng.setText("Text to Encode");
		keyToLock.setText("Key to Encode By");
		transInto.pack();
	}
	public void showDecode() {
		transOut.add(transoutpanel);
		transoutpanel.add(inputCode);
		transoutpanel.add(keyToUse);
		transoutpanel.add(submitDecode);
		transoutpanel.add(outputCode);
		inputCode.setText("Text to Decode");
		keyToUse.setText("Key to Decode By");
		transOut.pack();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		Object button = e.getSource();
		if(button == encode) {
			//Launch encoding screen
			showEncode();
			transInto.setVisible(true);
			options.setVisible(false);
			System.out.println("Encoding sequence");
		}
		if(button == decode) {
			//Launch decoding screen
			showDecode();
			transOut.setVisible(true);
			options.setVisible(false);
			System.out.println("Decoding sequence");
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
