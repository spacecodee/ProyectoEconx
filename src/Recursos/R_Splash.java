package Recursos;

import Vista.Splash.V_Splash;
import Vista.V_Login;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class R_Splash extends Thread {

    private JProgressBar jProgg;
    private V_Splash splasWn;
    private JLabel lblNum;

    public R_Splash(JProgressBar jProgg, V_Splash splasWn, JLabel lblNum) {
        super();
        this.jProgg = jProgg;
        this.splasWn = splasWn;
        this.lblNum = lblNum;
    }

    @Override
    public void run() {
        setProgress(0);
        pause(1000);

        setProgress(10);
        pause(2000);

        setProgress(30);
        pause(2000);

        setProgress(45);
        pause(1000);

        setProgress(80);
        pause(2000);

        setProgress(85);
        pause(500);

        setProgress(90);
        pause(500);

        setProgress(92);
        setProgress(98);
        setProgress(100);
    }

    public void pause(int mls) {
        try {
            Thread.sleep(mls);
        } catch (InterruptedException ex) {
            Logger.getLogger(R_Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setProgress(int valor) {
        jProgg.setValue(valor);
        lblNum.setText(valor + "%");

        pause(1000);

        if (valor == 100) {
            pause(1000);
            splasWn.hide();
            new V_Login().setVisible(true);
        }
    }

}
