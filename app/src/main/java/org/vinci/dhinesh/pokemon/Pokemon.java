package org.vinci.dhinesh.pokemon;

import java.io.Serializable;

/**
 * Created by SATTIA Dhinesh on 10/11/2017.
 */

public class Pokemon implements Serializable {
    private String id;
    private String noms;
    private int typeId;
    private int origineId;
    private int evolutionId;
    private String image;

    public Pokemon() {}

    public Pokemon(String id, String noms, int typeId, int origineId, int evolutionId, String image) {
        this.id = id;
        this.noms = noms;
        this.typeId = typeId;
        this.origineId = origineId;
        this.evolutionId = evolutionId;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getOrigineId() {
        return origineId;
    }

    public void setOrigineId(int origineId) {
        this.origineId = origineId;
    }

    public int evolutionId() {
        return evolutionId;
    }

    public void setEvolutionId(int evolutionId) {
        this.evolutionId = evolutionId;
    }

    public String getImage() {
        return "pokemon.jpg";
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Pokemon [ " +
                "id='" + id + '\'' +
                ", noms='" + noms + '\'' +
                ", typeId='" + typeId + '\'' +
                ", origineId='" + origineId + '\'' +
                ", evolutionId='" + evolutionId + '\'' +
                ", image=" + image +
                ']';
    }
}

