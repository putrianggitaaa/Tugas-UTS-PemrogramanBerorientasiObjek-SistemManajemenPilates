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

# KODE YANG MENERAPKAN POLYMORPHISM
Polymorphism diterapkan pada Superclass nya yaitu JenisKelas.java serta subclass nya yaitu JenisKelasPublik,java. JenisKelasPrivate.java, dan JenisKelasPrivateVip.java. Penjelasannya adalah sebagai berikut:

## JenisKelas.java
<img width="582" height="171" alt="image" src="https://github.com/user-attachments/assets/70ba908b-c96a-4aab-bb7f-d900dd7226d4" />

Class JenisKelas menjadi class induk (superclass) yang memiliki method tampilkanInfo(). Method ini digunakan untuk menampilkan informasi dasar dari suatu jenis kelas, seperti ID jenis, nama jenis, level, dan durasi. Method tampilkanInfo() pada class ini menjadi dasar yang kemudian dapat digunakan dan disesuaikan oleh class turunannya.


## JenisKelasPublik.java

<img width="575" height="142" alt="image" src="https://github.com/user-attachments/assets/d2e07363-121e-4f3f-befa-3e41ea8acf6b" />

Class JenisKelasPublik menerapkan override pada method tampilkanInfo() dari class JenisKelas. Method tersebut ditulis kembali agar dapat menampilkan informasi yang lebih spesifik untuk kelas publik, termasuk atribut tambahan berupa kapasitas peserta. Dengan demikian, ketika tampilkanInfo() dipanggil pada objek JenisKelasPublik, informasi yang ditampilkan akan menyesuaikan karakteristik kelas publik

## JenisKelasPrivate.java

<img width="592" height="137" alt="image" src="https://github.com/user-attachments/assets/da0c5a4c-3d02-4116-995d-6404ca7fd105" />

Class JenisKelasPrivate juga menerapkan override pada method tampilkanInfo() yang berasal dari class JenisKelas. Method tersebut disesuaikan untuk menampilkan informasi khusus kelas private, yaitu tambahan berupa jenis sesi. Class ini tetap dapat menggunakan informasi dasar dari JenisKelas, tetapi menambahkan informasi yang sesuai dengan karakteristik kelas private.

## JenisKelasPrivateVip.java

<img width="662" height="146" alt="image" src="https://github.com/user-attachments/assets/6c6ced96-bb74-474f-ab2b-5b270b429f09" />

Class JenisKelasPrivateVip menerapkan override pada method tampilkanInfo() yang diwarisi dari JenisKelasPrivate. Method tersebut digunakan untuk menampilkan informasi kelas private VIP dengan tambahan atribut fasilitas VIP. Class ini juga dapat menampilkan informasi dari class induknya sehingga informasi dasar kelas private tetap ditampilkan bersama informasi fasilitas khusus VIP.

# PENERAPAN PERCABANGAN
Penerapan percabangan dapat ditemukan pada class service.java, terutama pada bagian menu utama dan submenu pengelolaan data seperti Member, Instruktur, Jenis Kelas, dan Daftar Kelas. Percabangan digunakan untuk memeriksa pilihan pengguna, sehingga setiap pilihan akan menjalankan proses yang berbeda. Misalnya, ketika pengguna memilih menu untuk menambahkan data, program akan menjalankan method penambahan data, sedangkan ketika pengguna memilih menu untuk melihat, mengubah, atau menghapus data, program akan menjalankan proses sesuai pilihan tersebut. Dengan demikian, percabangan berfungsi sebagai pengatur alur program agar sistem dapat memberikan respons yang sesuai terhadap input pengguna.

Selain pada menu, percabangan juga diterapkan dalam proses validasi dan pengelolaan data. Pada InputValidator.java, kondisi digunakan untuk memeriksa apakah input yang diberikan pengguna sudah memenuhi ketentuan, seperti pilihan menu, angka, jenis kelamin, nomor telepon, maupun status kelas. Jika input sesuai dengan kondisi yang ditentukan, program dapat melanjutkan proses, sedangkan jika tidak sesuai, pengguna akan diminta memasukkan data kembali. Pada pengelolaan kelas, percabangan juga digunakan untuk menentukan kondisi berdasarkan data yang tersedia, misalnya ketika ID member, instruktur, atau jenis kelas ditemukan atau tidak ditemukan. Jika data ditemukan, proses dapat dilanjutkan, sedangkan jika tidak ditemukan, program memberikan informasi kepada pengguna dan meminta input yang sesuai. Penerapan percabangan tersebut membuat program mampu mengambil keputusan berdasarkan kondisi tertentu dan membantu mencegah proses pengolahan data yang tidak valid.

