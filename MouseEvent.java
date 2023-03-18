import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener{
  Label l;
  MouseListenerExample(){
  addMouseListener(this);
  l=new Label();
  l.setBounds(20,50,100,20);
  setSize(300,300);
  setLayout(null);
  setVisible(true);
}
  
public void mouseClicked(MouseEvent e) {
  l.setText("Mouse Clicked");
}
public void mouseEntered(MouseEvent e) {
  l.setText("Mouse Entered");
}
public void mouseExited(MouseEvent e) {
  l.setText("Mouse Exited");
}
