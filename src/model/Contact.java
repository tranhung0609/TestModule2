package model;

import java.time.LocalDate;

public class Contact {
    private final String phoneNumber;
    private String group;
    private String name;
    private String gender;
    private String address;
    private LocalDate dateOfBirth;
    private String email;

    public Contact(String phoneNumber, String group, String name, String gender, String address, LocalDate dateOfBirt, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirt;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Danh bạ => " +
                " Nhóm : " + group +
                "| Tên : " + name +
                "| Giới tính : " + gender +
                "| Địa chỉ : " + address +
                "| Ngày sinh : " + dateOfBirth +
                "| Email : " + email +
                "\t(^_^)";
    }
}
