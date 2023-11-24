import java.util.*;
class Main
{
   static String calculateGrade(int average) 
{
    String grade=" ";//To store the grades depend on average
    if(average>=90 && average<=100)
      {
          grade="O"; 
      }
     else if(average>=80 && average<90)
      {
          grade="A";
      }
      else if(average>=70 && average<80)
      {
          grade="B";
      }
      else if(average>=60 && average<70)
      {
          grade="C";
      }
      else if(average>=50 && average<60)
      {
          grade="D";
      }
      else if(average<50)
      {
          grade="F";
      }
      
      return grade;
}
public static void main(String args[])
{
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number of subjects:");
      int n= sc.nextInt(); //To get the no of subjects from the user
      System.out.println();
      int total=0; //Intialize the total to zero for adding purpose
      System.out.println("Enter the marks of each subjects out of 100:");
      for(int i=0;i<n;i++) //To get the marks for n subjects from the user
      {
         int mark = sc.nextInt(); //To get mark of the each subject
         total+=mark; // To add the total mark
      }
      int average = (total/n);  //Formula to calculate average 
      System.out.println();
      System.out.println("Total: "+total);
      System.out.println("Average: "+average);
      System.out.println("Grade: "+calculateGrade(average)); //Call the function by passing the parameter to calculate the grade for the average and store it 
      
      
}
}
