/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.EntidadeBase;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mateu
 */
@Entity
@Table(name = "cartao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cartao.findAll", query = "SELECT c FROM Cartao c"),
    @NamedQuery(name = "Cartao.findById", query = "SELECT c FROM Cartao c WHERE c.id = :id"),
    @NamedQuery(name = "Cartao.findByNumero", query = "SELECT c FROM Cartao c WHERE c.numero = :numero"),
    @NamedQuery(name = "Cartao.findByDebito", query = "SELECT c FROM Cartao c WHERE c.debito = :debito"),
    @NamedQuery(name = "Cartao.findByCredito", query = "SELECT c FROM Cartao c WHERE c.credito = :credito"),
    @NamedQuery(name = "Cartao.findByLimiteTotal", query = "SELECT c FROM Cartao c WHERE c.limiteTotal = :limiteTotal"),
    @NamedQuery(name = "Cartao.findByLimiteUsado", query = "SELECT c FROM Cartao c WHERE c.limiteUsado = :limiteUsado"),
    @NamedQuery(name = "Cartao.findByTitular", query = "SELECT c FROM Cartao c WHERE c.titular = :titular"),
    @NamedQuery(name = "Cartao.findByValidade", query = "SELECT c FROM Cartao c WHERE c.validade = :validade"),
    @NamedQuery(name = "Cartao.findByCvc", query = "SELECT c FROM Cartao c WHERE c.cvc = :cvc"),
    @NamedQuery(name = "Cartao.findBySenha", query = "SELECT c FROM Cartao c WHERE c.senha = :senha"),
    @NamedQuery(name = "Cartao.findBySituacao", query = "SELECT c FROM Cartao c WHERE c.situacao = :situacao")})
public class Cartao implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero")
    private String numero;
    @Column(name = "debito")
    private Boolean debito;
    @Column(name = "credito")
    private Boolean credito;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "limiteTotal")
    private Float limiteTotal;
    @Column(name = "limiteUsado")
    private Float limiteUsado;
    @Basic(optional = false)
    @Column(name = "titular")
    private String titular;
    @Basic(optional = false)
    @Column(name = "validade")
    @Temporal(TemporalType.DATE)
    private Date validade;
    @Basic(optional = false)
    @Column(name = "cvc")
    private short cvc;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Column(name = "situacao")
    private Boolean situacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartaoId")
    private List<Corrente> correnteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartaoId")
    private List<Poupanca> poupancaList;

    public Cartao() {
    }

    public Cartao(Integer id) {
        this.id = id;
    }

    public Cartao(Integer id, String numero, String titular, Date validade, short cvc, String senha) {
        this.id = id;
        this.numero = numero;
        this.titular = titular;
        this.validade = validade;
        this.cvc = cvc;
        this.senha = senha;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getDebito() {
        return debito;
    }

    public void setDebito(Boolean debito) {
        this.debito = debito;
    }

    public Boolean getCredito() {
        return credito;
    }

    public void setCredito(Boolean credito) {
        this.credito = credito;
    }

    public Float getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(Float limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public Float getLimiteUsado() {
        return limiteUsado;
    }

    public void setLimiteUsado(Float limiteUsado) {
        this.limiteUsado = limiteUsado;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public short getCvc() {
        return cvc;
    }

    public void setCvc(short cvc) {
        this.cvc = cvc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    @XmlTransient
    public List<Corrente> getCorrenteList() {
        return correnteList;
    }

    public void setCorrenteList(List<Corrente> correnteList) {
        this.correnteList = correnteList;
    }

    @XmlTransient
    public List<Poupanca> getPoupancaList() {
        return poupancaList;
    }

    public void setPoupancaList(List<Poupanca> poupancaList) {
        this.poupancaList = poupancaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartao)) {
            return false;
        }
        Cartao other = (Cartao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cartao[ id=" + id + " ]";
    }
    
    public String gerarNumeroCartao(){
        String number = "";
        int num;

        for(int i = 0; i < 4; i++) {
            num = (int) (Math.random() * 10);
            number += num;
        }

        return number;
    }

    public String gerarNumeroFormatado() {
        return this.numero = gerarNumeroCartao() + " " + gerarNumeroCartao() + " " + gerarNumeroCartao() + " " + gerarNumeroCartao();
    }

    public int gerarCvc(){
        int cvc1;
        Random random = new Random();
        do {
            cvc1 = random.nextInt(999);
        }while(cvc1 < 100);
        return cvc1;
    }
    
    public static Date somaData(Date data) {
        Calendar calendar = Calendar.getInstance(); 
        calendar.setTime(data); 
        calendar.add( Calendar.YEAR,4); 
        return calendar.getTime(); 
    }
    
}
