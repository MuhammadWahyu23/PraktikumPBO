import greenfoot.*;

/**
 * Kelas Ledakan1 merupakan turunan dari kelas Actor.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ledakan1 extends Actor
{
    private int jeda = 5;

    /**
     * Metode act dipanggil pada setiap frame dan digunakan untuk menjalankan logika objek.
     */
    public void act() 
    {
        // Jika jeda lebih dari 0, kurangi nilai jeda.
        if (jeda > 0) {
            jeda--;
        } else {
            // Jika jeda mencapai 0, hapus objek Ledakan1 dari dunia.
            getWorld().removeObject(this);
        }
    }    
}
