package com.digitalent.anime

object AnimeData {
    private val animeNames = arrayOf(
        "Classroom Of The Elite Season 2",
        "Overlord IV",
        "Hataraku Maou-sama!! Season 2",
        "Kuro no Shoukanshi",
        "Mamahaha no Tsurego ga Motokano datta",
        "Lycoris Recoil",
        "Isekai Ojisan",
        "Engage Kiss",
        "Kakkou no Iinazuke",
        "Kumichou Musume to Sewagakari"
    )

    private val sinopsis = arrayOf(
        "Anime ini menceritakan tentang sekolah menengah atas Kiyotaka Ayanokoji," +
                " yang lebih suka menjaga dirinya sendiri daripada berteman dengan sesama siswa Kelas-D.\n" +
                "Wajar saha, Kiyotaka adalah siswa yang sebenarnya sangat cerdas, kecerdasannya pun bisa dibilang di atas rata-rata.\n" +
                "\n" +
                "Namun karena kesialan membuatnya harus terdampar di kelas D, di mana diisi oleh siswa bodoh dan berandalan yang ada di kota tersebut.",

        "Overlord adalah anime Isekai yang bertemakan game online MMORPG yang dapat membuat pemainnya bisa berpetualang. Namun sesuai namanya, salah satu tokoh utama pada anime ini memiliki kekuatan yang Overlord karena sudah mencapai level maksimal dalam game ini.\n" +
                "\n" +
                "Game tersebut bernama YggDrasil. YggDrasil merupakan game yang diluncurkan pada 2126 dan diantara game bergenre DMMO-RPG lainnya.\n" +
                "\n" +
                "Di dalam suatu Serikat yang bernama Makam Agung Nazarick. Momonga merupakan salah satu dari para pendiri Serikat tersebut. Dalam Serikat tersebut terdapat senjata Staff of Ains Ooal Gown.",

        "Cerita ini mengisahkan seorang raja iblis bernama Sadou Maou berusaha untuk menguasai dunia bernama Ente Isla tetapi, ketika berhadapan dengan Hero Emilia, terpaksa mundur melalui sebuah gerbang yang membawa mereka ke Tokyo masa kini. Untuk dapat bertahan hidup dan menemukan jalan kembali ke Ente Isla, Satan bekerja paruh waktu di sebuah restoran cepat saji bernama Mg Ronalds.\n\n" +
                "Raja Iblis Satan dan seorang jenderalnya, Alciel, pergi dari dunia Ente Isla melalui sebuah gerbang ke kota Tokyo masa kini, setelah berhadapan dengan Hero Emilia beserta rekan-rekannya." +
                " Karena rendahnya tingkat sihir di dunia modern, Satan dan Alciel berubah wujud wujud menjadi manusia. Untuk dapat bertahan hidup, Satan bekerja paruh waktu di sebuah restoran cepat saji bernama MgRonald sementara Alciel mengerjakan pekerjaan rumah tangga." +
                " Suatu hari, Satan, kini dengan nama Sadao Maou, bertemu seorang gadis yang merupakan Hero Emilia, yang kini dengan nama Emi Yusa." +
                " Cerita ini mengungkap kepribadian dari masing-masing karakter dan nilai-nilai moral yang mereka miliki.",

        "Pada awal cerita, Kelvin bereinkarnasi ke dunia isekai dengan kemampuan yang sangat luar biasa sebagai seorang Summoners. Namun dia kehilangan ingatannya.\n" +
                "\n" +
                "Pengikut pertamanya adalah sesosok dewi yang sebelumnya ditemui olehnya, Namun butuh MP yang sangat besar untuk bisa memanggilnya dalam bentuk manusia.\n\n" +
                "Dalam alur cerita awal di dunia fantasy, Kelvin mempelajari banyak hal dengan memahami kehidupan dunia yang dipenuhi dengan ilmu sihir dan pedang.\n" +
                "\n" +
                "Dia memutuskan untuk hidup dengan tenang tanpa ikut campur dalam urusan dunia tersebut.\n" +
                "\n" +
                "Namun setelah beberapa waktu, Dia menyadari bahwa di dunia nyata kehidupannya penuh dengan pertempuran. Dia adalah Gamer yang sangat haus akan pertempura.\n" +
                "\n" +
                "Mengingat masa lalunya yang merupakan seorang gamer sejati, Kelvin menjadi sangat bersemangat ketika berada di dunia fantasy.",

        "Anime Mamahaha no Tsurego ga Motokano datta menceritakan sepasang mantan kekasih yang bernama Mizuto dan Yume.\n" +
                "\n" +
                "Awalnya, hubungan keduanya berjalan seperti sepasang kekasih kebanyakan, namun lambat laun hubungan keduannya menjadi retak dan lebih sering kesal satu sama lain daripada bersemangat untuk meneruskan berpacaran\n" +
                "\n" +
                "Mizuto dan Ayume akhirnya memutuskan untuk berpisah.\n" +
                "\n" +
                "Namun, Keduanya kemudian bertemu kembali dengan cara yang tak disangka-sangka.\n" +
                "\n" +
                "Bukan sebagai seorang teman, namun mereka dipertemukan sebagai saudara tiri yang harus tinggal serumah.\n" +
                "\n" +
                "Kedua orang tua mereka meminta agar mereka bisa terus bersama dan bersikap layaknya saudara kandung.\n" +
                "\n" +
                "Termasuk berangkat sekolah bersama dan harus saling menjaga satu sama lain.",

        "Lycoris Recoil bercerita tentang agen rahasia di bawah naungan Direct Attact (DA). Organisasi ini merekrut anak yatim piatu untuk dilatih menjadi agen.\n" +
                "\n" +
                "Berfokus pada tokoh bernama Takina Inoue, dia merupakan salah satu agen dengan kemampuan mumpuni. Suatu hari, Takina membuat kesalahan fatal sehingga dia dipindahtugaskan ke sebuah 'kafe' yang menyimpan rahasia. Bersama rekan barunya, Chisato Nishikigi, Takina akan belajar banyak hal dalam hidup yang perlu Takina mengerti.",

        "Isekai Ojisan adalah anime yang mengangkat kisah dua karakter utama, yaitu 'Ojisan' bernama Yousuke Shibazaki dan keponakan laki-lakinya yang bernama Takafumi Takaoka.\n" +
                "\n" +
                "Ojisan telah mengalami koma selama 17 tahun lamanya. Suatu ketika, dia terbangun dengan berbicara menggunakan bahasa yang aneh. Dia juga ternyata mampu menggunakan sihir.\n" +
                "\n" +
                "Takafumi yang awalnya mengira bahwa pamannya gila akhirnya menyadari bahwa pamannya pernah berpindah ke isekai.",

        "Baylong City, kota buatan terapung yang diciptakan setelah penemuan sumber energi baru. Shuu, seorang pemuda yang menjalankan perusahaan kecil di sana. Kebiasaan belanjanya membuat kantongnya selalu terkuras.\n" +
                "\n" +
                "Seorang gadis bernama Kisara sering mengunjungi kantor Shuu karena mengkhawatirkannya. Kisara sekolah di SMA Baylong City dan melakukan segalanya sendiri, mulai dari mengurus dokumen pekerjaan hingga mengurus pekerjaan rumah.\n" +
                "\n" +
                "Sementara Ayano adalah senior dan mantan pacar Shuu di perusahaannya dulu.\n" +
                "\n" +
                "Begitulah kisah komedi romatis yang sedikit tak bisa tentang tiga orang yang hidup di pulau buatan di Samudra Pasifik ini dimulai.",

        "Sinopsis anime Kakkou no Iinazuke mengambil latar waktu masa SMA seorang remaja bernama Nagi Umino. Kehidupan Nagi sebenarnya biasa-biasa saja sebagaimana pria sebayanya.\n" +
                "\n" +
                "Akan tetapi, Nagi Umino selalu merasa memiliki perbedaan dengan keluarganya. Hal itu terus mengganggu pikirannya, sampai akhirnya Nagi menemukan fakta mengejutkan.\n" +
                "\n" +
                "Nagi Unimo mengetahui bahwa keluarga yang selama ini tinggal bersamanya bukanlah keluarga asli. Hal itu terjadi karena Nagi Unimo tertukar ketika masih bayi.\n" +
                "\n" +
                "Hal itu membuat Nagi Umino bertekad menemukan keluarga aslinya.",

        "Bercerita mengenai kehidupan yakuza yang terkenal dengan kesadisannya ketika menghadapi musuh, yaitu Tooru Kirishima. Seorang kaki tangan bagi Sakuragi Yakuza ini bahkan mendapat julukan 'Iblis Sakuragi'.\n" +
                "\n" +
                "Kehidupan brutal Tooru sebagai yakuza berbalik ketika dia hampir mengacaukan perjanjian damai bosnya. Tooru diberikan tugas sulit yang tak pernah dia lakukan sebelumnya, yaitu mengasuh Yaeka Sakuragi, bocah berusia tujuh tahun."
    )

