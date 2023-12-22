import greenfoot.*;

/**
 * Kelas Rudal merupakan turunan dari kelas Actor.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rudal extends Actor
{
    /**
     * Metode act dipanggil pada setiap frame dan digunakan untuk menjalankan logika objek Rudal.
     * Objek Rudal akan bergerak ke atas dan dihapus jika sudah mencapai batas atas atau menyentuh Musuh.
     */
    public void gerak()
    {
        setLocation(getX(), getY() - 5); // Menggerakkan rudal ke atas
        if(getY() < 10){
            getWorld().removeObject(this); // Menghapus rudal jika mencapai batas atas
        } else {
            cek_kena(); // Memeriksa apakah rudal menyentuh Musuh
        }
    }
    
    /**
     * Metode cek_kena digunakan untuk memeriksa apakah rudal menyentuh objek Musuh.
     * Jika iya, maka ledakan akan ditambahkan, skor akan diupdate, suara ledakan akan diputar, dan objek Musuh yang disentuh akan dihapus.
     */
    public void cek_kena(){
        if(isTouching(Musuh.class))
        {
            getWorld().addObject(new Ledakan1(), getX(), getY()); // Menambahkan ledakan ke dunia
            Latar m = (Latar)getWorld();
            m.addScore(1); // Menambah skor
            Greenfoot.playSound("explosion.wav"); // Memutar suara ledakan
            removeTouching(Musuh.class); // Menghapus objek Musuh yang disentuh oleh rudal
        }
    }
    
    /**
     * Metode act dipanggil pada setiap frame dan menjalankan metode gerak() untuk pergerakan rudal.
     */
    public void act() 
    {
        gerak();
    }    
}
