package BuilderPattern;

public class Builder {
    private String name;
    private String batchName;
    private String univName;
    private int age;
    private String phoneNumber;
    private double psp;
    public int gradeYear;

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public String getBatchName() {
        return batchName;
    }

    public Builder setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    public String getUnivName() {
        return univName;
    }

    public Builder setUnivName(String univName) {
        this.univName = univName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public double getPsp() {
        return psp;
    }

    public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public Builder setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
        return this;
    }

    public Student build() throws Exception{
        return new Student(this);
    }
}
