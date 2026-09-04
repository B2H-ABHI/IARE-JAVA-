public class NewsEditor {
    public static void main(String[] args) {

        // Create headline using StringBuilder
        StringBuilder headline = new StringBuilder("Heavy Rain in City");

        System.out.println("==NEWS EDITOR ==");
        System.out.println("Original Headline : " + headline);

        // Append today's update
        headline.append(" Tomorrow");
        System.out.println("After Append : " + headline);

        // Insert "Breaking:"
        headline.insert(0, "Breaking: ");
        System.out.println("After Insert : " + headline);

        // Replace "in" with "Across"
        int start = headline.indexOf("in");
        headline.replace(start, start + 2, "Across");
        System.out.println("After Replace : " + headline);

        // Reverse the final headline
        headline.reverse();
        System.out.println("Reversed Headline : " + headline);
    }
}
