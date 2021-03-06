/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validations;
import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Tanisha_Jain
 */
public class AgeVerifier extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
       String text = ((JTextField) input).getText();
        if (text.length() > 0) {
            try {
                int number = Integer.parseInt(text);
                
                if (number < 0 || number > 125) {
                    input.setBackground(Color.red);
                    JOptionPane.showMessageDialog(input, "Please enter correct age.", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                input.setBackground(Color.white);
                return true;
            } catch (NumberFormatException e) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter valid age value.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            input.setBackground(Color.red);
            return false;
        }
    }
}
