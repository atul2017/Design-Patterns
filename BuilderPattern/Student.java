package BuilderPattern;

public class Student {
    private String name;
    private String batchName;
    private String univName;
    private int age;
    private String phoneNumber;
    private double psp;
    public int gradeYear;

    public Student(Builder builder) throws Exception{
        if(builder.getAge()>100){
            throw new Exception("Age is above 100 years");
        }
        this.batchName = builder.getBatchName();
        this.psp = builder.getPsp();
        this.name = builder.getName();
        this.gradeYear = builder.getGradeYear();
        this.age = builder.getAge();
        this.univName = builder.getUnivName();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

}
