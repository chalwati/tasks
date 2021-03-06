package com.todo.waycenter.tasks.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "Task")
public class Task {

    @Id
    @GeneratedValue
    private Integer Id ;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDateecheance() {
        return dateecheance;
    }

    public void setDateecheance(Date dateecheance) {
        this.dateecheance = dateecheance;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public boolean isStatutmodif() {
        return statutmodif;
    }

    public void setStatutmodif(boolean statutmodif) {
        this.statutmodif = statutmodif;
    }

    private String titre ;

    private String Description;

    private Date datedebut;

    private Date dateecheance ;

    private String statut ;

    private boolean statutmodif ;


}
