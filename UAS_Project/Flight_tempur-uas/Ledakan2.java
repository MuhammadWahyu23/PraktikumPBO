import greenfoot.*;

/**
 * Kelas Ledakan2 merupakan turunan dari kelas Actor.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ledakan2 extends Actor
{
     private int jeda = 10;

    /**
     * Metode act dipanggil pada setiap frame dan digunakan untuk menjalankan logika objek.
     */
    public void act() 
    {
        // Jika jeda lebih dari 0, kurangi nilai jeda.
        if (jeda > 0) {
            jeda--;
        } else {
            // Jika jeda mencapai 0, hapus objek Ledakan2 dari dunia.
            getWorld().removeObject(this);
        }
    }    
}
