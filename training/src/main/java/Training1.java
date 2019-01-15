import org.joda.time.LocalDate;

public class Training1 {

   static class Employee {
        private int id;
       private String name;

       public static String companyName;

        public Employee(){

            companyName =  "XYC";
        }

       public Employee setId(int id) {
           this.id = id;
           return this;
       }

       public Employee setName(String name) {
           this.name = name;
           return this;
       }
   }

    public static void main(String[] args) {
     Training1 training1 = new Training1();
     training1.function1();

    }


    void function1(){
        String str ="xyz";
        str ="abc";


        Employee e = new Employee();
        e.name = "some name";
        e.id = 20;
        int id= 30;

        Employee e1 = new Employee();
        e1.name = "some name";
        e1.id = 20;
        e1.companyName = "set by E1";


        update(e,str,id);
        System.out.println(e.id);//20
        System.out.println(e.name);//20
        System.out.println(str);
        System.out.println(id);
        System.out.println("company name "+e1.companyName);
        System.out.println("company name "+e.companyName);

    }

    static void update(Employee e,String str, int id){

        e.id = 10;
        e.name = "changed name";
        e.companyName = "changed company by update method";
        str = "changed";
        id=70;
    }


}
