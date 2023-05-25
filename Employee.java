public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        double vergi;
        if(salary<1000){
            vergi=0;
        }
        else{
            vergi=(salary*0.03);
        }
        return vergi;
    }

    public int bonus(){
        int bonus=0;
        if(workHours>40){
            bonus=30*(workHours-40);
        }
        return bonus;
    }

    public int raiseSalary(){
        int newSalary=0;
        if((2021-hireYear)<10){
           newSalary= (int) (salary*0.05);
        }
        if((2021-hireYear)>9 && (2021-hireYear)<20){
            newSalary=(int) (salary*0.1);
        }
        if((2021-hireYear)>19){
            newSalary=(int)(salary*0.15);
        }
        return newSalary;
    }

    public String toString(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Calışma saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+(salary+bonus()-tax()));
        System.out.println("Toplam maaş: "+(salary+raiseSalary()));

        return null;
    }
}