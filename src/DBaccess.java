//Source file: H:\\OOAD\\Assignment02\\DBaccess.java


public class DBaccess 
{
    private String courseName = "Object Oriented Analysis and Design";
    private String courseID = "COMP3711";
    private String courseSectionID = "A";
    private int numDays = 80;
    private String location = "SE12-319";
    private String time = "08:30-11:30";
    private String scheduleStr;
    private CourseSection courseSection;

   /**
   @roseuid 5470FED602BC
    */
   public DBaccess() 
   {
       System.out.println( "Message: class name: DBaccess; methodName: Constructor" );
   }
   
   /**
   @roseuid 5470EB120242
    */
   public int querySemester()
   {
       System.out.println( "Message: class name: DBaccess; methodName: querySemester" );
       return 3;
   }
   
   /**
   @roseuid 5470EB2D01E8
    */
   public String queryCourseSection()
   {
       System.out.println( "Message: class name: DBaccess; methodName: queryCourseSection" );
       return courseSectionID;
   }
   
   /**
   @roseuid 5470EB38007F
    */
   public void addCourseSection( CourseSection courseSectionID )
   {
       System.out.println( "Message: class name: DBaccess; methodName: addCourseSection" );
       this.courseSection = courseSection;
   }
   
   /**
   @roseuid 5470EB5100BE
    */
   public void removeCourseSection( String courseSectionID )
   {
       System.out.println( "Message: class name: DBaccess; methodName: removeCourseSection" );
   }
   
   /**
   @roseuid 5470EB5A020E
    */
   public String queryCourseName()
   {
       System.out.println( "Message: class name: DBaccess; methodName: queryCourseName" );
       return courseName;
   }
   
   /**
   @roseuid 5470EB6503BD
    */
   public String queryCourseNumber()
   {
       System.out.println( "Message: class name: DBaccess; methodName: queryCourseNumber" );
       return courseID;
   }
   
   /**
   @roseuid 5470EB830153
    */
   public String queryCourseSectionInfo()
   {
       System.out.println( "Message: class name: DBaccess; methodName: queryCourseSectionInfo" );
       return "Course ID: " + courseID + " \nCourse Name: " + courseSectionID + " \nCourse Section: " + courseSectionID;
   }
   
   /**
   @roseuid 5470EC04032A
    */
   public String querySchedule()
   {
       System.out.println( "Message: class name: DBaccess; methodName: querySchedule" );
       return "Schedule";
   }
}
