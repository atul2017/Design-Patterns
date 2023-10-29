package BuilderPattern;

public class Client {
    public static void main(String[] args) throws Exception {

//        Option 1
//        Builder builder = Student.getBuilder();
//        builder.setName("Atul Patel");
//        builder.setAge(42);
//        builder.setBatchName("November 22");
//        builder.setPsp(80.23);
//        builder.setUnivName("VTU");
//        //Student student = new Student(builder);
//        Student student = builder.build();
//        System.out.println("student->"+student.toString());


//        Option 2 - More improved
          Student student = Student.getBuilder()
                  .setName("Atul Patel")
                  .setAge(42)
                  .setBatchName("November 22")
                  .setPsp(80.23)
                  .setUnivName("VTU")
                  .build();
          System.out.println("student->"+student.toString());

    }
}
