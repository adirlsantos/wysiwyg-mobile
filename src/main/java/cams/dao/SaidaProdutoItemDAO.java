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
@Repository("SaidaProdutoItemDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface SaidaProdutoItemDAO extends JpaRepository<SaidaProdutoItem, java.lang.Integer> {

  /**
   * Obtém a instância de SaidaProdutoItem utilizando os identificadores
   * 
   * @param idSaidaProdutoItem
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM SaidaProdutoItem entity WHERE entity.idSaidaProdutoItem = :idSaidaProdutoItem")
  public SaidaProdutoItem findOne(@Param(value="idSaidaProdutoItem") java.lang.Integer idSaidaProdutoItem);

  /**
   * Remove a instância de SaidaProdutoItem utilizando os identificadores
   * 
   * @param idSaidaProdutoItem
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM SaidaProdutoItem entity WHERE entity.idSaidaProdutoItem = :idSaidaProdutoItem")
  public void delete(@Param(value="idSaidaProdutoItem") java.lang.Integer idSaidaProdutoItem);



  /**
   * Foreign Key produto
   * @generated
   */
  @Query("SELECT entity FROM SaidaProdutoItem entity WHERE entity.produto.idProduto = :idProduto")
  public Page<SaidaProdutoItem> findSaidaProdutoItemsByProduto(@Param(value="idProduto") java.lang.Integer idProduto, Pageable pageable);

  /**
   * Foreign Key saidaProduto
   * @generated
   */
  @Query("SELECT entity FROM SaidaProdutoItem entity WHERE entity.saidaProduto.idSaidaProduto = :idSaidaProduto")
  public Page<SaidaProdutoItem> findSaidaProdutoItemsBySaidaProduto(@Param(value="idSaidaProduto") java.lang.Integer idSaidaProduto, Pageable pageable);

}
