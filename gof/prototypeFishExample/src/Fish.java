public class Fish extends Shape {

    public Fish(){
        type = "Fish";
    }

    @Override
    public void draw() {
        System.out.println("Inside Fish::draw() method.");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Fish)) return false;
        Fish fish = (Fish) object;
        return this.getId() != null && this.getId().equals(fish.getId());
    }
}
