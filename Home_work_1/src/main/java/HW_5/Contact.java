package HW_5;

import HW_1.shop.Product;

public class Contact {
    private String name;
    private String tel;
    private String surname;

    public Contact(String name, String surname, String tel) {
        this.name = name;
        this.surname = surname;
        this.tel = tel;
    }


    public String getSurname() {
        return surname;
    }

    public String getTel() {
        return tel;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Contact contact = (Contact) obj;
        return getTel().equals(contact.tel) && getName().equals(contact.name);
    }

}