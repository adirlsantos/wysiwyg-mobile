package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TIPO_DEPENDENTE
 * @generated
 */
@Entity
@Table(name = "\"TIPO_DEPENDENTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.TipoDependente")
public class TipoDependente implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_TIPO_DEPENDENTE", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idTipoDependente;

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
  * @generated
  */
  @Column(name = "TD_DESCRICAO", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String tdDescricao;

  /**
   * Construtor
   * @generated
   */
  public TipoDependente(){
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
  public TipoDependente setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém idTipoDependente
   * return idTipoDependente
   * @generated
   */
  
  public java.lang.Integer getIdTipoDependente(){
    return this.idTipoDependente;
  }

  /**
   * Define idTipoDependente
   * @param idTipoDependente idTipoDependente
   * @generated
   */
  public TipoDependente setIdTipoDependente(java.lang.Integer idTipoDependente){
    this.idTipoDependente = idTipoDependente;
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
  public TipoDependente setIdUsuario(java.lang.Integer idUsuario){
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Obtém tdDescricao
   * return tdDescricao
   * @generated
   */
  
  public java.lang.String getTdDescricao(){
    return this.tdDescricao;
  }

  /**
   * Define tdDescricao
   * @param tdDescricao tdDescricao
   * @generated
   */
  public TipoDependente setTdDescricao(java.lang.String tdDescricao){
    this.tdDescricao = tdDescricao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TipoDependente object = (TipoDependente)obj;
    if (idTipoDependente != null ? !idTipoDependente.equals(object.idTipoDependente) : object.idTipoDependente != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idTipoDependente == null) ? 0 : idTipoDependente.hashCode());
    return result;
  }

}
