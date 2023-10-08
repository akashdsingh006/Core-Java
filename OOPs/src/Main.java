public class Main {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("John", 25);
            Person person2 = person1.clone();

            System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge());
            System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge());

            // Modifying person2
            person2.setName("Jane");
            person2.setAge(30);

            System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge());
            System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the clone() method
    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
    
    public void setName(String s) {
        name=s;
    }
    
    public void setAge(int a) {
        age=a;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

