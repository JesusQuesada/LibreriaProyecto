/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreriaSonido;

import java.applet.AudioClip;

/**
 *
 * @author User
 */
public class Sonido {

    AudioClip sonido;

    public void playAudio(String ruta) {
        
        
        sonido = java.applet.Applet.newAudioClip(getClass().getResource(ruta));
        sonido.play();
    }
    
    public void stopAudio() {
        sonido.stop();
    }

}
