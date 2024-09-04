import java.util.Scanner;

public class Main {
    private static class student{
        private final String name;
        private final float gpa;

        public student(String name, float gpa){
            this.name = name;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public float getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return this.name + " " + this.gpa;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create a student
        student st = new student(sc.nextLine(), sc.nextFloat());
        //display student
        System.out.println(st);
    }
}
