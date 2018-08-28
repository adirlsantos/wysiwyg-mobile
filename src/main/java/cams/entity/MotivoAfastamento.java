package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela MOTIVO_AFASTAMENTO
 * @generated
 */
@Entity
@Table(name = "\"MOTIVO_AFASTAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.MotivoAfastamento")
public class MotivoAfastamento implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_MOTIVO_AFASTAMENTO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idMotivoAfastamento;

  /**
  * @generated
  */
  @Column(name = "AF_DESCRICAO", nullable = true, unique = false, length=80, insertable=true, updatable=true)
  
  private java.lang.String afDescricao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dtUpdate;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
   * Construtor
   * @generated
   */
  public MotivoAfastamento(){
  }


  /**
   * Obtém afDescricao
   * return afDescricao
   * @generated
   */
  
  public java.lang.String getAfDescricao(){
    return this.afDescricao;
  }

  /**
   * Define afDescricao
   * @param afDescricao afDescricao
   * @generated
   */
  public MotivoAfastamento setAfDescricao(java.lang.String afDescricao){
    this.afDescricao = afDescricao;
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
  public MotivoAfastamento setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém idMotivoAfastamento
   * return idMotivoAfastamento
   * @generated
   */
  
  public java.lang.Integer getIdMotivoAfastamento(){
    return this.idMotivoAfastamento;
  }

  /**
   * Define idMotivoAfastamento
   * @param idMotivoAfastamento idMotivoAfastamento
   * @generated
   */
  public MotivoAfastamento setIdMotivoAfastamento(java.lang.Integer idMotivoAfastamento){
    this.idMotivoAfastamento = idMotivoAfastamento;
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
  public MotivoAfastamento setIdUsuario(java.lang.Integer idUsuario){
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
    MotivoAfastamento object = (MotivoAfastamento)obj;
    if (idMotivoAfastamento != null ? !idMotivoAfastamento.equals(object.idMotivoAfastamento) : object.idMotivoAfastamento != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idMotivoAfastamento == null) ? 0 : idMotivoAfastamento.hashCode());
    return result;
  }

}