# PENERAPAN PERULANGAN

Salah satu penerapannya terdapat pada proses menu utama dan submenu pada class service.java. Perulangan memungkinkan program untuk tetap berjalan dan menampilkan kembali menu setelah pengguna selesai melakukan suatu proses, sehingga pengguna dapat melakukan pengelolaan data secara berulang tanpa harus menjalankan program dari awal. Dengan penerapan ini, pengguna dapat menambahkan, melihat, mengubah, maupun menghapus data member, instruktur, jenis kelas, dan daftar kelas dalam satu kali program dijalankan. Hal ini membuat alur sistem menjadi lebih interaktif dan memudahkan pengguna dalam melakukan beberapa proses secara berurutan.

Perulangan juga diterapkan pada proses validasi input melalui class InputValidator.java. Ketika pengguna memasukkan data yang tidak sesuai dengan ketentuan, program akan meminta pengguna untuk memasukkan kembali data tersebut sampai input yang diberikan valid.

Selain itu, perulangan digunakan ketika program menampilkan kumpulan data yang tersimpan dalam collection. Data seperti member, instruktur, jenis kelas, dan daftar kelas perlu ditampilkan satu per satu sehingga setiap elemen dalam collection dapat diproses dan ditampilkan kepada pengguna. Dengan menggunakan perulangan, program tidak perlu menuliskan perintah untuk menampilkan setiap objek secara manual. Penerapan ini membuat kode menjadi lebih efisien dan memungkinkan program menampilkan seluruh data yang jumlahnya dapat berubah sesuai dengan data yang ditambahkan oleh pengguna.

# DOKUMENTASI ALUR PROGRAM
## Tampilan Menu Utama
<img width="577" height="288" alt="image" src="https://github.com/user-attachments/assets/67f32051-90ad-465d-9f5d-79f7a73315c0" />

Pada bagian ini pengguna akan diberikan beberapa pilihan menu yang dapat digunakan untuk mengelola data. Terdapat menu member yang berfungsi untuk mengelola data member, menu Instruktur yang digunakan untuk mengelola data instruktur, menu jenis kelas yang digunakan untuk mengelola jenis kelas yang tersedia, serta menu pendaftaran kelas yang digunakan untuk mengelola daftar kelas yang akan dilaksanakan di studio pilates ini. Program ini dilengkapi input validator yang apabila kita menginput menu diluar dari 1-5, maka akan muncul pemberitahuan agar memilih menu dengan benar.

## Menu Member

<img width="517" height="316" alt="image" src="https://github.com/user-attachments/assets/2973e5a5-7fae-4dd9-851f-3a9502622c48" />

Menu member berisi 2 sub menu yaitu lihat dan tambah member yang fungsinya sebagai berikut:

* **1. Tambah Member**
<img width="522" height="347" alt="image" src="https://github.com/user-attachments/assets/edccefd8-0ad0-4341-ad5d-74300ba800dd" />

Pada sub menu ini, pengguna dapat menambahkan member baru yang akan bergabung untuk mengikuti kelas di studio dengan memasukkan data-data pribadi member tersebut. Program ini dilengkapi dengan input validator sehingga pengguna tidak akan dapat memasukkan ID yang sama secara berulang dan tidak dapat mengosongkan nama atribut.

* **2. Lihat Member**

<img width="465" height="412" alt="image" src="https://github.com/user-attachments/assets/e56367f0-355c-4853-8fe8-cc309a52e681" />

Pada sub menu ini, pengguna dapat melihat daftar member yang telah terdaftar pada sistem.

* **3. Kembali**
  
<img width="555" height="318" alt="image" src="https://github.com/user-attachments/assets/01bba284-6a2b-4023-b99a-cbac8ae948cf" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.

## Menu Instruktur 

<img width="515" height="218" alt="image" src="https://github.com/user-attachments/assets/3656bc5d-e70e-4bdd-aa13-0e557f69b323" />

Menu instruktur berisi 2 sub menu yaitu lihat dan tambah instruktur yang fungsinya sebagai berikut:

* **1. Tambah Instruktur**
* 
<img width="651" height="365" alt="image" src="https://github.com/user-attachments/assets/be79c176-708b-4fc3-8f99-49e79d7732c6" />

Pada sub menu ini, pengguna dapat menambahkan instruktur baru yang akan bergabung untuk memandu kelas di studio dengan memasukkan data-data pribadi instruktur tersebut. Program ini dilengkapi dengan input validator sehingga pengguna tidak akan dapat memasukkan ID yang sama secara berulang dan tidak dapat mengosongkan nama atribut.

