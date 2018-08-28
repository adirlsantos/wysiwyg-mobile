package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela AGENCIA
 * @generated
 */
@Entity
@Table(name = "\"AGENCIA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Agencia")
public class Agencia implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_AGENCIA", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idAgencia;

  /**
  * @generated
  */
  @Column(name = "AG_LOCAL", nullable = true, unique = false, length=40, insertable=true, updatable=true)
  
  private java.lang.String agLocal;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_BANCO", nullable = false, referencedColumnName = "ID_BANCO", insertable=true, updatable=true)
  
  private Banco banco;

  /**
  * @generated
  */
  @Column(name = "CONTA_AGENCIA", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.Integer contaAgencia;

  /**
  * @generated
  */
  @Column(name = "DIG_AGENCIA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String digAgencia;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
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
  public Agencia(){
  }


  /**
   * Obtém agLocal
   * return agLocal
   * @generated
   */
  
  public java.lang.String getAgLocal(){
    return this.agLocal;
  }

  /**
   * Define agLocal
   * @param agLocal agLocal
   * @generated
   */
  public Agencia setAgLocal(java.lang.String agLocal){
    this.agLocal = agLocal;
    return this;
  }

  /**
   * Obtém banco
   * return banco
   * @generated
   */
  
  public Banco getBanco(){
    return this.banco;
  }

  /**
   * Define banco
   * @param banco banco
   * @generated
   */
  public Agencia setBanco(Banco banco){
    this.banco = banco;
    return this;
  }

  /**
   * Obtém contaAgencia
   * return contaAgencia
   * @generated
   */
  
  public java.lang.Integer getContaAgencia(){
    return this.contaAgencia;
  }

  /**
   * Define contaAgencia
   * @param contaAgencia contaAgencia
   * @generated
   */
  public Agencia setContaAgencia(java.lang.Integer contaAgencia){
    this.contaAgencia = contaAgencia;
    return this;
  }

  /**
   * Obtém digAgencia
   * return digAgencia
   * @generated
   */
  
  public java.lang.String getDigAgencia(){
    return this.digAgencia;
  }

  /**
   * Define digAgencia
   * @param digAgencia digAgencia
   * @generated
   */
  public Agencia setDigAgencia(java.lang.String digAgencia){
    this.digAgencia = digAgencia;
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
  public Agencia setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém idAgencia
   * return idAgencia
   * @generated
   */
  
  public java.lang.Integer getIdAgencia(){
    return this.idAgencia;
  }

  /**
   * Define idAgencia
   * @param idAgencia idAgencia
   * @generated
   */
  public Agencia setIdAgencia(java.lang.Integer idAgencia){
    this.idAgencia = idAgencia;
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
  public Agencia setIdUsuario(java.lang.Integer idUsuario){
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
    Agencia object = (Agencia)obj;
    if (idAgencia != null ? !idAgencia.equals(object.idAgencia) : object.idAgencia != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idAgencia == null) ? 0 : idAgencia.hashCode());
    return result;
  }

}
