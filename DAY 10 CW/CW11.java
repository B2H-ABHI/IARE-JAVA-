//CREATE A STRING BUFFER CONTAINING "JAVA", append "PROGRAMMING", and  then append "LANGUAGE"
public class CW11 {
    
    public static void main(String[] args) {
        //Creating Buffer
        StringBuffer sb =  new StringBuffer(5);//StringBuffer automatically increases it's capacity when the data becomes larger than initial capacity
        //add first word
        sb.append("Java");
        //add space
        sb.append(" ");
        //add second word
        sb.append ("Programming");
        //add space
        sb.append (" ");
        //add third word
        sb.append ("Language");
        System.out.println(sb);
        //display data
        System.out.println("String: " + sb);
        //display length
        System.out.println("Length: " + sb.length());
        //display capacity
        System.out.println("Capacity: " + sb.capacity()); //even though given capacity was 5, java automatically incraeses it according to need..... 
    }
}
    

