/*
 * Vamos a crear la nave del juego
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Junior
 */
public class Nave {

    public Image imagen = null;
    public int x = 0;
    public int y = 0;
    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecha = false;

    public Nave() {
        //Esto es le contructor de la clase nave
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        } catch (IOException ramon) {

        }
    }

    public boolean isPulsadoIzquierda() {
        return pulsadoIzquierda;
    }

    public void setPulsadoIzquierda(boolean pulsadoIzquierda) {
        this.pulsadoIzquierda = pulsadoIzquierda;
    }

    public boolean isPulsadoDerecha() {
        return pulsadoDerecha;
    }

    public void setPulsadoDerecha(boolean pulsadoDerecha) {
        this.pulsadoDerecha = pulsadoDerecha;
    }

    //Metodo para mover a la nave 
    public void mueve() {
        if (pulsadoIzquierda && x > 0) {
            x--;
        }
    }

}
