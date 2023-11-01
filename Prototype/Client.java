package Prototype;

public class Client {

    public static void fillRegistry(StudentRegistry registry){
        Student st = new Student();
        st.setBatch("April-22");
        st.setAverageBatchPSP(80.34);
        registry.register("April-22",st);

        IntelligentStudent is = new IntelligentStudent();
        is.setIq(80);
        is.setAverageBatchPSP(84);
        is.setBatch("May-22");
        registry.register("May-22",is);
    }

    public static void main(String[] args){
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student atul = registry.get("April-22").clone();
        atul.setName("Atul Patel");
        atul.setAge(42);

        Student ajay = registry.get("May-22").clone();
        ajay.setName("Ajay Patel");
        ajay.setAge(36);
        System.out.println("Stop here");
    }
}
