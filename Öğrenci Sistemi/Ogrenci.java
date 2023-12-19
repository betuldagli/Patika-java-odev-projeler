/**Öğrenci Sınıfı Özellikleri :

 Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
 Metotlar : Student(),addBulkExamNote(), isPass(), calcAvarage(), printNote()*/
public class Ogrenci {
    String name;
    String stuNo;
    int classes;
    Course matematik;
    Course kimya;
    Course biyoloji;
    double avarage;
    boolean isPass;

    Ogrenci (String name,String stuNo,int classes,Course matematik,Course kimya,Course biyoloji){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.matematik=matematik;
        this.kimya=kimya;
        this.biyoloji=biyoloji;
        this.isPass=false;
    }

    public void addBulkExamNote (int matematik,int kimya,int biyoloji){
        if(matematik>=0 && matematik<=100){
            this.matematik.note=matematik;
        }
        if(kimya>=0 && kimya<=100){
            this.kimya.note=kimya;
        }
        if(biyoloji>=0 && biyoloji<=100){
            this.biyoloji.note=biyoloji;
        }
    }

    public void isPass(){
        if(this.matematik.note==0 ||this.kimya.note==0 || this.biyoloji.note==0 ){
            System.out.println("Notlar tam olarak girilmemiş.");
        }
        else {
            this.isPass=isCheckPass();
            printNote();
            System.out.println("ortalamanız: "+this.avarage);
            if(this.isPass){
                System.out.println("Sınıfı Geçti.");
            }
            else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAvarage(){
        this.avarage=(this.matematik.note+this.kimya.note+this.biyoloji.note)/3;
    }


    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik Notu: " + this.matematik.note);
        System.out.println("Kimya Notu: " + this.kimya.note);
        System.out.println("Biyoloji Notu: " + this.biyoloji.note);
    }

}