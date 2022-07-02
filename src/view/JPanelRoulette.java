package view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;

public class JPanelRoulette extends JPanel {
    private Image image;
    
    public JPanelRoulette() {
        super();
        init();
    }

    private void init() {
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public void setImage(Image image) {
        this.image = image;
        //mostrar la imagen
    }
}
