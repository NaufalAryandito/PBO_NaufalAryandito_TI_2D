package P3.Tugas;

public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 30) {
            this.age = 30;
        } else if (newAge < 18) {
            this.age = 18;
        } else {
            this.age = newAge;
        }
    }
}


