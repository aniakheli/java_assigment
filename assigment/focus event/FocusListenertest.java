import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Panel extends JPanel implements MouseListener, FocusListener {
myMessageBox msgBox;

public Panel() {
    addMouseListener(this);
    addFocusListener(this);
}

public void paintComponent(Graphics g) {
    super.paintComponent(g);
    setBackground(Color.GREEN);
    msgBox = new myMessageBox(g);
    g.dispose();
}

public void focusGained(FocusEvent fe) {
    System.out.println("Focus gained in JPanel");
}

public void focusLost(FocusEvent fe){
    System.out.println("Focus lost in JPanel");
}

public void mousePressed(MouseEvent me) {
    requestFocus();
    System.out.println("Mouse Pressed in JPanel");
}
public void mouseReleased(MouseEvent me) {}
public void mouseClicked(MouseEvent me) {}
public void mouseEntered(MouseEvent me) {}
public void mouseExited(MouseEvent me) {}
}

class myMessageBox extends Component implements FocusListener, MouseListener{
myMessageBox(Graphics g) {
    addMouseListener(this);
    addFocusListener(this);
    paintComponent(g);
    System.out.println("Done");
}

public void paintComponent(Graphics g) {
    g.fillRect(150,100,100,100);
}

public void mousePressed(MouseEvent me) {
    requestFocus();
    System.out.println("Mouse pressed on box");
}

public void mouseReleased(MouseEvent me) {}
public void mouseClicked(MouseEvent me) {}
public void mouseEntered(MouseEvent me) {}
public void mouseExited(MouseEvent me) {}

public void focusGained(FocusEvent fe){
    System.out.println("Focus gained by box");
}

public void focusLost(FocusEvent fe) {
    System.out.println("Focus lost by box");
}
}

public class FocusListenertest {
public static void main(String args[]) {
    JFrame window = new JFrame();
    Panel content = new Panel();
    window.setContentPane(content);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLocation(100,75);
    window.setSize(400, 400);
    window.setVisible(true);
}
}
