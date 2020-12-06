package swing_sample;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SwingSample {
    private static final String userPath = System.getProperty("user.dir");

    private JButton jSaveButton;
    private JButton jClearButton;
    private JLabel jLabel;
    private JLabel jLabelPath;
    private JTextField jTextField;
    private JFrame jFrame;
    private JTextArea jTextArea;


    public SwingSample() {
        this.jFrame = new JFrame();

        this.jSaveButton = new JButton("Save file");
        this.jClearButton=new JButton("Clear text");

        this.jLabel = new JLabel();
        this.jLabelPath = new JLabel("File path : ");
        this.jTextField = new JTextField();
        this.jTextArea = new JTextArea();

        //Frame setup
        this.jFrame.getContentPane().setLayout(null);
        this.jFrame.setBounds(100, 100, 600, 400);


        //Label setup
        this.jLabel.setText("TEXT EDITOR");
        this.jLabel.setBounds(new Rectangle(30, 20, 150, 30));

        //Button setup
        this.jSaveButton.setBounds(15, 110, 130, 30);
        this.jSaveButton.addActionListener(actionEvent -> {
            String newFilePath = jTextField.getText();
            String newFileContent = jTextArea.getText();
            try {
                saveFile(newFilePath, newFileContent);
                JOptionPane.showMessageDialog(this.jSaveButton, "File saved at directory : ");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this.jSaveButton, "File not saved at directory : " + newFilePath);

            }
        });

        //Set clear button details
        this.jClearButton.setBounds(15, 170, 130, 30);
        this.jClearButton.addActionListener(actionEvent -> {
            this.jTextArea.setText("");
        });


        //Set text area details
        this.jTextArea.setBounds(new Rectangle(150, 25, 430, 270));

        //Path label setup
        this.jLabelPath.setBounds(new Rectangle(70, 315, 100, 30));


        //Field setup
        this.jTextField.setBounds(new Rectangle(150, 320, 430, 25));
        this.jTextField.setText(userPath);


        this.jFrame.add(jLabel);
        this.jFrame.add(jSaveButton);
        this.jFrame.add(jClearButton);
        this.jFrame.add(jTextArea);
        this.jFrame.add(jLabelPath);
        this.jFrame.add(jTextField);

        this.jFrame.setVisible(true);
        this.jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void saveFile(String filePath, String content) throws IOException {
        File newFile = new File(filePath);
        if (newFile.exists()) {
            newFile.delete();
            if (newFile.createNewFile()) {
                FileWriter myWriter = new FileWriter(newFile);
                myWriter.write(content);
                myWriter.close();
            } else
                throw new RuntimeException("New file couldn't be created.");
        } else {
            if (newFile.createNewFile()) {
                FileWriter myWriter = new FileWriter(newFile);
                myWriter.write(content);
                myWriter.close();
            } else
                throw new RuntimeException("New file couldn't be created.");
        }
    }


    public static void main(String[] args) {
        new SwingSample();
    }

}
