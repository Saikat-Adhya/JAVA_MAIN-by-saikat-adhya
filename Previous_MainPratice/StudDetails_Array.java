public class StudDetails_Array {
    int rollno;
    int marks;
    String name;

    //Constructor using
    public StudDetails_Array(int rollno, int marks, String name){
        this.rollno=rollno;
        this.marks=marks;
        this.name=name;


    }
    //Creating a method
    public void ShowDetails(){
        System.out.println("This is rollno: "+rollno);
        System.out.println("This marks: " +marks);
        System.out.println("This name is: "+name);

    }
    
    public static void main(String[] args) {

        //Creating an array of three(3) students.
        StudDetails_Array [] students = new StudDetails_Array[3];

        //Creating an obj and adding them in to array
        students[0] = new StudDetails_Array(1, 90, "ok");
        students[1] = new StudDetails_Array(2, 92, "okk");
        students[2] = new StudDetails_Array(3, 91, "okkk");


        //Display all the details of the student
        for(StudDetails_Array stud:students){
            stud.ShowDetails();
        }

       
    }
    
    
}
