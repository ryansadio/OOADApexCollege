//Source file: H:\\OOAD\\Assignment02\\Semester.java


public class Semester 
{
   private int semesterID;
   public DBaccess theDBaccess;
   public CourseSection theCourseSection[];
   
   /**
   @roseuid 5470FF0D0003
    * @param i
    */
   public Semester( DBaccess dBaccess, int i )
   {
       theDBaccess = dBaccess;
       semesterID = i;
       System.out.println( "Message: class name: Semester; methodName: Constructor" );
   }
   
   /**
   @roseuid 5470EA7700DC
    */
   public int getSemester()
   {
       System.out.println( "Message: class name: Semester; methodName: getSemester" );
       return theDBaccess.querySemester();
   }
}
