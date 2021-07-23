package sg.edu.rp.c346.id19004781.petboardingapp;

import java.io.Serializable;

public class Message implements Serializable {
    private String name;
    private Integer days;
    private String date;
    private String animals;
    private boolean vaccinated;

    public Message(String name, Integer days, String date, String animals, boolean vaccinated) {
        this.name = name;
        this.days = days;
        this.date = date;
        this.animals = animals;
        this.vaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAnimals() {
        return animals;
    }

    public void setAnimals(String animals) {
        this.animals = animals;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", days='" + days + '\'' +
                ", date='" + date + '\'' +
                ", animals='" + animals + '\'' +
                ", vaccinated=" + vaccinated +
                '}';
    }
}
