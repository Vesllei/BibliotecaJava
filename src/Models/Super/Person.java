package Models.Super;

public abstract class Person {
    protected String name;
    protected int tel;

    public Person(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }


    @Override
    public abstract String toString();



}
