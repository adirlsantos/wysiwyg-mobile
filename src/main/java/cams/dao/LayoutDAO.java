package cams.dao;

import cams.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("LayoutDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface LayoutDAO extends JpaRepository<Layout, java.lang.Integer> {

  /**
   * Obtém a instância de Layout utilizando os identificadores
   * 
   * @param idLayout
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Layout entity WHERE entity.idLayout = :idLayout")
  public Layout findOne(@Param(value="idLayout") java.lang.Integer idLayout);

  /**
   * Remove a instância de Layout utilizando os identificadores
   * 
   * @param idLayout
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Layout entity WHERE entity.idLayout = :idLayout")
  public void delete(@Param(value="idLayout") java.lang.Integer idLayout);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM LayoutTipo entity WHERE entity.layout.idLayout = :idLayout")
  public Page<LayoutTipo> findLayoutTipo(@Param(value="idLayout") java.lang.Integer idLayout, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM FilialBanco entity WHERE entity.layout.idLayout = :idLayout")
  public Page<FilialBanco> findFilialBanco(@Param(value="idLayout") java.lang.Integer idLayout, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.filial FROM FilialBanco entity WHERE entity.layout.idLayout = :idLayout")
  public Page<Filial> listFilial(@Param(value="idLayout") java.lang.Integer idLayout, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM FilialBanco entity WHERE entity.layout.idLayout = :instanceIdLayout AND entity.filial.idFilial = :relationIdFilial")
  public int deleteFilial(@Param(value="instanceIdLayout") java.lang.Integer instanceIdLayout, @Param(value="relationIdFilial") java.lang.Integer relationIdFilial);

}
