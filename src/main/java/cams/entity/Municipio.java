package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela MUNICIPIO
 * @generated
 */
@Entity
@Table(name = "\"MUNICIPIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Municipio")
public class Municipio implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_MUNICIPIO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idMunicipio;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dtUpdate;

  /**
  * @generated
  */
  @Column(name = "ID_UF", nullable = false, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String idUf;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
  * @generated
  */
  @Column(name = "MU_DESCRICAO", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String muDescricao;

  /**
   * Construtor
   * @generated
   */
  public Municipio(){
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
  public Municipio setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém idMunicipio
   * return idMunicipio
   * @generated
   */
  
  public java.lang.Integer getIdMunicipio(){
    return this.idMunicipio;
  }

  /**
   * Define idMunicipio
   * @param idMunicipio idMunicipio
   * @generated
   */
  public Municipio setIdMunicipio(java.lang.Integer idMunicipio){
    this.idMunicipio = idMunicipio;
    return this;
  }

  /**
   * Obtém idUf
   * return idUf
   * @generated
   */
  
  public java.lang.String getIdUf(){
    return this.idUf;
  }

  /**
   * Define idUf
   * @param idUf idUf
   * @generated
   */
  public Municipio setIdUf(java.lang.String idUf){
    this.idUf = idUf;
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
  public Municipio setIdUsuario(java.lang.Integer idUsuario){
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Obtém muDescricao
   * return muDescricao
   * @generated
   */
  
  public java.lang.String getMuDescricao(){
    return this.muDescricao;
  }

  /**
   * Define muDescricao
   * @param muDescricao muDescricao
   * @generated
   */
  public Municipio setMuDescricao(java.lang.String muDescricao){
    this.muDescricao = muDescricao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Municipio object = (Municipio)obj;
    if (idMunicipio != null ? !idMunicipio.equals(object.idMunicipio) : object.idMunicipio != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idMunicipio == null) ? 0 : idMunicipio.hashCode());
    return result;
  }

}
