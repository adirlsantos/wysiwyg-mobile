package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela EXAME_CONSULTA
 * @generated
 */
@Entity
@Table(name = "\"EXAME_CONSULTA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.ExameConsulta")
public class ExameConsulta implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_EXAME_CONSULTA", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idExameConsulta;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dtUpdate;

  /**
  * @generated
  */
  @Column(name = "EC_CARENCIA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer ecCarencia;

  /**
  * @generated
  */
  @Column(name = "EC_CODIGO_AMB", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String ecCodigoAmb;

  /**
  * @generated
  */
  @Column(name = "EC_DESCRICAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String ecDescricao;

  /**
  * @generated
  */
  @Column(name = "EC_DESCRICAO_RESUMIDA", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String ecDescricaoResumida;

  /**
  * @generated
  */
  @Column(name = "EC_EXAME_CONSULTA", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String ecExameConsulta;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
   * Construtor
   * @generated
   */
  public ExameConsulta(){
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
  public ExameConsulta setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém ecCarencia
   * return ecCarencia
   * @generated
   */
  
  public java.lang.Integer getEcCarencia(){
    return this.ecCarencia;
  }

  /**
   * Define ecCarencia
   * @param ecCarencia ecCarencia
   * @generated
   */
  public ExameConsulta setEcCarencia(java.lang.Integer ecCarencia){
    this.ecCarencia = ecCarencia;
    return this;
  }

  /**
   * Obtém ecCodigoAmb
   * return ecCodigoAmb
   * @generated
   */
  
  public java.lang.String getEcCodigoAmb(){
    return this.ecCodigoAmb;
  }

  /**
   * Define ecCodigoAmb
   * @param ecCodigoAmb ecCodigoAmb
   * @generated
   */
  public ExameConsulta setEcCodigoAmb(java.lang.String ecCodigoAmb){
    this.ecCodigoAmb = ecCodigoAmb;
    return this;
  }

  /**
   * Obtém ecDescricao
   * return ecDescricao
   * @generated
   */
  
  public java.lang.String getEcDescricao(){
    return this.ecDescricao;
  }

  /**
   * Define ecDescricao
   * @param ecDescricao ecDescricao
   * @generated
   */
  public ExameConsulta setEcDescricao(java.lang.String ecDescricao){
    this.ecDescricao = ecDescricao;
    return this;
  }

  /**
   * Obtém ecDescricaoResumida
   * return ecDescricaoResumida
   * @generated
   */
  
  public java.lang.String getEcDescricaoResumida(){
    return this.ecDescricaoResumida;
  }

  /**
   * Define ecDescricaoResumida
   * @param ecDescricaoResumida ecDescricaoResumida
   * @generated
   */
  public ExameConsulta setEcDescricaoResumida(java.lang.String ecDescricaoResumida){
    this.ecDescricaoResumida = ecDescricaoResumida;
    return this;
  }

  /**
   * Obtém ecExameConsulta
   * return ecExameConsulta
   * @generated
   */
  
  public java.lang.String getEcExameConsulta(){
    return this.ecExameConsulta;
  }

  /**
   * Define ecExameConsulta
   * @param ecExameConsulta ecExameConsulta
   * @generated
   */
  public ExameConsulta setEcExameConsulta(java.lang.String ecExameConsulta){
    this.ecExameConsulta = ecExameConsulta;
    return this;
  }

  /**
   * Obtém idExameConsulta
   * return idExameConsulta
   * @generated
   */
  
  public java.lang.Integer getIdExameConsulta(){
    return this.idExameConsulta;
  }

  /**
   * Define idExameConsulta
   * @param idExameConsulta idExameConsulta
   * @generated
   */
  public ExameConsulta setIdExameConsulta(java.lang.Integer idExameConsulta){
    this.idExameConsulta = idExameConsulta;
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
  public ExameConsulta setIdUsuario(java.lang.Integer idUsuario){
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
    ExameConsulta object = (ExameConsulta)obj;
    if (idExameConsulta != null ? !idExameConsulta.equals(object.idExameConsulta) : object.idExameConsulta != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idExameConsulta == null) ? 0 : idExameConsulta.hashCode());
    return result;
  }

}
