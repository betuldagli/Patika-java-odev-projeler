import java.util.Scanner;
/**
 * sisteme giriş için kullanıcı adı ve şifre alan program kodunu yazınız.
 * Ödev
 Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı
 girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
 sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
public class SistemGiris {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String userName,password,newPassword;
        int control=0,control1=0,secim;
        System.out.println("Kullanıcı adınızı giriniz:");
        userName = girdi.nextLine();

        System.out.println("şifrenizi giriniz:");
        password = girdi.nextLine();

        if(userName.equals("betuldagli")){
            control = 1;
        }
        if(password.equals("1234")){
            control1=1;
        }
        if(control1==1 && control==1 ){
            System.out.println("Giriş Başarılı");
        }
        if(control==0){
            System.out.println("Kullanıcı adını hatalı girdiniz");
        }
        if(control1==0){
            System.out.println("şifreyi hatalı girdiniz:\nşifrenizi mi unuttunuz?\n");
            System.out.println("şifrenizi değiştirmek için 1 değiştirmek istemiyorsanız 2 giriniz:");
            secim = girdi.nextInt();

            switch(secim){
                case 1:
                    System.out.println("yeni şifrenizi giriniz.\nyeni şifrenizin eskisi ile aynı olmamasına dikkat ediniz");
                    newPassword = girdi.next();

                    if(newPassword.equals("1234")){
                        System.out.println("yeni şifre eski şifre ile ayni olamaz.");
                    }
                    else{
                        System.out.println("şifre oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("şifreniz değiştirilmedi.");
            }
        }

    }
}