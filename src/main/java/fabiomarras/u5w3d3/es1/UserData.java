package fabiomarras.u5w3d3.es1;

public class UserData implements fabiomarras.u5w3d3.es1.DataSource {
    private String nomeCompleto;
    private int eta;

    @Override
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public int getEta() {
        return eta;
    }

    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
