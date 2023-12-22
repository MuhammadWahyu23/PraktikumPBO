import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Kelas kalah merupakan turunan dari kelas Actor.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kalah extends Actor
{
    /**
     * Metode act dipanggil pada setiap frame dan dapat digunakan untuk menambahkan logika atau aksi tertentu.
     * Pada contoh ini, teks "Game Over" akan ditampilkan di tengah layar saat objek kalah aktif.
     */
    public void act() 
    {
        // Menambahkan aksi atau logika ketika kondisi kalah terjadi
        if (Greenfoot.mousePressed(this)) {
            // Misalnya, menampilkan teks "Game Over" di tengah layar
            getWorld().showText("Game Over", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        }
    }    
}
