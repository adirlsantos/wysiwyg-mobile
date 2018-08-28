package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FILIAL
 * @generated
 */
@Entity
@Table(name = "\"FILIAL\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Filial")
public class Filial implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_FILIAL", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idFilial;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
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
  @Column(name = "FL_BAIRRO", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String flBairro;

  /**
  * @generated
  */
  @Column(name = "FL_CEP", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String flCep;

  /**
  * @generated
  */
  @Column(name = "FL_CNPJ", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String flCnpj;

  /**
  * @generated
  */
  @Column(name = "FL_COMPLEMENTO", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String flComplemento;

  /**
  * @generated
  */
  @Column(name = "FL_CONTATO", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String flContato;

  /**
  * @generated
  */
  @Column(name = "FL_ENDERECO", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String flEndereco;

  /**
  * @generated
  */
  @Column(name = "FL_FAX", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String flFax;

  /**
  * @generated
  */
  @Column(name = "FL_INSCRICAOESTADUAL", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String flInscricaoestadual;

  /**
  * @generated
  */
  @Column(name = "FL_INSCRICAOMUNICIPAL", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String flInscricaomunicipal;

  /**
  * @generated
  */
  @Column(name = "FL_MATRIZ", nullable = false, unique = false, length=80, insertable=true, updatable=true)
  
  private java.lang.String flMatriz;

  /**
  * @generated
  */
  @Column(name = "FL_MEDICO_RESPONSAVEL", nullable = true, unique = false, length=40, insertable=true, updatable=true)
  
  private java.lang.String flMedicoResponsavel;

  /**
  * @generated
  */
  @Column(name = "FL_MUNICIPIO", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String flMunicipio;

  /**
  * @generated
  */
  @Column(name = "FL_NOME", nullable = false, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String flNome;

  /**
  * @generated
  */
  @Column(name = "FL_RESPONSAVEL", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.String flResponsavel;

  /**
  * @generated
  */
  @Column(name = "FL_TEL1", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String flTel1;

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
  public Filial(){
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
  public Filial setDtUpdate(java.util.Date dtUpdate){
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
  public Filial setEmpresa(Empresa empresa){
    this.empresa = empresa;
    return this;
  }

  /**
   * Obtém flBairro
   * return flBairro
   * @generated
   */
  
  public java.lang.String getFlBairro(){
    return this.flBairro;
  }

  /**
   * Define flBairro
   * @param flBairro flBairro
   * @generated
   */
  public Filial setFlBairro(java.lang.String flBairro){
    this.flBairro = flBairro;
    return this;
  }

  /**
   * Obtém flCep
   * return flCep
   * @generated
   */
  
  public java.lang.String getFlCep(){
    return this.flCep;
  }

  /**
   * Define flCep
   * @param flCep flCep
   * @generated
   */
  public Filial setFlCep(java.lang.String flCep){
    this.flCep = flCep;
    return this;
  }

  /**
   * Obtém flCnpj
   * return flCnpj
   * @generated
   */
  
  public java.lang.String getFlCnpj(){
    return this.flCnpj;
  }

  /**
   * Define flCnpj
   * @param flCnpj flCnpj
   * @generated
   */
  public Filial setFlCnpj(java.lang.String flCnpj){
    this.flCnpj = flCnpj;
    return this;
  }

  /**
   * Obtém flComplemento
   * return flComplemento
   * @generated
   */
  
  public java.lang.String getFlComplemento(){
    return this.flComplemento;
  }

  /**
   * Define flComplemento
   * @param flComplemento flComplemento
   * @generated
   */
  public Filial setFlComplemento(java.lang.String flComplemento){
    this.flComplemento = flComplemento;
    return this;
  }

  /**
   * Obtém flContato
   * return flContato
   * @generated
   */
  
  public java.lang.String getFlContato(){
    return this.flContato;
  }

  /**
   * Define flContato
   * @param flContato flContato
   * @generated
   */
  public Filial setFlContato(java.lang.String flContato){
    this.flContato = flContato;
    return this;
  }

  /**
   * Obtém flEndereco
   * return flEndereco
   * @generated
   */
  
  public java.lang.String getFlEndereco(){
    return this.flEndereco;
  }

  /**
   * Define flEndereco
   * @param flEndereco flEndereco
   * @generated
   */
  public Filial setFlEndereco(java.lang.String flEndereco){
    this.flEndereco = flEndereco;
    return this;
  }

  /**
   * Obtém flFax
   * return flFax
   * @generated
   */
  
  public java.lang.String getFlFax(){
    return this.flFax;
  }

  /**
   * Define flFax
   * @param flFax flFax
   * @generated
   */
  public Filial setFlFax(java.lang.String flFax){
    this.flFax = flFax;
    return this;
  }

  /**
   * Obtém flInscricaoestadual
   * return flInscricaoestadual
   * @generated
   */
  
  public java.lang.String getFlInscricaoestadual(){
    return this.flInscricaoestadual;
  }

  /**
   * Define flInscricaoestadual
   * @param flInscricaoestadual flInscricaoestadual
   * @generated
   */
  public Filial setFlInscricaoestadual(java.lang.String flInscricaoestadual){
    this.flInscricaoestadual = flInscricaoestadual;
    return this;
  }

  /**
   * Obtém flInscricaomunicipal
   * return flInscricaomunicipal
   * @generated
   */
  
  public java.lang.String getFlInscricaomunicipal(){
    return this.flInscricaomunicipal;
  }

  /**
   * Define flInscricaomunicipal
   * @param flInscricaomunicipal flInscricaomunicipal
   * @generated
   */
  public Filial setFlInscricaomunicipal(java.lang.String flInscricaomunicipal){
    this.flInscricaomunicipal = flInscricaomunicipal;
    return this;
  }

  /**
   * Obtém flMatriz
   * return flMatriz
   * @generated
   */
  
  public java.lang.String getFlMatriz(){
    return this.flMatriz;
  }

  /**
   * Define flMatriz
   * @param flMatriz flMatriz
   * @generated
   */
  public Filial setFlMatriz(java.lang.String flMatriz){
    this.flMatriz = flMatriz;
    return this;
  }

  /**
   * Obtém flMedicoResponsavel
   * return flMedicoResponsavel
   * @generated
   */
  
  public java.lang.String getFlMedicoResponsavel(){
    return this.flMedicoResponsavel;
  }

  /**
   * Define flMedicoResponsavel
   * @param flMedicoResponsavel flMedicoResponsavel
   * @generated
   */
  public Filial setFlMedicoResponsavel(java.lang.String flMedicoResponsavel){
    this.flMedicoResponsavel = flMedicoResponsavel;
    return this;
  }

  /**
   * Obtém flMunicipio
   * return flMunicipio
   * @generated
   */
  
  public java.lang.String getFlMunicipio(){
    return this.flMunicipio;
  }

  /**
   * Define flMunicipio
   * @param flMunicipio flMunicipio
   * @generated
   */
  public Filial setFlMunicipio(java.lang.String flMunicipio){
    this.flMunicipio = flMunicipio;
    return this;
  }

  /**
   * Obtém flNome
   * return flNome
   * @generated
   */
  
  public java.lang.String getFlNome(){
    return this.flNome;
  }

  /**
   * Define flNome
   * @param flNome flNome
   * @generated
   */
  public Filial setFlNome(java.lang.String flNome){
    this.flNome = flNome;
    return this;
  }

  /**
   * Obtém flResponsavel
   * return flResponsavel
   * @generated
   */
  
  public java.lang.String getFlResponsavel(){
    return this.flResponsavel;
  }

  /**
   * Define flResponsavel
   * @param flResponsavel flResponsavel
   * @generated
   */
  public Filial setFlResponsavel(java.lang.String flResponsavel){
    this.flResponsavel = flResponsavel;
    return this;
  }

  /**
   * Obtém flTel1
   * return flTel1
   * @generated
   */
  
  public java.lang.String getFlTel1(){
    return this.flTel1;
  }

  /**
   * Define flTel1
   * @param flTel1 flTel1
   * @generated
   */
  public Filial setFlTel1(java.lang.String flTel1){
    this.flTel1 = flTel1;
    return this;
  }

  /**
   * Obtém idFilial
   * return idFilial
   * @generated
   */
  
  public java.lang.Integer getIdFilial(){
    return this.idFilial;
  }

  /**
   * Define idFilial
   * @param idFilial idFilial
   * @generated
   */
  public Filial setIdFilial(java.lang.Integer idFilial){
    this.idFilial = idFilial;
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
  public Filial setIdUsuario(java.lang.Integer idUsuario){
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
  public Filial setMunicipio(Municipio municipio){
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
    Filial object = (Filial)obj;
    if (idFilial != null ? !idFilial.equals(object.idFilial) : object.idFilial != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idFilial == null) ? 0 : idFilial.hashCode());
    return result;
  }

}
