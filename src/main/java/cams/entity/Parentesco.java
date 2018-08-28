package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PARENTESCO
 * @generated
 */
@Entity
@Table(name = "\"PARENTESCO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Parentesco")
public class Parentesco implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_PARENTESCO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idParentesco;

  /**
  * @generated
  */
  @Column(name = "PR_DESCRICAO", nullable = true, unique = false, length=80, insertable=true, updatable=true)
  
  private java.lang.String prDescricao;

  /**
   * Construtor
   * @generated
   */
  public Parentesco(){
  }


  /**
   * Obtém idParentesco
   * return idParentesco
   * @generated
   */
  
  public java.lang.Integer getIdParentesco(){
    return this.idParentesco;
  }

  /**
   * Define idParentesco
   * @param idParentesco idParentesco
   * @generated
   */
  public Parentesco setIdParentesco(java.lang.Integer idParentesco){
    this.idParentesco = idParentesco;
    return this;
  }

  /**
   * Obtém prDescricao
   * return prDescricao
   * @generated
   */
  
  public java.lang.String getPrDescricao(){
    return this.prDescricao;
  }

  /**
   * Define prDescricao
   * @param prDescricao prDescricao
   * @generated
   */
  public Parentesco setPrDescricao(java.lang.String prDescricao){
    this.prDescricao = prDescricao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Parentesco object = (Parentesco)obj;
    if (idParentesco != null ? !idParentesco.equals(object.idParentesco) : object.idParentesco != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idParentesco == null) ? 0 : idParentesco.hashCode());
    return result;
  }

}
