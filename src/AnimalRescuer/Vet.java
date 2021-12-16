package AnimalRescuer;

public class Vet {

    private String name;
    private String spec;
    private String address;
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printVetData()
    {
        System.out.println("-------------------------------");
        System.out.println("Vet name: " + this.name);
        System.out.println("Vet address: " + this.address);
        System.out.println("Vet spec: " + this.spec);
        System.out.println("Vet phone number: " + this.phoneNumber);
        System.out.println("-------------------------------");
    }

}
