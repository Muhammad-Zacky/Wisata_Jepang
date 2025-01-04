package com.zacky3019.wisata_jepang

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class beranda : AppCompatActivity() {
    private lateinit var wisataAdapter: AdapterGambar
    private lateinit var wisataList: List<ModelGambar>


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_beranda)

        wisataList = listOf(
            ModelGambar("Tokyo Tower","Minato, Tokyo", R.drawable.tokyo_tower,"Tanggal : 23 Desember 1958", "Menara Tokyo (東京タワー, Tokyo Tower) adalah sebuah menara di Taman Shiba, Tokyo, Jepang. Tinggi keseluruhan 332,6 m dan merupakan bangunan menara baja tertinggi di dunia yang tegak sendiri di permukaan tanah..\n" +
                    "\n" +
                    "Menara Tokyo terkenal sebagai simbol kota Tokyo dan objek wisata daripada fungsinya sebagai menara antena pemancar TV analog (UHF/VHF), TV lokal digital, dan radio FM."),

            ModelGambar("sapporo Snow Festival","Sapporo, Hokkaido", R.drawable.sapporo_snow_festival,"Tanggal : 12 Maret 2007", "Festival Salju Sapporo (さっぽろ雪まつり, Sapporo Yuki Matsuri) adalah festival salju terbesar di Jepang yang diadakan di kota Sapporo, Hokkaido. Festival ini dilangsungkan selama seminggu pada awal bulan Februari.\n" +
                    "\n" +
                    "Tenggelamkan diri dalam keajaiban ala Studio Sapporo dan temui Totoro ataupun Princess Mononoke di dunia nyata.\n" +
                    "\n" +
                    "Festival salju Sapporo pertama kali diselengarakan tahun 1950 oleh dinas pariwisata Sapporo dan pemerintah kota Sapporo, dengan sponsor surat kabar lokal Hokkai Times."),

            ModelGambar("Osaka Castle","Chuo-ku, Osaka, Jepang", R.drawable.osaka_castle,"Tanggal : 22 Januari 2001", "Istana Osaka (大坂城atau大阪城, Ōsaka-jō ) adalah istana Jepang yang terletak di Chūō-ku , Osaka , Jepang . Istana ini merupakan salah satu bangunan penting Jepang dan memainkan peran penting dalam penyatuan Jepang pada abad keenam belas pada periode Azuchi-Momoyama. \n" +
                    "\n" +
                    "Istana Osaka dimanfaatkan sebagai istana sekaligus benteng sejak zaman Azuchi Momoyama hingga zaman Edo. Istana Osaka yang ada sekarang terdiri dari menara utama yang dilindungi oleh dua lapis tembok tinggi yang dikelilingi oleh dua lapis parit, parit bagian dalam (Uchibori) dan parit bagian luar (Sotobori)."),

            ModelGambar("Nara Park","Nara", R.drawable.nara_park,"Tanggal : 25 Desember 2016", "Taman Nara (奈良公園, Nara Kōen) atau Nara Park adalah taman umum yang terletak di kota Nara, Jepang, di kaki Gunung Wakakusa, didirikan pada 1300-an dan salah satu taman tertua di Jepang.\n" +
                    "\n" +
                    "Nara, yang dulunya dikenal dengan nama Yamato, adalah salah satu area penghasil teh utama di Jepang. Teh pertama kalinya mulai diproduksi di wilayah ini 1.200 tahun yang lalu, ketika biksu legendaris Kukai membawa biji tanaman teh hitam ke Jepang dari Tiongkok.")
        )

        wisataAdapter = AdapterGambar(wisataList){ wisata ->
            val intent = Intent(this, DetailGambar::class.java)
            intent.putExtra("WISATA", wisata)
            startActivity(intent)
        }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = wisataAdapter

    }
}