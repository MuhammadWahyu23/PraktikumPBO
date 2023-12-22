import greenfoot.*;

/**
 * Kelas Musuh merupakan turunan dari kelas Actor.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musuh extends Actor
{
    public int tahan = 30; // Variabel untuk mengatur jeda antara tembakan musuh
    private int jeda = 0; // Variabel untuk mengatur waktu antara tembakan musuh

    /**
     * Metode untuk membuat musuh bergerak ke bawah.
     */
    public void gerak()
    {
        setLocation(getX(), getY() + 1);

        // Jika musuh mencapai batas bawah layar, pindahkan musuh ke posisi acak di bagian atas layar.
        if(getY() > 500){
            setLocation(Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(50));
        }
    }
    
    /**
     * Metode act dipanggil pada setiap frame dan digunakan untuk menjalankan logika objek Musuh.
     */
    public void act() 
    {
        gerak(); // Panggil metode gerak() untuk membuat musuh bergerak ke bawah.
        
        if(tahan == 0){
            tahan = 30; // Reset nilai tahan setelah jeda selesai.
        }
        
        if(jeda > 0){
            jeda--;
        }
        
        // Tambahkan kondisi untuk menembak laser musuh.
        if(jeda == 1){
            getWorld().addObject(new LaserMusuh(), getX(), getY() + 50);
        }
        
        // Setel ulang nilai jeda setelah tembakan musuh.
        if(jeda == 0){
            jeda = 120;
        }
    }    
}
