import greenfoot.*;

/**
 * Kelas LaserMusuh merupakan turunan dari kelas Actor.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserMusuh extends Actor
{
    private int UwU;
    
    // Metode untuk membuat laser musuh bergerak ke bawah.
    public void gerak()
    {
        setLocation(getX(), getY() + 5);
        
        // Jika laser musuh mencapai batas bawah layar, hapus objek laser musuh.
        if(getY() > 590){
            getWorld().removeObject(this);
        } else {
            // Cek apakah laser musuh menyentuh objek Pesawat.
            cek_kena();
        }
    }
    
    // Metode untuk mengecek apakah laser musuh menyentuh objek Pesawat.
    public void cek_kena(){
        if (isTouching(Pesawat.class))
        {
            // Jika laser musuh menyentuh Pesawat, tambahkan objek Ledakan2 ke dunia.
            getWorld().addObject(new Ledakan2(), getX(), getY());
            
            // Dapatkan referensi ke dunia (Latar) dan kurangi nilai UwU.
            Latar w = (Latar) getWorld();
            w.updateUwU(-1);
            
            // Hapus objek laser musuh.
            getWorld().removeObject(this);
            
            // Putar suara ledakan.
            Greenfoot.playSound("meledak.mp3");
        }
    }
    
    // Metode act dipanggil pada setiap frame dan digunakan untuk menjalankan logika objek.
    public void act() 
    {
        // Panggil metode gerak() untuk membuat laser musuh bergerak.
        gerak();
    }    
}