* **2. Lihat Instruktur**
 
<img width="507" height="476" alt="image" src="https://github.com/user-attachments/assets/285b46e9-7695-4b27-b241-eec659b2a3eb" />


Pada sub menu ini, pengguna dapat melihat daftar instruktur yang telah terdaftar pada sistem.


* **3. Kembali**
  
<img width="552" height="315" alt="image" src="https://github.com/user-attachments/assets/7ac885e3-3600-4454-98d4-736de68be65e" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.

## Menu Jenis Kelas

<img width="516" height="272" alt="image" src="https://github.com/user-attachments/assets/2ae54e85-bf2e-4173-b5f4-284872defcbb" />

Menu jenis kelas berisi 2 sub menu yaitu lihat dan tambah jenis kelas yang fungsinya sebagai berikut:

* **1. Tambah Jenis Kelas**
<img width="702" height="417" alt="image" src="https://github.com/user-attachments/assets/c8c38a92-dc94-4c9f-ab47-1a43c93557c0" />

Pada sub menu ini, pengguna dapat menambahkan jenis kelas baru yang akan dilaksanakan di studio dengan memasukkan informasi dari jenis kelas tersebut tersebut. Program ini dilengkapi dengan input validator sehingga pengguna tidak akan dapat memasukkan ID yang sama secara berulang dan tidak dapat mengosongkan nama atribut.

* **2. Lihat Jenis Kelas**

<img width="696" height="876" alt="image" src="https://github.com/user-attachments/assets/f3c27a40-391c-48cb-8e73-a26936d11930" />

Pada sub menu ini, pengguna dapat melihat daftar jenis kelas yang telah terdaftar pada sistem.

* **3. Kembali**

<img width="546" height="377" alt="image" src="https://github.com/user-attachments/assets/1d490767-eb7f-4a8c-9ebf-508eade14206" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.

## Menu Daftar Kelas

<img width="548" height="328" alt="image" src="https://github.com/user-attachments/assets/1e608503-5e55-4b8f-b0d8-fecf0746386e" />

Menu pendaftaran kelas berisi 4 sub menu yaitu lihat, tambah, hapus, dan perbarui daftar kelas yang fungsinya sebagai berikut:

* **1. Lihat Daftar Kelas**
  
<img width="537" height="425" alt="image" src="https://github.com/user-attachments/assets/51137513-a2df-4eda-b88c-65217cd1c0db" />

Pada sub menu ini, pengguna dapat melihat daftar kelas yang telah terdaftar pada sistem.

* **2. Pendaftaran Kelas**

<img width="541" height="266" alt="image" src="https://github.com/user-attachments/assets/068f9fb7-29bf-4c0a-8a68-f0013873e5a5" />

Pada sub menu ini, sistem akan menampilkan id member, id instruktur, dan id jenis kelas agar pengguna dapat memilih member, instruktur, dan jenis kelas apa yang ingin ditambahkan. Setelah itu, akan muncul output dimana kelas berhasil ditambahkan dan tertera identitas member, instruktur, dan jenis kelas yang akan dilaksanakan. Program ini dilengkapi dengan input validator sehingga pengguna tidak akan dapat memasukkan ID yang sama secara berulang dan tidak dapat mengosongkan nama atribut.


* **3. Hapus Kelas**

<img width="515" height="123" alt="image" src="https://github.com/user-attachments/assets/ecb5e232-bf47-4858-8f3c-1d020bcd5bdf" />

Pada sub menu ini, sistem akan mengarahkan pengguna untuk menginput ID kelas yang akan dihapus. Selanjutnya, sistem akan menghapus kelas sesuai dengan ID yang di input oleh pengguna.



* **4. Update Status Kelas**

<img width="510" height="367" alt="image" src="https://github.com/user-attachments/assets/397177c5-7ea5-4947-86c3-03d4b49eb5e1" />

Pada sub menu ini, sistem dapat memperbarui status dari daftar kelas. Sub menu ini dapat digunakan untuk memperbarui status dari kelas yang telah didaftarkan dari Terjadwal menjadi Selesai atau Batal agar memudahkan pengelola dalam monitoring daftar kelasnya.

* **5. Kembali**


<img width="557" height="292" alt="image" src="https://github.com/user-attachments/assets/eae03350-5399-47c7-bf6d-6cb21ce164a8" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.

## Keluar


<img width="561" height="271" alt="image" src="https://github.com/user-attachments/assets/da60a3b3-f86e-450b-b367-f0de127bcb85" />

Pada menu ini, pengguna akan diarahkan untuk keluar dari sistem.
