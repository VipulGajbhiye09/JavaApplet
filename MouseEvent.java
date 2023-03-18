import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener{
  Label l;
  MouseListenerExample(){
  addMouseListener(this);
  l=new Label();
  l.setBounds(20,50,100,20);

