import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlusController implements ActionListener {

    PlusMinusModel model ;
    CounterView counterView;
    ButtonView plusbuttonView;




    public PlusController(PlusMinusModel model){
        this.model = model;
        this.counterView = new CounterView();

    }
    public void actionPerformed(ActionEvent e) {
        this.counterView.setText(this.model.getZahlToString());
        if (this.model.getMax()==this.model.getZahl())
        {
            this.plusbuttonView.setEnabled(false);
        }

    }

}
