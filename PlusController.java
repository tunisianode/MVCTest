import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlusController implements ActionListener {

    PlusMinusModel model ;





    public PlusController(PlusMinusModel model){
        this.model = model;
    }




    @Override
    public void actionPerformed(ActionEvent e)
    {
        model.decrement();
    }
}
