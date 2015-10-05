package input.view;

import javax.swing.JOptionPane;
/**
 * This class provides popups for input and output.
 * @author Cody Henrichsen
 * @version 1.0 9/24/15
 */
public class PopupDisplay
{
	/**
	 * Provides a popup box for asking a question and allows the user to submit a text answer.
	 * Returns the user response as a String.
	 * @param input The supplied question for the popup.
	 * @return The user's answer to the supplied question.
	 */
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	
	/**
	 * Shows the user the supplied String input in a popup box.
	 * @param input The text to be displayed.
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
