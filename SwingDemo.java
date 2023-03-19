import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class StudentResult {
// Function to write a student information in JFrame and storing it in a file
public static void StudentInfo()
{
JFrame f = new JFrame("Student Result Form");
  
JTextField t1, t2, t3,t4,t5,t6,t7;
JComboBox j1, j2;
JButton b1, b2;

l1 = new JLabel("Student Name:");
l1.setBounds(50, 50, 100, 30);
l2 = new JLabel("Branch:");
l2.setBounds(50, 100, 120, 30);
l3 = new JLabel("Div :");
l3.setBounds(400, 50, 50, 30);
l4 = new JLabel("Roll no:");
l4.setBounds(400, 100, 70, 30);
l5 = new JLabel(" Microcontroller:");
l5.setBounds(400, 150, 70, 30);
l6 = new JLabel("EM Field Theory:");
l6.setBounds(50, 150, 70, 30);
l7 = new JLabel("Java:");
l7.setBounds(400, 200, 70, 30);
l8 = new JLabel("Digital Comm.:");
l8.setBounds(50, 200, 70, 30);
l9 = new JLabel("DBMS:");
l9.setBounds(400, 250, 70, 30);

