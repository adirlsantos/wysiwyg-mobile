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
@Repository("LayoutTipoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface LayoutTipoDAO extends JpaRepository<LayoutTipo, java.lang.Integer> {

  /**
   * Obtém a instância de LayoutTipo utilizando os identificadores
   * 
   * @param idLayoutTipo
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM LayoutTipo entity WHERE entity.idLayoutTipo = :idLayoutTipo")
  public LayoutTipo findOne(@Param(value="idLayoutTipo") java.lang.Integer idLayoutTipo);

  /**
   * Remove a instância de LayoutTipo utilizando os identificadores
   * 
   * @param idLayoutTipo
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM LayoutTipo entity WHERE entity.idLayoutTipo = :idLayoutTipo")
  public void delete(@Param(value="idLayoutTipo") java.lang.Integer idLayoutTipo);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM LayoutTipoItem entity WHERE entity.layoutTipo.idLayoutTipo = :idLayoutTipo")
  public Page<LayoutTipoItem> findLayoutTipoItem(@Param(value="idLayoutTipo") java.lang.Integer idLayoutTipo, Pageable pageable);

  /**
   * Foreign Key layout
   * @generated
   */
  @Query("SELECT entity FROM LayoutTipo entity WHERE entity.layout.idLayout = :idLayout")
  public Page<LayoutTipo> findLayoutTiposByLayout(@Param(value="idLayout") java.lang.Integer idLayout, Pageable pageable);

}
