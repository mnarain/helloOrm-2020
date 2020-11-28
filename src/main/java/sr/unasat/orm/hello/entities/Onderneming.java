package sr.unasat.orm.hello.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Onderneming {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(length = 50, unique = true)
    private String naam;
    private String adres;
    private LocalDate oprichtingsdatum;
    private String kkfnummer;
    @ManyToOne
    @JoinColumn(name = "persoon_id", nullable = false)
    private Persoon eigenaar;

    public Onderneming() {
    }

    public Onderneming(Long id, String naam, String adres, LocalDate oprichtingsdatum, String kkfnummer, Persoon eigenaar) {
        this.id = id;
        this.naam = naam;
        this.adres = adres;
        this.oprichtingsdatum = oprichtingsdatum;
        this.kkfnummer = kkfnummer;
        this.eigenaar = eigenaar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public LocalDate getOprichtingsdatum() {
        return oprichtingsdatum;
    }

    public void setOprichtingsdatum(LocalDate oprichtingsdatum) {
        this.oprichtingsdatum = oprichtingsdatum;
    }

    public String getKkfnummer() {
        return kkfnummer;
    }

    public void setKkfnummer(String kkfnummer) {
        this.kkfnummer = kkfnummer;
    }

    public Persoon getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(Persoon eigenaar) {
        this.eigenaar = eigenaar;
    }

    @Override
    public String toString() {
        return "Onderneming{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", adres='" + adres + '\'' +
                ", oprichtingsdatum=" + oprichtingsdatum +
                ", kkfnummer='" + kkfnummer + '\'' +
                '}';
    }
}
