public class Human {
    private String name;
    private String age;
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;

    public String obtenirAdrecaCompleta() {
        StringBuilder result = new StringBuilder();
        // REFACT 4: Extraccio de metode
        return result.append(country + ", " + city + ", " + street + ", " + house + " " + quarter).toString();
                 /*   .append(country)
                    .append(", ")
                    .append(city)
                    .append(", ")
                    .append(street)
                    .append(", ")
                    .append(house)
                    .append(" ")
                    .append(quarter).toString();

                  */
    }
}
