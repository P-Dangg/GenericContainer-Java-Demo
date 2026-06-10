//This class represent BTS member

public class Member {
    private String name;
    private int age;
    private String role;

    //constructor
    public Member (String name, int age, String role){
        this.name = name;
        this.age = age;
        this.role = role;
    }
    //getters and setters
    public String getName() { return name; }
    public int getAge() { return age; }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
    }

    public void setRole(String role) {
        this.role = role;
    }

    //toString
    public String toString() {
        return "Member: " + name + " Age: " + age + " Role: " + role;
    }
}


