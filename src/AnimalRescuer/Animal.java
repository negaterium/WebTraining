package AnimalRescuer;

public class Animal {

    private String race;
    private int ageYears;
    private float weight;
    private String color;
    private String eyecolor;
    private String name;
    private boolean vaccinated;
    private int healthlevel;
    private int hunger;
    private int happiness;
    private String favfood;
    private String favactivity;
    private String type;
    private String habitat;


    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    public String getFavactivity() {
        return favactivity;
    }

    public void setFavactivity(String favactivity) {
        this.favactivity = favactivity;
    }

    public String getFavfood() {
        return favfood;
    }

    public void setFavfood(String favfood) {
        this.favfood = favfood;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHealthlevel() {
        return healthlevel;
    }

    public void setHealthlevel(int healthlevel) {
        this.healthlevel = healthlevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public void setAgeYears(int ageYears) {
        this.ageYears = ageYears;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void eat() {
        System.out.println("Animal: " + this.type + " -> eats!");
    }

    public void makeSound() {
        System.out.println("Animal: " + this.type + " -> eats!");
    }

    public void printAnimalData()
    {
        System.out.println("-------------------------------");
        System.out.println("Animal type: " + this.type);
        System.out.println("Animal race: " + this.race);
        System.out.println("Animal age: " + this.ageYears);
        System.out.println("Animal weight: " + this.weight);
        System.out.println("Animal color: " + this.color);
        System.out.println("Animal eye color: " + this.eyecolor);
        System.out.println("Animal name: " + this.name);
        System.out.println("Animal is vaccinated: " + this.vaccinated);
        System.out.println("Animal health lever: " + this.healthlevel);
        System.out.println("Animal hunger level: " + this.hunger);
        System.out.println("Animal happiness level: " + this.happiness);
        System.out.println("Animal favorite food: " + this.favfood);
        System.out.println("Animal favorite activity: " + this.favactivity);
        System.out.println("Animal habitat: " + this.habitat);
        System.out.println("-------------------------------");
    }

}
