import greenfoot.*;

/**
 * Kelas TombolMulai merupakan turunan dari kelas Actor.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TombolMulai extends Actor
{
    /**
     * Metode act dipanggil pada setiap frame dan digunakan untuk menjalankan logika objek TombolMulai.
     * Jika tombol ini ditekan, gambar tombol akan dikecilkan sebentar dan dunia akan diubah menjadi kelas Latar.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            // Mengurangi ukuran gambar tombol sejenak
            getImage().scale((int)Math.round(getImage().getWidth()*0.9), (int)Math.round(getImage().getHeight()*0.9));
            
            // Mengatur jeda sebelum mengubah dunia
            Greenfoot.delay(5);
            
            // Mengubah dunia menjadi kelas Latar
            Greenfoot.setWorld(new Latar());
        }
    }    
}
