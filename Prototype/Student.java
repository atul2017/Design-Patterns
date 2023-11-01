package Prototype;

public class Student implements Prototype {
    private int age;
    private String name;
    private double psp;
    private String batch;
    private double averageBatchPSP;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAverageBatchPSP() {
        return averageBatchPSP;
    }

    public void setAverageBatchPSP(double averageBatchPSP) {
        this.averageBatchPSP = averageBatchPSP;
    }

    public Student(){

    }
    public Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.psp = st.psp;
        this.batch = st.batch;
        this.psp = st.psp;
    }
    @Override
    public Student clone() {
        return new Student(this);
    }
}
