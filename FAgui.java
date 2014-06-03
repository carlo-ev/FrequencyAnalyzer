import javax.swing.*;
import java.awt.*;

public class FAgui{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Frequency Analyzer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanel = frame.getContentPane();
        contentPanel.setLayout(new GridLayout());
        GridBagConstraints layoutConstraints = new GridBagConstraints();


        JLabel label = new JLabel("Encrypted Message", JLabel.CENTER);
        label.setOpaque(true);
        //label.setPreferredSize(new Dimension(50, 50));
        layoutConstraints.gridwidth = 2;
        layoutConstraints.gridheight = 2;
        layoutConstraints.weightx = 0.5;
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;
        contentPanel.add(label, layoutConstraints);

        //layoutConstraints = new GridBagConstraints();
        label = new JLabel("Decrypted Message", JLabel.CENTER);
        //label.setPreferredSize(new Dimension(50, 50));
        layoutConstraints.weightx = 0.5;
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 0;
        contentPanel.add(label, layoutConstraints);

        //layoutConstraints = new GridBagConstraints();
        JTextArea textArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.weightx = 0.0;
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 1;
        contentPanel.add(scrollPane, layoutConstraints);

        textArea = new JTextArea(10, 20);
        scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);
        layoutConstraints.weightx = 0.5;
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 1;
        contentPanel.add(scrollPane, layoutConstraints);

        frame.pack();
        frame.setVisible(true);       
    }

}