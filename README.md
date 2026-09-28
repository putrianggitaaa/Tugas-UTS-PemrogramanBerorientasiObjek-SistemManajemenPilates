# UTS PEMROGRAMAN BERORIENTASI OBJEK

Nama: Putri Anggita Melasari

Kelas: A'25

NIM: 2509116010

# SISTEM MANAJEMEN PILATES
Sistem Manajemen Pilates merupakan program berbasis bahasa pemrograman Java yang dibuat untuk membantu pengelolaan data pada studio Pilates secara sederhana. 
Program memungkinkan pengelola studio pilates untuk mengelola beberapa data utama, yaitu data member yang mengikuti kelas pilates, data instruktur yang memandu kelas pilates, jenis kelas pilates yang dapat diikuti, serta pendaftaran kelas. 
Pengelola dapat menambahkan dan melihat data member, instruktur, serta jenis kelas. Selain itu, program juga menyediakan pengelolaan daftar kelas yang mencakup pendaftaran kelas, penghapusan kelas, dan pembaruan status kelas.

# STRUKTUR DAN HIERARKI CLASS
Berikut adalah berbagai _class_ yang digunakan dalam program beserta penjelasan class yang bertindak sebagai _superclass_ dan _subclass_:
## SistemPilates.java
Class ini berfungsi sebagai _class main_ atau _entry point_ yang digunakan untuk menjalankan program utama.
## service.java
Class ini berfungsi sebagai proses pengolahan data dan menampung method untuk menambahkan, menampilkan, menghapus, dan memperbarui data sesuai dengan fitur yang tersedia. 
## InputValidator.java
Class ini berfungsi sebagai class yang menampung method untuk memvalidasi input angka, teks, nomor telepon, pilihan menu, jenis kelamin, dan status kelas. Dengan adanya class ini, proses validasi input dapat dipisahkan dari proses pengelolaan data sehingga kode pada class service menjadi lebih terstruktur.
## Member.java
Class ini berfungsi sebagai class yang merepresentasikan data member pada program, berisi identitas pribadi dari member tersebut.
## Instruktur.java
Class ini berfungsi sebagai class yang merepresentasikan data instruktur pada program, berisi identitas pribadi dari instruktur tersebut.
## JenisKelas.java (SuperClass)
Class ini berfungsi sebagai _superclass_ yang digunakan untuk enyimpan atribut umum dari jenis kelas Pilates. Atribut tersebut meliputi ID jenis, nama jenis, level, dan durasi kelas. Class ini menjadi dasar bagi class JenisKelasPrivate dan JenisKelasPublik sehingga kedua jenis kelas tersebut dapat menggunakan atribut umum yang sama tanpa harus mendefinisikannya kembali.
## JenisKelasPrivate.java (SubClass) 
Class ini berfungsi sebagai _subclass_ dari JenisKelas.java yang digunakan untuk merepresentasikan kelas Pilates private. Class ini mewarisi atribut umum dari JenisKelas dan memiliki atribut tambahan berupa jenisSesi. Atribut tersebut digunakan untuk membedakan bentuk sesi pada kelas private.
## JenisKelasPrivateVip.java (SubClass Tipe 2)
Class ini berfungsi sebagai _subclass_ dari JenisKelasPrivate.java yang digunakan untuk merepresentasikan jenis kelas turunan dari kelas private. 
Class ini bertindak sebagai _subclass_ tipe 2 yang mewarisi class JenisKelasPrivate
## JenisKelasPublik.java (SubClass)
Class ini berfungsi sebagai _subclass_ dari JenisKelas.java yang digunakan untuk merepresentasikan kelas Pilates publik. Selain mewarisi atribut dari JenisKelas, class ini memiliki atribut tambahan berupa kapasitas untuk menentukan jumlah peserta yang dapat mengikuti kelas publik tersebut.
## DaftarKelas.java
Class ini berfungsi untuk menyimpan informasi mengenai pendaftaran atau jadwal kelas yang diikuti oleh member. Class ini menghubungkan beberapa data, yaitu ID member, ID instruktur, ID jenis kelas, tanggal kelas, jam kelas, ruangan, dan status kelas. Dengan adanya class ini, data member, instruktur, dan jenis kelas dapat dihubungkan dalam satu data pendaftaran kelas.

