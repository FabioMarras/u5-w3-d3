package fabiomarras.u5w3d3.es1;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@AllArgsConstructor
public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }
    public void DataDiNascita (LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
