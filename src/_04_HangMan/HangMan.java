package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	Stack<String> words = new Stack<String>();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	boolean checkLetter(String l, String word) {
		if(word.indexOf(l) == -1) {
			return false;
		}
		return true;
	}
	
	void runGame() {
		String getNumWords = JOptionPane.showInputDialog("Num words: ");
		int numWords = 0;
		if(Integer.parseInt(getNumWords) <= Utilities.getTotalWordsInFile("dictionary.txt")) {
			numWords = Integer.parseInt(getNumWords);
		} else {
			System.out.println("Not applicable");
		}
		
		for (int i = 0; i < numWords; i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			if (!words.contains(word)) {
				words.push(word);
			}
		}
		
		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			String blanks = "";
			for (int j = 0; j < word.length(); j++) {
				blanks += "- ";
			}
			label.add(blanks, label);
			
			panel.add(label);
			frame.add(panel);
			
			frame.pack();
			
		}
	}
	
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.runGame();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
