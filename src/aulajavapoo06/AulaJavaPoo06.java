/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulajavapoo06;

/**
 *
 * @author Carla
 */
public class AulaJavaPoo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto c = new ControleRemoto ();
        c.ligar();
        c.abrirMenu();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}
