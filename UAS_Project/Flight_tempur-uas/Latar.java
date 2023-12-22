import greenfoot.*;

public class Latar extends World
{
    private int jeda = 0;
    private int score;
    private int UwU = 3;//nyawa

    /**
     * Constructor untuk objek kelas Latar.
     */
    public Latar()
    {    
        // Membuat dunia baru dengan ukuran 500x600 sel dan ukuran sel 1x1 piksel.
        super(500, 600, 1); 
        tampilUwU();
        tampilscore();
        addObject(new Pesawat(), 250, 550);
    }

    // Metode untuk memperbarui jumlah "UwU" berdasarkan poin.
    public void updateUwU(int point)
    {
        UwU = UwU + point;
        tampilUwU();

        // Jika "UwU" mencapai 0, hentikan permainan dan tambahkan layar kalah.
        if(UwU == 0)
        {
            Greenfoot.stop();
            addObject(new kalah(), 250, 300);
        }
    }

    // Metode untuk menampilkan jumlah "UwU" di layar.
    public void tampilUwU()
    {
        showText("UwU :" + UwU, 400, 25);
    }

    // Metode untuk menambah skor dan menampilkan perubahan di layar.
    public void addScore(int points)
    {
        score = score + points;
        tampilscore();

        // Tambahkan kondisi untuk menang: jika skor mencapai 20, hentikan permainan dan tambahkan layar menang.
        if (score >= 20)
        {
            Greenfoot.stop();
            addObject(new Menang(), 250, 300);
        }
    }

    // Metode untuk menampilkan skor di layar.
    private void tampilscore()
    {
        showText("Score :" + score, 100, 25);
    }

    // Metode act dipanggil pada setiap frame dan digunakan untuk mengatur logika permainan.
    public void act()
    {
        // Jika angka acak kurang dari 1 (1% kemungkinan), tambahkan objek Musuh ke dunia.
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Musuh(), Greenfoot.getRandomNumber(599), 500);
        }
    }
}
