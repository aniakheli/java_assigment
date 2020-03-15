import java.awt.*;
import java.awt.event.*;

public class KeyListenerDemo extends Frame implements KeyListener {
    Label l;
    TextArea a;

    KeyListenerDemo() {
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        a = new TextArea();
        a.setBounds(20, 80, 200, 200);
        a.addKeyListener(this);
        add(l);
        add(a);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KeyListenerDemo();
    }
}
