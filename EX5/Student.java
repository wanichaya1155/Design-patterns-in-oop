public class Student {

    private String name;
    private String university; 
    //option
    private int age;

    public  Student(StudentBuilder studentBuilder ){
        this.name = studentBuilder.name;
        this.university = studentBuilder.university;
        this.age = studentBuilder.age;
    }
    
    public static class StudentBuilder {

        private final String name;
        private final String university; 
        //option
        private int age;

        public StudentBuilder (String name,String university){
            this.name = name;
            this.university = university;
        }
        public StudentBuilder age (int age){
            this.age = age;
            return this;

        }
        public Student  build(){
            return new Student(this);
        }
        
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("name: " + name + "\n");
        sb.append("university: "+ university+"\n" );
        if (this.age != 0) {
        sb.append("age: '" + age + "'\n");
        }
        return sb.toString();

    }
    
}
