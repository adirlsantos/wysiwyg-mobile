package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SOCIO
 * @generated
 */
@Entity
@Table(name = "\"SOCIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Socio")
public class Socio implements Serializable {

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
  @Column(name = "ID_SOCIO", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idSocio;

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
  @JoinColumn(name="ID_AFASTAMENTO", nullable = true, referencedColumnName = "ID_MOTIVO_AFASTAMENTO", insertable=true, updatable=true)
  
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
  @JoinColumn(name="ID_POSTO_GRADUACAO", nullable = true, referencedColumnName = "ID_POSTO_GRADUACAO", insertable=true, updatable=true)
  
  private PostoGraduacao postoGraduacao;

  /**
  * @generated
  */
  @Column(name = "SC_BAIRRO", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String scBairro;

  /**
  * @generated
  */
  @Column(name = "SC_CEP", nullable = true, unique = false, length=9, insertable=true, updatable=true)
  
  private java.lang.String scCep;

  /**
  * @generated
  */
  @Column(name = "SC_CIVIL_MILITAR", nullable = true, unique = false, length=7, insertable=true, updatable=true)
  
  private java.lang.String scCivilMilitar;

  /**
  * @generated
  */
  @Column(name = "SC_CODIGO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String scCodigo;

  /**
  * @generated
  */
  @Column(name = "SC_COMPLEMENTO", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String scComplemento;

  /**
  * @generated
  */
  @Column(name = "SC_CPF", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String scCpf;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "SC_DATA_AFASTAMENTO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date scDataAfastamento;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "SC_DATA_NASCIMENTO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date scDataNascimento;

  /**
  * @generated
  */
  @Column(name = "SC_EMAIL", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String scEmail;

  /**
  * @generated
  */
  @Column(name = "SC_ENDERECO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String scEndereco;

  /**
  * @generated
  */
  @Column(name = "SC_ESTADO_CIVIL", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String scEstadoCivil;

  /**
  * @generated
  */
  @Column(name = "SC_FONE1", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String scFone1;

  /**
  * @generated
  */
  @Column(name = "SC_FONE2", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String scFone2;

  /**
  * @generated
  */
  @Column(name = "SC_FONE3", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String scFone3;

  /**
  * @generated
  */
  @Column(name = "SC_FUNCIONARIO", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String scFuncionario;

  /**
  * @generated
  */
  @Column(name = "SC_IDENTIDADE", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String scIdentidade;

  /**
  * @generated
  */
  @Column(name = "SC_LIMITE_CONSULTA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double scLimiteConsulta;

  /**
  * @generated
  */
  @Column(name = "SC_LOTACAO", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String scLotacao;

  /**
  * @generated
  */
  @Column(name = "SC_LOTE", nullable = true, unique = false, length=7, insertable=true, updatable=true)
  
  private java.lang.String scLote;

  /**
  * @generated
  */
  @Column(name = "SC_NOME", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String scNome;

  /**
  * @generated
  */
  @Column(name = "SC_NUMERO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String scNumero;

  /**
  * @generated
  */
  @Column(name = "SC_OBSERVACAO", nullable = true, unique = false, length=2048, insertable=true, updatable=true)
  
  private java.lang.String scObservacao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "SC_OPCAO_PLANO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date scOpcaoPlano;

  /**
  * @generated
  */
  @Column(name = "SC_PERCENTUAL_SOLDO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double scPercentualSoldo;

  /**
  * @generated
  */
  @Column(name = "SC_PLANO_SAUDE", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String scPlanoSaude;

  /**
  * @generated
  */
  @Column(name = "SC_PONTO_REFERENCIA", nullable = true, unique = false, length=150, insertable=true, updatable=true)
  
  private java.lang.String scPontoReferencia;

  /**
  * @generated
  */
  @Column(name = "SC_PRACA", nullable = true, unique = false, length=30, insertable=true, updatable=true)
  
  private java.lang.String scPraca;

  /**
  * @generated
  */
  @Column(name = "SC_SITE", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String scSite;

  /**
  * @generated
  */
  @Column(name = "SC_SITUACAO_CADASTRO", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String scSituacaoCadastro;

  /**
  * @generated
  */
  @Column(name = "SC_SITUACAO_PM", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String scSituacaoPm;

  /**
  * @generated
  */
  @Column(name = "SC_SOCIO_REMIDO", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String scSocioRemido;

  /**
  * @generated
  */
  @Column(name = "SC_TEM_VALOR_ADICIONAL", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String scTemValorAdicional;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "SC_ULTIMA_REVISAO_CADASTRO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date scUltimaRevisaoCadastro;

  /**
  * @generated
  */
  @Column(name = "SC_ULTIMO_VALOR", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double scUltimoValor;

  /**
  * @generated
  */
  @Column(name = "SC_UTILMA_REFERENCIA", nullable = true, unique = false, length=7, insertable=true, updatable=true)
  
  private java.lang.String scUtilmaReferencia;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "SC_VALIDADE_CARTAO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date scValidadeCartao;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_SOLDO", nullable = true, referencedColumnName = "ID_SOLDO", insertable=true, updatable=true)
  
  private Soldo soldo;

  /**
   * Construtor
   * @generated
   */
  public Socio(){
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
  public Socio setDtUpdate(java.util.Date dtUpdate){
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
  public Socio setEmpresa(Empresa empresa){
    this.empresa = empresa;
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
  public Socio setIdSocio(java.lang.Integer idSocio){
    this.idSocio = idSocio;
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
  public Socio setIdUsuario(java.lang.Integer idUsuario){
    this.idUsuario = idUsuario;
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
  public Socio setMotivoAfastamento(MotivoAfastamento motivoAfastamento){
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
  public Socio setMunicipio(Municipio municipio){
    this.municipio = municipio;
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
  public Socio setPostoGraduacao(PostoGraduacao postoGraduacao){
    this.postoGraduacao = postoGraduacao;
    return this;
  }

  /**
   * Obtém scBairro
   * return scBairro
   * @generated
   */
  
  public java.lang.String getScBairro(){
    return this.scBairro;
  }

  /**
   * Define scBairro
   * @param scBairro scBairro
   * @generated
   */
  public Socio setScBairro(java.lang.String scBairro){
    this.scBairro = scBairro;
    return this;
  }

  /**
   * Obtém scCep
   * return scCep
   * @generated
   */
  
  public java.lang.String getScCep(){
    return this.scCep;
  }

  /**
   * Define scCep
   * @param scCep scCep
   * @generated
   */
  public Socio setScCep(java.lang.String scCep){
    this.scCep = scCep;
    return this;
  }

  /**
   * Obtém scCivilMilitar
   * return scCivilMilitar
   * @generated
   */
  
  public java.lang.String getScCivilMilitar(){
    return this.scCivilMilitar;
  }

  /**
   * Define scCivilMilitar
   * @param scCivilMilitar scCivilMilitar
   * @generated
   */
  public Socio setScCivilMilitar(java.lang.String scCivilMilitar){
    this.scCivilMilitar = scCivilMilitar;
    return this;
  }

  /**
   * Obtém scCodigo
   * return scCodigo
   * @generated
   */
  
  public java.lang.String getScCodigo(){
    return this.scCodigo;
  }

  /**
   * Define scCodigo
   * @param scCodigo scCodigo
   * @generated
   */
  public Socio setScCodigo(java.lang.String scCodigo){
    this.scCodigo = scCodigo;
    return this;
  }

  /**
   * Obtém scComplemento
   * return scComplemento
   * @generated
   */
  
  public java.lang.String getScComplemento(){
    return this.scComplemento;
  }

  /**
   * Define scComplemento
   * @param scComplemento scComplemento
   * @generated
   */
  public Socio setScComplemento(java.lang.String scComplemento){
    this.scComplemento = scComplemento;
    return this;
  }

  /**
   * Obtém scCpf
   * return scCpf
   * @generated
   */
  
  public java.lang.String getScCpf(){
    return this.scCpf;
  }

  /**
   * Define scCpf
   * @param scCpf scCpf
   * @generated
   */
  public Socio setScCpf(java.lang.String scCpf){
    this.scCpf = scCpf;
    return this;
  }

  /**
   * Obtém scDataAfastamento
   * return scDataAfastamento
   * @generated
   */
  
  public java.util.Date getScDataAfastamento(){
    return this.scDataAfastamento;
  }

  /**
   * Define scDataAfastamento
   * @param scDataAfastamento scDataAfastamento
   * @generated
   */
  public Socio setScDataAfastamento(java.util.Date scDataAfastamento){
    this.scDataAfastamento = scDataAfastamento;
    return this;
  }

  /**
   * Obtém scDataNascimento
   * return scDataNascimento
   * @generated
   */
  
  public java.util.Date getScDataNascimento(){
    return this.scDataNascimento;
  }

  /**
   * Define scDataNascimento
   * @param scDataNascimento scDataNascimento
   * @generated
   */
  public Socio setScDataNascimento(java.util.Date scDataNascimento){
    this.scDataNascimento = scDataNascimento;
    return this;
  }

  /**
   * Obtém scEmail
   * return scEmail
   * @generated
   */
  
  public java.lang.String getScEmail(){
    return this.scEmail;
  }

  /**
   * Define scEmail
   * @param scEmail scEmail
   * @generated
   */
  public Socio setScEmail(java.lang.String scEmail){
    this.scEmail = scEmail;
    return this;
  }

  /**
   * Obtém scEndereco
   * return scEndereco
   * @generated
   */
  
  public java.lang.String getScEndereco(){
    return this.scEndereco;
  }

  /**
   * Define scEndereco
   * @param scEndereco scEndereco
   * @generated
   */
  public Socio setScEndereco(java.lang.String scEndereco){
    this.scEndereco = scEndereco;
    return this;
  }

  /**
   * Obtém scEstadoCivil
   * return scEstadoCivil
   * @generated
   */
  
  public java.lang.String getScEstadoCivil(){
    return this.scEstadoCivil;
  }

  /**
   * Define scEstadoCivil
   * @param scEstadoCivil scEstadoCivil
   * @generated
   */
  public Socio setScEstadoCivil(java.lang.String scEstadoCivil){
    this.scEstadoCivil = scEstadoCivil;
    return this;
  }

  /**
   * Obtém scFone1
   * return scFone1
   * @generated
   */
  
  public java.lang.String getScFone1(){
    return this.scFone1;
  }

  /**
   * Define scFone1
   * @param scFone1 scFone1
   * @generated
   */
  public Socio setScFone1(java.lang.String scFone1){
    this.scFone1 = scFone1;
    return this;
  }

  /**
   * Obtém scFone2
   * return scFone2
   * @generated
   */
  
  public java.lang.String getScFone2(){
    return this.scFone2;
  }

  /**
   * Define scFone2
   * @param scFone2 scFone2
   * @generated
   */
  public Socio setScFone2(java.lang.String scFone2){
    this.scFone2 = scFone2;
    return this;
  }

  /**
   * Obtém scFone3
   * return scFone3
   * @generated
   */
  
  public java.lang.String getScFone3(){
    return this.scFone3;
  }

  /**
   * Define scFone3
   * @param scFone3 scFone3
   * @generated
   */
  public Socio setScFone3(java.lang.String scFone3){
    this.scFone3 = scFone3;
    return this;
  }

  /**
   * Obtém scFuncionario
   * return scFuncionario
   * @generated
   */
  
  public java.lang.String getScFuncionario(){
    return this.scFuncionario;
  }

  /**
   * Define scFuncionario
   * @param scFuncionario scFuncionario
   * @generated
   */
  public Socio setScFuncionario(java.lang.String scFuncionario){
    this.scFuncionario = scFuncionario;
    return this;
  }

  /**
   * Obtém scIdentidade
   * return scIdentidade
   * @generated
   */
  
  public java.lang.String getScIdentidade(){
    return this.scIdentidade;
  }

  /**
   * Define scIdentidade
   * @param scIdentidade scIdentidade
   * @generated
   */
  public Socio setScIdentidade(java.lang.String scIdentidade){
    this.scIdentidade = scIdentidade;
    return this;
  }

  /**
   * Obtém scLimiteConsulta
   * return scLimiteConsulta
   * @generated
   */
  
  public java.lang.Double getScLimiteConsulta(){
    return this.scLimiteConsulta;
  }

  /**
   * Define scLimiteConsulta
   * @param scLimiteConsulta scLimiteConsulta
   * @generated
   */
  public Socio setScLimiteConsulta(java.lang.Double scLimiteConsulta){
    this.scLimiteConsulta = scLimiteConsulta;
    return this;
  }

  /**
   * Obtém scLotacao
   * return scLotacao
   * @generated
   */
  
  public java.lang.String getScLotacao(){
    return this.scLotacao;
  }

  /**
   * Define scLotacao
   * @param scLotacao scLotacao
   * @generated
   */
  public Socio setScLotacao(java.lang.String scLotacao){
    this.scLotacao = scLotacao;
    return this;
  }

  /**
   * Obtém scLote
   * return scLote
   * @generated
   */
  
  public java.lang.String getScLote(){
    return this.scLote;
  }

  /**
   * Define scLote
   * @param scLote scLote
   * @generated
   */
  public Socio setScLote(java.lang.String scLote){
    this.scLote = scLote;
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
  public Socio setScNome(java.lang.String scNome){
    this.scNome = scNome;
    return this;
  }

  /**
   * Obtém scNumero
   * return scNumero
   * @generated
   */
  
  public java.lang.String getScNumero(){
    return this.scNumero;
  }

  /**
   * Define scNumero
   * @param scNumero scNumero
   * @generated
   */
  public Socio setScNumero(java.lang.String scNumero){
    this.scNumero = scNumero;
    return this;
  }

  /**
   * Obtém scObservacao
   * return scObservacao
   * @generated
   */
  
  public java.lang.String getScObservacao(){
    return this.scObservacao;
  }

  /**
   * Define scObservacao
   * @param scObservacao scObservacao
   * @generated
   */
  public Socio setScObservacao(java.lang.String scObservacao){
    this.scObservacao = scObservacao;
    return this;
  }

  /**
   * Obtém scOpcaoPlano
   * return scOpcaoPlano
   * @generated
   */
  
  public java.util.Date getScOpcaoPlano(){
    return this.scOpcaoPlano;
  }

  /**
   * Define scOpcaoPlano
   * @param scOpcaoPlano scOpcaoPlano
   * @generated
   */
  public Socio setScOpcaoPlano(java.util.Date scOpcaoPlano){
    this.scOpcaoPlano = scOpcaoPlano;
    return this;
  }

  /**
   * Obtém scPercentualSoldo
   * return scPercentualSoldo
   * @generated
   */
  
  public java.lang.Double getScPercentualSoldo(){
    return this.scPercentualSoldo;
  }

  /**
   * Define scPercentualSoldo
   * @param scPercentualSoldo scPercentualSoldo
   * @generated
   */
  public Socio setScPercentualSoldo(java.lang.Double scPercentualSoldo){
    this.scPercentualSoldo = scPercentualSoldo;
    return this;
  }

  /**
   * Obtém scPlanoSaude
   * return scPlanoSaude
   * @generated
   */
  
  public java.lang.String getScPlanoSaude(){
    return this.scPlanoSaude;
  }

  /**
   * Define scPlanoSaude
   * @param scPlanoSaude scPlanoSaude
   * @generated
   */
  public Socio setScPlanoSaude(java.lang.String scPlanoSaude){
    this.scPlanoSaude = scPlanoSaude;
    return this;
  }

  /**
   * Obtém scPontoReferencia
   * return scPontoReferencia
   * @generated
   */
  
  public java.lang.String getScPontoReferencia(){
    return this.scPontoReferencia;
  }

  /**
   * Define scPontoReferencia
   * @param scPontoReferencia scPontoReferencia
   * @generated
   */
  public Socio setScPontoReferencia(java.lang.String scPontoReferencia){
    this.scPontoReferencia = scPontoReferencia;
    return this;
  }

  /**
   * Obtém scPraca
   * return scPraca
   * @generated
   */
  
  public java.lang.String getScPraca(){
    return this.scPraca;
  }

  /**
   * Define scPraca
   * @param scPraca scPraca
   * @generated
   */
  public Socio setScPraca(java.lang.String scPraca){
    this.scPraca = scPraca;
    return this;
  }

  /**
   * Obtém scSite
   * return scSite
   * @generated
   */
  
  public java.lang.String getScSite(){
    return this.scSite;
  }

  /**
   * Define scSite
   * @param scSite scSite
   * @generated
   */
  public Socio setScSite(java.lang.String scSite){
    this.scSite = scSite;
    return this;
  }

  /**
   * Obtém scSituacaoCadastro
   * return scSituacaoCadastro
   * @generated
   */
  
  public java.lang.String getScSituacaoCadastro(){
    return this.scSituacaoCadastro;
  }

  /**
   * Define scSituacaoCadastro
   * @param scSituacaoCadastro scSituacaoCadastro
   * @generated
   */
  public Socio setScSituacaoCadastro(java.lang.String scSituacaoCadastro){
    this.scSituacaoCadastro = scSituacaoCadastro;
    return this;
  }

  /**
   * Obtém scSituacaoPm
   * return scSituacaoPm
   * @generated
   */
  
  public java.lang.String getScSituacaoPm(){
    return this.scSituacaoPm;
  }

  /**
   * Define scSituacaoPm
   * @param scSituacaoPm scSituacaoPm
   * @generated
   */
  public Socio setScSituacaoPm(java.lang.String scSituacaoPm){
    this.scSituacaoPm = scSituacaoPm;
    return this;
  }

  /**
   * Obtém scSocioRemido
   * return scSocioRemido
   * @generated
   */
  
  public java.lang.String getScSocioRemido(){
    return this.scSocioRemido;
  }

  /**
   * Define scSocioRemido
   * @param scSocioRemido scSocioRemido
   * @generated
   */
  public Socio setScSocioRemido(java.lang.String scSocioRemido){
    this.scSocioRemido = scSocioRemido;
    return this;
  }

  /**
   * Obtém scTemValorAdicional
   * return scTemValorAdicional
   * @generated
   */
  
  public java.lang.String getScTemValorAdicional(){
    return this.scTemValorAdicional;
  }

  /**
   * Define scTemValorAdicional
   * @param scTemValorAdicional scTemValorAdicional
   * @generated
   */
  public Socio setScTemValorAdicional(java.lang.String scTemValorAdicional){
    this.scTemValorAdicional = scTemValorAdicional;
    return this;
  }

  /**
   * Obtém scUltimaRevisaoCadastro
   * return scUltimaRevisaoCadastro
   * @generated
   */
  
  public java.util.Date getScUltimaRevisaoCadastro(){
    return this.scUltimaRevisaoCadastro;
  }

  /**
   * Define scUltimaRevisaoCadastro
   * @param scUltimaRevisaoCadastro scUltimaRevisaoCadastro
   * @generated
   */
  public Socio setScUltimaRevisaoCadastro(java.util.Date scUltimaRevisaoCadastro){
    this.scUltimaRevisaoCadastro = scUltimaRevisaoCadastro;
    return this;
  }

  /**
   * Obtém scUltimoValor
   * return scUltimoValor
   * @generated
   */
  
  public java.lang.Double getScUltimoValor(){
    return this.scUltimoValor;
  }

  /**
   * Define scUltimoValor
   * @param scUltimoValor scUltimoValor
   * @generated
   */
  public Socio setScUltimoValor(java.lang.Double scUltimoValor){
    this.scUltimoValor = scUltimoValor;
    return this;
  }

  /**
   * Obtém scUtilmaReferencia
   * return scUtilmaReferencia
   * @generated
   */
  
  public java.lang.String getScUtilmaReferencia(){
    return this.scUtilmaReferencia;
  }

  /**
   * Define scUtilmaReferencia
   * @param scUtilmaReferencia scUtilmaReferencia
   * @generated
   */
  public Socio setScUtilmaReferencia(java.lang.String scUtilmaReferencia){
    this.scUtilmaReferencia = scUtilmaReferencia;
    return this;
  }

  /**
   * Obtém scValidadeCartao
   * return scValidadeCartao
   * @generated
   */
  
  public java.util.Date getScValidadeCartao(){
    return this.scValidadeCartao;
  }

  /**
   * Define scValidadeCartao
   * @param scValidadeCartao scValidadeCartao
   * @generated
   */
  public Socio setScValidadeCartao(java.util.Date scValidadeCartao){
    this.scValidadeCartao = scValidadeCartao;
    return this;
  }

  /**
   * Obtém soldo
   * return soldo
   * @generated
   */
  
  public Soldo getSoldo(){
    return this.soldo;
  }

  /**
   * Define soldo
   * @param soldo soldo
   * @generated
   */
  public Socio setSoldo(Soldo soldo){
    this.soldo = soldo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Socio object = (Socio)obj;
    if (idSocio != null ? !idSocio.equals(object.idSocio) : object.idSocio != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idSocio == null) ? 0 : idSocio.hashCode());
    return result;
  }

}
