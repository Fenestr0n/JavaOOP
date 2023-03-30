package hw_3;

public class Cat implements Comparable<Cat>{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Cat item) {
        // return name.compareTo(item.getName());
        if (this.name == item.name){
            return 0;
        } else {
            return -1;
        }
    }


}
