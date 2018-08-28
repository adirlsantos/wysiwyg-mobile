package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ATIVIDADE_MEDICA
 * @generated
 */
@Entity
@Table(name = "\"ATIVIDADE_MEDICA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.AtividadeMedica")
public class AtividadeMedica implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_ATIVIDADE_MEDICA", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idAtividadeMedica;

  /**
  * @generated
  */
  @Column(name = "AM_DESCRICAO", nullable = true, unique = false, length=80, insertable=true, updatable=true)
  
  private java.lang.String amDescricao;

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
  public AtividadeMedica(){
  }


  /**
   * Obtém amDescricao
   * return amDescricao
   * @generated
   */
  
  public java.lang.String getAmDescricao(){
    return this.amDescricao;
  }

  /**
   * Define amDescricao
   * @param amDescricao amDescricao
   * @generated
   */
  public AtividadeMedica setAmDescricao(java.lang.String amDescricao){
    this.amDescricao = amDescricao;
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
  public AtividadeMedica setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém idAtividadeMedica
   * return idAtividadeMedica
   * @generated
   */
  
  public java.lang.Integer getIdAtividadeMedica(){
    return this.idAtividadeMedica;
  }

  /**
   * Define idAtividadeMedica
   * @param idAtividadeMedica idAtividadeMedica
   * @generated
   */
  public AtividadeMedica setIdAtividadeMedica(java.lang.Integer idAtividadeMedica){
    this.idAtividadeMedica = idAtividadeMedica;
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
  public AtividadeMedica setIdUsuario(java.lang.Integer idUsuario){
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
    AtividadeMedica object = (AtividadeMedica)obj;
    if (idAtividadeMedica != null ? !idAtividadeMedica.equals(object.idAtividadeMedica) : object.idAtividadeMedica != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idAtividadeMedica == null) ? 0 : idAtividadeMedica.hashCode());
    return result;
  }

}
