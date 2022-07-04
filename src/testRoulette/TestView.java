package testRoulette;

import com.uptc.prg3.roulette.client.view.JWindowMain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestView implements ActionListener {
    private JWindowMain jWindowMain;
    public TestView() {
        this.jWindowMain = new JWindowMain(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getActionCommand();
        String action = source.toString();
        switch (action) {
            case "exit":
                jWindowMain.dispose();
                break;
            case "chosen":
                String chosen = jWindowMain.getSelectedSlot();
                jWindowMain.updatePic(chosen);
                break;
            case "play":
                jWindowMain.startRoulettes(true);
        }
    }
    public static void main(String[] args) {
        new TestView();
    }
}
