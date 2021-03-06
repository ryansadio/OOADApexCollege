//Source file: H:\\OOAD\\Assignment02\\Course.java


public class Course 
{
   private String courseName;
   private String couseID;
   public DBaccess theDBaccess;
   
   /**
   @roseuid 5470FECD0296
    */
   public Course( DBaccess dBaccess, String courseID, String courseName )
   {
       theDBaccess = dBaccess;
       this.couseID = courseID;
       this.courseName = courseName;
       System.out.println( "Message: class name: Course; methodName: Constructor" );
   }
   
   /**
   @roseuid 5470E6AC0332
    */
   public int getSemester()
   {
       System.out.println( "Message: class name: Course; methodName: getSemester" );
       return 3;
   }
   
   /**
   @roseuid 5470E6E900C7
    */
   public String getCourseSelection()
   {
       System.out.println( "Message: class name: Course; methodName: getCourseSelection" );
       return "Your selection";
   }

    public void removeCourseSection( String courseSectionID )
    {
        System.out.println( "Message: class name: Course; methodName: removeCourseSection" );
        theDBaccess.removeCourseSection( courseSectionID );
    }
   
   /**
   @roseuid 5470E71702FC
    */
   public String getCourseName( String courseID )
   {
       System.out.println( "Message: class name: Course; methodName: getCourseName" );
       return theDBaccess.queryCourseName( courseID );
   }
   
   /**
   @roseuid 5470E7200023
    */
   public String getCourseNumber( String courseName )
   {
       System.out.println( "Message: class name: Course; methodName: getCourseNumber" );
       return theDBaccess.queryCourseNumber( courseName );
   }

    public void addCourseSection( CourseSection courseSection )
    {
        theDBaccess.addCourseSection( courseSection );
    }
}
