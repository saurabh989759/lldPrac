package designPattern.prototype;

import lombok.Setter;

@Setter
public class Student implements Prototype<Student>{

    private String name;
    private int age;
    private String gender;
    private String batch ;
    private double avgBatchPsp ;

    public Student(){

    }

    public Student(Student student){
        this.name = student.name ;
        this.age = student.age ;
        this.gender = student.gender ;



        this.batch = student.batch ;
        this.avgBatchPsp = student.avgBatchPsp ;
    }
    @Override
    public Student clone() throws CloneNotSupportedException {
        return null;
    }
}
