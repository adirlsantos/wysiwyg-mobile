package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CLINICA_EXAME
 * @generated
 */
@Entity
@Table(name = "\"CLINICA_EXAME\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.ClinicaExame")
public class ClinicaExame implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_CLINICA_EXAME", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idClinicaExame;

  /**
  * @generated
  */
  @Column(name = "CE_PRECO_EXAME", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double cePrecoExame;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "CE_ULTIMA_ATUALIZACAO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date ceUltimaAtualizacao;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_CLINICA", nullable = false, referencedColumnName = "ID_CLINICA", insertable=true, updatable=true)
  
  private Clinica clinica;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_EXAME_CONSULTA", nullable = false, referencedColumnName = "ID_EXAME_CONSULTA", insertable=true, updatable=true)
  
  private ExameConsulta exameConsulta;

  /**
   * Construtor
   * @generated
   */
  public ClinicaExame(){
  }


  /**
   * Obtém cePrecoExame
   * return cePrecoExame
   * @generated
   */
  
  public java.lang.Double getCePrecoExame(){
    return this.cePrecoExame;
  }

  /**
   * Define cePrecoExame
   * @param cePrecoExame cePrecoExame
   * @generated
   */
  public ClinicaExame setCePrecoExame(java.lang.Double cePrecoExame){
    this.cePrecoExame = cePrecoExame;
    return this;
  }

  /**
   * Obtém ceUltimaAtualizacao
   * return ceUltimaAtualizacao
   * @generated
   */
  
  public java.util.Date getCeUltimaAtualizacao(){
    return this.ceUltimaAtualizacao;
  }

  /**
   * Define ceUltimaAtualizacao
   * @param ceUltimaAtualizacao ceUltimaAtualizacao
   * @generated
   */
  public ClinicaExame setCeUltimaAtualizacao(java.util.Date ceUltimaAtualizacao){
    this.ceUltimaAtualizacao = ceUltimaAtualizacao;
    return this;
  }

  /**
   * Obtém clinica
   * return clinica
   * @generated
   */
  
  public Clinica getClinica(){
    return this.clinica;
  }

  /**
   * Define clinica
   * @param clinica clinica
   * @generated
   */
  public ClinicaExame setClinica(Clinica clinica){
    this.clinica = clinica;
    return this;
  }

  /**
   * Obtém exameConsulta
   * return exameConsulta
   * @generated
   */
  
  public ExameConsulta getExameConsulta(){
    return this.exameConsulta;
  }

  /**
   * Define exameConsulta
   * @param exameConsulta exameConsulta
   * @generated
   */
  public ClinicaExame setExameConsulta(ExameConsulta exameConsulta){
    this.exameConsulta = exameConsulta;
    return this;
  }

  /**
   * Obtém idClinicaExame
   * return idClinicaExame
   * @generated
   */
  
  public java.lang.Integer getIdClinicaExame(){
    return this.idClinicaExame;
  }

  /**
   * Define idClinicaExame
   * @param idClinicaExame idClinicaExame
   * @generated
   */
  public ClinicaExame setIdClinicaExame(java.lang.Integer idClinicaExame){
    this.idClinicaExame = idClinicaExame;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ClinicaExame object = (ClinicaExame)obj;
    if (idClinicaExame != null ? !idClinicaExame.equals(object.idClinicaExame) : object.idClinicaExame != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idClinicaExame == null) ? 0 : idClinicaExame.hashCode());
    return result;
  }

}
