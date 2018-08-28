package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela BANCO
 * @generated
 */
@Entity
@Table(name = "\"BANCO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Banco")
public class Banco implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_BANCO", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idBanco;

  /**
  * @generated
  */
  @Column(name = "BA_CODIGO", nullable = false, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String baCodigo;

  /**
  * @generated
  */
  @Column(name = "BA_DESCRICAO", nullable = false, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String baDescricao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dtUpdate;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
   * Construtor
   * @generated
   */
  public Banco(){
  }


  /**
   * Obtém baCodigo
   * return baCodigo
   * @generated
   */
  
  public java.lang.String getBaCodigo(){
    return this.baCodigo;
  }

  /**
   * Define baCodigo
   * @param baCodigo baCodigo
   * @generated
   */
  public Banco setBaCodigo(java.lang.String baCodigo){
    this.baCodigo = baCodigo;
    return this;
  }

  /**
   * Obtém baDescricao
   * return baDescricao
   * @generated
   */
  
  public java.lang.String getBaDescricao(){
    return this.baDescricao;
  }

  /**
   * Define baDescricao
   * @param baDescricao baDescricao
   * @generated
   */
  public Banco setBaDescricao(java.lang.String baDescricao){
    this.baDescricao = baDescricao;
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
  public Banco setDtUpdate(java.util.Date dtUpdate){
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
  public Banco setIdBanco(java.lang.Integer idBanco){
    this.idBanco = idBanco;
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
  public Banco setIdUsuario(java.lang.Integer idUsuario){
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
    Banco object = (Banco)obj;
    if (idBanco != null ? !idBanco.equals(object.idBanco) : object.idBanco != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idBanco == null) ? 0 : idBanco.hashCode());
    return result;
  }

}
