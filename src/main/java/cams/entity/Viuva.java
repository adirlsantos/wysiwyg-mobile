package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela VIUVA
 * @generated
 */
@Entity
@Table(name = "\"VIUVA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Viuva")
public class Viuva implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_VIUVA", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idViuva;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dtUpdate;

  /**
  * @generated
  */
  @Column(name = "ID_AGENCIA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idAgencia;

  /**
  * @generated
  */
  @Column(name = "ID_EMPRESA", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idEmpresa;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_MOTIVO_AFASTAMENTO", nullable = true, referencedColumnName = "ID_MOTIVO_AFASTAMENTO", insertable=true, updatable=true)
  
  private MotivoAfastamento motivoAfastamento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_MUNICIPIO", nullable = true, referencedColumnName = "ID_MUNICIPIO", insertable=true, updatable=true)
  
  private Municipio municipio;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_PARENTESCO", nullable = true, referencedColumnName = "ID_PARENTESCO", insertable=true, updatable=true)
  
  private Parentesco parentesco;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_SOCIO", nullable = true, referencedColumnName = "ID_SOCIO", insertable=true, updatable=true)
  
  private Socio socio;

  /**
  * @generated
  */
  @Column(name = "VU_AGENCIA", nullable = true, unique = false, length=9, insertable=true, updatable=true)
  
  private java.lang.String vuAgencia;

  /**
  * @generated
  */
  @Column(name = "VU_ANTCODIGO", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String vuAntcodigo;

  /**
  * @generated
  */
  @Column(name = "VU_BAIRRO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String vuBairro;

  /**
  * @generated
  */
  @Column(name = "VU_CCORRENTE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String vuCcorrente;

  /**
  * @generated
  */
  @Column(name = "VU_CEP", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String vuCep;

  /**
  * @generated
  */
  @Column(name = "VU_COMPLEMENTO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String vuComplemento;

  /**
  * @generated
  */
  @Column(name = "VU_CPF", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String vuCpf;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "VU_DATA_AFASTAMENTO", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.util.Date vuDataAfastamento;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "VU_DATA_NASCIMENTO", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.util.Date vuDataNascimento;

  /**
  * @generated
  */
  @Column(name = "VU_ENDERECO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String vuEndereco;

  /**
  * @generated
  */
  @Column(name = "VU_FONE1", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String vuFone1;

  /**
  * @generated
  */
  @Column(name = "VU_FONE2", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String vuFone2;

  /**
  * @generated
  */
  @Column(name = "VU_FONE3", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String vuFone3;

  /**
  * @generated
  */
  @Column(name = "VU_IDENTIDADE", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.String vuIdentidade;

  /**
  * @generated
  */
  @Column(name = "VU_LOCAL_PAGAMENTO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String vuLocalPagamento;

  /**
  * @generated
  */
  @Column(name = "VU_NOME", nullable = true, unique = false, length=512, insertable=true, updatable=true)
  
  private java.lang.String vuNome;

  /**
  * @generated
  */
  @Column(name = "VU_NOME_BENEFICIARIO", nullable = true, unique = false, length=512, insertable=true, updatable=true)
  
  private java.lang.String vuNomeBeneficiario;

  /**
  * @generated
  */
  @Column(name = "VU_NUMBANCO", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String vuNumbanco;

  /**
  * @generated
  */
  @Column(name = "VU_NUMERO", nullable = true, unique = false, length=150, insertable=true, updatable=true)
  
  private java.lang.String vuNumero;

  /**
  * @generated
  */
  @Column(name = "VU_OBSERVACAO1", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String vuObservacao1;

  /**
  * @generated
  */
  @Column(name = "VU_OBSERVACAO2", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String vuObservacao2;

  /**
  * @generated
  */
  @Column(name = "VU_PLANO_SAUDE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String vuPlanoSaude;

  /**
  * @generated
  */
  @Column(name = "VU_PONTO_REFERENCIA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String vuPontoReferencia;

  /**
  * @generated
  */
  @Column(name = "VU_SITUACAO_CADASTRO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String vuSituacaoCadastro;

  /**
  * @generated
  */
  @Column(name = "VU_ULTIMOVALOR", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double vuUltimovalor;

  /**
  * @generated
  */
  @Column(name = "VU_VALORDEPOSITO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double vuValordeposito;

  /**
   * Construtor
   * @generated
   */
  public Viuva(){
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
  public Viuva setDtUpdate(java.util.Date dtUpdate){
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
  public Viuva setIdAgencia(java.lang.Integer idAgencia){
    this.idAgencia = idAgencia;
    return this;
  }

  /**
   * Obtém idEmpresa
   * return idEmpresa
   * @generated
   */
  
  public java.lang.Integer getIdEmpresa(){
    return this.idEmpresa;
  }

  /**
   * Define idEmpresa
   * @param idEmpresa idEmpresa
   * @generated
   */
  public Viuva setIdEmpresa(java.lang.Integer idEmpresa){
    this.idEmpresa = idEmpresa;
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
  public Viuva setIdUsuario(java.lang.Integer idUsuario){
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Obtém idViuva
   * return idViuva
   * @generated
   */
  
  public java.lang.Integer getIdViuva(){
    return this.idViuva;
  }

  /**
   * Define idViuva
   * @param idViuva idViuva
   * @generated
   */
  public Viuva setIdViuva(java.lang.Integer idViuva){
    this.idViuva = idViuva;
    return this;
  }

  /**
   * Obtém motivoAfastamento
   * return motivoAfastamento
   * @generated
   */
  
  public MotivoAfastamento getMotivoAfastamento(){
    return this.motivoAfastamento;
  }

  /**
   * Define motivoAfastamento
   * @param motivoAfastamento motivoAfastamento
   * @generated
   */
  public Viuva setMotivoAfastamento(MotivoAfastamento motivoAfastamento){
    this.motivoAfastamento = motivoAfastamento;
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
  public Viuva setMunicipio(Municipio municipio){
    this.municipio = municipio;
    return this;
  }

  /**
   * Obtém parentesco
   * return parentesco
   * @generated
   */
  
  public Parentesco getParentesco(){
    return this.parentesco;
  }

  /**
   * Define parentesco
   * @param parentesco parentesco
   * @generated
   */
  public Viuva setParentesco(Parentesco parentesco){
    this.parentesco = parentesco;
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
  public Viuva setSocio(Socio socio){
    this.socio = socio;
    return this;
  }

  /**
   * Obtém vuAgencia
   * return vuAgencia
   * @generated
   */
  
  public java.lang.String getVuAgencia(){
    return this.vuAgencia;
  }

  /**
   * Define vuAgencia
   * @param vuAgencia vuAgencia
   * @generated
   */
  public Viuva setVuAgencia(java.lang.String vuAgencia){
    this.vuAgencia = vuAgencia;
    return this;
  }

  /**
   * Obtém vuAntcodigo
   * return vuAntcodigo
   * @generated
   */
  
  public java.lang.String getVuAntcodigo(){
    return this.vuAntcodigo;
  }

  /**
   * Define vuAntcodigo
   * @param vuAntcodigo vuAntcodigo
   * @generated
   */
  public Viuva setVuAntcodigo(java.lang.String vuAntcodigo){
    this.vuAntcodigo = vuAntcodigo;
    return this;
  }

  /**
   * Obtém vuBairro
   * return vuBairro
   * @generated
   */
  
  public java.lang.String getVuBairro(){
    return this.vuBairro;
  }

  /**
   * Define vuBairro
   * @param vuBairro vuBairro
   * @generated
   */
  public Viuva setVuBairro(java.lang.String vuBairro){
    this.vuBairro = vuBairro;
    return this;
  }

  /**
   * Obtém vuCcorrente
   * return vuCcorrente
   * @generated
   */
  
  public java.lang.String getVuCcorrente(){
    return this.vuCcorrente;
  }

  /**
   * Define vuCcorrente
   * @param vuCcorrente vuCcorrente
   * @generated
   */
  public Viuva setVuCcorrente(java.lang.String vuCcorrente){
    this.vuCcorrente = vuCcorrente;
    return this;
  }

  /**
   * Obtém vuCep
   * return vuCep
   * @generated
   */
  
  public java.lang.String getVuCep(){
    return this.vuCep;
  }

  /**
   * Define vuCep
   * @param vuCep vuCep
   * @generated
   */
  public Viuva setVuCep(java.lang.String vuCep){
    this.vuCep = vuCep;
    return this;
  }

  /**
   * Obtém vuComplemento
   * return vuComplemento
   * @generated
   */
  
  public java.lang.String getVuComplemento(){
    return this.vuComplemento;
  }

  /**
   * Define vuComplemento
   * @param vuComplemento vuComplemento
   * @generated
   */
  public Viuva setVuComplemento(java.lang.String vuComplemento){
    this.vuComplemento = vuComplemento;
    return this;
  }

  /**
   * Obtém vuCpf
   * return vuCpf
   * @generated
   */
  
  public java.lang.String getVuCpf(){
    return this.vuCpf;
  }

  /**
   * Define vuCpf
   * @param vuCpf vuCpf
   * @generated
   */
  public Viuva setVuCpf(java.lang.String vuCpf){
    this.vuCpf = vuCpf;
    return this;
  }

  /**
   * Obtém vuDataAfastamento
   * return vuDataAfastamento
   * @generated
   */
  
  public java.util.Date getVuDataAfastamento(){
    return this.vuDataAfastamento;
  }

  /**
   * Define vuDataAfastamento
   * @param vuDataAfastamento vuDataAfastamento
   * @generated
   */
  public Viuva setVuDataAfastamento(java.util.Date vuDataAfastamento){
    this.vuDataAfastamento = vuDataAfastamento;
    return this;
  }

  /**
   * Obtém vuDataNascimento
   * return vuDataNascimento
   * @generated
   */
  
  public java.util.Date getVuDataNascimento(){
    return this.vuDataNascimento;
  }

  /**
   * Define vuDataNascimento
   * @param vuDataNascimento vuDataNascimento
   * @generated
   */
  public Viuva setVuDataNascimento(java.util.Date vuDataNascimento){
    this.vuDataNascimento = vuDataNascimento;
    return this;
  }

  /**
   * Obtém vuEndereco
   * return vuEndereco
   * @generated
   */
  
  public java.lang.String getVuEndereco(){
    return this.vuEndereco;
  }

  /**
   * Define vuEndereco
   * @param vuEndereco vuEndereco
   * @generated
   */
  public Viuva setVuEndereco(java.lang.String vuEndereco){
    this.vuEndereco = vuEndereco;
    return this;
  }

  /**
   * Obtém vuFone1
   * return vuFone1
   * @generated
   */
  
  public java.lang.String getVuFone1(){
    return this.vuFone1;
  }

  /**
   * Define vuFone1
   * @param vuFone1 vuFone1
   * @generated
   */
  public Viuva setVuFone1(java.lang.String vuFone1){
    this.vuFone1 = vuFone1;
    return this;
  }

  /**
   * Obtém vuFone2
   * return vuFone2
   * @generated
   */
  
  public java.lang.String getVuFone2(){
    return this.vuFone2;
  }

  /**
   * Define vuFone2
   * @param vuFone2 vuFone2
   * @generated
   */
  public Viuva setVuFone2(java.lang.String vuFone2){
    this.vuFone2 = vuFone2;
    return this;
  }

  /**
   * Obtém vuFone3
   * return vuFone3
   * @generated
   */
  
  public java.lang.String getVuFone3(){
    return this.vuFone3;
  }

  /**
   * Define vuFone3
   * @param vuFone3 vuFone3
   * @generated
   */
  public Viuva setVuFone3(java.lang.String vuFone3){
    this.vuFone3 = vuFone3;
    return this;
  }

  /**
   * Obtém vuIdentidade
   * return vuIdentidade
   * @generated
   */
  
  public java.lang.String getVuIdentidade(){
    return this.vuIdentidade;
  }

  /**
   * Define vuIdentidade
   * @param vuIdentidade vuIdentidade
   * @generated
   */
  public Viuva setVuIdentidade(java.lang.String vuIdentidade){
    this.vuIdentidade = vuIdentidade;
    return this;
  }

  /**
   * Obtém vuLocalPagamento
   * return vuLocalPagamento
   * @generated
   */
  
  public java.lang.String getVuLocalPagamento(){
    return this.vuLocalPagamento;
  }

  /**
   * Define vuLocalPagamento
   * @param vuLocalPagamento vuLocalPagamento
   * @generated
   */
  public Viuva setVuLocalPagamento(java.lang.String vuLocalPagamento){
    this.vuLocalPagamento = vuLocalPagamento;
    return this;
  }

  /**
   * Obtém vuNome
   * return vuNome
   * @generated
   */
  
  public java.lang.String getVuNome(){
    return this.vuNome;
  }

  /**
   * Define vuNome
   * @param vuNome vuNome
   * @generated
   */
  public Viuva setVuNome(java.lang.String vuNome){
    this.vuNome = vuNome;
    return this;
  }

  /**
   * Obtém vuNomeBeneficiario
   * return vuNomeBeneficiario
   * @generated
   */
  
  public java.lang.String getVuNomeBeneficiario(){
    return this.vuNomeBeneficiario;
  }

  /**
   * Define vuNomeBeneficiario
   * @param vuNomeBeneficiario vuNomeBeneficiario
   * @generated
   */
  public Viuva setVuNomeBeneficiario(java.lang.String vuNomeBeneficiario){
    this.vuNomeBeneficiario = vuNomeBeneficiario;
    return this;
  }

  /**
   * Obtém vuNumbanco
   * return vuNumbanco
   * @generated
   */
  
  public java.lang.String getVuNumbanco(){
    return this.vuNumbanco;
  }

  /**
   * Define vuNumbanco
   * @param vuNumbanco vuNumbanco
   * @generated
   */
  public Viuva setVuNumbanco(java.lang.String vuNumbanco){
    this.vuNumbanco = vuNumbanco;
    return this;
  }

  /**
   * Obtém vuNumero
   * return vuNumero
   * @generated
   */
  
  public java.lang.String getVuNumero(){
    return this.vuNumero;
  }

  /**
   * Define vuNumero
   * @param vuNumero vuNumero
   * @generated
   */
  public Viuva setVuNumero(java.lang.String vuNumero){
    this.vuNumero = vuNumero;
    return this;
  }

  /**
   * Obtém vuObservacao1
   * return vuObservacao1
   * @generated
   */
  
  public java.lang.String getVuObservacao1(){
    return this.vuObservacao1;
  }

  /**
   * Define vuObservacao1
   * @param vuObservacao1 vuObservacao1
   * @generated
   */
  public Viuva setVuObservacao1(java.lang.String vuObservacao1){
    this.vuObservacao1 = vuObservacao1;
    return this;
  }

  /**
   * Obtém vuObservacao2
   * return vuObservacao2
   * @generated
   */
  
  public java.lang.String getVuObservacao2(){
    return this.vuObservacao2;
  }

  /**
   * Define vuObservacao2
   * @param vuObservacao2 vuObservacao2
   * @generated
   */
  public Viuva setVuObservacao2(java.lang.String vuObservacao2){
    this.vuObservacao2 = vuObservacao2;
    return this;
  }

  /**
   * Obtém vuPlanoSaude
   * return vuPlanoSaude
   * @generated
   */
  
  public java.lang.String getVuPlanoSaude(){
    return this.vuPlanoSaude;
  }

  /**
   * Define vuPlanoSaude
   * @param vuPlanoSaude vuPlanoSaude
   * @generated
   */
  public Viuva setVuPlanoSaude(java.lang.String vuPlanoSaude){
    this.vuPlanoSaude = vuPlanoSaude;
    return this;
  }

  /**
   * Obtém vuPontoReferencia
   * return vuPontoReferencia
   * @generated
   */
  
  public java.lang.String getVuPontoReferencia(){
    return this.vuPontoReferencia;
  }

  /**
   * Define vuPontoReferencia
   * @param vuPontoReferencia vuPontoReferencia
   * @generated
   */
  public Viuva setVuPontoReferencia(java.lang.String vuPontoReferencia){
    this.vuPontoReferencia = vuPontoReferencia;
    return this;
  }

  /**
   * Obtém vuSituacaoCadastro
   * return vuSituacaoCadastro
   * @generated
   */
  
  public java.lang.String getVuSituacaoCadastro(){
    return this.vuSituacaoCadastro;
  }

  /**
   * Define vuSituacaoCadastro
   * @param vuSituacaoCadastro vuSituacaoCadastro
   * @generated
   */
  public Viuva setVuSituacaoCadastro(java.lang.String vuSituacaoCadastro){
    this.vuSituacaoCadastro = vuSituacaoCadastro;
    return this;
  }

  /**
   * Obtém vuUltimovalor
   * return vuUltimovalor
   * @generated
   */
  
  public java.lang.Double getVuUltimovalor(){
    return this.vuUltimovalor;
  }

  /**
   * Define vuUltimovalor
   * @param vuUltimovalor vuUltimovalor
   * @generated
   */
  public Viuva setVuUltimovalor(java.lang.Double vuUltimovalor){
    this.vuUltimovalor = vuUltimovalor;
    return this;
  }

  /**
   * Obtém vuValordeposito
   * return vuValordeposito
   * @generated
   */
  
  public java.lang.Double getVuValordeposito(){
    return this.vuValordeposito;
  }

  /**
   * Define vuValordeposito
   * @param vuValordeposito vuValordeposito
   * @generated
   */
  public Viuva setVuValordeposito(java.lang.Double vuValordeposito){
    this.vuValordeposito = vuValordeposito;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Viuva object = (Viuva)obj;
    if (idViuva != null ? !idViuva.equals(object.idViuva) : object.idViuva != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idViuva == null) ? 0 : idViuva.hashCode());
    return result;
  }

}
