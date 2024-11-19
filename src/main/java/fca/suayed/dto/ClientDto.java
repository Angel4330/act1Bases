package fca.suayed.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;


public class ClientDto {
    
    private Long id;
    private String name;
    private String apellidoP;
    private String apellidoM;
    private String RFCData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getapellidoP() {
        return apellidoP;
    }

    public void setapellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    @ColumnName("apellido_materno")
    public String getapellidoM() {
        return apellidoM;
    }

    public void setapellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    @ColumnName("rfc")
    public String getRFCData() {
        return RFCData;
    }

    public void setRFCData(String RFCData) {
        this.RFCData = RFCData;
    }

}
