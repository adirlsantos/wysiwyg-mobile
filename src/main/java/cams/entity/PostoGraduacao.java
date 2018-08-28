package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela POSTO_GRADUACAO
 * @generated
 */
@Entity
@Table(name = "\"POSTO_GRADUACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.PostoGraduacao")
public class PostoGraduacao implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_POSTO_GRADUACAO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idPostoGraduacao;

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
  @Column(name = "PG_NOME", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String pgNome;

  /**
   * Construtor
   * @generated
   */
  public PostoGraduacao(){
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
  public PostoGraduacao setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém idPostoGraduacao
   * return idPostoGraduacao
   * @generated
   */
  
  public java.lang.Integer getIdPostoGraduacao(){
    return this.idPostoGraduacao;
  }

  /**
   * Define idPostoGraduacao
   * @param idPostoGraduacao idPostoGraduacao
   * @generated
   */
  public PostoGraduacao setIdPostoGraduacao(java.lang.Integer idPostoGraduacao){
    this.idPostoGraduacao = idPostoGraduacao;
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
  public PostoGraduacao setIdUsuario(java.lang.Integer idUsuario){
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Obtém pgNome
   * return pgNome
   * @generated
   */
  
  public java.lang.String getPgNome(){
    return this.pgNome;
  }

  /**
   * Define pgNome
   * @param pgNome pgNome
   * @generated
   */
  public PostoGraduacao setPgNome(java.lang.String pgNome){
    this.pgNome = pgNome;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PostoGraduacao object = (PostoGraduacao)obj;
    if (idPostoGraduacao != null ? !idPostoGraduacao.equals(object.idPostoGraduacao) : object.idPostoGraduacao != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idPostoGraduacao == null) ? 0 : idPostoGraduacao.hashCode());
    return result;
  }

}
