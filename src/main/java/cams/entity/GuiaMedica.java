package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela GUIA_MEDICA
 * @generated
 */
@Entity
@Table(name = "\"GUIA_MEDICA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.GuiaMedica")
public class GuiaMedica implements Serializable {

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
  @Column(name = "ID_GUIA_MEDICA", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idGuiaMedica;

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
  @JoinColumn(name="ID_FILIAL", nullable = false, referencedColumnName = "ID_FILIAL", insertable=true, updatable=true)
  
  private Filial filial;

  /**
  * @generated
  */
  @Column(name = "GM_CONSULTA_EXAME", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String gmConsultaExame;

  /**
  * @generated
  */
  @Column(name = "GM_CORTESIA", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String gmCortesia;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "GM_EMISSAO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date gmEmissao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "GM_ENTREGA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date gmEntrega;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "GM_ENVIO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date gmEnvio;

  /**
  * @generated
  */
  @Column(name = "GM_OBSERVACAO", nullable = true, unique = false, length=512, insertable=true, updatable=true)
  
  private java.lang.String gmObservacao;

  /**
  * @generated
  */
  @Column(name = "GM_OBSERVACAO_ENTREGA", nullable = true, unique = false, length=512, insertable=true, updatable=true)
  
  private java.lang.String gmObservacaoEntrega;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "GM_PREVISAO_ENTREGA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date gmPrevisaoEntrega;

  /**
  * @generated
  */
  @Column(name = "GM_QTDE", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer gmQtde;

  /**
  * @generated
  */
  @Column(name = "GM_RESPONSAVEL", nullable = true, unique = false, length=40, insertable=true, updatable=true)
  
  private java.lang.String gmResponsavel;

  /**
  * @generated
  */
  @Column(name = "GM_VALOR_TOTAL_GUIA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double gmValorTotalGuia;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_SOCIO", nullable = true, referencedColumnName = "ID_SOCIO", insertable=true, updatable=true)
  
  private Socio socio;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_DEPENDENTE", nullable = true, referencedColumnName = "ID_DEPENDENTE", insertable=true, updatable=true)
  
  private Dependente dependente;

  /**
  * @generated
  */
  @Column(name = "GM_SITUACAO", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String gmSituacao;

  /**
   * Construtor
   * @generated
   */
  public GuiaMedica(){
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
  public GuiaMedica setClinica(Clinica clinica){
    this.clinica = clinica;
    return this;
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
  public GuiaMedica setFilial(Filial filial){
    this.filial = filial;
    return this;
  }

  /**
   * Obtém gmConsultaExame
   * return gmConsultaExame
   * @generated
   */
  
  public java.lang.String getGmConsultaExame(){
    return this.gmConsultaExame;
  }

  /**
   * Define gmConsultaExame
   * @param gmConsultaExame gmConsultaExame
   * @generated
   */
  public GuiaMedica setGmConsultaExame(java.lang.String gmConsultaExame){
    this.gmConsultaExame = gmConsultaExame;
    return this;
  }

  /**
   * Obtém gmCortesia
   * return gmCortesia
   * @generated
   */
  
  public java.lang.String getGmCortesia(){
    return this.gmCortesia;
  }

  /**
   * Define gmCortesia
   * @param gmCortesia gmCortesia
   * @generated
   */
  public GuiaMedica setGmCortesia(java.lang.String gmCortesia){
    this.gmCortesia = gmCortesia;
    return this;
  }

  /**
   * Obtém gmEmissao
   * return gmEmissao
   * @generated
   */
  
  public java.util.Date getGmEmissao(){
    return this.gmEmissao;
  }

  /**
   * Define gmEmissao
   * @param gmEmissao gmEmissao
   * @generated
   */
  public GuiaMedica setGmEmissao(java.util.Date gmEmissao){
    this.gmEmissao = gmEmissao;
    return this;
  }

  /**
   * Obtém gmEntrega
   * return gmEntrega
   * @generated
   */
  
  public java.util.Date getGmEntrega(){
    return this.gmEntrega;
  }

  /**
   * Define gmEntrega
   * @param gmEntrega gmEntrega
   * @generated
   */
  public GuiaMedica setGmEntrega(java.util.Date gmEntrega){
    this.gmEntrega = gmEntrega;
    return this;
  }

  /**
   * Obtém gmEnvio
   * return gmEnvio
   * @generated
   */
  
  public java.util.Date getGmEnvio(){
    return this.gmEnvio;
  }

  /**
   * Define gmEnvio
   * @param gmEnvio gmEnvio
   * @generated
   */
  public GuiaMedica setGmEnvio(java.util.Date gmEnvio){
    this.gmEnvio = gmEnvio;
    return this;
  }

  /**
   * Obtém gmObservacao
   * return gmObservacao
   * @generated
   */
  
  public java.lang.String getGmObservacao(){
    return this.gmObservacao;
  }

  /**
   * Define gmObservacao
   * @param gmObservacao gmObservacao
   * @generated
   */
  public GuiaMedica setGmObservacao(java.lang.String gmObservacao){
    this.gmObservacao = gmObservacao;
    return this;
  }

  /**
   * Obtém gmObservacaoEntrega
   * return gmObservacaoEntrega
   * @generated
   */
  
  public java.lang.String getGmObservacaoEntrega(){
    return this.gmObservacaoEntrega;
  }

  /**
   * Define gmObservacaoEntrega
   * @param gmObservacaoEntrega gmObservacaoEntrega
   * @generated
   */
  public GuiaMedica setGmObservacaoEntrega(java.lang.String gmObservacaoEntrega){
    this.gmObservacaoEntrega = gmObservacaoEntrega;
    return this;
  }

  /**
   * Obtém gmPrevisaoEntrega
   * return gmPrevisaoEntrega
   * @generated
   */
  
  public java.util.Date getGmPrevisaoEntrega(){
    return this.gmPrevisaoEntrega;
  }

  /**
   * Define gmPrevisaoEntrega
   * @param gmPrevisaoEntrega gmPrevisaoEntrega
   * @generated
   */
  public GuiaMedica setGmPrevisaoEntrega(java.util.Date gmPrevisaoEntrega){
    this.gmPrevisaoEntrega = gmPrevisaoEntrega;
    return this;
  }

  /**
   * Obtém gmQtde
   * return gmQtde
   * @generated
   */
  
  public java.lang.Integer getGmQtde(){
    return this.gmQtde;
  }

  /**
   * Define gmQtde
   * @param gmQtde gmQtde
   * @generated
   */
  public GuiaMedica setGmQtde(java.lang.Integer gmQtde){
    this.gmQtde = gmQtde;
    return this;
  }

  /**
   * Obtém gmResponsavel
   * return gmResponsavel
   * @generated
   */
  
  public java.lang.String getGmResponsavel(){
    return this.gmResponsavel;
  }

  /**
   * Define gmResponsavel
   * @param gmResponsavel gmResponsavel
   * @generated
   */
  public GuiaMedica setGmResponsavel(java.lang.String gmResponsavel){
    this.gmResponsavel = gmResponsavel;
    return this;
  }

  /**
   * Obtém gmValorTotalGuia
   * return gmValorTotalGuia
   * @generated
   */
  
  public java.lang.Double getGmValorTotalGuia(){
    return this.gmValorTotalGuia;
  }

  /**
   * Define gmValorTotalGuia
   * @param gmValorTotalGuia gmValorTotalGuia
   * @generated
   */
  public GuiaMedica setGmValorTotalGuia(java.lang.Double gmValorTotalGuia){
    this.gmValorTotalGuia = gmValorTotalGuia;
    return this;
  }

  /**
   * Obtém idGuiaMedica
   * return idGuiaMedica
   * @generated
   */
  
  public java.lang.Integer getIdGuiaMedica(){
    return this.idGuiaMedica;
  }

  /**
   * Define idGuiaMedica
   * @param idGuiaMedica idGuiaMedica
   * @generated
   */
  public GuiaMedica setIdGuiaMedica(java.lang.Integer idGuiaMedica){
    this.idGuiaMedica = idGuiaMedica;
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
  public GuiaMedica setSocio(Socio socio){
    this.socio = socio;
    return this;
  }

  /**
   * Obtém dependente
   * return dependente
   * @generated
   */
  
  public Dependente getDependente(){
    return this.dependente;
  }

  /**
   * Define dependente
   * @param dependente dependente
   * @generated
   */
  public GuiaMedica setDependente(Dependente dependente){
    this.dependente = dependente;
    return this;
  }

  /**
   * Obtém gmSituacao
   * return gmSituacao
   * @generated
   */
  
  public java.lang.String getGmSituacao(){
    return this.gmSituacao;
  }

  /**
   * Define gmSituacao
   * @param gmSituacao gmSituacao
   * @generated
   */
  public GuiaMedica setGmSituacao(java.lang.String gmSituacao){
    this.gmSituacao = gmSituacao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    GuiaMedica object = (GuiaMedica)obj;
    if (idGuiaMedica != null ? !idGuiaMedica.equals(object.idGuiaMedica) : object.idGuiaMedica != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGuiaMedica == null) ? 0 : idGuiaMedica.hashCode());
    return result;
  }

}
