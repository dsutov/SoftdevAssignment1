public class HouseTest {

    public static void main(String[] args) {
        House h1 = new House();
        House h2 = new House();
        House h3 = new House(4, 3, "Doe");

        h1.setNum_of_bedrooms(4);
        h1.setNum_of_bathrooms(7);
        h1.setOwner_surname("Jackson");
        h1.printDetails();

        h2.setNum_of_bedrooms(4);
        h2.setNum_of_bathrooms(7);
        h2.setOwner_surname("Jackson");
        h2.printDetails();

        h3.printDetails();
    }
}
