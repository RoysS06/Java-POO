package Ejercicio1;

public class Paciente {
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private String blood;
    private double weight;
    private double height;


    Paciente ( String name, String address){
        this.name = name;
        this.address = address;
    }


    public String getweight(){
        return weight + " Kg.";
    }

    public void setWeight(double weight){
        this.weight = weight;
    }


    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El numero que ingresaste no es valido");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }
}


