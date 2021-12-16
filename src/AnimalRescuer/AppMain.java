package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {

        AppMain animalRescuer = new AppMain();
        Dog tili = new Dog();
        Cat daph =  new Cat();
        Adopter adop = new Adopter();
        AnimalFood dogFood = new AnimalFood();
        AnimalFood catFood = new AnimalFood();
        Duck daffy = new Duck();
        Game agame = new Game();
        Girl agirl = new Girl();
        Vet avet = new Vet();
        Animal dolphin = new Animal();
        animalRescuer.initDog(tili, "Tili", 2, "black", "shepherd", true, 10, 8, 5, 3,
                "meat", "run", "enclosure", "dog");
        animalRescuer.initCat(daph, "Daphne", 3, "white", "birmanese", true, 3, 8, 5, 3,
                "meat", "play", "household", "cat");
        animalRescuer.initAnimal(dolphin, "Joe", 10, "gray", "longsnot", false, 50, 10, 8, 10,
                "meat", "swim", "wild", "dolphin");
        animalRescuer.initVet(avet, "Address", "cli", "+12345", "Jane Doe");

        System.out.println(tili.getFavactivity());


        tili.eat();
        daph.eat();
        dolphin.eat();
        dolphin.printAnimalData();
        avet.printVetData();

    }


    private void initDog(Dog dog, String name, int age, String color, String race, boolean vaccinated, int weight, int healthlevel,
                         int hunger, int happiness, String favfood, String favactivity, String habitat, String type)
    {
        dog.setName(name);
        dog.setAgeYears(age);
        dog.setColor(color);
        dog.setRace(race);
        dog.setVaccinated(vaccinated);
        dog.setWeight(weight);
        dog.setFavactivity(favactivity);
        dog.setFavfood(favfood);
        dog.setHabitat(habitat);
        dog.setHealthlevel(healthlevel);
        dog.setHappiness(happiness);
        dog.setHunger(hunger);
        dog.setType(type);
    }

    private void initCat(Cat cat, String name, int age, String color, String race, boolean vaccinated, int weight, int healthlevel,
                         int hunger, int happiness, String favfood, String favactivity, String habitat, String type)
    {
        cat.setName(name);
        cat.setAgeYears(age);
        cat.setColor(color);
        cat.setRace(race);
        cat.setVaccinated(vaccinated);
        cat.setWeight(weight);
        cat.setFavactivity(favactivity);
        cat.setFavfood(favfood);
        cat.setHabitat(habitat);
        cat.setHealthlevel(healthlevel);
        cat.setHappiness(happiness);
        cat.setHunger(hunger);
        cat.setType(type);
    }

    private void initAnimal(Animal animal, String name, int age, String color, String race, boolean vaccinated, int weight, int healthlevel,
                            int hunger, int happiness, String favfood, String favactivity, String habitat, String type)
    {
        animal.setName(name);
        animal.setAgeYears(age);
        animal.setColor(color);
        animal.setRace(race);
        animal.setVaccinated(vaccinated);
        animal.setWeight(weight);
        animal.setFavactivity(favactivity);
        animal.setFavfood(favfood);
        animal.setHabitat(habitat);
        animal.setHealthlevel(healthlevel);
        animal.setHappiness(happiness);
        animal.setHunger(hunger);
        animal.setType(type);
    }

    private void initVet(Vet vet, String address, String spec, String phoneNumber, String name) {
        vet.setAddress(address);
        vet.setSpec(spec);
        vet.setPhoneNumber(phoneNumber);
        vet.setName(name);
    }
}
