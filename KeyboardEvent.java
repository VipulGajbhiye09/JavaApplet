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
