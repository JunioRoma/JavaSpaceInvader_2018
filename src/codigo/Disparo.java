/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Junior
 */
public class Disparo {
    public Image imagen = null;
    private int x = 0;
    private int y = 0;
    private int altoPantalla;
    private boolean disparo = false;
    
    public Disparo(int _altoPantalla){
        try{
            imagen = ImageIO.read(getClass().getResource("/imagenes/disparo.png"));
            altoPantalla = _altoPantalla;
        }
        catch(IOException e){}
        altoPantalla = _altoPantalla;
    }

    public void mueve(){
        if(y > 0){
            y--;
        }
    }
    
    public void posicionDisparo(Nave _nave){
        x = _nave.x + _nave.imagen.getWidth(null)/2 - imagen.getWidth(null)/2;
        y = _nave.y;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isDisparo() {
        return disparo;
    }

    public void setDisparo(boolean disparo) {
        this.disparo = disparo;
    }
        
}
