/**Ders Sınıfı Özellikleri :

 Nitelikler : isim,kod,önek,not,Öğretmen
 Metotlar : Course() , addTeacher() , printTeacher()*/
public class Course {
    Ogretmen DersOgretmeni;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
    }

    public void AddTeacher(Ogretmen t){
        if(this.prefix.equals(t.branch)){
            this.DersOgretmeni=t;
            System.out.println("İşlem başarılı.");
        }
        else{
            System.out.println(t.name+" Akademisyeni bu dersi veremez.");
        }
    }

    public void PrintTeacher(){
        if(DersOgretmeni!=null){
            System.out.println(this.name+" dersin akademisyeni: "+DersOgretmeni.name);
        }
        else{
            System.out.println(this.name+" dersine öğretmen atanmamıştır.");
        }
    }
}