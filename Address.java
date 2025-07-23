import java.util.Objects;

public class Address {
    private final String country;
    private final String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Address o = (Address) obj;
        return country.equals(o.country) && city.equals(o.city);
    }

    @Override
    public String toString() {
        return String.format("Country: %s, City: %s", country, city);
    }
}
