package rocbigas.examenuf5;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author rocbigas
 *
 */
public class Persona implements Comparable<Persona> {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String city;
    private String phone;
    private String company;
    private double salary;

    public Persona(String firstName, String lastName, String birthDate, String email, String city, String phone, String company, String salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.parse(birthDate);
        this.email = email;
        this.city = city;
        this.phone = phone;
        this.company = company;
        this.salary = Double.parseDouble(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Persona{" + "firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", email=" + email + ", city=" + city + ", phone=" + phone + ", company=" + company + ", salary=" + salary + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.email, other.email);
    }

    @Override
    public int compareTo(Persona o) {
        int res = this.getLastName().compareTo(o.getLastName());
        if (res != 0) {
            return res;
        } else {
            return this.getFirstName().compareTo(o.getFirstName());
        }
    }

}
