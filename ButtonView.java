import javax.swing.JButton;

public class ButtonView extends JButton implements PlusMinusListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;



    public ButtonView(String name, PlusMinusModel model) {
        super(name);
        this.valueChanged(model);
    }

    @Override
    public void valueChanged(PlusMinusModel model) {
         if(this.getText().equals("+")){
             if(model.getZahl()== model.getMax()){
                 setEnabled(false);
             }
         }else {
             if(model.getZahl()== model.getMin()){
                 setEnabled(false);
             }
         }
    }
}
