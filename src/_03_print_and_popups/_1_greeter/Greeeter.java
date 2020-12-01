package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeeter {
public static void main(String[] args) {
	System.out.println("Helloooo World!");
	String name = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null,"Hello "+name);

}
}
