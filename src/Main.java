import java.util.List;

public class Main {

   public static void main(String[] args)
            throws CloneNotSupportedException {

        Employees employes = new Employees();
        employes.loaddata();

        Employees emps1 = (Employees) employes.clone();
        Employees emps2 = (Employees) employes.clone();
        List<String> list = emps1.getEmpList();
        list.add("Ebrahim");

        emps2.getEmpList().remove("Mohamed");

        System.out.println("First list: "+employes.getEmpList());
        System.out.println("emps1 list: "+list);
        System.out.println("emps2 list: "+emps2.getEmpList());

    }
}