# KODE YANG MENERAPKAN INHERITANCE
Penerapan inheritance terdapat pada class JenisKelas yang bertindak sebagai superclass, JenisKelasPrivate dan JenisKelasPublik yang bertindak sebagai subclass, serta JenisKelasPrivateVip yang bertindak sebagai subclass tipe 2 dari JenisKelasPrivate. Penjelasannya adalah sebagai berikut:

## JenisKelas.java

<img width="870" height="868" alt="image" src="https://github.com/user-attachments/assets/7dd8d1f3-b589-49c6-ae23-dc14c8b25f4c" />

Class JenisKelas berperan sebagai superclass yang menjadi dasar bagi jenis kelas Pilates lainnya. Class ini memiliki beberapa atribut umum, yaitu idJenis, namaJenis, level, dan durasi. Atribut tersebut merupakan informasi yang dibutuhkan oleh setiap jenis kelas Pilates. Class JenisKelas juga memiliki constructor yang digunakan untuk menginisialisasi atribut umum yang nantinya dapat diwariskan kepada subclass. Hal ini memungkinkan JenisKelasPrivate dan JenisKelasPublik menggunakan atribut yang sama tanpa perlu mendeklarasikan kembali atribut tersebut pada masing-masing class. Dengan demikian, JenisKelas menjadi induk (superclass), sedangkan JenisKelasPrivate dan JenisKelasPublik menjadi class turunan atau subclass.

## JenisKelasPublik.java

<img width="768" height="526" alt="image" src="https://github.com/user-attachments/assets/4fdef32c-d1c8-4104-a26e-6bc5f4fa0b7e" />

Keyword extends menunjukkan bahwa JenisKelasPublik merupakan subclass dari JenisKelas. Class ini mewarisi atribut dan method yang dimiliki oleh superclass JenisKelas, seperti idJenis, namaJenis, level, dan durasi. JenisKelasPublik kemudian memiliki atribut tambahan yaitu Atribut kapasitas yang merupakan karakteristik khusus yang hanya ditambahkan pada class JenisKelasPublik untuk menentukan jumlah peserta dalam kelas publik. Inheritance juga diterapkan pada constructor melalui penggunaan Keyword super yang digunakan untuk memanggil constructor dari superclass JenisKelas. Dengan demikian, nilai idJenis, namaJenis, level, dan durasi dapat diteruskan dan diinisialisasi oleh constructor pada class JenisKelas. Setelah itu, kapasitas diinisialisasi sebagai atribut khusus milik JenisKelasPublik.

## JenisKelasPrivate.java

<img width="775" height="483" alt="image" src="https://github.com/user-attachments/assets/8df5fec7-2e94-4182-bfb6-9bb5f47bc266" />

Keyword extends menunjukkan bahwa JenisKelasPrivate merupakan subclass dari JenisKelas. Dengan demikian, JenisKelasPrivate dapat mewarisi atribut dan method yang dimiliki oleh class JenisKelas. Selain atribut yang diwarisi, JenisKelasPrivate memiliki atribut khusus yaitu jenisSesi yang digunakan untuk menyimpan jenis sesi pada kelas private. Inheritance juga diterapkan pada constructor melalui penggunaan Keyword super yang digunakan untuk memanggil constructor dari superclass JenisKelas. Dengan demikian, nilai idJenis, namaJenis, level, dan durasi dapat diteruskan dan diinisialisasi oleh constructor pada class JenisKelas. Setelah itu, jenisSesi diinisialisasi sebagai atribut khusus milik JenisKelasPrivate.


## JenisKelasPrivateVip.java

<img width="867" height="478" alt="image" src="https://github.com/user-attachments/assets/2b9e9fc1-0343-4d53-84e6-5cfa377a4228" />

JenisKelasPrivateVip merupakan turunan dari class JenisKelasPrivate sehingga dapat mewarisi atribut dan method yang dimiliki oleh class tersebut. Class ini kemudian menambahkan atribut khusus berupa fasilitas untuk menyimpan fasilitas tambahan pada kelas Pilates VIP. Constructor menggunakan super() untuk memanggil constructor dari class induk dan mengisi data yang diwariskan, kemudian this.fasilitas digunakan untuk menyimpan data fasilitas khusus VIP. Dengan inheritance ini, class JenisKelasPrivateVip dapat menggunakan kembali fitur dari JenisKelasPrivate tanpa harus menuliskan ulang kode yang sama.
