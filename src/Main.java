public class Main {

    public static void main(String[] args)
    {


        DBaccess dBaccess = new DBaccess();

        Semester semester = new Semester( dBaccess, 1 );
        semester.getSemester();

        SelectCourse selectCourse = new SelectCourse( semester );
        selectCourse.setCourseID( "COMP3900" );
        selectCourse.setCourseName( "Project" );
        selectCourse.setSectionID( "B" );
        selectCourse.setSectionName( "Web and Mobile" );
        selectCourse.setOption( 1 );
        selectCourse.setSemester( 4 );

        CourseSection courseSection = new CourseSection( dBaccess );
        courseSection.getCourseSection();
        courseSection.getCourseSectionInfo();
        courseSection.linkCourseSection( "C" );


        Course course = new Course( dBaccess, "Data Communications", "COMP3721");
        course.getSemester();
        course.getCourseName( "COMP3721" );
        course.getCourseNumber( "Data Communications" );
        course.getCourseSelection();
        course.removeCourseSection( "COMP3721 ");
        course.addCourseSection( courseSection );

        Schedule schedule = new Schedule( dBaccess );
        schedule.getCourseSectionInfo();

        Print print = new Print( schedule );
        print.print( schedule.getSchedule() );


    }
}
