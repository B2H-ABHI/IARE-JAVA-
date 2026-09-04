public class NewsHeadline {
public static void main(String[] args) {
// Create headline using StringBuilder
StringBuilder headline = new StringBuilder("City Marathon Scheduled");
System.out.println("==NEWS HEADLINE ==");
System.out.println("Original Headline : " + headline);
// Append the latest news update

headline.append(" Tomorrow");
// Insert &quot;Breaking:&quot; at the beginning
headline.insert(0, "Breaking: ");
// Display the final headline
System.out.println("Updated Headline : " + headline);
}
}
