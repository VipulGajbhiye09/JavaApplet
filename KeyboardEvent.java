import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// To demonstrate the working of Keyboard Events
public class KeyboardEvents extends Applet implements KeyListener ,ActionListener {
Label purpose;
char keyChar = ' ';
int number = 0;
String string1 = " ", string2 = " ", string3 = " ", string4 = " ";
Button start;
{
requestFocus(); // should make the applet the active component for Key
events
start = new Button("START");
add(start);
start.addActionListener(this);
addKeyListener(this); 

purpose = new Label("The purpose of this program is to show how Keyboard Events work");
add(purpose);
}
public void keyPressed(KeyEvent e)
{
  number++; 
  string1 = e.getKeyText(e.getKeyCode()); // show which key is pressed
  if(e.getKeyCode() == e.VK_UP) // check if UP arrow key is pressed
  string2 = "Up Arrow key";
  if(e.getKeyCode() == e.VK_DOWN) // check if DOWN arrow key is pressed
  string2 = "Down Arrow key";
  if(e.getKeyCode() == e.VK_LEFT) // check if LEFT arrow key is pressed
  string2 = "Left Arrow key";
  if(e.getKeyCode() == e.VK_RIGHT) // check if Right arrow key is pressed
  string2 = "Right Arrow key";
  if(e.getKeyCode() == e.VK_ENTER) // check if ENTER key is pressed
  string2 = "Enter key";
  repaint();
  } 

  public void keyReleased(KeyEvent e)
  {
  string4 = e.getKeyText(e.getKeyCode());
  repaint();
  }
