package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FORNECEDOR
 * @generated
 */
@Entity
@Table(name = "\"FORNECEDOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Fornecedor")
public class Fornecedor implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_FORNECEDOR", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idFornecedor;

  /**
  * @generated
  */
  @Column(name = "FO_BAIRRO", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String foBairro;

  /**
  * @generated
  */
  @Column(name = "FO_CELULAR", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String foCelular;

  /**
  * @generated
  */
  @Column(name = "FO_CEP", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String foCep;

  /**
  * @generated
  */
  @Column(name = "FO_COMPLEMENTO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String foComplemento;

  /**
  * @generated
  */
  @Column(name = "FO_EMAIL", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String foEmail;

  /**
  * @generated
  */
  @Column(name = "FO_ENDERECO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String foEndereco;

  /**
  * @generated
  */
  @Column(name = "FO_NOME_FANTASIA", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String foNomeFantasia;

  /**
  * @generated
  */
  @Column(name = "FO_NUMERO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer foNumero;

  /**
  * @generated
  */
  @Column(name = "FO_RAZAO_SOCIAL", nullable = false, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String foRazaoSocial;

  /**
  * @generated
  */
  @Column(name = "FO_RESPONSAVEL", nullable = true, unique = false, length=30, insertable=true, updatable=true)
  
  private java.lang.String foResponsavel;

  /**
  * @generated
  */
  @Column(name = "FO_SITE", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String foSite;

  /**
  * @generated
  */
  @Column(name = "FO_TELEFONE", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String foTelefone;

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
  public Fornecedor(){
  }


  /**
   * Obtém foBairro
   * return foBairro
   * @generated
   */
  
  public java.lang.String getFoBairro(){
    return this.foBairro;
  }

  /**
   * Define foBairro
   * @param foBairro foBairro
   * @generated
   */
  public Fornecedor setFoBairro(java.lang.String foBairro){
    this.foBairro = foBairro;
    return this;
  }

  /**
   * Obtém foCelular
   * return foCelular
   * @generated
   */
  
  public java.lang.String getFoCelular(){
    return this.foCelular;
  }

  /**
   * Define foCelular
   * @param foCelular foCelular
   * @generated
   */
  public Fornecedor setFoCelular(java.lang.String foCelular){
    this.foCelular = foCelular;
    return this;
  }

  /**
   * Obtém foCep
   * return foCep
   * @generated
   */
  
  public java.lang.String getFoCep(){
    return this.foCep;
  }

  /**
   * Define foCep
   * @param foCep foCep
   * @generated
   */
  public Fornecedor setFoCep(java.lang.String foCep){
    this.foCep = foCep;
    return this;
  }

  /**
   * Obtém foComplemento
   * return foComplemento
   * @generated
   */
  
  public java.lang.String getFoComplemento(){
    return this.foComplemento;
  }

  /**
   * Define foComplemento
   * @param foComplemento foComplemento
   * @generated
   */
  public Fornecedor setFoComplemento(java.lang.String foComplemento){
    this.foComplemento = foComplemento;
    return this;
  }

  /**
   * Obtém foEmail
   * return foEmail
   * @generated
   */
  
  public java.lang.String getFoEmail(){
    return this.foEmail;
  }

  /**
   * Define foEmail
   * @param foEmail foEmail
   * @generated
   */
  public Fornecedor setFoEmail(java.lang.String foEmail){
    this.foEmail = foEmail;
    return this;
  }

  /**
   * Obtém foEndereco
   * return foEndereco
   * @generated
   */
  
  public java.lang.String getFoEndereco(){
    return this.foEndereco;
  }

  /**
   * Define foEndereco
   * @param foEndereco foEndereco
   * @generated
   */
  public Fornecedor setFoEndereco(java.lang.String foEndereco){
    this.foEndereco = foEndereco;
    return this;
  }

  /**
   * Obtém foNomeFantasia
   * return foNomeFantasia
   * @generated
   */
  
  public java.lang.String getFoNomeFantasia(){
    return this.foNomeFantasia;
  }

  /**
   * Define foNomeFantasia
   * @param foNomeFantasia foNomeFantasia
   * @generated
   */
  public Fornecedor setFoNomeFantasia(java.lang.String foNomeFantasia){
    this.foNomeFantasia = foNomeFantasia;
    return this;
  }

  /**
   * Obtém foNumero
   * return foNumero
   * @generated
   */
  
  public java.lang.Integer getFoNumero(){
    return this.foNumero;
  }

  /**
   * Define foNumero
   * @param foNumero foNumero
   * @generated
   */
  public Fornecedor setFoNumero(java.lang.Integer foNumero){
    this.foNumero = foNumero;
    return this;
  }

  /**
   * Obtém foRazaoSocial
   * return foRazaoSocial
   * @generated
   */
  
  public java.lang.String getFoRazaoSocial(){
    return this.foRazaoSocial;
  }

  /**
   * Define foRazaoSocial
   * @param foRazaoSocial foRazaoSocial
   * @generated
   */
  public Fornecedor setFoRazaoSocial(java.lang.String foRazaoSocial){
    this.foRazaoSocial = foRazaoSocial;
    return this;
  }

  /**
   * Obtém foResponsavel
   * return foResponsavel
   * @generated
   */
  
  public java.lang.String getFoResponsavel(){
    return this.foResponsavel;
  }

  /**
   * Define foResponsavel
   * @param foResponsavel foResponsavel
   * @generated
   */
  public Fornecedor setFoResponsavel(java.lang.String foResponsavel){
    this.foResponsavel = foResponsavel;
    return this;
  }

  /**
   * Obtém foSite
   * return foSite
   * @generated
   */
  
  public java.lang.String getFoSite(){
    return this.foSite;
  }

  /**
   * Define foSite
   * @param foSite foSite
   * @generated
   */
  public Fornecedor setFoSite(java.lang.String foSite){
    this.foSite = foSite;
    return this;
  }

  /**
   * Obtém foTelefone
   * return foTelefone
   * @generated
   */
  
  public java.lang.String getFoTelefone(){
    return this.foTelefone;
  }

  /**
   * Define foTelefone
   * @param foTelefone foTelefone
   * @generated
   */
  public Fornecedor setFoTelefone(java.lang.String foTelefone){
    this.foTelefone = foTelefone;
    return this;
  }

  /**
   * Obtém idFornecedor
   * return idFornecedor
   * @generated
   */
  
  public java.lang.Integer getIdFornecedor(){
    return this.idFornecedor;
  }

  /**
   * Define idFornecedor
   * @param idFornecedor idFornecedor
   * @generated
   */
  public Fornecedor setIdFornecedor(java.lang.Integer idFornecedor){
    this.idFornecedor = idFornecedor;
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
  public Fornecedor setMunicipio(Municipio municipio){
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
    Fornecedor object = (Fornecedor)obj;
    if (idFornecedor != null ? !idFornecedor.equals(object.idFornecedor) : object.idFornecedor != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idFornecedor == null) ? 0 : idFornecedor.hashCode());
    return result;
  }

}
