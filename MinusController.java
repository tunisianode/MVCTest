import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MinusController implements ActionListener {

    PlusMinusModel model ;

    public MinusController(PlusMinusModel model){

        this.model = model;

    }




    @Override
    public void actionPerformed(ActionEvent e)
    {
        model.decrement();
    }
}
