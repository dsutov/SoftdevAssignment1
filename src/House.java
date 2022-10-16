public class House {

    private int num_of_bedrooms;
    private int num_of_bathrooms;
    private String owner_surname;

    public House(){
        this.num_of_bedrooms = 0;
        this.num_of_bathrooms = 0;
        this.owner_surname = "";
    }

    public House(int num_of_bedrooms, int num_of_bathrooms, String owner_surname) {
        this.num_of_bedrooms = num_of_bedrooms;
        this.num_of_bathrooms = num_of_bathrooms;
        this.owner_surname = owner_surname;
    }

    public int getNum_of_bedrooms() {
        return this.num_of_bedrooms;
    }

    public int getNum_of_bathrooms() {
        return this.num_of_bathrooms;
    }

    public String getOwner_surname() {
        return this.owner_surname;
    }

    public void setNum_of_bedrooms(int num_of_bedrooms) {
        this.num_of_bedrooms = num_of_bedrooms;
    }

    public void setNum_of_bathrooms(int num_of_bathrooms) {
        this.num_of_bathrooms = num_of_bathrooms;
    }

    public void setOwner_surname(String owner_surname) {
        this.owner_surname = owner_surname;
    }

    public void printDetails() {
        System.out.println("Number of Bedrooms: " + this.num_of_bedrooms);
        System.out.println("Number of bathrooms: " + this.num_of_bathrooms);
        System.out.println("Owner surname: " + this.owner_surname);
        System.out.println("*----------------------*");
    }

}
