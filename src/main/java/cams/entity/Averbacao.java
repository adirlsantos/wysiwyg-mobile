package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela AVERBACAO
 * @generated
 */
@Entity
@Table(name = "\"AVERBACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Averbacao")
public class Averbacao implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_AVERBACAO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idAverbacao;

  /**
  * @generated
  */
  @Column(name = "AV_EXERCICIO", nullable = false, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String avExercicio;

  /**
  * @generated
  */
  @Column(name = "AV_PERCENTUAL", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double avPercentual;

  /**
  * @generated
  */
  @Column(name = "AV_TIPO_ENVIO", nullable = false, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String avTipoEnvio;

  /**
  * @generated
  */
  @Column(name = "ID_SOCIO", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idSocio;

  /**
   * Construtor
   * @generated
   */
  public Averbacao(){
  }


  /**
   * Obtém avExercicio
   * return avExercicio
   * @generated
   */
  
  public java.lang.String getAvExercicio(){
    return this.avExercicio;
  }

  /**
   * Define avExercicio
   * @param avExercicio avExercicio
   * @generated
   */
  public Averbacao setAvExercicio(java.lang.String avExercicio){
    this.avExercicio = avExercicio;
    return this;
  }

  /**
   * Obtém avPercentual
   * return avPercentual
   * @generated
   */
  
  public java.lang.Double getAvPercentual(){
    return this.avPercentual;
  }

  /**
   * Define avPercentual
   * @param avPercentual avPercentual
   * @generated
   */
  public Averbacao setAvPercentual(java.lang.Double avPercentual){
    this.avPercentual = avPercentual;
    return this;
  }

  /**
   * Obtém avTipoEnvio
   * return avTipoEnvio
   * @generated
   */
  
  public java.lang.String getAvTipoEnvio(){
    return this.avTipoEnvio;
  }

  /**
   * Define avTipoEnvio
   * @param avTipoEnvio avTipoEnvio
   * @generated
   */
  public Averbacao setAvTipoEnvio(java.lang.String avTipoEnvio){
    this.avTipoEnvio = avTipoEnvio;
    return this;
  }

  /**
   * Obtém idAverbacao
   * return idAverbacao
   * @generated
   */
  
  public java.lang.Integer getIdAverbacao(){
    return this.idAverbacao;
  }

  /**
   * Define idAverbacao
   * @param idAverbacao idAverbacao
   * @generated
   */
  public Averbacao setIdAverbacao(java.lang.Integer idAverbacao){
    this.idAverbacao = idAverbacao;
    return this;
  }

  /**
   * Obtém idSocio
   * return idSocio
   * @generated
   */
  
  public java.lang.Integer getIdSocio(){
    return this.idSocio;
  }

  /**
   * Define idSocio
   * @param idSocio idSocio
   * @generated
   */
  public Averbacao setIdSocio(java.lang.Integer idSocio){
    this.idSocio = idSocio;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Averbacao object = (Averbacao)obj;
    if (idAverbacao != null ? !idAverbacao.equals(object.idAverbacao) : object.idAverbacao != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idAverbacao == null) ? 0 : idAverbacao.hashCode());
    return result;
  }

}
