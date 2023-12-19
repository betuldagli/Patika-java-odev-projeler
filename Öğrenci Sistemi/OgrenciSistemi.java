
public class OgrenciSistemi {
    public static void main(String[] args) {
       Course matematik= new Course("Matematik","MAT001","mat");
       Course kimya= new Course("Kimya","KMY001","kmy");
       Course biyoloji= new Course("Biyoloji","BYJ001","byj");

       Ogretmen t1=new Ogretmen("Ömer","847505621","mat");
       Ogretmen t2=new Ogretmen("Ali","48942458","kmy");
       Ogretmen t3=new Ogretmen("Selin","1763466346","byj");

       matematik.AddTeacher(t1);
       kimya.AddTeacher(t2);
       biyoloji.AddTeacher(t3);

       Ogrenci std1=new Ogrenci("Betül","859",1,matematik,kimya,biyoloji);
       std1.addBulkExamNote(95,87,92);
       std1.isPass();

       Ogrenci std2=new Ogrenci("Nevra","976",1,matematik,kimya,biyoloji);
       std2.addBulkExamNote(85,89,96);
       std2.isPass();

       Ogrenci std3=new Ogrenci("Emine","345",1,matematik,kimya,biyoloji);
       std3.addBulkExamNote(93,90,91);
       std3.isPass();
    }
}