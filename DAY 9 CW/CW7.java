
//demonstrate immutability using concat() and toUpperCase() 
public class CW7 {

    public static void main(String[] args){
        String name = "java";
        //we have to change it to JAVA PROGRAMMING

        System.out.println("Original: " + name);
        String combinedName = name.concat(" programming");
        String uppercaseName = combinedName.toUpperCase();
        System.out.println("Unchanged original: " + name);
        System.out.println("Updated: " + uppercaseName);
        
    }
}