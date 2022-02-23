package Controller;

import javafx.beans.property.SimpleStringProperty;

public class Student {
    private final SimpleStringProperty name;
    private final SimpleStringProperty surname;
    private final SimpleStringProperty birthday;
    private final SimpleStringProperty city;
    private final SimpleStringProperty telephone;
    private final SimpleStringProperty appointment;
    private final SimpleStringProperty ID;


    public Student(String nam, String sur, String birth, String cit, String tele, String appo, String ID) {
        this.name = new SimpleStringProperty(nam);
        this.surname = new SimpleStringProperty(sur);
        this.birthday = new SimpleStringProperty(birth);
        this.city = new SimpleStringProperty(cit);
        this.telephone = new SimpleStringProperty(tele);
        this.appointment = new SimpleStringProperty(appo);
        this.ID = new SimpleStringProperty(ID);
    }
    public String getName() {
        return name.get();
    }

    public void setName(String nam) {
        name.set(nam);
    }

    public String getSurname() {
        return surname.get();
    }

    public void setSurname(String sur) {
        surname.set(sur);
    }

    public String getBirthday() {
        return birthday.get();
    }

    public void setBirthday(String birth) {
        birthday.set(birth);
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String cit) {
        city.set(cit);
    }
    public String getTelephone() {
        return telephone.get();
    }

    public void setTelephone(String tele) {
        telephone.set(tele);
    }

    public String getAppointment() {
        return appointment.get();
    }

    public void setAppointment(String appo) {
        appointment.set(appo);
    }

    public String getID() {
        return ID.get();
    }



}
