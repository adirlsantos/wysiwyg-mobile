package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela AVERBACAO_VALOR
 * @generated
 */
@Entity
@Table(name = "\"AVERBACAO_VALOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.AverbacaoValor")
public class AverbacaoValor implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_AVERBACAO_VALOR", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idAverbacaoValor;

  /**
  * @generated
  */
  @Column(name = "AV_CODIGO_BENEFICIARIO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer avCodigoBeneficiario;

  /**
  * @generated
  */
  @Column(name = "AV_CODIGO_ORGAO", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer avCodigoOrgao;

  /**
  * @generated
  */
  @Column(name = "AV_EXERCICIO", nullable = false, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String avExercicio;

  /**
  * @generated
  */
  @Column(name = "AV_PARCELAS", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer avParcelas;

  /**
  * @generated
  */
  @Column(name = "AV_TIPO_ENVIO", nullable = false, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String avTipoEnvio;

  /**
  * @generated
  */
  @Column(name = "AV_VALOR_VANTAGEM_DESCONTO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double avValorVantagemDesconto;

  /**
  * @generated
  */
  @Column(name = "AV_VANTAGEM_DESCONTO", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer avVantagemDesconto;

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
  public AverbacaoValor(){
  }


  /**
   * Obtém avCodigoBeneficiario
   * return avCodigoBeneficiario
   * @generated
   */
  
  public java.lang.Integer getAvCodigoBeneficiario(){
    return this.avCodigoBeneficiario;
  }

  /**
   * Define avCodigoBeneficiario
   * @param avCodigoBeneficiario avCodigoBeneficiario
   * @generated
   */
  public AverbacaoValor setAvCodigoBeneficiario(java.lang.Integer avCodigoBeneficiario){
    this.avCodigoBeneficiario = avCodigoBeneficiario;
    return this;
  }

  /**
   * Obtém avCodigoOrgao
   * return avCodigoOrgao
   * @generated
   */
  
  public java.lang.Integer getAvCodigoOrgao(){
    return this.avCodigoOrgao;
  }

  /**
   * Define avCodigoOrgao
   * @param avCodigoOrgao avCodigoOrgao
   * @generated
   */
  public AverbacaoValor setAvCodigoOrgao(java.lang.Integer avCodigoOrgao){
    this.avCodigoOrgao = avCodigoOrgao;
    return this;
  }

  /**
   * Obtém avExercicio
   * return avExercicio
   * @generated
   */
  
  public java.lang.String getAvExercicio(){
    return this.avExercicio;
  }

  /**
   * Define avExercicio
   * @param avExercicio avExercicio
   * @generated
   */
  public AverbacaoValor setAvExercicio(java.lang.String avExercicio){
    this.avExercicio = avExercicio;
    return this;
  }

  /**
   * Obtém avParcelas
   * return avParcelas
   * @generated
   */
  
  public java.lang.Integer getAvParcelas(){
    return this.avParcelas;
  }

  /**
   * Define avParcelas
   * @param avParcelas avParcelas
   * @generated
   */
  public AverbacaoValor setAvParcelas(java.lang.Integer avParcelas){
    this.avParcelas = avParcelas;
    return this;
  }

  /**
   * Obtém avTipoEnvio
   * return avTipoEnvio
   * @generated
   */
  
  public java.lang.String getAvTipoEnvio(){
    return this.avTipoEnvio;
  }

  /**
   * Define avTipoEnvio
   * @param avTipoEnvio avTipoEnvio
   * @generated
   */
  public AverbacaoValor setAvTipoEnvio(java.lang.String avTipoEnvio){
    this.avTipoEnvio = avTipoEnvio;
    return this;
  }

  /**
   * Obtém avValorVantagemDesconto
   * return avValorVantagemDesconto
   * @generated
   */
  
  public java.lang.Double getAvValorVantagemDesconto(){
    return this.avValorVantagemDesconto;
  }

  /**
   * Define avValorVantagemDesconto
   * @param avValorVantagemDesconto avValorVantagemDesconto
   * @generated
   */
  public AverbacaoValor setAvValorVantagemDesconto(java.lang.Double avValorVantagemDesconto){
    this.avValorVantagemDesconto = avValorVantagemDesconto;
    return this;
  }

  /**
   * Obtém avVantagemDesconto
   * return avVantagemDesconto
   * @generated
   */
  
  public java.lang.Integer getAvVantagemDesconto(){
    return this.avVantagemDesconto;
  }

  /**
   * Define avVantagemDesconto
   * @param avVantagemDesconto avVantagemDesconto
   * @generated
   */
  public AverbacaoValor setAvVantagemDesconto(java.lang.Integer avVantagemDesconto){
    this.avVantagemDesconto = avVantagemDesconto;
    return this;
  }

  /**
   * Obtém idAverbacaoValor
   * return idAverbacaoValor
   * @generated
   */
  
  public java.lang.Integer getIdAverbacaoValor(){
    return this.idAverbacaoValor;
  }

  /**
   * Define idAverbacaoValor
   * @param idAverbacaoValor idAverbacaoValor
   * @generated
   */
  public AverbacaoValor setIdAverbacaoValor(java.lang.Integer idAverbacaoValor){
    this.idAverbacaoValor = idAverbacaoValor;
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
  public AverbacaoValor setSocio(Socio socio){
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
    AverbacaoValor object = (AverbacaoValor)obj;
    if (idAverbacaoValor != null ? !idAverbacaoValor.equals(object.idAverbacaoValor) : object.idAverbacaoValor != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idAverbacaoValor == null) ? 0 : idAverbacaoValor.hashCode());
    return result;
  }

}
