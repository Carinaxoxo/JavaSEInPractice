package chapter6_interfaces_lambdaExpressions_innerClasses.timer_6_3;

import java.awt.*; // for ActionLisener
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
// for resolving conflict with java.util.Timer;

public class TimerTest{
	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();
		
		// construct a timer that calls the listener
		// make it beep every sec
		
		// construct an object of class and pass it to the Timer construct
		Timer t = new Timer(1000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "you wanna quit?");
		System.exit(0);
	}
}

class TimePrinter implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		System.out.println("At the tone, the time is " + new Date());
		Toolkit.getDefaultToolkit().beep();
	}
}

