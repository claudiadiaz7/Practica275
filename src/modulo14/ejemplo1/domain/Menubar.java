package modulo14.ejemplo1.domain;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Menubar implements ActionListener,ItemListener {
	
	private JFrame f;
	private JMenuBar mb;
	private JMenu m1;
	private JMenu m2;
	private JMenu m3;
	private JMenuItem mi1;
	private JMenuItem mi2;
	private JMenuItem mi3;
	private JMenuItem mi4;
	private JMenuItem mi5;
	
	 public void actionPerformed(ActionEvent e) {
		 if (e.getActionCommand() == "New") {
			 System.out.println("Selecciono NUEVO archivo");	 
		 }
		 if (e.getActionCommand() == "Save") {
			 System.out.println("Selecciono GUARDAR archivo");	 
		 }
		 if (e.getActionCommand() == "Load") {
			 System.out.println("Selecciono ABRIR archivo");	 
		 }
		 if (e.getActionCommand() == "Quit") {
			 System.out.println("Selecciono CERRAR archivo");	 
		 }
		 		   
	}
    
	
	public void launchFrame() {
	 f = new JFrame("MenuBar");
	 mb = new JMenuBar();
	 f.setJMenuBar(mb);
	 //f = new JFrame("Menu");
	  mb = new JMenuBar();
	  m1 = new JMenu("File");
	  m2 = new JMenu("Edit");
	  m3 = new JMenu("Help");
	  mb.add(m1);
	  mb.add(m2);
	  mb.add(m3);
	  f.setJMenuBar(mb);
	  mi1 = new JMenuItem("New");
	  mi1.setActionCommand("New");
	  mi2 = new JMenuItem("Save");
	  mi2.setActionCommand("Save");
	  mi3 = new JMenuItem("Load");
	  mi3.setActionCommand("Load");
	  mi4 = new JMenuItem("Quit");
	  mi4.setActionCommand("Quit");
	  
	  mi1.addActionListener(this);
	  mi2.addActionListener(this);
	  mi3.addActionListener(this);
	  mi4.addActionListener(this);
	  
	  m1.add(mi1);
	  m1.add(mi2);
	  m1.add(mi3);
	  m1.addSeparator();
	  m1.add(mi4);
	 
	  mi5 = new JCheckBoxMenuItem("Persistent");
	  mi5.setActionCommand("CheckBox");
	  mi5.addItemListener(this);
	  m1.add(mi5);
	  f.setSize(400,300);
	  f.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (mi5.isSelected()) {
			System.out.println("Tildo CheckBox archivo ");	
		}else {
			System.out.println("Destildo CheckBox archivo ");
		}
			 
		
	}
	public static void main(String[] args) {
		Menubar guiWindow2 = new Menubar();
		  guiWindow2.launchFrame();

	}


	

}

	
