public class Student {
    private String name;
    private String birghtday;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirghtday() {
        return birghtday;
    }

    public void setBirghtday(String birghtday) {
        this.birghtday = birghtday;
    }

    public int getAge() {
        if (age > 15) {
            return age;
        } else
        return 0;

        }


    public void setAge(int age) {
        this.age = age;
    }
}
