package Prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent(){

    }

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        student.setIq(this.iq);
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

}
