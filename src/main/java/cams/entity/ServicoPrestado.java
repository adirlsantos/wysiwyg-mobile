package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SERVICO_PRESTADO
 * @generated
 */
@Entity
@Table(name = "\"SERVICO_PRESTADO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.ServicoPrestado")
public class ServicoPrestado implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_SERVICO_PRESTADO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idServicoPrestado;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_CLINICA", nullable = false, referencedColumnName = "ID_CLINICA", insertable=true, updatable=true)
  
  private Clinica clinica;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dtUpdate;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = false, unique = false, length=44, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
  * @generated
  */
  @Column(name = "SP_CHAVE_NFE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String spChaveNfe;

  /**
  * @generated
  */
  @Column(name = "SP_COFINS", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double spCofins;

  /**
  * @generated
  */
  @Column(name = "SP_CSLL", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double spCsll;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "SP_DATA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date spData;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "SP_DATA_PAGAMENTO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date spDataPagamento;

  /**
  * @generated
  */
  @Column(name = "SP_IRRF", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double spIrrf;

  /**
  * @generated
  */
  @Column(name = "SP_ISS", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.Double spIss;

  /**
  * @generated
  */
  @Column(name = "SP_NUMERO_NOTA", nullable = true, unique = false, length=254, insertable=true, updatable=true)
  
  private java.lang.String spNumeroNota;

  /**
  * @generated
  */
  @Column(name = "SP_OBSERVACAO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String spObservacao;

  /**
  * @generated
  */
  @Column(name = "SP_PIS", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double spPis;

  /**
  * @generated
  */
  @Column(name = "SP_VALOR_COFINS", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double spValorCofins;

  /**
  * @generated
  */
  @Column(name = "SP_VALOR_CSLL", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double spValorCsll;

  /**
  * @generated
  */
  @Column(name = "SP_VALOR_IRRF", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double spValorIrrf;

  /**
  * @generated
  */
  @Column(name = "SP_VALOR_ISS", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double spValorIss;

  /**
  * @generated
  */
  @Column(name = "SP_VALOR_LIQUIDO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double spValorLiquido;

  /**
  * @generated
  */
  @Column(name = "SP_VALOR_PIS", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double spValorPis;

  /**
  * @generated
  */
  @Column(name = "SP_VALOR_SERVICO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double spValorServico;

  /**
   * Construtor
   * @generated
   */
  public ServicoPrestado(){
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
  public ServicoPrestado setClinica(Clinica clinica){
    this.clinica = clinica;
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
  public ServicoPrestado setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém idServicoPrestado
   * return idServicoPrestado
   * @generated
   */
  
  public java.lang.Integer getIdServicoPrestado(){
    return this.idServicoPrestado;
  }

  /**
   * Define idServicoPrestado
   * @param idServicoPrestado idServicoPrestado
   * @generated
   */
  public ServicoPrestado setIdServicoPrestado(java.lang.Integer idServicoPrestado){
    this.idServicoPrestado = idServicoPrestado;
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
  public ServicoPrestado setIdUsuario(java.lang.Integer idUsuario){
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Obtém spChaveNfe
   * return spChaveNfe
   * @generated
   */
  
  public java.lang.String getSpChaveNfe(){
    return this.spChaveNfe;
  }

  /**
   * Define spChaveNfe
   * @param spChaveNfe spChaveNfe
   * @generated
   */
  public ServicoPrestado setSpChaveNfe(java.lang.String spChaveNfe){
    this.spChaveNfe = spChaveNfe;
    return this;
  }

  /**
   * Obtém spCofins
   * return spCofins
   * @generated
   */
  
  public java.lang.Double getSpCofins(){
    return this.spCofins;
  }

  /**
   * Define spCofins
   * @param spCofins spCofins
   * @generated
   */
  public ServicoPrestado setSpCofins(java.lang.Double spCofins){
    this.spCofins = spCofins;
    return this;
  }

  /**
   * Obtém spCsll
   * return spCsll
   * @generated
   */
  
  public java.lang.Double getSpCsll(){
    return this.spCsll;
  }

  /**
   * Define spCsll
   * @param spCsll spCsll
   * @generated
   */
  public ServicoPrestado setSpCsll(java.lang.Double spCsll){
    this.spCsll = spCsll;
    return this;
  }

  /**
   * Obtém spData
   * return spData
   * @generated
   */
  
  public java.util.Date getSpData(){
    return this.spData;
  }

  /**
   * Define spData
   * @param spData spData
   * @generated
   */
  public ServicoPrestado setSpData(java.util.Date spData){
    this.spData = spData;
    return this;
  }

  /**
   * Obtém spDataPagamento
   * return spDataPagamento
   * @generated
   */
  
  public java.util.Date getSpDataPagamento(){
    return this.spDataPagamento;
  }

  /**
   * Define spDataPagamento
   * @param spDataPagamento spDataPagamento
   * @generated
   */
  public ServicoPrestado setSpDataPagamento(java.util.Date spDataPagamento){
    this.spDataPagamento = spDataPagamento;
    return this;
  }

  /**
   * Obtém spIrrf
   * return spIrrf
   * @generated
   */
  
  public java.lang.Double getSpIrrf(){
    return this.spIrrf;
  }

  /**
   * Define spIrrf
   * @param spIrrf spIrrf
   * @generated
   */
  public ServicoPrestado setSpIrrf(java.lang.Double spIrrf){
    this.spIrrf = spIrrf;
    return this;
  }

  /**
   * Obtém spIss
   * return spIss
   * @generated
   */
  
  public java.lang.Double getSpIss(){
    return this.spIss;
  }

  /**
   * Define spIss
   * @param spIss spIss
   * @generated
   */
  public ServicoPrestado setSpIss(java.lang.Double spIss){
    this.spIss = spIss;
    return this;
  }

  /**
   * Obtém spNumeroNota
   * return spNumeroNota
   * @generated
   */
  
  public java.lang.String getSpNumeroNota(){
    return this.spNumeroNota;
  }

  /**
   * Define spNumeroNota
   * @param spNumeroNota spNumeroNota
   * @generated
   */
  public ServicoPrestado setSpNumeroNota(java.lang.String spNumeroNota){
    this.spNumeroNota = spNumeroNota;
    return this;
  }

  /**
   * Obtém spObservacao
   * return spObservacao
   * @generated
   */
  
  public java.lang.String getSpObservacao(){
    return this.spObservacao;
  }

  /**
   * Define spObservacao
   * @param spObservacao spObservacao
   * @generated
   */
  public ServicoPrestado setSpObservacao(java.lang.String spObservacao){
    this.spObservacao = spObservacao;
    return this;
  }

  /**
   * Obtém spPis
   * return spPis
   * @generated
   */
  
  public java.lang.Double getSpPis(){
    return this.spPis;
  }

  /**
   * Define spPis
   * @param spPis spPis
   * @generated
   */
  public ServicoPrestado setSpPis(java.lang.Double spPis){
    this.spPis = spPis;
    return this;
  }

  /**
   * Obtém spValorCofins
   * return spValorCofins
   * @generated
   */
  
  public java.lang.Double getSpValorCofins(){
    return this.spValorCofins;
  }

  /**
   * Define spValorCofins
   * @param spValorCofins spValorCofins
   * @generated
   */
  public ServicoPrestado setSpValorCofins(java.lang.Double spValorCofins){
    this.spValorCofins = spValorCofins;
    return this;
  }

  /**
   * Obtém spValorCsll
   * return spValorCsll
   * @generated
   */
  
  public java.lang.Double getSpValorCsll(){
    return this.spValorCsll;
  }

  /**
   * Define spValorCsll
   * @param spValorCsll spValorCsll
   * @generated
   */
  public ServicoPrestado setSpValorCsll(java.lang.Double spValorCsll){
    this.spValorCsll = spValorCsll;
    return this;
  }

  /**
   * Obtém spValorIrrf
   * return spValorIrrf
   * @generated
   */
  
  public java.lang.Double getSpValorIrrf(){
    return this.spValorIrrf;
  }

  /**
   * Define spValorIrrf
   * @param spValorIrrf spValorIrrf
   * @generated
   */
  public ServicoPrestado setSpValorIrrf(java.lang.Double spValorIrrf){
    this.spValorIrrf = spValorIrrf;
    return this;
  }

  /**
   * Obtém spValorIss
   * return spValorIss
   * @generated
   */
  
  public java.lang.Double getSpValorIss(){
    return this.spValorIss;
  }

  /**
   * Define spValorIss
   * @param spValorIss spValorIss
   * @generated
   */
  public ServicoPrestado setSpValorIss(java.lang.Double spValorIss){
    this.spValorIss = spValorIss;
    return this;
  }

  /**
   * Obtém spValorLiquido
   * return spValorLiquido
   * @generated
   */
  
  public java.lang.Double getSpValorLiquido(){
    return this.spValorLiquido;
  }

  /**
   * Define spValorLiquido
   * @param spValorLiquido spValorLiquido
   * @generated
   */
  public ServicoPrestado setSpValorLiquido(java.lang.Double spValorLiquido){
    this.spValorLiquido = spValorLiquido;
    return this;
  }

  /**
   * Obtém spValorPis
   * return spValorPis
   * @generated
   */
  
  public java.lang.Double getSpValorPis(){
    return this.spValorPis;
  }

  /**
   * Define spValorPis
   * @param spValorPis spValorPis
   * @generated
   */
  public ServicoPrestado setSpValorPis(java.lang.Double spValorPis){
    this.spValorPis = spValorPis;
    return this;
  }

  /**
   * Obtém spValorServico
   * return spValorServico
   * @generated
   */
  
  public java.lang.Double getSpValorServico(){
    return this.spValorServico;
  }

  /**
   * Define spValorServico
   * @param spValorServico spValorServico
   * @generated
   */
  public ServicoPrestado setSpValorServico(java.lang.Double spValorServico){
    this.spValorServico = spValorServico;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ServicoPrestado object = (ServicoPrestado)obj;
    if (idServicoPrestado != null ? !idServicoPrestado.equals(object.idServicoPrestado) : object.idServicoPrestado != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idServicoPrestado == null) ? 0 : idServicoPrestado.hashCode());
    return result;
  }

}
