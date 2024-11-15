public class EncapsulationSample {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        
        
        student1.setStudentId(1234);
        student1.setName("Aron Caay");

        
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getName());

        
        Book book1 = new Book();
        
        
        book1.setBookNumber(101);
        book1.setTitle("si Mabuti");
        book1.setAuthor("Genoveva Edroza Matute");
        book1.setPrice(199.99);

        
        System.out.println("\nBook Details:");
        System.out.println("Book Number: " + book1.getBookNumber());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());
    }
}

