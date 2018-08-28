package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FUNCIONARIO
 * @generated
 */
@Entity
@Table(name = "\"FUNCIONARIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Funcionario")
public class Funcionario implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_FUNCIONARIO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idFuncionario;

  /**
  * @generated
  */
  @Column(name = "FU_BAIRRO", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String fuBairro;

  /**
  * @generated
  */
  @Column(name = "FU_CELULAR", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String fuCelular;

  /**
  * @generated
  */
  @Column(name = "FU_CEP", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String fuCep;

  /**
  * @generated
  */
  @Column(name = "FU_COMPLEMENTO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String fuComplemento;

  /**
  * @generated
  */
  @Column(name = "FU_EMAIL", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String fuEmail;

  /**
  * @generated
  */
  @Column(name = "FU_ENDERECO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String fuEndereco;

  /**
  * @generated
  */
  @Column(name = "FU_NOME", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String fuNome;

  /**
  * @generated
  */
  @Column(name = "FU_NUMERO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer fuNumero;

  /**
  * @generated
  */
  @Column(name = "FU_SITE", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String fuSite;

  /**
  * @generated
  */
  @Column(name = "FU_TELEFONE", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String fuTelefone;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_MUNICIPIO", nullable = false, referencedColumnName = "ID_MUNICIPIO", insertable=true, updatable=true)
  
  private Municipio municipio;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_SETOR", nullable = false, referencedColumnName = "ID_SETOR", insertable=true, updatable=true)
  
  private Setor setor;

  /**
   * Construtor
   * @generated
   */
  public Funcionario(){
  }


  /**
   * Obtém fuBairro
   * return fuBairro
   * @generated
   */
  
  public java.lang.String getFuBairro(){
    return this.fuBairro;
  }

  /**
   * Define fuBairro
   * @param fuBairro fuBairro
   * @generated
   */
  public Funcionario setFuBairro(java.lang.String fuBairro){
    this.fuBairro = fuBairro;
    return this;
  }

  /**
   * Obtém fuCelular
   * return fuCelular
   * @generated
   */
  
  public java.lang.String getFuCelular(){
    return this.fuCelular;
  }

  /**
   * Define fuCelular
   * @param fuCelular fuCelular
   * @generated
   */
  public Funcionario setFuCelular(java.lang.String fuCelular){
    this.fuCelular = fuCelular;
    return this;
  }

  /**
   * Obtém fuCep
   * return fuCep
   * @generated
   */
  
  public java.lang.String getFuCep(){
    return this.fuCep;
  }

  /**
   * Define fuCep
   * @param fuCep fuCep
   * @generated
   */
  public Funcionario setFuCep(java.lang.String fuCep){
    this.fuCep = fuCep;
    return this;
  }

  /**
   * Obtém fuComplemento
   * return fuComplemento
   * @generated
   */
  
  public java.lang.String getFuComplemento(){
    return this.fuComplemento;
  }

  /**
   * Define fuComplemento
   * @param fuComplemento fuComplemento
   * @generated
   */
  public Funcionario setFuComplemento(java.lang.String fuComplemento){
    this.fuComplemento = fuComplemento;
    return this;
  }

  /**
   * Obtém fuEmail
   * return fuEmail
   * @generated
   */
  
  public java.lang.String getFuEmail(){
    return this.fuEmail;
  }

  /**
   * Define fuEmail
   * @param fuEmail fuEmail
   * @generated
   */
  public Funcionario setFuEmail(java.lang.String fuEmail){
    this.fuEmail = fuEmail;
    return this;
  }

  /**
   * Obtém fuEndereco
   * return fuEndereco
   * @generated
   */
  
  public java.lang.String getFuEndereco(){
    return this.fuEndereco;
  }

  /**
   * Define fuEndereco
   * @param fuEndereco fuEndereco
   * @generated
   */
  public Funcionario setFuEndereco(java.lang.String fuEndereco){
    this.fuEndereco = fuEndereco;
    return this;
  }

  /**
   * Obtém fuNome
   * return fuNome
   * @generated
   */
  
  public java.lang.String getFuNome(){
    return this.fuNome;
  }

  /**
   * Define fuNome
   * @param fuNome fuNome
   * @generated
   */
  public Funcionario setFuNome(java.lang.String fuNome){
    this.fuNome = fuNome;
    return this;
  }

  /**
   * Obtém fuNumero
   * return fuNumero
   * @generated
   */
  
  public java.lang.Integer getFuNumero(){
    return this.fuNumero;
  }

  /**
   * Define fuNumero
   * @param fuNumero fuNumero
   * @generated
   */
  public Funcionario setFuNumero(java.lang.Integer fuNumero){
    this.fuNumero = fuNumero;
    return this;
  }

  /**
   * Obtém fuSite
   * return fuSite
   * @generated
   */
  
  public java.lang.String getFuSite(){
    return this.fuSite;
  }

  /**
   * Define fuSite
   * @param fuSite fuSite
   * @generated
   */
  public Funcionario setFuSite(java.lang.String fuSite){
    this.fuSite = fuSite;
    return this;
  }

  /**
   * Obtém fuTelefone
   * return fuTelefone
   * @generated
   */
  
  public java.lang.String getFuTelefone(){
    return this.fuTelefone;
  }

  /**
   * Define fuTelefone
   * @param fuTelefone fuTelefone
   * @generated
   */
  public Funcionario setFuTelefone(java.lang.String fuTelefone){
    this.fuTelefone = fuTelefone;
    return this;
  }

  /**
   * Obtém idFuncionario
   * return idFuncionario
   * @generated
   */
  
  public java.lang.Integer getIdFuncionario(){
    return this.idFuncionario;
  }

  /**
   * Define idFuncionario
   * @param idFuncionario idFuncionario
   * @generated
   */
  public Funcionario setIdFuncionario(java.lang.Integer idFuncionario){
    this.idFuncionario = idFuncionario;
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
  public Funcionario setMunicipio(Municipio municipio){
    this.municipio = municipio;
    return this;
  }

  /**
   * Obtém setor
   * return setor
   * @generated
   */
  
  public Setor getSetor(){
    return this.setor;
  }

  /**
   * Define setor
   * @param setor setor
   * @generated
   */
  public Funcionario setSetor(Setor setor){
    this.setor = setor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Funcionario object = (Funcionario)obj;
    if (idFuncionario != null ? !idFuncionario.equals(object.idFuncionario) : object.idFuncionario != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idFuncionario == null) ? 0 : idFuncionario.hashCode());
    return result;
  }

}
