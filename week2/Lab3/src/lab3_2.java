import javax.swing.JOptionPane;

public class lab3_2 {
    String pername;
    String name;
    String surName;
    int age;

    public lab3_2() {
        pername = "Mr.";
        name = "Somchai";
        surName = "Cheingpongpan";
        age = 24;
    }

    public static void main(String[] args) {
        lab3_2 person;
        long id;
        String value;

        id = 6606021421012L;
        person = new lab3_2();
        value = person.pername + " " + person.name + " " + person.surName + ", " + person.age + " year old.";
        JOptionPane.showMessageDialog(null, "ID : " + id + "\nData person : " + value, "Result", 1);

        person.pername = "Ms.";
        person.name = "John";
        person.surName = "Smith";
        person.age = 29;
        value = person.pername + " " + person.name + " " + person.surName + ", " + person.age + " year old.";
        JOptionPane.showMessageDialog(null, "ID : " + id + "\nNew data person : " + value, "Result", 1);
    }
}
