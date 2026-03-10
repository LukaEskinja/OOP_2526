package pckg_cls_obj;

public class Hlace {

    private String model;
    private Boolean ciste;

    public Hlace(String model) {
        this.model = model;
        this.ciste = true;
    }

    public Boolean getCiste() {
        return ciste;
    }

    public void setCiste(Boolean ciste) {
        this.ciste = ciste;
    }

    public void koristeneHlace() {
        this.ciste = false;
    }

    public Hlace nekakoCiste(Student student) {
        return student.operiMe(this);
    }
}
