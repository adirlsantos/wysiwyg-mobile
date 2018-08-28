package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LAYOUT
 * @generated
 */
@Entity
@Table(name = "\"LAYOUT\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Layout")
public class Layout implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_LAYOUT", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idLayout;

  /**
  * @generated
  */
  @Column(name = "LY_LAYOUT", nullable = false, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String lyLayout;

  /**
  * @generated
  */
  @Column(name = "LY_OBSERVACAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String lyObservacao;

  /**
  * @generated
  */
  @Column(name = "TIPO_LAYOUT", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String tipoLayout;

  /**
   * Construtor
   * @generated
   */
  public Layout(){
  }


  /**
   * Obtém idLayout
   * return idLayout
   * @generated
   */
  
  public java.lang.Integer getIdLayout(){
    return this.idLayout;
  }

  /**
   * Define idLayout
   * @param idLayout idLayout
   * @generated
   */
  public Layout setIdLayout(java.lang.Integer idLayout){
    this.idLayout = idLayout;
    return this;
  }

  /**
   * Obtém lyLayout
   * return lyLayout
   * @generated
   */
  
  public java.lang.String getLyLayout(){
    return this.lyLayout;
  }

  /**
   * Define lyLayout
   * @param lyLayout lyLayout
   * @generated
   */
  public Layout setLyLayout(java.lang.String lyLayout){
    this.lyLayout = lyLayout;
    return this;
  }

  /**
   * Obtém lyObservacao
   * return lyObservacao
   * @generated
   */
  
  public java.lang.String getLyObservacao(){
    return this.lyObservacao;
  }

  /**
   * Define lyObservacao
   * @param lyObservacao lyObservacao
   * @generated
   */
  public Layout setLyObservacao(java.lang.String lyObservacao){
    this.lyObservacao = lyObservacao;
    return this;
  }

  /**
   * Obtém tipoLayout
   * return tipoLayout
   * @generated
   */
  
  public java.lang.String getTipoLayout(){
    return this.tipoLayout;
  }

  /**
   * Define tipoLayout
   * @param tipoLayout tipoLayout
   * @generated
   */
  public Layout setTipoLayout(java.lang.String tipoLayout){
    this.tipoLayout = tipoLayout;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Layout object = (Layout)obj;
    if (idLayout != null ? !idLayout.equals(object.idLayout) : object.idLayout != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idLayout == null) ? 0 : idLayout.hashCode());
    return result;
  }

}
