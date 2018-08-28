package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela GUIA_LABORATORIAL
 * @generated
 */
@Entity
@Table(name = "\"GUIA_LABORATORIAL\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.GuiaLaboratorial")
public class GuiaLaboratorial implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_GUIA_LABORATORIO", nullable = false, length=100, insertable=true, updatable=true)
  private java.lang.Integer idGuiaLaboratorio;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_FILIAL", nullable = false, referencedColumnName = "ID_FILIAL", insertable=true, updatable=true)
  
  private Filial filial;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "GL_ATENDIMENTO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date glAtendimento;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "GL_ENTREGA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.util.Date glEntrega;

  /**
  * @generated
  */
  @Column(name = "GL_IDADE", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String glIdade;

  /**
  * @generated
  */
  @Column(name = "GL_MEDICO_RESPONSAVEL", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String glMedicoResponsavel;

  /**
  * @generated
  */
  @Column(name = "GL_MEDICO_SOLICITANTE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String glMedicoSolicitante;

  /**
  * @generated
  */
  @Column(name = "GL_OBSERVACAO", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String glObservacao;

  /**
  * @generated
  */
  @Column(name = "GL_TELEFONE", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String glTelefone;

  /**
  * @generated
  */
  @Column(name = "GL_TIPO_PACIENTE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String glTipoPaciente;

  /**
  * @generated
  */
  @Column(name = "ID_DEPENDENTE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idDependente;

  /**
  * @generated
  */
  @Column(name = "SC_NOME", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String scNome;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_SOCIO", nullable = true, referencedColumnName = "ID_SOCIO", insertable=true, updatable=true)
  
  private Socio socio;

  /**
   * Construtor
   * @generated
   */
  public GuiaLaboratorial(){
  }


  /**
   * Obtém filial
   * return filial
   * @generated
   */
  
  public Filial getFilial(){
    return this.filial;
  }

  /**
   * Define filial
   * @param filial filial
   * @generated
   */
  public GuiaLaboratorial setFilial(Filial filial){
    this.filial = filial;
    return this;
  }

  /**
   * Obtém glAtendimento
   * return glAtendimento
   * @generated
   */
  
  public java.util.Date getGlAtendimento(){
    return this.glAtendimento;
  }

  /**
   * Define glAtendimento
   * @param glAtendimento glAtendimento
   * @generated
   */
  public GuiaLaboratorial setGlAtendimento(java.util.Date glAtendimento){
    this.glAtendimento = glAtendimento;
    return this;
  }

  /**
   * Obtém glEntrega
   * return glEntrega
   * @generated
   */
  
  public java.util.Date getGlEntrega(){
    return this.glEntrega;
  }

  /**
   * Define glEntrega
   * @param glEntrega glEntrega
   * @generated
   */
  public GuiaLaboratorial setGlEntrega(java.util.Date glEntrega){
    this.glEntrega = glEntrega;
    return this;
  }

  /**
   * Obtém glIdade
   * return glIdade
   * @generated
   */
  
  public java.lang.String getGlIdade(){
    return this.glIdade;
  }

  /**
   * Define glIdade
   * @param glIdade glIdade
   * @generated
   */
  public GuiaLaboratorial setGlIdade(java.lang.String glIdade){
    this.glIdade = glIdade;
    return this;
  }

  /**
   * Obtém glMedicoResponsavel
   * return glMedicoResponsavel
   * @generated
   */
  
  public java.lang.String getGlMedicoResponsavel(){
    return this.glMedicoResponsavel;
  }

  /**
   * Define glMedicoResponsavel
   * @param glMedicoResponsavel glMedicoResponsavel
   * @generated
   */
  public GuiaLaboratorial setGlMedicoResponsavel(java.lang.String glMedicoResponsavel){
    this.glMedicoResponsavel = glMedicoResponsavel;
    return this;
  }

  /**
   * Obtém glMedicoSolicitante
   * return glMedicoSolicitante
   * @generated
   */
  
  public java.lang.String getGlMedicoSolicitante(){
    return this.glMedicoSolicitante;
  }

  /**
   * Define glMedicoSolicitante
   * @param glMedicoSolicitante glMedicoSolicitante
   * @generated
   */
  public GuiaLaboratorial setGlMedicoSolicitante(java.lang.String glMedicoSolicitante){
    this.glMedicoSolicitante = glMedicoSolicitante;
    return this;
  }

  /**
   * Obtém glObservacao
   * return glObservacao
   * @generated
   */
  
  public java.lang.String getGlObservacao(){
    return this.glObservacao;
  }

  /**
   * Define glObservacao
   * @param glObservacao glObservacao
   * @generated
   */
  public GuiaLaboratorial setGlObservacao(java.lang.String glObservacao){
    this.glObservacao = glObservacao;
    return this;
  }

  /**
   * Obtém glTelefone
   * return glTelefone
   * @generated
   */
  
  public java.lang.String getGlTelefone(){
    return this.glTelefone;
  }

  /**
   * Define glTelefone
   * @param glTelefone glTelefone
   * @generated
   */
  public GuiaLaboratorial setGlTelefone(java.lang.String glTelefone){
    this.glTelefone = glTelefone;
    return this;
  }

  /**
   * Obtém glTipoPaciente
   * return glTipoPaciente
   * @generated
   */
  
  public java.lang.String getGlTipoPaciente(){
    return this.glTipoPaciente;
  }

  /**
   * Define glTipoPaciente
   * @param glTipoPaciente glTipoPaciente
   * @generated
   */
  public GuiaLaboratorial setGlTipoPaciente(java.lang.String glTipoPaciente){
    this.glTipoPaciente = glTipoPaciente;
    return this;
  }

  /**
   * Obtém idDependente
   * return idDependente
   * @generated
   */
  
  public java.lang.Integer getIdDependente(){
    return this.idDependente;
  }

  /**
   * Define idDependente
   * @param idDependente idDependente
   * @generated
   */
  public GuiaLaboratorial setIdDependente(java.lang.Integer idDependente){
    this.idDependente = idDependente;
    return this;
  }

  /**
   * Obtém idGuiaLaboratorio
   * return idGuiaLaboratorio
   * @generated
   */
  
  public java.lang.Integer getIdGuiaLaboratorio(){
    return this.idGuiaLaboratorio;
  }

  /**
   * Define idGuiaLaboratorio
   * @param idGuiaLaboratorio idGuiaLaboratorio
   * @generated
   */
  public GuiaLaboratorial setIdGuiaLaboratorio(java.lang.Integer idGuiaLaboratorio){
    this.idGuiaLaboratorio = idGuiaLaboratorio;
    return this;
  }

  /**
   * Obtém scNome
   * return scNome
   * @generated
   */
  
  public java.lang.String getScNome(){
    return this.scNome;
  }

  /**
   * Define scNome
   * @param scNome scNome
   * @generated
   */
  public GuiaLaboratorial setScNome(java.lang.String scNome){
    this.scNome = scNome;
    return this;
  }

  /**
   * Obtém socio
   * return socio
   * @generated
   */
  
  public Socio getSocio(){
    return this.socio;
  }

  /**
   * Define socio
   * @param socio socio
   * @generated
   */
  public GuiaLaboratorial setSocio(Socio socio){
    this.socio = socio;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    GuiaLaboratorial object = (GuiaLaboratorial)obj;
    if (idGuiaLaboratorio != null ? !idGuiaLaboratorio.equals(object.idGuiaLaboratorio) : object.idGuiaLaboratorio != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGuiaLaboratorio == null) ? 0 : idGuiaLaboratorio.hashCode());
    return result;
  }

}
