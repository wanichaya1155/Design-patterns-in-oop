public class App {
    public static void main(String[] args) {
        Student AjSarunSohandsome = new Student.StudentBuilder("AJSARUN","KMITL")
            .age(20)
            .build();
        System.out.println(AjSarunSohandsome);
    }
    
}
