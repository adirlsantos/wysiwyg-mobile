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
@Repository("LayoutTipoItemDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface LayoutTipoItemDAO extends JpaRepository<LayoutTipoItem, java.lang.Integer> {

  /**
   * Obtém a instância de LayoutTipoItem utilizando os identificadores
   * 
   * @param idLayoutTipoItem
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM LayoutTipoItem entity WHERE entity.idLayoutTipoItem = :idLayoutTipoItem")
  public LayoutTipoItem findOne(@Param(value="idLayoutTipoItem") java.lang.Integer idLayoutTipoItem);

  /**
   * Remove a instância de LayoutTipoItem utilizando os identificadores
   * 
   * @param idLayoutTipoItem
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM LayoutTipoItem entity WHERE entity.idLayoutTipoItem = :idLayoutTipoItem")
  public void delete(@Param(value="idLayoutTipoItem") java.lang.Integer idLayoutTipoItem);



  /**
   * Foreign Key layoutTipo
   * @generated
   */
  @Query("SELECT entity FROM LayoutTipoItem entity WHERE entity.layoutTipo.idLayoutTipo = :idLayoutTipo")
  public Page<LayoutTipoItem> findLayoutTipoItemsByLayoutTipo(@Param(value="idLayoutTipo") java.lang.Integer idLayoutTipo, Pageable pageable);

}
