
package views;

import models.TvSony;


public class Main {
    public static void main(String[] args) {
        TvSony sony = new TvSony();
        
        
         sony.setCanal(10);
        System.out.println(sony.aumentarCanal());
        
        sony.setVolume(10);
        System.out.println(sony.aumentarVolume());
        
    }
}
