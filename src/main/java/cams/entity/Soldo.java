package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SOLDO
 * @generated
 */
@Entity
@Table(name = "\"SOLDO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Soldo")
public class Soldo implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_SOLDO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idSoldo;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dtUpdate;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_POSTO_GRADUACAO", nullable = false, referencedColumnName = "ID_POSTO_GRADUACAO", insertable=true, updatable=true)
  
  private PostoGraduacao postoGraduacao;

  /**
  * @generated
  */
  @Column(name = "SL_NOME", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String slNome;

  /**
  * @generated
  */
  @Column(name = "SL_VALOR", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double slValor;

  /**
   * Construtor
   * @generated
   */
  public Soldo(){
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
  public Soldo setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém idSoldo
   * return idSoldo
   * @generated
   */
  
  public java.lang.Integer getIdSoldo(){
    return this.idSoldo;
  }

  /**
   * Define idSoldo
   * @param idSoldo idSoldo
   * @generated
   */
  public Soldo setIdSoldo(java.lang.Integer idSoldo){
    this.idSoldo = idSoldo;
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
  public Soldo setIdUsuario(java.lang.Integer idUsuario){
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Obtém postoGraduacao
   * return postoGraduacao
   * @generated
   */
  
  public PostoGraduacao getPostoGraduacao(){
    return this.postoGraduacao;
  }

  /**
   * Define postoGraduacao
   * @param postoGraduacao postoGraduacao
   * @generated
   */
  public Soldo setPostoGraduacao(PostoGraduacao postoGraduacao){
    this.postoGraduacao = postoGraduacao;
    return this;
  }

  /**
   * Obtém slNome
   * return slNome
   * @generated
   */
  
  public java.lang.String getSlNome(){
    return this.slNome;
  }

  /**
   * Define slNome
   * @param slNome slNome
   * @generated
   */
  public Soldo setSlNome(java.lang.String slNome){
    this.slNome = slNome;
    return this;
  }

  /**
   * Obtém slValor
   * return slValor
   * @generated
   */
  
  public java.lang.Double getSlValor(){
    return this.slValor;
  }

  /**
   * Define slValor
   * @param slValor slValor
   * @generated
   */
  public Soldo setSlValor(java.lang.Double slValor){
    this.slValor = slValor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Soldo object = (Soldo)obj;
    if (idSoldo != null ? !idSoldo.equals(object.idSoldo) : object.idSoldo != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idSoldo == null) ? 0 : idSoldo.hashCode());
    return result;
  }

}
