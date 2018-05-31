package views;

import javax.swing.JOptionPane;

public class PopUp {
	/**afficahge d'un message dans un poppup
	 * 
	 * @param infoMessage(message string)
	 * @param titleBar (string titre de l'infobulle
	 */
    public static void infoBox(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void infoBoxQuestion(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.QUESTION_MESSAGE);
    }
    public static void infoBoxWarning(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.WARNING_MESSAGE);
    }
    
}
