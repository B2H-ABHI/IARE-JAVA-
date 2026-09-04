abstract class HospitalDepartmentBase {

    protected String departmentName;

    public HospitalDepartmentBase(String departmentName) {
        this.departmentName = departmentName;
    }

    public abstract void provideTreatment();
}

class Cardiology extends HospitalDepartmentBase {

    public Cardiology() {
        super("Cardiology");
    }

    public void provideTreatment() {
        System.out.println("== CARDIOLOGY ==");
        System.out.println("Department : " + departmentName);
        System.out.println("Treatment : Heart Care Services");
    }
}

class Neurology extends HospitalDepartmentBase {

    public Neurology() {
        super("Neurology");
    }

    public void provideTreatment() {
        System.out.println("== NEUROLOGY ==");
        System.out.println("Department : " + departmentName);
        System.out.println("Treatment : Brain and Nerve Care");
    }
}

public class HospitalDepartment {

    public static void main(String[] args) {

        Cardiology cardiology = new Cardiology();
        cardiology.provideTreatment();

        System.out.println();

        Neurology neurology = new Neurology();
        neurology.provideTreatment();
    }
}

