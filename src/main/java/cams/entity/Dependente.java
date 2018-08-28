package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela DEPENDENTE
 * @generated
 */
@Entity
@Table(name = "\"DEPENDENTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Dependente")
public class Dependente implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_DEPENDENTE", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idDependente;

  /**
  * @generated
  */
  @Column(name = "DP_CPF", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String dpCpf;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DP_DATA_NASCIMENTO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dpDataNascimento;

  /**
  * @generated
  */
  @Column(name = "DP_FONE1", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String dpFone1;

  /**
  * @generated
  */
  @Column(name = "DP_FONE2", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String dpFone2;

  /**
  * @generated
  */
  @Column(name = "DP_NOME", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String dpNome;

  /**
  * @generated
  */
  @Column(name = "DP_PLANO_SAUDE", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String dpPlanoSaude;

  /**
  * @generated
  */
  @Column(name = "DP_RG", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String dpRg;

  /**
  * @generated
  */
  @Column(name = "DP_TEM_VALOR_ADICIONAL", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String dpTemValorAdicional;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DP_VALIDADE_CARTAO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dpValidadeCartao;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_SOCIO", nullable = false, referencedColumnName = "ID_SOCIO", insertable=true, updatable=true)
  
  private Socio socio;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_TIPO_DEPENDENTE", nullable = true, referencedColumnName = "ID_TIPO_DEPENDENTE", insertable=true, updatable=true)
  
  private TipoDependente tipoDependente;

  /**
   * Construtor
   * @generated
   */
  public Dependente(){
  }


  /**
   * Obtém dpCpf
   * return dpCpf
   * @generated
   */
  
  public java.lang.String getDpCpf(){
    return this.dpCpf;
  }

  /**
   * Define dpCpf
   * @param dpCpf dpCpf
   * @generated
   */
  public Dependente setDpCpf(java.lang.String dpCpf){
    this.dpCpf = dpCpf;
    return this;
  }

  /**
   * Obtém dpDataNascimento
   * return dpDataNascimento
   * @generated
   */
  
  public java.util.Date getDpDataNascimento(){
    return this.dpDataNascimento;
  }

  /**
   * Define dpDataNascimento
   * @param dpDataNascimento dpDataNascimento
   * @generated
   */
  public Dependente setDpDataNascimento(java.util.Date dpDataNascimento){
    this.dpDataNascimento = dpDataNascimento;
    return this;
  }

  /**
   * Obtém dpFone1
   * return dpFone1
   * @generated
   */
  
  public java.lang.String getDpFone1(){
    return this.dpFone1;
  }

  /**
   * Define dpFone1
   * @param dpFone1 dpFone1
   * @generated
   */
  public Dependente setDpFone1(java.lang.String dpFone1){
    this.dpFone1 = dpFone1;
    return this;
  }

  /**
   * Obtém dpFone2
   * return dpFone2
   * @generated
   */
  
  public java.lang.String getDpFone2(){
    return this.dpFone2;
  }

  /**
   * Define dpFone2
   * @param dpFone2 dpFone2
   * @generated
   */
  public Dependente setDpFone2(java.lang.String dpFone2){
    this.dpFone2 = dpFone2;
    return this;
  }

  /**
   * Obtém dpNome
   * return dpNome
   * @generated
   */
  
  public java.lang.String getDpNome(){
    return this.dpNome;
  }

  /**
   * Define dpNome
   * @param dpNome dpNome
   * @generated
   */
  public Dependente setDpNome(java.lang.String dpNome){
    this.dpNome = dpNome;
    return this;
  }

  /**
   * Obtém dpPlanoSaude
   * return dpPlanoSaude
   * @generated
   */
  
  public java.lang.String getDpPlanoSaude(){
    return this.dpPlanoSaude;
  }

  /**
   * Define dpPlanoSaude
   * @param dpPlanoSaude dpPlanoSaude
   * @generated
   */
  public Dependente setDpPlanoSaude(java.lang.String dpPlanoSaude){
    this.dpPlanoSaude = dpPlanoSaude;
    return this;
  }

  /**
   * Obtém dpRg
   * return dpRg
   * @generated
   */
  
  public java.lang.String getDpRg(){
    return this.dpRg;
  }

  /**
   * Define dpRg
   * @param dpRg dpRg
   * @generated
   */
  public Dependente setDpRg(java.lang.String dpRg){
    this.dpRg = dpRg;
    return this;
  }

  /**
   * Obtém dpTemValorAdicional
   * return dpTemValorAdicional
   * @generated
   */
  
  public java.lang.String getDpTemValorAdicional(){
    return this.dpTemValorAdicional;
  }

  /**
   * Define dpTemValorAdicional
   * @param dpTemValorAdicional dpTemValorAdicional
   * @generated
   */
  public Dependente setDpTemValorAdicional(java.lang.String dpTemValorAdicional){
    this.dpTemValorAdicional = dpTemValorAdicional;
    return this;
  }

  /**
   * Obtém dpValidadeCartao
   * return dpValidadeCartao
   * @generated
   */
  
  public java.util.Date getDpValidadeCartao(){
    return this.dpValidadeCartao;
  }

  /**
   * Define dpValidadeCartao
   * @param dpValidadeCartao dpValidadeCartao
   * @generated
   */
  public Dependente setDpValidadeCartao(java.util.Date dpValidadeCartao){
    this.dpValidadeCartao = dpValidadeCartao;
    return this;
  }

  /**
   * Obtém idDependente
   * return idDependente
   * @generated
   */
  
  public java.lang.Integer getIdDependente(){
    return this.idDependente;
  }

  /**
   * Define idDependente
   * @param idDependente idDependente
   * @generated
   */
  public Dependente setIdDependente(java.lang.Integer idDependente){
    this.idDependente = idDependente;
    return this;
  }

  /**
   * Obtém socio
   * return socio
   * @generated
   */
  
  public Socio getSocio(){
    return this.socio;
  }

  /**
   * Define socio
   * @param socio socio
   * @generated
   */
  public Dependente setSocio(Socio socio){
    this.socio = socio;
    return this;
  }

  /**
   * Obtém tipoDependente
   * return tipoDependente
   * @generated
   */
  
  public TipoDependente getTipoDependente(){
    return this.tipoDependente;
  }

  /**
   * Define tipoDependente
   * @param tipoDependente tipoDependente
   * @generated
   */
  public Dependente setTipoDependente(TipoDependente tipoDependente){
    this.tipoDependente = tipoDependente;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Dependente object = (Dependente)obj;
    if (idDependente != null ? !idDependente.equals(object.idDependente) : object.idDependente != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idDependente == null) ? 0 : idDependente.hashCode());
    return result;
  }

}
