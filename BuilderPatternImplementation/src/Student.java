public class Student {

    private String name;
    private int age;
    private double psp;
    private String batch;

    private Student(Builder builder){
        this.name=builder.name;
        this.age=builder.age;
    }

    public void setPsp(double psp){
        if(psp<0 || psp>10){
            throw new RuntimeException("PSP should be from 0-10");
        }
        this.psp=psp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public static Builder builder(){
        return new Builder();
    }

    public double getPsp() {
        return this.psp;
    }

    public String getBatch() {
        return this.batch;
    }

    static class Builder{
        private String name;
        private int age;

        public Builder setAge(int age){
            if(age<18){
                throw new RuntimeException("Age should be 18 or above");
            }
            this.age=age;
            return this;
        }
        public Builder setName(String name){
            if(name==null || name.isBlank()){
                throw new RuntimeException("Name cannot be empty!");
            }
            this.name=name;
            return this;
        }
        public Student build(){
            validate();
            return new Student(this);
        }
        private void validate(){
            if(name==null || name.isBlank()){
                throw new RuntimeException("Name cannot be empty!");
            }
            if(age<18){
                throw new RuntimeException("Age should be 18 or above");
            }
        }
    }

}
