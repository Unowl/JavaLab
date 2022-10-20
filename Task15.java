import java.util.ArrayList;
public class Task15
{
    public static class Student {

        String name;
        int group;
        int course;
        double[] score;
   
        Student(String name, int group, int course, double[] score){
	        this.course = course;
	        this.group = group;
	        this.name = name;
	        this.score = score;
        }
   
        public boolean Next_course(){
	        double mean_score = 0;
	        for(int i = 0; i < this.score.length; i++){
		        mean_score += this.score[i];
	        }
	   
	        mean_score = mean_score / this.score.length;
	   
	        if(mean_score < 3 ){
		        return false;
	        }
	        this.course++;
		    return true;
	   
    }
	   
    }
    static void printStudents(ArrayList<Student> students, int course){
	   
	    for(int i = 0; i < students.size(); i++)
	    {
		    if(students.get(i).course == course)
		    {
			    System.out.println(students.get(i).name);
		    }
	    }      
    }
    
    public static void main(String[] arguments) throws Exception { 
  
        ArrayList <Student> students = new ArrayList <Student>();	   
	    students.add(new Student("Student1", 3, 1, new double[] {2,2,3}));
	    students.add(new Student("Student2", 2, 2, new double[] {3,4,5} ));
	    students.add(new Student("Student3", 1, 3, new double[] {4,4,5}));
	    
	    int len = students.size();
	   
	   for(int i = 0; i < len; i++)
	   {
		   if(!students.get(i).Next_course())
		   {
			   students.remove(i);
			   len--;
			   i--;
		   }
	   }
	   printStudents(students, 4);

    }
}
