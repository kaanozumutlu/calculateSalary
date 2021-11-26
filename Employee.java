public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax=0.0;
    int bonus=0;
    double rSalary=0;


    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public void calTax(){
        if(this.salary<1000){
            System.out.println("Vergiye tabi degilsiniz!");
        }
        if(this.salary>1000){
            this.tax=salary*0.03;
            this.salary-=this.tax;

        }
    }
    public void calBonus() {
        if (this.workHours > 40) {

            for (int i = 1; i <= (this.workHours - 40); i++) {
                this.bonus += 30;
            }

         this.salary+=this.bonus;

        }
    }
    public void raiseSalary(){
            int presentYear=2021;
            if(presentYear-this.hireYear<=10){
                this.rSalary+=this.salary*0.05;
                this.salary+=this.rSalary;

            }
            if((presentYear-this.hireYear)>9 && (presentYear-this.hireYear)<20){
                this.rSalary+=this.salary*0.1;
                this.salary+=this.rSalary;
            }
            if((presentYear-this.hireYear)>19){
                this.rSalary+=this.salary*0.15;
                this.salary+=this.rSalary;
            }
        }
    public void toStrng(){
        System.out.println("Adi:" +this.name);
        System.out.println("Maasi: "+this.salary);
        System.out.println("Calisma Saati: "+this.workHours);
        System.out.println("Baslangic Yili: "+this.hireYear);
        System.out.println("Vergi: "+this.tax);
        System.out.println("Bonus: "+this.bonus);
        System.out.println("Maas Artisi: "+this.rSalary);
        System.out.println("Vergi ve Bonuslarla Maas: "+(this.salary-this.tax+this.bonus));
        System.out.println("Toplam maas: "+(this.salary+this.rSalary));
    }
}
