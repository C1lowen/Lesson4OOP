package lesson4oop.lesson4_oop_level2;

public class CSVStringConverter implements StringConverter  {
    public String toStringRepresentation (Student student){
        return student.getName() + ";" + student.getLastName() + ";" + student.getGender() + ";" + student.getId() + ";" +  student.getGroupName();
    }

    public Student fromStringRepresentation (String str){
        String[] massiveStr = str.split(";");
        String name = massiveStr[0];
        String lastName = massiveStr[1];
        Gender gender;
        if(massiveStr[2].equals("MAN")){
            gender = Gender.MAN;
        }else{
            gender = Gender.WOMAN;
        }
        int id = Integer.parseInt(massiveStr[3]);
        String group = massiveStr[4];

        return new Student(name, lastName, gender, id, group);
    }
}