    private val Rating = arrayOf(
        "8.06",
        "8.33",
        "7.13",
        "7.14",
        "6.97",
        "8.28",
        "7.98",
        "7.01",
        "7.23",
        "7.77"
    )

    private val totalEpisodes = arrayOf(
        "TV(13eps)",
        "TV(13eps)",
        "TV(12eps)",
        "TV(12eps)",
        "TV(12eps)",
        "TV(13eps)",
        "TV(13eps)",
        "TV(13eps)",
        "TV(24eps)",
        "TV(12eps)"
    )

    private val animeImage = intArrayOf(
        R.drawable.classroom_of_the_elite,
        R.drawable.overlord,
        R.drawable.hataraku,
        R.drawable.kurono_shoukanshi,
        R.drawable.mamahaha,
        R.drawable.lycoris_recoil,
        R.drawable.isekai_ojisan,
        R.drawable.engage_kiss,
        R.drawable.kakkou_no_linazuke,
        R.drawable.kumichou
    )

    private val studio = arrayOf(
        "Lerche",
        "MADHOUSE",
        "Studio 3Hz",
        "Satelight",
        "project No.9",
        "A-1 Pictures",
        "Atelier Pontdarc",
        "A-1 Pictures",
        "Shin-Ei/AnimationSynergySP",
        "feel./GAINA"
    )

    val listData: ArrayList<Data>
        get() {
            val list = arrayListOf<Data>()
            for (position in animeNames.indices) {
                val data = Data()
                data.name = animeNames[position]
                data.sinopsis = sinopsis[position]
                data.photo = animeImage[position]
                data.rating = Rating[position]
                data.tEpisodes = totalEpisodes[position]
                data.studio = studio[position]
                list.add(data)
            }
            return list
        }
}