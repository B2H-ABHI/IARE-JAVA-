//Create two row and 3 columns array
public class Array1 {
    public static void main(String[] args) {
int[][] marks ={
{2,3,6},
{7,3,8},
{10,20,30}
};

//Display the array
for (int i = 0; i<marks.length; i++) {
for (int j = 0; j<marks[i].length; j++) {

System.out.print(marks[i][j] + " ");
 }
 System.out.println();
}
// now sum all the elements in the array
 int sum = 0;
for (int i = 0; i<marks.length; i++) {
for (int j = 0; j<marks[i].length; j++) {
sum += marks[i][j];
}
}
 System.out.println("Sum of all elements: " + sum);
System.out.println("Before update =" + marks[2][2]);
marks[2][2] = 22;
System.out.println("After update=" + marks[2][2]);

//updating first row

marks[0][0]=12;
marks[0][1]=19;
marks[0][2]=34;

//display new array
for (int i = 0; i<marks.length; i++) {
for (int j = 0; j<marks[i].length; j++) {

System.out.print(marks[i][j] + " ");
 }
 System.out.println();
}




}
}

