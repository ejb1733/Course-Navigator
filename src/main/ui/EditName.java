package ui;

import model.Worklist;

import javax.swing.*;

public class EditName {
    JFrame frame;
    JPanel panel;
    JTextField name = new JTextField(20);
    JButton enter = new JButton("Enter");
    JButton back = new JButton("Back to Edit Options");

    Worklist worklist;

    EditName(Worklist wl) {
        worklist = wl;
        editName();
    }

    void editName() {
        JLabel label = new JLabel("Please enter a new name for " + worklist.getWorklistName());
        frame = new JFrame();
        panel = new JPanel();
        panel.add(label);
        panel.add(name);

        enter = new JButton();
        enter.addActionListener(
                e -> {
                    String newName = name.getText();
                    String message = "Your worklists' name has been successfully changed from - "
                            + worklist.getWorklistName() + " to - " + newName;
                    JOptionPane.showMessageDialog(new JFrame(), message, "Success!",
                            JOptionPane.INFORMATION_MESSAGE);
                    worklist.setWorklistName(newName);
                    frame.dispose();
                }
        );
        panel.add(enter);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setVisible(true);
    }
}