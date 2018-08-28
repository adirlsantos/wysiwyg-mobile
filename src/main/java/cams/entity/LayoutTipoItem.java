package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LAYOUT_TIPO_ITEM
 * @generated
 */
@Entity
@Table(name = "\"LAYOUT_TIPO_ITEM\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.LayoutTipoItem")
public class LayoutTipoItem implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_LAYOUT_TIPO_ITEM", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idLayoutTipoItem;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_LAYOUT_TIPO", nullable = false, referencedColumnName = "ID_LAYOUT_TIPO", insertable=true, updatable=true)
  
  private LayoutTipo layoutTipo;

  /**
  * @generated
  */
  @Column(name = "LI_ATRIBUTO", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String liAtributo;

  /**
  * @generated
  */
  @Column(name = "LI_DESCRICAO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String liDescricao;

  /**
  * @generated
  */
  @Column(name = "LI_FORMATO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String liFormato;

  /**
  * @generated
  */
  @Column(name = "LI_OBJETO", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String liObjeto;

  /**
  * @generated
  */
  @Column(name = "LI_ORDEM", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer liOrdem;

  /**
  * @generated
  */
  @Column(name = "LI_TAMANHO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.Integer liTamanho;

  /**
  * @generated
  */
  @Column(name = "LI_TIPO_FORMATO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String liTipoFormato;

  /**
  * @generated
  */
  @Column(name = "LI_VALOR_FIXO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String liValorFixo;

  /**
   * Construtor
   * @generated
   */
  public LayoutTipoItem(){
  }


  /**
   * Obtém idLayoutTipoItem
   * return idLayoutTipoItem
   * @generated
   */
  
  public java.lang.Integer getIdLayoutTipoItem(){
    return this.idLayoutTipoItem;
  }

  /**
   * Define idLayoutTipoItem
   * @param idLayoutTipoItem idLayoutTipoItem
   * @generated
   */
  public LayoutTipoItem setIdLayoutTipoItem(java.lang.Integer idLayoutTipoItem){
    this.idLayoutTipoItem = idLayoutTipoItem;
    return this;
  }

  /**
   * Obtém layoutTipo
   * return layoutTipo
   * @generated
   */
  
  public LayoutTipo getLayoutTipo(){
    return this.layoutTipo;
  }

  /**
   * Define layoutTipo
   * @param layoutTipo layoutTipo
   * @generated
   */
  public LayoutTipoItem setLayoutTipo(LayoutTipo layoutTipo){
    this.layoutTipo = layoutTipo;
    return this;
  }

  /**
   * Obtém liAtributo
   * return liAtributo
   * @generated
   */
  
  public java.lang.String getLiAtributo(){
    return this.liAtributo;
  }

  /**
   * Define liAtributo
   * @param liAtributo liAtributo
   * @generated
   */
  public LayoutTipoItem setLiAtributo(java.lang.String liAtributo){
    this.liAtributo = liAtributo;
    return this;
  }

  /**
   * Obtém liDescricao
   * return liDescricao
   * @generated
   */
  
  public java.lang.String getLiDescricao(){
    return this.liDescricao;
  }

  /**
   * Define liDescricao
   * @param liDescricao liDescricao
   * @generated
   */
  public LayoutTipoItem setLiDescricao(java.lang.String liDescricao){
    this.liDescricao = liDescricao;
    return this;
  }

  /**
   * Obtém liFormato
   * return liFormato
   * @generated
   */
  
  public java.lang.String getLiFormato(){
    return this.liFormato;
  }

  /**
   * Define liFormato
   * @param liFormato liFormato
   * @generated
   */
  public LayoutTipoItem setLiFormato(java.lang.String liFormato){
    this.liFormato = liFormato;
    return this;
  }

  /**
   * Obtém liObjeto
   * return liObjeto
   * @generated
   */
  
  public java.lang.String getLiObjeto(){
    return this.liObjeto;
  }

  /**
   * Define liObjeto
   * @param liObjeto liObjeto
   * @generated
   */
  public LayoutTipoItem setLiObjeto(java.lang.String liObjeto){
    this.liObjeto = liObjeto;
    return this;
  }

  /**
   * Obtém liOrdem
   * return liOrdem
   * @generated
   */
  
  public java.lang.Integer getLiOrdem(){
    return this.liOrdem;
  }

  /**
   * Define liOrdem
   * @param liOrdem liOrdem
   * @generated
   */
  public LayoutTipoItem setLiOrdem(java.lang.Integer liOrdem){
    this.liOrdem = liOrdem;
    return this;
  }

  /**
   * Obtém liTamanho
   * return liTamanho
   * @generated
   */
  
  public java.lang.Integer getLiTamanho(){
    return this.liTamanho;
  }

  /**
   * Define liTamanho
   * @param liTamanho liTamanho
   * @generated
   */
  public LayoutTipoItem setLiTamanho(java.lang.Integer liTamanho){
    this.liTamanho = liTamanho;
    return this;
  }

  /**
   * Obtém liTipoFormato
   * return liTipoFormato
   * @generated
   */
  
  public java.lang.String getLiTipoFormato(){
    return this.liTipoFormato;
  }

  /**
   * Define liTipoFormato
   * @param liTipoFormato liTipoFormato
   * @generated
   */
  public LayoutTipoItem setLiTipoFormato(java.lang.String liTipoFormato){
    this.liTipoFormato = liTipoFormato;
    return this;
  }

  /**
   * Obtém liValorFixo
   * return liValorFixo
   * @generated
   */
  
  public java.lang.String getLiValorFixo(){
    return this.liValorFixo;
  }

  /**
   * Define liValorFixo
   * @param liValorFixo liValorFixo
   * @generated
   */
  public LayoutTipoItem setLiValorFixo(java.lang.String liValorFixo){
    this.liValorFixo = liValorFixo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    LayoutTipoItem object = (LayoutTipoItem)obj;
    if (idLayoutTipoItem != null ? !idLayoutTipoItem.equals(object.idLayoutTipoItem) : object.idLayoutTipoItem != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idLayoutTipoItem == null) ? 0 : idLayoutTipoItem.hashCode());
    return result;
  }

}
