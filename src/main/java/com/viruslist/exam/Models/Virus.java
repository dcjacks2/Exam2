package com.viruslist.exam.Models;


import javax.persistence.*;

@Entity
@Table(name = "virus")
public class Virus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column( name = "name")
    public String Name;
    @Column( name = "description")
    public String Description;
    @Column( name = "symptoms")
    public String Symptoms;
    @Column( name = "duration")
    public String Duration;
    @Column( name = "mortalityrate")
    public Double Mortalityrate;

    public Virus(){
   }
    public Virus(String Name, String Description, String Symptoms, String Duration, Double Mortalityrate){
        this.Name = Name;
        this.Description = Description;
        this.Symptoms = Symptoms;
        this.Duration = Duration;
        this.Mortalityrate = Mortalityrate;
    }

    public int getId() { return id; }

    public void setId(int id) {this.id = id;}

    public String getName() {return Name;}

    public void setName(String Name) {this.Name = Name;}

    public String getDescription() {return Description; }

    public void setDescription(String Description) {this.Description = Description;}

    public String getSymptoms() {return Symptoms;}

    public void setSymptoms(String Symptoms) {this.Symptoms = Symptoms;}

    public String getDuration() {return Duration;}

    public void setDuration(String Duration) {this.Duration = Duration;}

    public Double getMortalityrate() {return Mortalityrate;}

    public void setMortalityrate(Double Mortalityrate){this.Mortalityrate = Mortalityrate;}

}
