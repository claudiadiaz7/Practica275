package modulo12.ejemplo1.domain;

import java.awt.*;
import javax.swing.*;

 public class GridExample {
 private JFrame f;
 private JButton b1, b2, b3, b4, b5;

 public GridExample() {
f = new JFrame("Grid Example");
 b1 = new JButton("Button 1");
 b2 = new JButton("Button 2");
 b3 = new JButton("Button 3");
 b4 = new JButton("Button 4");
 b5 = new JButton("Button 5");
 }
public void launchFrame() {
 f.setLayout (new GridLayout(3,2)); //pasamos las filas y columnas que forma

 f.add(b1);
 f.add(b2);
 f.add(b3);
 f.add(b4);
 f.add(b5);
 
 f.pack();
 f.setVisible(true);
 //f.setSize(400,200);
 }

 public static void main(String args[]) {
 GridExample grid = new GridExample();
 grid.launchFrame();
 }
}