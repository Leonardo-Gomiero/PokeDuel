package Duel;


public class Move {
    String name;
    String type;
    String category;
    int pp;
    int power;
    int accuracy;

    public Move(String name, String type, String category, int pp, int power, int accuracy) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.pp = pp;
        this.power = power;
        this.accuracy = accuracy;
    }
    
     public void showInfo(){
         System.out.println(
                "\n\nName: " + this.name
                + "\nType: " + this.type
                + "\nCategory: " + this.category
                + "\nPP: " + this.pp
                + "\nPower: " + this.power
                + "\nAccuracy: " + this.accuracy
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
    
}
