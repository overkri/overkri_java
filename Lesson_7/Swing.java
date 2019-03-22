package Lesson_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing { //Честно признаюсь, использовал ваш код.
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyWindow();
            }
        });
    }
}

class MyWindow extends JFrame {
    JLabel lbId = new JLabel();


    public MyWindow() {
        setTitle("Window");
        setBounds(800, 300, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        EditWindowNew editWindow = new EditWindowNew(this);

        JPanel jPanel = new JPanel(new GridLayout(1, 2));
        JButton jbtSend = new JButton("Set your name, surname, fathername");

        jPanel.add(lbId);


        add(jPanel, BorderLayout.NORTH);
        add(jbtSend, BorderLayout.SOUTH);

        jbtSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editWindow.setVisible(true);
            }
        });

        setVisible(true);
    }

    void setValue(String id) {
        lbId.setText("Привет, " + id + " !");

    }
}

class EditWindowNew extends JFrame {
    MyWindow window;

    public EditWindowNew(MyWindow window) {
        this.window = window;
        setTitle("Set name, surname, fathername");
        setBounds(800, 300, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel(new GridLayout(1, 2));
        JTextField lbId = new JTextField();
        JButton jbtSend = new JButton("Send");
        jPanel.add(lbId);
        add(jPanel, BorderLayout.NORTH);
        add(jbtSend, BorderLayout.SOUTH);

        jbtSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.setValue(lbId.getText());
                setVisible(false);
            }
        });

    }

}


