# TugasE-learning
Tugas yang berisikan input control di implementasikan matakuliah Pemrograman Mobile 1
<p>_____________________________________________________________________________________________________________</p>
👤 Identitas 
<p>NPM   : 23552011329</p> 
<p>Nama  : Aditia Nurwansyah</p> 
<p>Kelas : TIF RP 23 CNS A</p>  
<p>_____________________________________________________________________________________________________________</p> 

<p>_____________________________________________________________________________________________________________</p>
📌 Deskripsi Aplikasi
<p>Aplikasi android ini berisikan untuk menampilkan input phone number dan toast ketika sudah memasukan nomor telepon menggunakan kontrol input</p> 
<p>InputPhonenumber. dan Toast.</p> 
<p>____________________________________________________________________________________________________________</p> 
<p>✅ Fitur yang Diimplementasikan</p>
<p>📱 Input phone number (memasukan nomor telepon)</p>
<p>🔔 Toast (memberikan notifikasi valid atau tidak nya memasukan nomor telepon)</p> 
<p>____________________________________________________________________________________________________________</p>
<p>🧩 Penjelasan fitur dan kode 🔍</p> 
<h1>1. Input Phone Number</h1> 
<p>Menampilkan dialog masukan nomor, kemudian hasil nya di tampilkan ActivityMain. lalu di EditText.</p>
 <p>val MasukTelepon = findViewById<EditText>(R.id.etphoneNumber)</p> 
 <p>val button = findViewById<Button>(R.id.button_main)</p> 
<p>____________________________________________________________________________________________________________</p>
📸##Screenshot fitur input phone number 
![56fe9256-ad93-4b06-b6dc-158a91dd80b5](https://github.com/user-attachments/assets/13c43ba9-7f34-4357-9390-e0340cfb59bd)


<h1>2. Toast</h1>
<p>menampilkan dialog pada saat mengklik tombol, kemudian hasil nya ditampilkan ActivityMain. lalu di button.</p>

  button.setOnClickListener {
  
            val phone = MasukTelepon.text.toString().trim()
            if (isValidPhoneNumber(phone)) {
                Toast.makeText(this, "Nomor valid: $phone", Toast.LENGTH_SHORT).show()
            } else {
                MasukTelepon.error = "Nomor telepon tidak valid"
            }
        }
    } private fun isValidPhoneNumber(phone: String): Boolean {
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
