package fastrl;

import javax.swing.JFrame;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;

import fastrl.screens.Screen;

import fastrl.screens.MainMenu;


class ApplicationMain extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1060623638149583738L;

    private AsciiPanel terminal;
    private Screen screen;
    private int repaintsNum = 0;

    public ApplicationMain() {
        super();
        System.out.println("ApplicationMain init");
        terminal = new AsciiPanel();
        add(terminal);
        pack();
        screen = new MainMenu();
        addKeyListener(this);
        repaint();
    }

    public void repaint() {
        System.out.println("Repainting Terminal (" + repaintsNum + ")");
        repaintsNum += 1;
        terminal.clear();
        screen.displayOutput(terminal);
        super.repaint();
    }

    public void keyPressed(KeyEvent e) {
        screen = screen.respondToUserInput(e);
        repaint();
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        ApplicationMain app = new ApplicationMain();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}