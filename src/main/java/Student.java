import java.util.ArrayList;

public class Student {

    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        setId(id);
        setName(name);
        this.grades = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        //average = ALL GRADES ADDED UP / HOW MANY GRADES THERE ARE;
        double sum = 0;

        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        return sum / grades.size();
    }
}
