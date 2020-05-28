
package carpimtablosudd2;


public class Carpimtablosudd2 {

   
    public static void main(String[] args) {
        carpmaislemleri(1*5);
        carpmaislemleri(2*5);
        carpmaislemleri(3*5);
        carpmaislemleri(4*5);
        carpmaislemleri(5*5);
        carpmaislemleri(6*5);
        carpmaislemleri(7*5);
        carpmaislemleri(8*5);
        carpmaislemleri(9*5);
        carpmaislemleri(10*5);
        
        /*Burada carpma değişkenine parametreleri giriyorum,
        yani ekran çıktısı olarak gözükecek kısım burada yapmış oluyorum.
        Sırayla sayılarımı yazıyorum ve çarpma işlemini uyguluyorum.
        5 ve 5'in katarını sırasıyla ekrana yazdırıyorum.
        Girmiş olduğum parametreleri kendi aralarında çarpıyor, ekrana yazdırıyor 
        ve sonra bir sonraki parametreye geçiyor.*/
    }
     public static void carpmaislemleri(int... dogan) 
  /*Değişken sayılı bir parametre olduğu için yani 
   istediğimiz sayıda parametre oluşturacapımız için, burada üç nokta (...) kullandım. 
   Bu üç nokta sayesinde girmiş olduğumuz parametreler yani sayılar ard arda sıralanıp,
   kendi aralarında çarpılacak.
   Yani biz burada bir dizi oluşturmuş oluyoruz. Bu üç nokta (...) bu işlevi görüyor.
   */     
{
int carpma=1;
/*Bu sayıların toplanabilmesi için carpma adında bir değişken tanımladım.
carpma=1 diyerek de çarpma işleminin 1'den başlamasını sağladım,
eğer carpma=0 deseydim bütün değereler 0 olarak ekrana yazılacaktı.
Bu yüzden mantık olarak 1'den başlatıyoruz.*/

for(int sayı: dogan)
 /*for döndüsünün içinde oluşturduğum sayı değişkeni dönecek,
 Bu sayı değişkeni de değerini dogan isminde adlandırıdığım parametreler içinden alıcak.
Yani dogan diye adlandlandırdığım parametreyi kullanarak parametreleri tek tek alamasını sağlıyorum.
 */
{
carpma*=sayı;
/*
Bu şekilde yaparak da parametlerin yani girmiş olduğum sayıların çarpılmasını sağlıyorum. 
*/
}
    System.out.println(+carpma);
  /*Sonucu ekrana yazdırması için de System.out.println kullanarak,
    carpma değişkeninin işlemlerini ekrana yazırması için parantezin içine yazıyorum.
    Kısaca sonucu ekrana yazdıracak.
  */  
}
}
