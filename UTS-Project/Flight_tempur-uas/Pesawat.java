import greenfoot.*;

/**
 * Kelas Pesawat merupakan turunan dari kelas Actor.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesawat extends Actor
{
    public int tahan = 10; // Variabel untuk mengatur jeda antara tembakan pesawat
    private int jeda = 0; // Variabel untuk mengatur waktu antara tembakan pesawat
    private int UwU; // Variabel untuk mengatur UwU (nilai tertentu dalam permainan)

    /**
     * Metode untuk menggerakkan pesawat dan menembak rudal.
     */
    public void tombol(){
        // Menggerakkan pesawat berdasarkan input tombol kursor
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 4);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 4);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 4, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 4, getY());
        }
        
        // Menembakkan rudal jika jeda sudah habis
        if (tahan == 0){
            if(Greenfoot.isKeyDown("Space"))
            {
               getWorld().addObject(new Rudal(), getX(), getY());
               Greenfoot.playSound("bullet.wav");
            }
            tahan = 10; // Mengatur ulang nilai tahan setelah tembakan
        }
    }
                
    /**
     * Metode act dipanggil pada setiap frame dan digunakan untuk menjalankan logika objek Pesawat.
     */
    public void act() 
    {
        tahan--; // Mengurangi nilai tahan untuk mengatur jeda antara tembakan pesawat
        tombol(); // Panggil metode tombol() untuk menggerakkan pesawat dan menembakkan rudal
        
        if(jeda > 0){
            jeda--;
        }
        
        // Kondisi untuk menambah nilai jeda dan menembakkan rudal setiap 20 frame
        if(jeda == 1){
            // Menembakkan rudal
            // (Catatan: Tidak ada implementasi tambahan di dalam if(jeda==1), mungkin ada bagian kode yang hilang di sini)
        }
        
        // Setel ulang nilai jeda setelah tembakan pesawat
        if(jeda == 0){
            jeda = 20;
        }
    }
}
