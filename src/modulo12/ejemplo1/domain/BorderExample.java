package modulo12.ejemplo1.domain;

import java.awt.*;
import javax.swing.*;

 public class BorderExample {
 private JFrame f;
 private JButton bn, bs, bw, be, bc;

 public BorderExample() {
 f = new JFrame("Border Layout");
 bn = new JButton("Button 1");
 bc = new JButton("Button 2");
 bw = new JButton("Button 3");
 bs = new JButton("Button 4");
 be = new JButton("Button 5");
 }
 public void launchFrame() {
	  f.add(bn, BorderLayout.NORTH);
	  f.add(bs, BorderLayout.SOUTH);
	  f.add(bw, BorderLayout.WEST);
	  f.add(be, BorderLayout.EAST);
	  f.add(bc, BorderLayout.CENTER);
	  f.setSize(400,200);
	  f.setVisible(true);
	 }
	 
	  public static void main(String args[]) {
	  BorderExample guiWindow2 = new BorderExample();
	  guiWindow2.launchFrame();
	  }
	 }
