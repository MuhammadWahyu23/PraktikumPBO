import greenfoot.*;

/**
 * Kelas Menu digunakan untuk membuat dunia menu dalam permainan.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor untuk objek kelas Menu.
     */
    public Menu()
    {    
        // Membuat dunia baru dengan ukuran 500x600 sel dan ukuran sel 1x1 piksel.
        super(500, 600, 1); 
        
        // Memeriksa apakah objek yang membuat dunia ini adalah kelas MenuUtama.
        if(this.getClass().getName().equalsIgnoreCase("MenuUtama"))
        {
            // Jika iya, tambahkan TombolMulai ke dunia di posisi tertentu.
            TombolMulai mulai = new TombolMulai();
            addObject(mulai, 141, 510);
        }
        else
        {
            // Jika bukan MenuUtama, tidak lakukan apa-apa (blok else kosong).
        }
    }
}
