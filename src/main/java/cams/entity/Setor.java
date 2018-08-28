package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SETOR
 * @generated
 */
@Entity
@Table(name = "\"SETOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Setor")
public class Setor implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_SETOR", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idSetor;

  /**
  * @generated
  */
  @Column(name = "ST_NOME", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String stNome;

  /**
  * @generated
  */
  @Column(name = "ST_RESPONSAVEL", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String stResponsavel;

  /**
  * @generated
  */
  @Column(name = "ST_TELEFONE", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String stTelefone;

  /**
   * Construtor
   * @generated
   */
  public Setor(){
  }


  /**
   * Obtém idSetor
   * return idSetor
   * @generated
   */
  
  public java.lang.Integer getIdSetor(){
    return this.idSetor;
  }

  /**
   * Define idSetor
   * @param idSetor idSetor
   * @generated
   */
  public Setor setIdSetor(java.lang.Integer idSetor){
    this.idSetor = idSetor;
    return this;
  }

  /**
   * Obtém stNome
   * return stNome
   * @generated
   */
  
  public java.lang.String getStNome(){
    return this.stNome;
  }

  /**
   * Define stNome
   * @param stNome stNome
   * @generated
   */
  public Setor setStNome(java.lang.String stNome){
    this.stNome = stNome;
    return this;
  }

  /**
   * Obtém stResponsavel
   * return stResponsavel
   * @generated
   */
  
  public java.lang.String getStResponsavel(){
    return this.stResponsavel;
  }

  /**
   * Define stResponsavel
   * @param stResponsavel stResponsavel
   * @generated
   */
  public Setor setStResponsavel(java.lang.String stResponsavel){
    this.stResponsavel = stResponsavel;
    return this;
  }

  /**
   * Obtém stTelefone
   * return stTelefone
   * @generated
   */
  
  public java.lang.String getStTelefone(){
    return this.stTelefone;
  }

  /**
   * Define stTelefone
   * @param stTelefone stTelefone
   * @generated
   */
  public Setor setStTelefone(java.lang.String stTelefone){
    this.stTelefone = stTelefone;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Setor object = (Setor)obj;
    if (idSetor != null ? !idSetor.equals(object.idSetor) : object.idSetor != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idSetor == null) ? 0 : idSetor.hashCode());
    return result;
  }

}
