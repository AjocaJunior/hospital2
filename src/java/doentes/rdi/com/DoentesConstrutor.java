package doentes.rdi.com;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="doentes")
public class DoentesConstrutor implements Serializable {
    
    

    public int getNib() {
        return nib;
    }

    public void setNib(int nib) {
        this.nib = nib;
    }

    public Calendar getCalendardea() {
        return datadea;
    }

    public void setCalendardea(Calendar datadea) {
        this.datadea = datadea;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getBi() {
        return bi;
    }

    public void setBi(int bi) {
        this.bi = bi;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCboestado() {
        return cboestado;
    }

    public void setCboestado(String cboestado) {
        this.cboestado = cboestado;
    }

    public String getCboprofissao() {
        return cboprofissao;
    }

    public void setCboprofissao(String cboprofissao) {
        this.cboprofissao = cboprofissao;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNomepai() {
        return nomepai;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }
    
    public Calendar getDatadea() {
        return datadea;
    }

    public void setDatadea(Calendar datadea) {
        this.datadea = datadea;
    }
    
    @Id
    @GeneratedValue
    private int nib;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar datadea; //Dúvida

    

    public Calendar getDatan() {
        return datan;
    }

    public void setDatan(Calendar datan) {
        this.datan = datan;
    }
    
    @Column(nullable = false, unique=true,length=20)
    private String nome;
    
    @Column(nullable = false, unique=true,length=20)
    private String apelido;
    
    @Column(nullable = false, unique=true,length=13)  
    private int bi;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar datan;   //Dúvida
    
    @Column(nullable = false, length=10)
    private String sexo;
    
    @Column(nullable = false)
    private String cboestado;
    
    @Column(nullable = false)
    private String cboprofissao;
    
    @Column
    private String naturalidade;
    
    @Column
    private String nomepai;
    
    @Column
    private String nomemae;
    
    @Column
    @Transient
    private int idade;
    
}
