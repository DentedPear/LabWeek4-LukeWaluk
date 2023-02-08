import java.util.Random;
public class Main {


    public static void main(String[] args) {

        System.out.println(sqaurebox(1,1,1));
        System.out.println(tempature(72));
        System.out.println(rafleticket());
        System.out.println(coursegrade(25, 15,
                                        10, 25, 25));
    }


    public static double sqaurebox(double width, double length, double height) {
        System.out.println("Below_Me_Is_SqaureBoxes");
        return width*length*height;
    }

    public static double tempature(double farenheight) {
        System.out.println("Below_Me_Is_Farenheight");
        return farenheight*1.8+32;
    }

    public static double rafleticket() {
        System.out.println("Below_Me_Is_Rafle_Tickets");
        Random rand = new Random();
        return (rand.nextInt(1000));
        //return rand.nextInt();
    }

    public static double coursegrade(double ProblemSetAvarage, double WritingAvarage,
                                     double FinalPaperGrade, double MidtermExamGrade,
                                     double FinalExamGrade)
    {
        System.out.println("Below_Me_Is_Course_Grades.");

        return (ProblemSetAvarage+WritingAvarage+FinalPaperGrade+MidtermExamGrade+FinalExamGrade/100*100);
    }




}
