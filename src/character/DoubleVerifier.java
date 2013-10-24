package character;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 * Verifies that a JTextField is a double and that it falls within the set
 * upper and lower bounds, inclusive.
 *
 * @author Jacob Dorman
 */
public class DoubleVerifier extends InputVerifier
{

    private String lastGood;
    private boolean valueChanged;
    private double lowerBound;
    private double upperBound;

    /**
     * Creates a new IntegerVerifier with the passed lower and upper bounds,
     * inclusive.
     *
     * @param lowerBound
     * @param upperBound
     */
    public DoubleVerifier(double lowerBound, double upperBound)
    {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        lastGood = "" + lowerBound;
        valueChanged = false;
    }

    @Override
    public boolean verify(JComponent input)
    {
        JTextField textField = (JTextField) input;
        String text = textField.getText();

        if (text.equals(lastGood))
        {
            valueChanged = false;
            return true;
        }
        try
        {
            double parseInt = Double.parseDouble(text);
            if (parseInt >= lowerBound && parseInt <= upperBound)
            {
                lastGood = String.valueOf(parseInt);
                valueChanged = true;
                return true;
            }
            textField.setText(lastGood);
            valueChanged = false;
            return false;
        } catch (NumberFormatException e)
        {
            textField.setText(lastGood);
            valueChanged = false;
            return false;
        }
    }

    /**
     * @return true if the value has been changed and verified
     */
    public boolean isValueChanged()
    {
        return valueChanged;
    }
}
