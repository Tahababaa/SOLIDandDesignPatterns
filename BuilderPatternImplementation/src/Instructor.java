public class Instructor {
    private String name;
    private String email;
    private  int age;
    private boolean isWorking;
    private String companyAttributes;

    private Instructor(Builder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.companyAttributes=builder.companyAttributes;
        this.email=builder.email;
        this.isWorking=builder.isWorking;
    }
    public static Builder builder(){
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public String getCompanyAttributes() {
        return companyAttributes;
    }
    public static class Builder{
        private String name;
        private String email;
        private  int age;
        private boolean isWorking;
        private String companyAttributes;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCompanyAttributes(String companyAttributes) {
            this.companyAttributes = companyAttributes;
            return this;

        }

        public Builder setWorking(boolean working) {
            isWorking = working;
            return this;

        }

        public Builder setAge(int age) {
            this.age = age;
            return this;

        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;

        }
        public Instructor build(){
            validate();
            return new Instructor(this);
        }
        private void validate(){
            if(!isWorking){
                throw new RuntimeException("Person should be a working professional");
            }
            if(name==null || name.isBlank()){
                throw  new RuntimeException("Name is required!");
            }
        }
    }
}
