//Source file: H:\\OOAD\\Assignment02\\Schedule.java


public class Schedule 
{
   private int courseName;
   private int courseID;
   private int courseSectionID;
   private int numDays;
   private int location;
   private int time;
   private String scheduleStr;
   public DBaccess theDBaccess;
   
   /**
   @roseuid 5470FEFC01FB
    */
   public Schedule( DBaccess dBaccess )
   {
       theDBaccess = dBaccess;
       System.out.println( "Message: class name: Schedule; methodName: Constructor" );
   }
   
   /**
   @roseuid 5470EA1200B2
    */
   public String getCourseSectionInfo()
   {
       System.out.println( "Message: class name: Schedule; methodName: getCourseSectionInfo" );
       return theDBaccess.queryCourseSectionInfo();
   }
   
   /**
   @roseuid 5470EA460247
    */
   public String getSchedule()
   {
       System.out.println( "Message: class name: Schedule; methodName: getSchedule" );
       scheduleStr = theDBaccess.querySchedule();
       return scheduleStr;
   }
}
