//Source file: H:\\OOAD\\Assignment02\\SelectCourse.java


public class SelectCourse 
{
   public Semester theSemester;
   
   /**
   @roseuid 5470FF1302F4
    * @param semester
    */
   public SelectCourse( Semester semester )
   {
       theSemester = semester;
       System.out.println( "Message: class name: SelectCourse; methodName: Constructor" );
   }
   
   /**
   @roseuid 5470EC6302F4
    */
   public void setSemester( int semester )
   {
       System.out.println( "Message: class name: SelectCourse; methodName: setSemester" );
   }
   
   /**
   @roseuid 5470ECCA00B6
    */
   public void setOption( int option )
   {
       System.out.println( "Message: class name: SelectCourse; methodName: setOption" );
   }
   
   /**
   @roseuid 5470ECDA03B5
    */
   public void setCourseID( String courseID )
   {
       System.out.println( "Message: class name: SelectCourse; methodName: setCourseID" );
   }
   
   /**
   @roseuid 5470ED220168
    */
   public void setCourseName( String courseName )
   {
       System.out.println( "Message: class name: SelectCourse; methodName: setCourseName" );
   }
   
   /**
   @roseuid 5470ED66019C
    */
   public void setSectionID( String sectionID )
   {
       System.out.println( "Message: class name: SelectCourse; methodName: setSectionID" );
   }
   
   /**
   @roseuid 5470ED6E01B3
    */
   public void setSectionName( String sectionName )
   {
       System.out.println( "Message: class name: SelectCourse; methodName: setSectionName" );
   }
}
