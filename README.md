
<p>menampilkan dialog pada saat mengklik tombol, kemudian hasil nya ditampilkan ActivityMain. lalu di button.</p>

  button.setOnClickListener {
  
            val phone = MasukTelepon.text.toString().trim()
            if (isValidPhoneNumber(phone)) {
                Toast.makeText(this, "Nomor valid: $phone", Toast.LENGTH_SHORT).show()
            } else {
                MasukTelepon.error = "Nomor telepon tidak valid"
            }
        }
    }
    private fun isValidPhoneNumber(phone: String): Boolean {
        return phone.matches(Regex("^\\+?[0-9]{10,15}$"))
    }
<p>________________________________________________________________________________________________________________________________________</p>
📸<h1>Screenshot fitur pada toast</h1>
![alt text](https://github.com/aditianurwansyah/Testing/blob/main/IMG_20250416_103014.jpg?raw=true) 
![alt text](https://github.com/aditianurwansyah/Testing/blob/main/IMG_20250416_103039.jpg?raw=true) 
<br><h1>⚒️ Teknologi yang digunakan</h1></br>  
<p>Bahasa Pemrograman: Kotlin</p>
<p>IDE: Android Studio</p>
<p>Komponen UI:</p>
<p>InputPhoneNumber</p>
<p>Toast</p>
TextEdit 
