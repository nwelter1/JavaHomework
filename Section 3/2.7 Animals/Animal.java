
public class Animal {
    private String name;
    private String legs;
    private int age;
    private boolean fly;

    public Animal(String name, String legs, int age, boolean fly){
        this.name = name;
        this.legs = legs;
        this.age = age;
        this.fly = fly;
    }
    public String getName(){
        return this.name;
    }
    public String getLegs(){
        return this.legs;
    }
    public int getAge(){
        return this.age;
    }
    public boolean getFly(){
        return this.fly;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setLegs(String legs){
        this.legs = legs;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setFly(boolean fly){
        this.fly = fly;
    }
}
