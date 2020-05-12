package database.models.modality;

import database.models.Model;

import javax.persistence.*;

@Entity(name = "graduation")
public class Graduation extends Model<Graduation> {

    @ManyToOne
    @JoinColumn(name = "modalityId", foreignKey = @ForeignKey(name = "graduation_modalityId"))
    private Modality modality;

    @Column(name = "description")
    private String description;

    public Modality getModality() {
        return modality;
    }

    public void setModality(Modality modality) {
        this.modality = modality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String[] getResult() {
        return new String[0];
    }

}
