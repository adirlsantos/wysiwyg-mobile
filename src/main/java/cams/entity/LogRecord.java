package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LOG_RECORD
 * @generated
 */
@Entity
@Table(name = "\"LOG_RECORD\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.LogRecord")
public class LogRecord implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_LOG_RECORD", nullable = false, length=46, insertable=true, updatable=true)
  private java.lang.String idLogRecord;

  /**
  * @generated
  */
  @Column(name = "ID_EMPRESA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idEmpresa;

  /**
  * @generated
  */
  @Column(name = "ID_FILIAL", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idFilial;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "LG_DATA_MAQ", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date lgDataMaq;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "LG_DATA_SRV", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date lgDataSrv;

  /**
  * @generated
  */
  @Column(name = "LG_HISTORICO", nullable = true, unique = false, length=1024, insertable=true, updatable=true)
  
  private java.lang.String lgHistorico;

  /**
  * @generated
  */
  @Column(name = "LG_TABELA", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String lgTabela;

  /**
   * Construtor
   * @generated
   */
  public LogRecord(){
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
  public LogRecord setIdEmpresa(java.lang.Integer idEmpresa){
    this.idEmpresa = idEmpresa;
    return this;
  }

  /**
   * Obtém idFilial
   * return idFilial
   * @generated
   */
  
  public java.lang.Integer getIdFilial(){
    return this.idFilial;
  }

  /**
   * Define idFilial
   * @param idFilial idFilial
   * @generated
   */
  public LogRecord setIdFilial(java.lang.Integer idFilial){
    this.idFilial = idFilial;
    return this;
  }

  /**
   * Obtém idLogRecord
   * return idLogRecord
   * @generated
   */
  
  public java.lang.String getIdLogRecord(){
    return this.idLogRecord;
  }

  /**
   * Define idLogRecord
   * @param idLogRecord idLogRecord
   * @generated
   */
  public LogRecord setIdLogRecord(java.lang.String idLogRecord){
    this.idLogRecord = idLogRecord;
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
  public LogRecord setIdUsuario(java.lang.Integer idUsuario){
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Obtém lgDataMaq
   * return lgDataMaq
   * @generated
   */
  
  public java.util.Date getLgDataMaq(){
    return this.lgDataMaq;
  }

  /**
   * Define lgDataMaq
   * @param lgDataMaq lgDataMaq
   * @generated
   */
  public LogRecord setLgDataMaq(java.util.Date lgDataMaq){
    this.lgDataMaq = lgDataMaq;
    return this;
  }

  /**
   * Obtém lgDataSrv
   * return lgDataSrv
   * @generated
   */
  
  public java.util.Date getLgDataSrv(){
    return this.lgDataSrv;
  }

  /**
   * Define lgDataSrv
   * @param lgDataSrv lgDataSrv
   * @generated
   */
  public LogRecord setLgDataSrv(java.util.Date lgDataSrv){
    this.lgDataSrv = lgDataSrv;
    return this;
  }

  /**
   * Obtém lgHistorico
   * return lgHistorico
   * @generated
   */
  
  public java.lang.String getLgHistorico(){
    return this.lgHistorico;
  }

  /**
   * Define lgHistorico
   * @param lgHistorico lgHistorico
   * @generated
   */
  public LogRecord setLgHistorico(java.lang.String lgHistorico){
    this.lgHistorico = lgHistorico;
    return this;
  }

  /**
   * Obtém lgTabela
   * return lgTabela
   * @generated
   */
  
  public java.lang.String getLgTabela(){
    return this.lgTabela;
  }

  /**
   * Define lgTabela
   * @param lgTabela lgTabela
   * @generated
   */
  public LogRecord setLgTabela(java.lang.String lgTabela){
    this.lgTabela = lgTabela;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    LogRecord object = (LogRecord)obj;
    if (idLogRecord != null ? !idLogRecord.equals(object.idLogRecord) : object.idLogRecord != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idLogRecord == null) ? 0 : idLogRecord.hashCode());
    return result;
  }

}
