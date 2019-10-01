Bu uygulamada Naive Bayes teoreminin bir örnek üzerinde gerçekleştirilmesi yapılmaya çalışılmıştır. Kısaca Naive Bayes, birbirine bağlı olayların olduğu bir kümeden bazı sonuçların elde edilmesi olasılıklarını hesaplamaya yardımcı olur. Örnek ile anlatmaya çalışalım.
Örnek;
    Hava Durumu Sıcaklık  Nem
    Yağmurlu    15        Yüksek
    Yağmurlu    10        Orta
    Bulutlu     5         Düşük
    Bulutlu     15        Yüksek
    Güneşli     5         Orta
    Güneşli     10        Yüksek
    Güneşli     15        Yüksek
    Yağmurlu    5         Orta
    
 Yukarıdaki gibi birbiriyle ilişkili olan bir tablomuz olsun. Sorumuz "Güneşli" bir günde nemin "Yüksek" olma olasılığı nedir? (P(Yüksek|Güneşli) = ?)
 
 
 Formül;
            P(A|B) =   (P(B|A)P(A))/P(B)
        P(A|B) = B olayı gerçekleştiğinde A olayının gerçekleşme olasılığı
        P(A) = A olayının gerçekleşme olasılığı
        P(B|A) = A olayı gerçekleştiğinde B olayının gerçekleşme olasılığı
        P(B) = B olayının gerçekleşme olasılığı

Çözüm için öncelikle bir frekans tablosu ve buna bağlı olarak bir olasılık tablosunun oluşturulması gerekmektedir. bunun için Hava durumu/Nem, Sıcaklık/Nem gibi ikililer olacak şekilde bir frekans tablosu oluşturulmalıdır.
        
                                    NEM
                              Düşük Orta  Yüksek  Toplam
                    Yağmurlu    0     2     1       3
        HAVA DURUMU Güneşli     0     1     2       3
                    Bulutlu     1     0     1       2
                    Toplam      1     3     4       8
     Yukarıdaki gibi frekans tablosu oluşturulur.  Bu tabloya göre de olasılık tablosu oluşturulur.
     
                                    NEM
                              Düşük Orta  Yüksek  Toplam
                    Yağmurlu    0/1   2/3   1/4     3/8     =>> Toplam sütunundaki 3/8 değeri P(Yağmurlu) olasılığını ifade eder.
        HAVA DURUMU Güneşli     0/1   1/3   2/4     3/8     =>> Toplam sütunundaki 3/8 değeri P(Güneşli) olasılığını ifade eder.
                    Bulutlu     1/1   0/3   1/4     2/8     =>> Toplam sütunundaki 3/8 değeri P(Bulutlu) olasılığını ifade eder.
                    Toplam      1/8   3/8   4/8     
                            P(Düşük) P(Orta) P(Yüksek)

                Yukarıdaki tabloda 2/3=0,66 değeri de Yağmurlu bir havada Nemin Düşük olma olasılığıdır.
                
      Bu değerler elde edildikten sonra formüldeki yerlerine konulduğunda;
          P(Yüksek|Güneşli) = P(Güneşli|Yüksek).P(Yüksek)/P(Güneşli)
                            = (0,5).(0,5)/(0,375)
                            = 0,66  şeklinde bir sonuç bulunur.




Yukarda anlatıldığı şekilde Naive Bayes teoreminin Java dilinde geliştirilmesi işlemi yapılmıştır. Bunun içinsırasıyla;
  1- Verilerin Bir dosyadan okunması,                                         (Bu işlem tamamlandı)
  2- Okunan verilerden frekans tablosunun oluşturulması,                      (Bu işlem tamamlandı)
  3- Frekans tablosundan Olasılık tablosu(Likelihood) oluşturulması,          (Bu işlem üzerinde çalışma devam ediyor)
  4- Naive Bayes formülü ile olasılığın hesaplanması                          (Bu işlem üzerinde çalışma devam ediyor)
  
  Adımları gerçekleştirilmek istenmiştir.
