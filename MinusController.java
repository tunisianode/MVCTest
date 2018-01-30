import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MinusController implements ActionListener {

    PlusMinusModel model ;
    CounterView view;

    public MinusController(PlusMinusModel model){

        this.model = model;

    }




    @Override
    public void actionPerformed(ActionEvent e)
    {
        model.decrement();
        this.view.setText(model.getZahlToString());
    }
}
