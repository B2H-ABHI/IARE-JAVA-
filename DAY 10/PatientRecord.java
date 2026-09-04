public class PatientRecord {
    public static void main(String[] args) {

        // Create patient information using StringBuffer
        StringBuffer record = new StringBuffer("Patient: Priya");

        System.out.println("== PATIENT RECORD ==");
        System.out.println("Original Record : " + record);

        // Append ward number
        record.append(" Ward : 305");

        // Insert doctor's name
        record.insert(record.indexOf(" Ward"),
                " Doctor : Dr. Kumar");

        // Delete unnecessary extra space
        int index = record.indexOf(" Ward");
        record.delete(index, index + 1);

        // Display updated record
        System.out.println("Updated Record : " + record);
    }
}