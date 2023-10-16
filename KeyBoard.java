package aula04.exemplo01;
import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;
/**
 *
 * @author Kakugawa
 */
public class KeyBoard implements KeyListener{
    private Cena cena;
    
    public KeyBoard(Cena cena){
        this.cena = cena;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {        
        System.out.println("Key pressed: " + e.getKeyCode());
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
            System.exit(0);
        
        if(e.getKeyChar() == 'a')
            System.out.println("Pressionou tecla a");

        if(e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Pressionou tecla up");
//            cena.reshape(cena.Resize());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }

}
