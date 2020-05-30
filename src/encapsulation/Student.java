package encapsulation;

public class Student {

    private String gender;
    private int age ;
    private int score;
    private String name = "aj";
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }





























    public void setScore(int score1){
        score= score1;

    }
    public int  getScore(){
        return score;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public void setAge(int age){
        this.age = age;

    }
    public int getAge(){
        return age;
    }
}
