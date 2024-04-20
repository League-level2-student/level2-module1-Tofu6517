package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JButton addName=new JButton("Add Name");
	JButton viewName=new JButton("View Name");
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook setUp=new GuestBook();
		setUp.slotSetUp();
	}
	public void slotSetUp() {
		addName.addActionListener(this);
		viewName.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(700,300);
		frame.add(panel);
		panel.add(addName);
		panel.add(viewName);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==addName) {
			String a=JOptionPane.showInputDialog("What name do you want.");
			list.add(a);
		}
		if(e.getSource()==viewName) {
			for(int i=0;i<list.size();i++) {
				String s=list.get(i);
				System.out.println("Guest #"+i+": "+s);
			}
		}
	}
}