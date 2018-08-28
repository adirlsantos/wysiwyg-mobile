package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela EMPRESA
 * @generated
 */
@Entity
@Table(name = "\"EMPRESA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Empresa")
public class Empresa implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_EMPRESA", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idEmpresa;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dtUpdate;

  /**
  * @generated
  */
  @Column(name = "EM_COFINS", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double emCofins;

  /**
  * @generated
  */
  @Column(name = "EM_CSLL", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double emCsll;

  /**
  * @generated
  */
  @Column(name = "EM_FANTASIA", nullable = false, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String emFantasia;

  /**
  * @generated
  */
  @Column(name = "EM_IRRF", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double emIrrf;

  /**
  * @generated
  */
  @Column(name = "EM_ISS", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double emIss;

  /**
  * @generated
  */
  @Column(name = "EM_NOMERAZAO", nullable = false, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String emNomerazao;

  /**
  * @generated
  */
  @Column(name = "EM_PIS", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double emPis;

  /**
  * @generated
  */
  @Column(name = "EM_VALOR_IRRF", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double emValorIrrf;

  /**
  * @generated
  */
  @Column(name = "EM_VALOR_LIMITE_CONSULTA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double emValorLimiteConsulta;

  /**
  * @generated
  */
  @Column(name = "EM_VALOR_PIS_COFINS_CSLL", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double emValorPisCofinsCsll;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
   * Construtor
   * @generated
   */
  public Empresa(){
  }


  /**
   * Obtém dtUpdate
   * return dtUpdate
   * @generated
   */
  
  public java.util.Date getDtUpdate(){
    return this.dtUpdate;
  }

  /**
   * Define dtUpdate
   * @param dtUpdate dtUpdate
   * @generated
   */
  public Empresa setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém emCofins
   * return emCofins
   * @generated
   */
  
  public java.lang.Double getEmCofins(){
    return this.emCofins;
  }

  /**
   * Define emCofins
   * @param emCofins emCofins
   * @generated
   */
  public Empresa setEmCofins(java.lang.Double emCofins){
    this.emCofins = emCofins;
    return this;
  }

  /**
   * Obtém emCsll
   * return emCsll
   * @generated
   */
  
  public java.lang.Double getEmCsll(){
    return this.emCsll;
  }

  /**
   * Define emCsll
   * @param emCsll emCsll
   * @generated
   */
  public Empresa setEmCsll(java.lang.Double emCsll){
    this.emCsll = emCsll;
    return this;
  }

  /**
   * Obtém emFantasia
   * return emFantasia
   * @generated
   */
  
  public java.lang.String getEmFantasia(){
    return this.emFantasia;
  }

  /**
   * Define emFantasia
   * @param emFantasia emFantasia
   * @generated
   */
  public Empresa setEmFantasia(java.lang.String emFantasia){
    this.emFantasia = emFantasia;
    return this;
  }

  /**
   * Obtém emIrrf
   * return emIrrf
   * @generated
   */
  
  public java.lang.Double getEmIrrf(){
    return this.emIrrf;
  }

  /**
   * Define emIrrf
   * @param emIrrf emIrrf
   * @generated
   */
  public Empresa setEmIrrf(java.lang.Double emIrrf){
    this.emIrrf = emIrrf;
    return this;
  }

  /**
   * Obtém emIss
   * return emIss
   * @generated
   */
  
  public java.lang.Double getEmIss(){
    return this.emIss;
  }

  /**
   * Define emIss
   * @param emIss emIss
   * @generated
   */
  public Empresa setEmIss(java.lang.Double emIss){
    this.emIss = emIss;
    return this;
  }

  /**
   * Obtém emNomerazao
   * return emNomerazao
   * @generated
   */
  
  public java.lang.String getEmNomerazao(){
    return this.emNomerazao;
  }

  /**
   * Define emNomerazao
   * @param emNomerazao emNomerazao
   * @generated
   */
  public Empresa setEmNomerazao(java.lang.String emNomerazao){
    this.emNomerazao = emNomerazao;
    return this;
  }

  /**
   * Obtém emPis
   * return emPis
   * @generated
   */
  
  public java.lang.Double getEmPis(){
    return this.emPis;
  }

  /**
   * Define emPis
   * @param emPis emPis
   * @generated
   */
  public Empresa setEmPis(java.lang.Double emPis){
    this.emPis = emPis;
    return this;
  }

  /**
   * Obtém emValorIrrf
   * return emValorIrrf
   * @generated
   */
  
  public java.lang.Double getEmValorIrrf(){
    return this.emValorIrrf;
  }

  /**
   * Define emValorIrrf
   * @param emValorIrrf emValorIrrf
   * @generated
   */
  public Empresa setEmValorIrrf(java.lang.Double emValorIrrf){
    this.emValorIrrf = emValorIrrf;
    return this;
  }

  /**
   * Obtém emValorLimiteConsulta
   * return emValorLimiteConsulta
   * @generated
   */
  
  public java.lang.Double getEmValorLimiteConsulta(){
    return this.emValorLimiteConsulta;
  }

  /**
   * Define emValorLimiteConsulta
   * @param emValorLimiteConsulta emValorLimiteConsulta
   * @generated
   */
  public Empresa setEmValorLimiteConsulta(java.lang.Double emValorLimiteConsulta){
    this.emValorLimiteConsulta = emValorLimiteConsulta;
    return this;
  }

  /**
   * Obtém emValorPisCofinsCsll
   * return emValorPisCofinsCsll
   * @generated
   */
  
  public java.lang.Double getEmValorPisCofinsCsll(){
    return this.emValorPisCofinsCsll;
  }

  /**
   * Define emValorPisCofinsCsll
   * @param emValorPisCofinsCsll emValorPisCofinsCsll
   * @generated
   */
  public Empresa setEmValorPisCofinsCsll(java.lang.Double emValorPisCofinsCsll){
    this.emValorPisCofinsCsll = emValorPisCofinsCsll;
    return this;
  }

  /**
   * Obtém idEmpresa
   * return idEmpresa
   * @generated
   */
  
  public java.lang.Integer getIdEmpresa(){
    return this.idEmpresa;
  }

  /**
   * Define idEmpresa
   * @param idEmpresa idEmpresa
   * @generated
   */
  public Empresa setIdEmpresa(java.lang.Integer idEmpresa){
    this.idEmpresa = idEmpresa;
    return this;
  }

  /**
   * Obtém idUsuario
   * return idUsuario
   * @generated
   */
  
  public java.lang.Integer getIdUsuario(){
    return this.idUsuario;
  }

  /**
   * Define idUsuario
   * @param idUsuario idUsuario
   * @generated
   */
  public Empresa setIdUsuario(java.lang.Integer idUsuario){
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Empresa object = (Empresa)obj;
    if (idEmpresa != null ? !idEmpresa.equals(object.idEmpresa) : object.idEmpresa != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idEmpresa == null) ? 0 : idEmpresa.hashCode());
    return result;
  }

}
