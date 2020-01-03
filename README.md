# FungsiDanMethod_BagianII__JV
Bahan Ajar Fundamental Pemrograman Java: Mengenal Fungsi Dan Method - Bagian II.<br><br>
<img src="https://github.com/RizkyKhapidsyah/FungsiDanMethod_BagianII__JV/blob/master/result/001.PNG">
<img src="https://github.com/RizkyKhapidsyah/FungsiDanMethod_BagianII__JV/blob/master/result/002.PNG"><br><br>
- Lihat <a href="https://github.com/RizkyKhapidsyah/FungsiDanMethod_BagianII__JV/tree/master/src/com/rizkykhapidsyah/fdmii">Source Code.</a><br><br>

-----

## <i>"Jutaan orang bahkan tidak menyadari bahwa sebenarnya mereka telah menggunakan salah satu method ketika membuat program 'Hello World' dengan pemrograman Java."</i>

---

Saat anda ingin mencetak sesuatu ke console maka anda akan menggunakan sintaks System.out.println();. Nah println(); merupakan salah satu method pada java. Nantinya, kita akan belajar bagaimana cara membuat sebuah method kita sendiri. Namun sebelum itu kita akan membahas pengertian method terlebih dahulu. Method dalam pemrograman Java adalah sebuah blok program terpisah (diluar program utama) yang kita gunakan untuk menyelesaikan masalah khusus. Tujuannya: memecah program kompleks menjadi bagian-bagian kecil sehingga nantinya dapat kita gunakan secara berulang-ulang tanpa harus menulis baris kode yang sama. Jika anda pernah mendengar istilah prosedur dan fungsi atau mungkin juga function, pada dasarnya sama. Namun dalam Java kita akan menyebutnya sebagai Method.

## Bagaimana Cara Membuat Method?

Berikut adalah struktur dari sebuah method:

      modifier returnType namaMethod (Parameter List) {
         // method body
      }

Penjelasan singkat:

<code>modifier</code> : Untuk menentukan hak akses terhadap method.<br>
<code>returnType</code> : Ada dua jenis method yaitu: method <code>void</code> dan method <code>return</code>.<br>
<code>namaMethod</code> : Ini adalah nama method. Sesuai keinginan anda.<br>
<code>Parameter</code> : Untuk meng-oper sebuah nilai. Bersifat opsional.<br>

Dan berikut adalah bentuk method pada java:

      public void cetakPesan(){
        System.out.println("Belajar Java bersama kodedasar.com");
      }

Nah dari contoh diatas kita membuat sebuah method bernama cetakPesan tanpa menggunakan parameter. Lalu tugasnya untuk mencetak sebuah pesan.

>> Catatan: Dalam method kita bisa menggunakan parameter maupun tanpa menggunakan parameter. Hal ini tergantung kebutuhan program yang kita kerjakan.

## Method Void (Tanpa Nilai Kembali)

Diawal pembahasan kita sudah menyinggung bahwa ada dua jenis method dan pada bagian ini kita akan membahas tentang method void yang tidak memiliki nilai kembali. Method jenis ini fungsinya seperti prosedur pada bahasa pascal. Untuk lebih jelasnya disini saya akan membuat contoh program java menggunakan method void. Silahkan perhatikan baris kode berikut ini:

      public class MethodVoid {
        public static String tulisan = "Selamat Belajar Method pada Java!";

        public static void cetakTulisan(){
          System.out.println(tulisan);
        }

        public static void cetakNama(String nama){
          System.out.println("Nama saya adalah "+nama);
        }

        public static void main(String[] args){
          cetakTulisan();
          cetakNama("Rizky Khapidsyah");
        }
      }

>> Catatan: keyword static berfungsi agar variabel atau method yang kita buat dapat digunakan langsung dalam program utama tanpa harus membuat obyek. 

Dalam program diatas kita membuat sebuah kelas bernama MethodVoid. Pertama kita mendeklarasikan variabel tulisan dengan tipe data String. Kemudian, kita membuat dua method void bernama cetakTulisan dan cetakNama. Yang membedakannya adalah penggunaan parameter pada method cetakNama.

Terakhir, kita memanggil method teadi kedalam program utama. Jika kita lihat lagi, method <code>cetakTulisan()</code> akan menampilkan nilai dari variabel tulisan dimana sebelumnya telah kita deklarasikan langsung nilainya sekaligus. Sedangkan pada method <code>cetakNama()</code> kita akan mengoper sebuah nilai didalam parameter, yang kemudian akan disimpan dalam variabel nama lalu dicetak.

## Method dengan <code>Return</code> Value

Selanjutnya kita akan membahas tentang method return. Yang dimaksud dengan method return artinya kita akan mengembalikan sebuah nilai pada fungsi atau method kita.

Lalu nilai kembalian tersebut sesuai dengan tipe data yang digunakan. Untuk lebih mudahnya mari kita lihat contoh program berikut ini:

      public class MethodReturn {
      
        public static String nama = "Rizky Khapidsyah";

        public static String getNama(){
          return nama;
        }

        public static int hitungUmur(int lahir, int sekarang){
          int umur = sekarang - lahir;
          return umur;
        }

        public static void main(String[] args){

          String namaSaya = getNama();
          System.out.println("Nama saya: "+namaSaya);

          int umurSaya = hitungUmur(1991, 2020);
          System.out.println("Umur saya: "+umurSaya);
        }

      }

Dalam program diatas kita membuat kelas bernama MethodReturn dimana kita telah mendeklarasikan variabel nama dan method getNama() juga method <code>hitungUmur()</code>. Sama seperti method void kita boleh menggunakan parameter maupun tanpa parameter hal ini disesuikan dengan program yang kita butuhkan. Jika kita perhatikan dalam program diatas kita menggunakan keyword return untuk tiap method. Namun tipe data untuk tiap method berbeda sesuai kebutuhan kita. Nah fungsi <code>return</code> adalah untuk mengembalikan nilai kedalam fungsi itu sendiri. Intinya nilai yang dikembalikan akan disimpan dalam nama method. Inilah sebabnya kita dapat mencetak atau memindakan nilai dari method <code>return</code> kedalam variabel. Contohnya kita memindahkan nilai <code>getNama()</code> kedalam variabel <code>namaSaya</code>. Meskipun demikian, sebenarnya saya bisa saja langsung mencetaknya.


# Kesimpulan

Dalam praktiknya, method void akan sering kita jumpai untuk memberikan sebuah nilai terhadapat variabel atau yang nantinya akan kita kenal dengan sebutan Setter. Sedangkan method return akan sering kita jumpai untuk mengambil sebuah nilai dari sebuah variabel atau yang kita sebuat dengan method Getter. Tambahan, intinya kita menggunakan sebuah parameter jika ingin mengoper sebuah nilai yang kemudian akan kita olah kedalam sebuah method baik void maupun return.


-----
Referensi Artikel:<br>
- <a href="https://kodedasar.com">KodeDasar</a>.<br><br>
Referensi Source Code: <br>
<a href="https://www.youtube.com/user/faqihzamukhlish"> Kelas Terbuka </a> dan <a href="https://github.com/kelasterbuka"> Kelas Terbuka (Repository)</a>. Created by <a href="https://github.com/faqihza">Faqihza Mukhlish.</a> Thanks To: <a href="https://www.youtube.com/channel/UCRGHjysoCemh4y7tCJQs30w/about">Faqihza Mukhlish.</a><br>

-----
All Source Code is Modified.
