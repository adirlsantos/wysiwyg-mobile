package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CONTA_CORRENTE
 * @generated
 */
@Entity
@Table(name = "\"CONTA_CORRENTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.ContaCorrente")
public class ContaCorrente implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_CONTA_CORRENTE", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idContaCorrente;

  /**
  * @generated
  */
  @Column(name = "CC_AGENCIA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String ccAgencia;

  /**
  * @generated
  */
  @Column(name = "CC_CONTA_CORRENTE", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String ccContaCorrente;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "CC_DATA_ABERTURA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date ccDataAbertura;

  /**
  * @generated
  */
  @Column(name = "CC_FAX", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String ccFax;

  /**
  * @generated
  */
  @Column(name = "CC_GERENTE", nullable = true, unique = false, length=18, insertable=true, updatable=true)
  
  private java.lang.String ccGerente;

  /**
  * @generated
  */
  @Column(name = "CC_SALDO_ANTERIOR", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double ccSaldoAnterior;

  /**
  * @generated
  */
  @Column(name = "CC_TELEFONE", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String ccTelefone;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dtUpdate;

  /**
  * @generated
  */
  @Column(name = "ID_BANCO", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idBanco;

  /**
  * @generated
  */
  @Column(name = "ID_CONTA_COMPRA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idContaCompra;

  /**
  * @generated
  */
  @Column(name = "ID_CONTA_VENDA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idContaVenda;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
   * Construtor
   * @generated
   */
  public ContaCorrente(){
  }


  /**
   * Obtém ccAgencia
   * return ccAgencia
   * @generated
   */
  
  public java.lang.String getCcAgencia(){
    return this.ccAgencia;
  }

  /**
   * Define ccAgencia
   * @param ccAgencia ccAgencia
   * @generated
   */
  public ContaCorrente setCcAgencia(java.lang.String ccAgencia){
    this.ccAgencia = ccAgencia;
    return this;
  }

  /**
   * Obtém ccContaCorrente
   * return ccContaCorrente
   * @generated
   */
  
  public java.lang.String getCcContaCorrente(){
    return this.ccContaCorrente;
  }

  /**
   * Define ccContaCorrente
   * @param ccContaCorrente ccContaCorrente
   * @generated
   */
  public ContaCorrente setCcContaCorrente(java.lang.String ccContaCorrente){
    this.ccContaCorrente = ccContaCorrente;
    return this;
  }

  /**
   * Obtém ccDataAbertura
   * return ccDataAbertura
   * @generated
   */
  
  public java.util.Date getCcDataAbertura(){
    return this.ccDataAbertura;
  }

  /**
   * Define ccDataAbertura
   * @param ccDataAbertura ccDataAbertura
   * @generated
   */
  public ContaCorrente setCcDataAbertura(java.util.Date ccDataAbertura){
    this.ccDataAbertura = ccDataAbertura;
    return this;
  }

  /**
   * Obtém ccFax
   * return ccFax
   * @generated
   */
  
  public java.lang.String getCcFax(){
    return this.ccFax;
  }

  /**
   * Define ccFax
   * @param ccFax ccFax
   * @generated
   */
  public ContaCorrente setCcFax(java.lang.String ccFax){
    this.ccFax = ccFax;
    return this;
  }

  /**
   * Obtém ccGerente
   * return ccGerente
   * @generated
   */
  
  public java.lang.String getCcGerente(){
    return this.ccGerente;
  }

  /**
   * Define ccGerente
   * @param ccGerente ccGerente
   * @generated
   */
  public ContaCorrente setCcGerente(java.lang.String ccGerente){
    this.ccGerente = ccGerente;
    return this;
  }

  /**
   * Obtém ccSaldoAnterior
   * return ccSaldoAnterior
   * @generated
   */
  
  public java.lang.Double getCcSaldoAnterior(){
    return this.ccSaldoAnterior;
  }

  /**
   * Define ccSaldoAnterior
   * @param ccSaldoAnterior ccSaldoAnterior
   * @generated
   */
  public ContaCorrente setCcSaldoAnterior(java.lang.Double ccSaldoAnterior){
    this.ccSaldoAnterior = ccSaldoAnterior;
    return this;
  }

  /**
   * Obtém ccTelefone
   * return ccTelefone
   * @generated
   */
  
  public java.lang.String getCcTelefone(){
    return this.ccTelefone;
  }

  /**
   * Define ccTelefone
   * @param ccTelefone ccTelefone
   * @generated
   */
  public ContaCorrente setCcTelefone(java.lang.String ccTelefone){
    this.ccTelefone = ccTelefone;
    return this;
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
  public ContaCorrente setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém idBanco
   * return idBanco
   * @generated
   */
  
  public java.lang.Integer getIdBanco(){
    return this.idBanco;
  }

  /**
   * Define idBanco
   * @param idBanco idBanco
   * @generated
   */
  public ContaCorrente setIdBanco(java.lang.Integer idBanco){
    this.idBanco = idBanco;
    return this;
  }

  /**
   * Obtém idContaCompra
   * return idContaCompra
   * @generated
   */
  
  public java.lang.Integer getIdContaCompra(){
    return this.idContaCompra;
  }

  /**
   * Define idContaCompra
   * @param idContaCompra idContaCompra
   * @generated
   */
  public ContaCorrente setIdContaCompra(java.lang.Integer idContaCompra){
    this.idContaCompra = idContaCompra;
    return this;
  }

  /**
   * Obtém idContaCorrente
   * return idContaCorrente
   * @generated
   */
  
  public java.lang.Integer getIdContaCorrente(){
    return this.idContaCorrente;
  }

  /**
   * Define idContaCorrente
   * @param idContaCorrente idContaCorrente
   * @generated
   */
  public ContaCorrente setIdContaCorrente(java.lang.Integer idContaCorrente){
    this.idContaCorrente = idContaCorrente;
    return this;
  }

  /**
   * Obtém idContaVenda
   * return idContaVenda
   * @generated
   */
  
  public java.lang.Integer getIdContaVenda(){
    return this.idContaVenda;
  }

  /**
   * Define idContaVenda
   * @param idContaVenda idContaVenda
   * @generated
   */
  public ContaCorrente setIdContaVenda(java.lang.Integer idContaVenda){
    this.idContaVenda = idContaVenda;
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
  public ContaCorrente setIdUsuario(java.lang.Integer idUsuario){
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
    ContaCorrente object = (ContaCorrente)obj;
    if (idContaCorrente != null ? !idContaCorrente.equals(object.idContaCorrente) : object.idContaCorrente != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idContaCorrente == null) ? 0 : idContaCorrente.hashCode());
    return result;
  }

}
