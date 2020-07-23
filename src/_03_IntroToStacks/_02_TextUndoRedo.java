package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JLabel label = new JLabel();
	
	String text = "You typed: ";
	Stack<Character> deleted = new Stack<Character>();
	
	void run() {
		frame.setVisible(true);
		
		frame.addKeyListener(this);
		
		label.setText(text);
		
		panel.add(label);
		frame.add(panel);
		
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char ch = e.getKeyChar();
		String key = Character.toString(ch);
		
		text += key;
		
		label.setText(text);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			char deletedChar = text.charAt(text.length() - 1);
			deleted.push(deletedChar);
			
			String newText = text.substring(0, text.length() - 1);
			System.out.println(newText);
			text = newText;
			label.setText(text);
			System.out.println(text);
			
		}
			else if (e.getKeyCode() == KeyEvent.VK_UP) {
			char character = deleted.pop();
			for (int i = 0; i < deleted.size(); i++) {
				System.out.println(Character.toString(deleted.get(i)));
			}
			text += character;
			label.setText(text);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		_02_TextUndoRedo text = new _02_TextUndoRedo();
		text.run();
	}
	
}
