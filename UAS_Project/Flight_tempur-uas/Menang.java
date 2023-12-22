import greenfoot.*;

public class Menang extends Actor
{
    private int pesawatMusuhDihancurkan = 0;
    
    /**
     * Metode act dipanggil pada setiap frame dan digunakan untuk menjalankan logika objek.
     */
    public void act() 
    {
        // Periksa apakah pemain telah menghancurkan 20 pesawat musuh
        if (pesawatMusuhDihancurkan >= 20) {
            // Anda menang! Implementasikan aksi kemenangan di sini.
            getWorld().showText("You Win!", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();  // Hentikan permainan
        }
    } 
}
