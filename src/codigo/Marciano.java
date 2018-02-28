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
public class Marciano {

    public Image imagen = null;
    public Image imagen2 = null;

    public int x = 0;
    public int y = 0;

    private int anchoPantalla;

    public Marciano(int _anchoPantalla) {
        //Esto es le contructor de la clase nave
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/marcianito1.png"));
            imagen2 = ImageIO.read(getClass().getResource("/imagenes/marcianito2.png"));
        } catch (IOException ramon) {

        }
        anchoPantalla = _anchoPantalla;
    }

    //Metodo para mover a la nave 
    public void mueve(boolean direccion) {
        if (direccion) {
            if (x < anchoPantalla - (imagen.getWidth(null) - 8)) {
                x++;
            }
        }
        else{
            if(x > 0){
                x--;
            }
        }

    }
    

}
