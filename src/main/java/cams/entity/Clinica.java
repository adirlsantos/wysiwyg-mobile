package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CLINICA
 * @generated
 */
@Entity
@Table(name = "\"CLINICA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Clinica")
public class Clinica implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_CLINICA", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idClinica;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_ATIVIDADE_MEDICA", nullable = true, referencedColumnName = "ID_ATIVIDADE_MEDICA", insertable=true, updatable=true)
  
  private AtividadeMedica atividadeMedica;

  /**
  * @generated
  */
  @Column(name = "CL_BAIRRO", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String clBairro;

  /**
  * @generated
  */
  @Column(name = "CL_CEP", nullable = true, unique = false, length=9, insertable=true, updatable=true)
  
  private java.lang.String clCep;

  /**
  * @generated
  */
  @Column(name = "CL_CNPJ", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String clCnpj;

  /**
  * @generated
  */
  @Column(name = "CL_COMPLEMENTO", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String clComplemento;

  /**
  * @generated
  */
  @Column(name = "CL_DESCRICAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String clDescricao;

  /**
  * @generated
  */
  @Column(name = "CL_EMAIL", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String clEmail;

  /**
  * @generated
  */
  @Column(name = "CL_ENDERECO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String clEndereco;

  /**
  * @generated
  */
  @Column(name = "CL_LIMITE_SANITAS", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.Double clLimiteSanitas;

  /**
  * @generated
  */
  @Column(name = "CL_NUMERO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String clNumero;

  /**
  * @generated
  */
  @Column(name = "CL_OBSERVACAO", nullable = true, unique = false, length=1024, insertable=true, updatable=true)
  
  private java.lang.String clObservacao;

  /**
  * @generated
  */
  @Column(name = "CL_PONTO_REFERENCIA", nullable = true, unique = false, length=150, insertable=true, updatable=true)
  
  private java.lang.String clPontoReferencia;

  /**
  * @generated
  */
  @Column(name = "CL_QTDE_EXAMES", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer clQtdeExames;

  /**
  * @generated
  */
  @Column(name = "CL_RET_COFINS", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String clRetCofins;

  /**
  * @generated
  */
  @Column(name = "CL_RET_CSLL", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String clRetCsll;

  /**
  * @generated
  */
  @Column(name = "CL_RET_IRRF", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String clRetIrrf;

  /**
  * @generated
  */
  @Column(name = "CL_RET_ISS", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String clRetIss;

  /**
  * @generated
  */
  @Column(name = "CL_RET_PIS", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String clRetPis;

  /**
  * @generated
  */
  @Column(name = "CL_SITE", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String clSite;

  /**
  * @generated
  */
  @Column(name = "CL_TELEFONE1", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String clTelefone1;

  /**
  * @generated
  */
  @Column(name = "CL_TELEFONE2", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String clTelefone2;

  /**
  * @generated
  */
  @Column(name = "CL_TELEFONE3", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String clTelefone3;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dtUpdate;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_EMPRESA", nullable = false, referencedColumnName = "ID_EMPRESA", insertable=true, updatable=true)
  
  private Empresa empresa;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_MUNICIPIO", nullable = false, referencedColumnName = "ID_MUNICIPIO", insertable=true, updatable=true)
  
  private Municipio municipio;

  /**
   * Construtor
   * @generated
   */
  public Clinica(){
  }


  /**
   * Obtém atividadeMedica
   * return atividadeMedica
   * @generated
   */
  
  public AtividadeMedica getAtividadeMedica(){
    return this.atividadeMedica;
  }

  /**
   * Define atividadeMedica
   * @param atividadeMedica atividadeMedica
   * @generated
   */
  public Clinica setAtividadeMedica(AtividadeMedica atividadeMedica){
    this.atividadeMedica = atividadeMedica;
    return this;
  }

  /**
   * Obtém clBairro
   * return clBairro
   * @generated
   */
  
  public java.lang.String getClBairro(){
    return this.clBairro;
  }

  /**
   * Define clBairro
   * @param clBairro clBairro
   * @generated
   */
  public Clinica setClBairro(java.lang.String clBairro){
    this.clBairro = clBairro;
    return this;
  }

  /**
   * Obtém clCep
   * return clCep
   * @generated
   */
  
  public java.lang.String getClCep(){
    return this.clCep;
  }

  /**
   * Define clCep
   * @param clCep clCep
   * @generated
   */
  public Clinica setClCep(java.lang.String clCep){
    this.clCep = clCep;
    return this;
  }

  /**
   * Obtém clCnpj
   * return clCnpj
   * @generated
   */
  
  public java.lang.String getClCnpj(){
    return this.clCnpj;
  }

  /**
   * Define clCnpj
   * @param clCnpj clCnpj
   * @generated
   */
  public Clinica setClCnpj(java.lang.String clCnpj){
    this.clCnpj = clCnpj;
    return this;
  }

  /**
   * Obtém clComplemento
   * return clComplemento
   * @generated
   */
  
  public java.lang.String getClComplemento(){
    return this.clComplemento;
  }

  /**
   * Define clComplemento
   * @param clComplemento clComplemento
   * @generated
   */
  public Clinica setClComplemento(java.lang.String clComplemento){
    this.clComplemento = clComplemento;
    return this;
  }

  /**
   * Obtém clDescricao
   * return clDescricao
   * @generated
   */
  
  public java.lang.String getClDescricao(){
    return this.clDescricao;
  }

  /**
   * Define clDescricao
   * @param clDescricao clDescricao
   * @generated
   */
  public Clinica setClDescricao(java.lang.String clDescricao){
    this.clDescricao = clDescricao;
    return this;
  }

  /**
   * Obtém clEmail
   * return clEmail
   * @generated
   */
  
  public java.lang.String getClEmail(){
    return this.clEmail;
  }

  /**
   * Define clEmail
   * @param clEmail clEmail
   * @generated
   */
  public Clinica setClEmail(java.lang.String clEmail){
    this.clEmail = clEmail;
    return this;
  }

  /**
   * Obtém clEndereco
   * return clEndereco
   * @generated
   */
  
  public java.lang.String getClEndereco(){
    return this.clEndereco;
  }

  /**
   * Define clEndereco
   * @param clEndereco clEndereco
   * @generated
   */
  public Clinica setClEndereco(java.lang.String clEndereco){
    this.clEndereco = clEndereco;
    return this;
  }

  /**
   * Obtém clLimiteSanitas
   * return clLimiteSanitas
   * @generated
   */
  
  public java.lang.Double getClLimiteSanitas(){
    return this.clLimiteSanitas;
  }

  /**
   * Define clLimiteSanitas
   * @param clLimiteSanitas clLimiteSanitas
   * @generated
   */
  public Clinica setClLimiteSanitas(java.lang.Double clLimiteSanitas){
    this.clLimiteSanitas = clLimiteSanitas;
    return this;
  }

  /**
   * Obtém clNumero
   * return clNumero
   * @generated
   */
  
  public java.lang.String getClNumero(){
    return this.clNumero;
  }

  /**
   * Define clNumero
   * @param clNumero clNumero
   * @generated
   */
  public Clinica setClNumero(java.lang.String clNumero){
    this.clNumero = clNumero;
    return this;
  }

  /**
   * Obtém clObservacao
   * return clObservacao
   * @generated
   */
  
  public java.lang.String getClObservacao(){
    return this.clObservacao;
  }

  /**
   * Define clObservacao
   * @param clObservacao clObservacao
   * @generated
   */
  public Clinica setClObservacao(java.lang.String clObservacao){
    this.clObservacao = clObservacao;
    return this;
  }

  /**
   * Obtém clPontoReferencia
   * return clPontoReferencia
   * @generated
   */
  
  public java.lang.String getClPontoReferencia(){
    return this.clPontoReferencia;
  }

  /**
   * Define clPontoReferencia
   * @param clPontoReferencia clPontoReferencia
   * @generated
   */
  public Clinica setClPontoReferencia(java.lang.String clPontoReferencia){
    this.clPontoReferencia = clPontoReferencia;
    return this;
  }

  /**
   * Obtém clQtdeExames
   * return clQtdeExames
   * @generated
   */
  
  public java.lang.Integer getClQtdeExames(){
    return this.clQtdeExames;
  }

  /**
   * Define clQtdeExames
   * @param clQtdeExames clQtdeExames
   * @generated
   */
  public Clinica setClQtdeExames(java.lang.Integer clQtdeExames){
    this.clQtdeExames = clQtdeExames;
    return this;
  }

  /**
   * Obtém clRetCofins
   * return clRetCofins
   * @generated
   */
  
  public java.lang.String getClRetCofins(){
    return this.clRetCofins;
  }

  /**
   * Define clRetCofins
   * @param clRetCofins clRetCofins
   * @generated
   */
  public Clinica setClRetCofins(java.lang.String clRetCofins){
    this.clRetCofins = clRetCofins;
    return this;
  }

  /**
   * Obtém clRetCsll
   * return clRetCsll
   * @generated
   */
  
  public java.lang.String getClRetCsll(){
    return this.clRetCsll;
  }

  /**
   * Define clRetCsll
   * @param clRetCsll clRetCsll
   * @generated
   */
  public Clinica setClRetCsll(java.lang.String clRetCsll){
    this.clRetCsll = clRetCsll;
    return this;
  }

  /**
   * Obtém clRetIrrf
   * return clRetIrrf
   * @generated
   */
  
  public java.lang.String getClRetIrrf(){
    return this.clRetIrrf;
  }

  /**
   * Define clRetIrrf
   * @param clRetIrrf clRetIrrf
   * @generated
   */
  public Clinica setClRetIrrf(java.lang.String clRetIrrf){
    this.clRetIrrf = clRetIrrf;
    return this;
  }

  /**
   * Obtém clRetIss
   * return clRetIss
   * @generated
   */
  
  public java.lang.String getClRetIss(){
    return this.clRetIss;
  }

  /**
   * Define clRetIss
   * @param clRetIss clRetIss
   * @generated
   */
  public Clinica setClRetIss(java.lang.String clRetIss){
    this.clRetIss = clRetIss;
    return this;
  }

  /**
   * Obtém clRetPis
   * return clRetPis
   * @generated
   */
  
  public java.lang.String getClRetPis(){
    return this.clRetPis;
  }

  /**
   * Define clRetPis
   * @param clRetPis clRetPis
   * @generated
   */
  public Clinica setClRetPis(java.lang.String clRetPis){
    this.clRetPis = clRetPis;
    return this;
  }

  /**
   * Obtém clSite
   * return clSite
   * @generated
   */
  
  public java.lang.String getClSite(){
    return this.clSite;
  }

  /**
   * Define clSite
   * @param clSite clSite
   * @generated
   */
  public Clinica setClSite(java.lang.String clSite){
    this.clSite = clSite;
    return this;
  }

  /**
   * Obtém clTelefone1
   * return clTelefone1
   * @generated
   */
  
  public java.lang.String getClTelefone1(){
    return this.clTelefone1;
  }

  /**
   * Define clTelefone1
   * @param clTelefone1 clTelefone1
   * @generated
   */
  public Clinica setClTelefone1(java.lang.String clTelefone1){
    this.clTelefone1 = clTelefone1;
    return this;
  }

  /**
   * Obtém clTelefone2
   * return clTelefone2
   * @generated
   */
  
  public java.lang.String getClTelefone2(){
    return this.clTelefone2;
  }

  /**
   * Define clTelefone2
   * @param clTelefone2 clTelefone2
   * @generated
   */
  public Clinica setClTelefone2(java.lang.String clTelefone2){
    this.clTelefone2 = clTelefone2;
    return this;
  }

  /**
   * Obtém clTelefone3
   * return clTelefone3
   * @generated
   */
  
  public java.lang.String getClTelefone3(){
    return this.clTelefone3;
  }

  /**
   * Define clTelefone3
   * @param clTelefone3 clTelefone3
   * @generated
   */
  public Clinica setClTelefone3(java.lang.String clTelefone3){
    this.clTelefone3 = clTelefone3;
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
  public Clinica setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém empresa
   * return empresa
   * @generated
   */
  
  public Empresa getEmpresa(){
    return this.empresa;
  }

  /**
   * Define empresa
   * @param empresa empresa
   * @generated
   */
  public Clinica setEmpresa(Empresa empresa){
    this.empresa = empresa;
    return this;
  }

  /**
   * Obtém idClinica
   * return idClinica
   * @generated
   */
  
  public java.lang.Integer getIdClinica(){
    return this.idClinica;
  }

  /**
   * Define idClinica
   * @param idClinica idClinica
   * @generated
   */
  public Clinica setIdClinica(java.lang.Integer idClinica){
    this.idClinica = idClinica;
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
  public Clinica setIdUsuario(java.lang.Integer idUsuario){
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Obtém municipio
   * return municipio
   * @generated
   */
  
  public Municipio getMunicipio(){
    return this.municipio;
  }

  /**
   * Define municipio
   * @param municipio municipio
   * @generated
   */
  public Clinica setMunicipio(Municipio municipio){
    this.municipio = municipio;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Clinica object = (Clinica)obj;
    if (idClinica != null ? !idClinica.equals(object.idClinica) : object.idClinica != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idClinica == null) ? 0 : idClinica.hashCode());
    return result;
  }

}
