package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CONTRIBUICAO_MENSAL
 * @generated
 */
@Entity
@Table(name = "\"CONTRIBUICAO_MENSAL\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.ContribuicaoMensal")
public class ContribuicaoMensal implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_CONTRIBUICAO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idContribuicao;

  /**
  * @generated
  */
  @Column(name = "CM_EXERCICIO", nullable = false, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String cmExercicio;

  /**
  * @generated
  */
  @Column(name = "CM_LOTE", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String cmLote;

  /**
  * @generated
  */
  @Column(name = "CM_MENSALIDADE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double cmMensalidade;

  /**
  * @generated
  */
  @Column(name = "CM_NUMERO_CONVENIO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer cmNumeroConvenio;

  /**
  * @generated
  */
  @Column(name = "CM_PLANO_SAUDE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double cmPlanoSaude;

  /**
  * @generated
  */
  @Column(name = "CM_VALOR_EMPRESTIMO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double cmValorEmprestimo;

  /**
  * @generated
  */
  @Column(name = "CM_VD", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String cmVd;

  /**
  * @generated
  */
  @Column(name = "COM_NUMERO_EMPRESTIMO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer comNumeroEmprestimo;

  /**
  * @generated
  */
  @Column(name = "COM_VALOR_CONVENIO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double comValorConvenio;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_SOCIO", nullable = false, referencedColumnName = "ID_SOCIO", insertable=true, updatable=true)
  
  private Socio socio;

  /**
   * Construtor
   * @generated
   */
  public ContribuicaoMensal(){
  }


  /**
   * Obtém cmExercicio
   * return cmExercicio
   * @generated
   */
  
  public java.lang.String getCmExercicio(){
    return this.cmExercicio;
  }

  /**
   * Define cmExercicio
   * @param cmExercicio cmExercicio
   * @generated
   */
  public ContribuicaoMensal setCmExercicio(java.lang.String cmExercicio){
    this.cmExercicio = cmExercicio;
    return this;
  }

  /**
   * Obtém cmLote
   * return cmLote
   * @generated
   */
  
  public java.lang.String getCmLote(){
    return this.cmLote;
  }

  /**
   * Define cmLote
   * @param cmLote cmLote
   * @generated
   */
  public ContribuicaoMensal setCmLote(java.lang.String cmLote){
    this.cmLote = cmLote;
    return this;
  }

  /**
   * Obtém cmMensalidade
   * return cmMensalidade
   * @generated
   */
  
  public java.lang.Double getCmMensalidade(){
    return this.cmMensalidade;
  }

  /**
   * Define cmMensalidade
   * @param cmMensalidade cmMensalidade
   * @generated
   */
  public ContribuicaoMensal setCmMensalidade(java.lang.Double cmMensalidade){
    this.cmMensalidade = cmMensalidade;
    return this;
  }

  /**
   * Obtém cmNumeroConvenio
   * return cmNumeroConvenio
   * @generated
   */
  
  public java.lang.Integer getCmNumeroConvenio(){
    return this.cmNumeroConvenio;
  }

  /**
   * Define cmNumeroConvenio
   * @param cmNumeroConvenio cmNumeroConvenio
   * @generated
   */
  public ContribuicaoMensal setCmNumeroConvenio(java.lang.Integer cmNumeroConvenio){
    this.cmNumeroConvenio = cmNumeroConvenio;
    return this;
  }

  /**
   * Obtém cmPlanoSaude
   * return cmPlanoSaude
   * @generated
   */
  
  public java.lang.Double getCmPlanoSaude(){
    return this.cmPlanoSaude;
  }

  /**
   * Define cmPlanoSaude
   * @param cmPlanoSaude cmPlanoSaude
   * @generated
   */
  public ContribuicaoMensal setCmPlanoSaude(java.lang.Double cmPlanoSaude){
    this.cmPlanoSaude = cmPlanoSaude;
    return this;
  }

  /**
   * Obtém cmValorEmprestimo
   * return cmValorEmprestimo
   * @generated
   */
  
  public java.lang.Double getCmValorEmprestimo(){
    return this.cmValorEmprestimo;
  }

  /**
   * Define cmValorEmprestimo
   * @param cmValorEmprestimo cmValorEmprestimo
   * @generated
   */
  public ContribuicaoMensal setCmValorEmprestimo(java.lang.Double cmValorEmprestimo){
    this.cmValorEmprestimo = cmValorEmprestimo;
    return this;
  }

  /**
   * Obtém cmVd
   * return cmVd
   * @generated
   */
  
  public java.lang.String getCmVd(){
    return this.cmVd;
  }

  /**
   * Define cmVd
   * @param cmVd cmVd
   * @generated
   */
  public ContribuicaoMensal setCmVd(java.lang.String cmVd){
    this.cmVd = cmVd;
    return this;
  }

  /**
   * Obtém comNumeroEmprestimo
   * return comNumeroEmprestimo
   * @generated
   */
  
  public java.lang.Integer getComNumeroEmprestimo(){
    return this.comNumeroEmprestimo;
  }

  /**
   * Define comNumeroEmprestimo
   * @param comNumeroEmprestimo comNumeroEmprestimo
   * @generated
   */
  public ContribuicaoMensal setComNumeroEmprestimo(java.lang.Integer comNumeroEmprestimo){
    this.comNumeroEmprestimo = comNumeroEmprestimo;
    return this;
  }

  /**
   * Obtém comValorConvenio
   * return comValorConvenio
   * @generated
   */
  
  public java.lang.Double getComValorConvenio(){
    return this.comValorConvenio;
  }

  /**
   * Define comValorConvenio
   * @param comValorConvenio comValorConvenio
   * @generated
   */
  public ContribuicaoMensal setComValorConvenio(java.lang.Double comValorConvenio){
    this.comValorConvenio = comValorConvenio;
    return this;
  }

  /**
   * Obtém idContribuicao
   * return idContribuicao
   * @generated
   */
  
  public java.lang.Integer getIdContribuicao(){
    return this.idContribuicao;
  }

  /**
   * Define idContribuicao
   * @param idContribuicao idContribuicao
   * @generated
   */
  public ContribuicaoMensal setIdContribuicao(java.lang.Integer idContribuicao){
    this.idContribuicao = idContribuicao;
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
  public ContribuicaoMensal setSocio(Socio socio){
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
    ContribuicaoMensal object = (ContribuicaoMensal)obj;
    if (idContribuicao != null ? !idContribuicao.equals(object.idContribuicao) : object.idContribuicao != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idContribuicao == null) ? 0 : idContribuicao.hashCode());
    return result;
  }

}
