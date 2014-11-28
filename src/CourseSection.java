//Source file: H:\\OOAD\\Assignment02\\CourseSection.java


public class CourseSection 
{
   private String sectionID;
   private String sectionName;
   private String courseID;
   public DBaccess theDBaccess;
   
   /**
   @roseuid 5470FF05024F
    */
   public CourseSection( DBaccess dBaccess )
   {
       theDBaccess = dBaccess;
       System.out.println( "Message: class name: CourseSection; methodName: Constructor" );
   }
   
   /**
   @roseuid 5470E7900114
    */
   public String getCourseSection()
   {
       System.out.println( "Message: class name: CourseSection; methodName: getCourseSection" );
       return theDBaccess.queryCourseSection();
   }
   
   /**
   @roseuid 5470E7A5035A
    */
   public void linkCourseSection( String courseSection )
   {
       System.out.println( "Message: class name: CourseSection; methodName: linkCourseSection" );
   }
   
   /**
   @roseuid 5470E7C00039
    */
   public String getCourseSectionInfo()
   {
       System.out.println( "Message: class name: CourseSection; methodName: getCourseSectionInfo" );
       return theDBaccess.queryCourseSectionInfo();
   }
}
