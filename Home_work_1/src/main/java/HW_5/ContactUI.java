package HW_5;

public class ContactUI {
    public ContactRepoInMemory data;

    // Вывод информации о конкретном пользователе по его имени
    public void printContact(String name) {
        Contact contact = this.data.getContactByName(name);
        System.out.println(contact);
    }
    // Вывод всех контактов
    public void printAllContact() {
        System.out.println(this.data.getAllContact());
    }
    // Заглушка по умолчанию возвращает нового пользователя
    public Contact createNewContact() {
        return new Contact("Marta", "Due", "89541254578");
    }
}
