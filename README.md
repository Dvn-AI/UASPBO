                                                            HASIL UAS PBO 

1. Pertama-tama buat project baru di Netbeans, lalu buat class jFrameForm Mahasiswa, Login, dan DaftarAkun. Setelah itu buat entity class dari database(tutorialnya ada di repositories saya pada Pertemuan13). 
2. Kemudian tambahkan Library yang dibutuhkan seperti dibawah ini.
   
![image](https://github.com/user-attachments/assets/4ca70ca3-210e-4fe5-8eaa-dccec34e670f)

3. Pindah ke pgAdmin4, buat tabel mahasiswa dengan kolom:
   - nama
   - nim
   - alamat
   - asal_sma
   - nama_orangtua
   Serta tabel login dengan kolom:
   - username
   - password
     
4. Kembali ke NetBeans, sekarang desain form dari class Mahasiswa, Login, dan DaftarAkun. Berikut contoh desainnya:
   - Daftar Akun
   ![image](https://github.com/user-attachments/assets/602cbb0c-eaac-4887-a745-ecb10363ade5)

   - Login
   ![image](https://github.com/user-attachments/assets/e3f4845b-5568-43f2-a8e2-8c5b8efd152c)
  
   - Mahasiswa
   ![image](https://github.com/user-attachments/assets/62561139-aaf7-4186-a311-839ddfbfbedd)

5. Nah, untuk halaman DaftarAkun. Saya membuat method validatePassword untuk mengecek apakah password yang diinput oleh pengguna sesuai dengan format yang diatur oleh kita. Hal ini dilakukan untuk menghindari penginputan password yang asal-asalan. Kemudian saya menggunakan 2 label yang saya ubah iconnya menjadi gambar mata terbuka dan tertutup dengan format jpg/png. Icon tersebut berfungsi untuk melihat dan menyembunyikan karakter password yang sudah diketik oleh pengguna sehingga privasi terjamin. Kemudian jika pengguna mengklik Button Daftar, maka akan otomatis diarahkan ke halaman Login.
   
6. Nah, untuk halaman Login. Hampir sama seperti DaftarAkun, bedanya ada pada sistemnya. Sistem pada login adalah dimana programnya difokuskan untuk mencocokkan data yang sudah ada di database dengan karakter yang diketik oleh pengguna. Sehingga tidak akan bisa masuk jika username atau password salah.
   
7. Nah, untuk Mahasiswa. Disini saya mengaplikasikan CRUD beserta Upload dan Cetak. Untuk Upload sendiri, tujuannya adalah untuk menampilkan data dari file .csv yang sudah diformat sedemikian rupa di Ms.Excel sehingga pengguna hanya perlu memasukkan data di excel lalu mengupload nya melalui NetBeans. Tidak perlu susah payah input data satu persatu. Lalu untuk Cetak, setelah data yang diinginkan sudah terinput semuanya kedalam aplikasi, pengguna dapat mencetak data yang ada kalau-kalau data tersebut memang ditujukan untuk keperluan tertentu.
   
9. Nah, untuk tutorial pembuatan file .csv nya ada di repository saya pada Pertemuan11. Sedangkan untuk tuorial pembuatan Jasper Report untuk Cetaknya ada pada Pertemuan10.
10. Sekian Terimakasih 😇
     








































































