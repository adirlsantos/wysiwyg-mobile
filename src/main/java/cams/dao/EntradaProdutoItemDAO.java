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
@Repository("EntradaProdutoItemDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface EntradaProdutoItemDAO extends JpaRepository<EntradaProdutoItem, java.lang.Integer> {

  /**
   * Obtém a instância de EntradaProdutoItem utilizando os identificadores
   * 
   * @param idEntradaProdutoItem
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM EntradaProdutoItem entity WHERE entity.idEntradaProdutoItem = :idEntradaProdutoItem")
  public EntradaProdutoItem findOne(@Param(value="idEntradaProdutoItem") java.lang.Integer idEntradaProdutoItem);

  /**
   * Remove a instância de EntradaProdutoItem utilizando os identificadores
   * 
   * @param idEntradaProdutoItem
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM EntradaProdutoItem entity WHERE entity.idEntradaProdutoItem = :idEntradaProdutoItem")
  public void delete(@Param(value="idEntradaProdutoItem") java.lang.Integer idEntradaProdutoItem);



  /**
   * Foreign Key entradaProduto
   * @generated
   */
  @Query("SELECT entity FROM EntradaProdutoItem entity WHERE entity.entradaProduto.idEntradaProduto = :idEntradaProduto")
  public Page<EntradaProdutoItem> findEntradaProdutoItemsByEntradaProduto(@Param(value="idEntradaProduto") java.lang.Integer idEntradaProduto, Pageable pageable);

  /**
   * Foreign Key produto
   * @generated
   */
  @Query("SELECT entity FROM EntradaProdutoItem entity WHERE entity.produto.idProduto = :idProduto")
  public Page<EntradaProdutoItem> findEntradaProdutoItemsByProduto(@Param(value="idProduto") java.lang.Integer idProduto, Pageable pageable);

}
