package lambdastream;

public class Pupil {
    private String name;
    private int age;
    private int stature;
    private SpecialityEnum specialities;

    public Pupil(String name, int age, int stature) {
        this.name = name;
        this.age = age;
        this.stature = stature;
    }

    public Pupil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStature() {
        return stature;
    }

    public void setStature(int stature) {
        this.stature = stature;
    }

    public SpecialityEnum getSpecialities() {
        return specialities;
    }

    public void setSpecialities(SpecialityEnum specialities) {
        this.specialities = specialities;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stature=" + stature +
                ", specialities=" + specialities +
                '}';
    }
}
