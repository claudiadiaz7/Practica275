package modulo12.ejemplo1.domain;

import javax.swing.*;
public class HelloWorldSwing {
private static void createAndShowGUI() {
JFrame frame = new JFrame("HelloWorldSwing");
//Set up the window.
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel label = new JLabel("Hello World");
// Add Label
frame.add(label);
 frame.setSize(300,200);
 // Display Window
 frame.setVisible(true);}
public static void main(String[] args) {
 javax.swing.SwingUtilities.invokeLater(new Runnable() {
 //Schedule for the event-dispatching thread:
 //creating,showing this app's GUI.
 public void run() {createAndShowGUI();}
 });
 }
 }