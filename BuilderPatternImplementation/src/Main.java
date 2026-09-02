public class Main {

    public static void main(String[] args) {

        // ============================================================
        // 1. TEST INSTRUCTOR - SUCCESSFUL CREATION
        // ============================================================

        System.out.println("========== INSTRUCTOR TESTS ==========");

        Instructor instructor = Instructor.builder()
                .setName("John")
                .setEmail("john@gmail.com")
                .setAge(35)
                .setWorking(true)
                .setCompanyAttributes("ABC Technologies")
                .build();

        System.out.println("Instructor created successfully!");

        System.out.println("Name: " + instructor.getName());
        System.out.println("Email: " + instructor.getEmail());
        System.out.println("Age: " + instructor.getAge());
        System.out.println("Working: " + instructor.isWorking());
        System.out.println("Company: " + instructor.getCompanyAttributes());


        // ============================================================
        // 2. INSTRUCTOR - VALIDATION FAILURE
        // ============================================================

        System.out.println("\n========== INSTRUCTOR VALIDATION ==========");

        try {

            Instructor instructor2 = Instructor.builder()
                    .setName("David")
                    .setEmail("david@gmail.com")
                    .setAge(30)
                    .setWorking(false)
                    .setCompanyAttributes("XYZ")
                    .build();

        } catch (RuntimeException e) {

            System.out.println("Instructor validation failed as expected.");
            System.out.println("Exception: " + e.getMessage());
        }


        // ============================================================
        // 3. INSTRUCTOR - BUILD WITHOUT setWorking()
        // ============================================================

        System.out.println("\n========== INSTRUCTOR DEFAULT VALUE TEST ==========");

        try {

            Instructor instructor3 = Instructor.builder()
                    .setName("Mike")
                    .setEmail("mike@gmail.com")
                    .setAge(40)
                    .build();

        } catch (RuntimeException e) {

            System.out.println("Validation failed as expected.");
            System.out.println("Reason: " + e.getMessage());
        }


        // ============================================================
        // 4. TEST STUDENT - SUCCESSFUL CREATION
        // ============================================================

        System.out.println("\n========== STUDENT TESTS ==========");

        Student student = Student.builder()
                .setName("Taha")
                .setAge(25)
                .build();

        System.out.println("Student created successfully!");


        // ============================================================
        // 5. STUDENT - SET PSP AND BATCH AFTER CREATION
        // ============================================================

        student.setPsp(8.5);
        student.setBatch("LLD-Batch");

        System.out.println("PSP: " + student.getPsp());
        System.out.println("Batch: " + student.getBatch());


        // ============================================================
        // 6. STUDENT - INVALID PSP
        // ============================================================

        System.out.println("\n========== STUDENT PSP VALIDATION ==========");

        try {

            student.setPsp(15);

        } catch (RuntimeException e) {

            System.out.println("PSP validation failed as expected.");
            System.out.println("Reason: " + e.getMessage());
        }


        // ============================================================
        // 7. STUDENT - INVALID AGE IN SETTER
        // ============================================================

        System.out.println("\n========== STUDENT AGE VALIDATION ==========");

        try {

            Student student2 = Student.builder()
                    .setName("Rahul")
                    .setAge(17)
                    .build();

        } catch (RuntimeException e) {

            System.out.println("Age validation failed as expected.");
            System.out.println("Reason: " + e.getMessage());
        }


        // ============================================================
        // 8. STUDENT - INVALID NAME IN SETTER
        // ============================================================

        System.out.println("\n========== STUDENT NAME VALIDATION ==========");

        try {

            Student student3 = Student.builder()
                    .setName("")
                    .setAge(20)
                    .build();

        } catch (RuntimeException e) {

            System.out.println("Name validation failed as expected.");
            System.out.println("Reason: " + e.getMessage());
        }


        // ============================================================
        // 9. STUDENT - NULL NAME
        // ============================================================

        System.out.println("\n========== STUDENT NULL NAME ==========");

        try {

            Student student4 = Student.builder()
                    .setName(null)
                    .setAge(20)
                    .build();

        } catch (RuntimeException e) {

            System.out.println("Null name validation failed as expected.");
            System.out.println("Reason: " + e.getMessage());
        }


        // ============================================================
        // 10. STUDENT - BUILD WITHOUT NAME
        // ============================================================

        System.out.println("\n========== STUDENT MISSING NAME ==========");

        try {

            Student student5 = Student.builder()
                    .setAge(20)
                    .build();

        } catch (RuntimeException e) {

            System.out.println("Missing name validation failed as expected.");
            System.out.println("Reason: " + e.getMessage());
        }


        // ============================================================
        // 11. STUDENT - BUILD WITHOUT AGE
        // ============================================================

        System.out.println("\n========== STUDENT MISSING AGE ==========");

        try {

            Student student6 = Student.builder()
                    .setName("Aman")
                    .build();

        } catch (RuntimeException e) {

            System.out.println("Missing age validation failed as expected.");
            System.out.println("Reason: " + e.getMessage());
        }


        // ============================================================
        // 12. STUDENT - PSP BOUNDARY TESTS
        // ============================================================

        System.out.println("\n========== PSP BOUNDARY TESTS ==========");

        Student student7 = Student.builder()
                .setName("Alex")
                .setAge(22)
                .build();

        try {

            student7.setPsp(0);
            System.out.println("PSP = 0 accepted.");

            student7.setPsp(10);
            System.out.println("PSP = 10 accepted.");

            student7.setPsp(-1);

        } catch (RuntimeException e) {

            System.out.println("PSP = -1 rejected.");
            System.out.println("Reason: " + e.getMessage());
        }


        // ============================================================
        // 13. STUDENT - AGE BOUNDARY TEST
        // ============================================================

        System.out.println("\n========== AGE BOUNDARY TEST ==========");

        try {

            Student student8 = Student.builder()
                    .setName("Sam")
                    .setAge(18)
                    .build();

            System.out.println("Age = 18 accepted.");

        } catch (RuntimeException e) {

            System.out.println("Age = 18 rejected unexpectedly.");
            System.out.println("Reason: " + e.getMessage());
        }


        // ============================================================
        // FINAL MESSAGE
        // ============================================================

        System.out.println("\n========== ALL TESTS COMPLETED ==========");
    }
}