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
@Repository("EntradaProdutoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface EntradaProdutoDAO extends JpaRepository<EntradaProduto, java.lang.Integer> {

  /**
   * Obtém a instância de EntradaProduto utilizando os identificadores
   * 
   * @param idEntradaProduto
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM EntradaProduto entity WHERE entity.idEntradaProduto = :idEntradaProduto")
  public EntradaProduto findOne(@Param(value="idEntradaProduto") java.lang.Integer idEntradaProduto);

  /**
   * Remove a instância de EntradaProduto utilizando os identificadores
   * 
   * @param idEntradaProduto
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM EntradaProduto entity WHERE entity.idEntradaProduto = :idEntradaProduto")
  public void delete(@Param(value="idEntradaProduto") java.lang.Integer idEntradaProduto);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM EntradaProdutoItem entity WHERE entity.entradaProduto.idEntradaProduto = :idEntradaProduto")
  public Page<EntradaProdutoItem> findEntradaProdutoItem(@Param(value="idEntradaProduto") java.lang.Integer idEntradaProduto, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.produto FROM EntradaProdutoItem entity WHERE entity.entradaProduto.idEntradaProduto = :idEntradaProduto")
  public Page<Produto> listProduto(@Param(value="idEntradaProduto") java.lang.Integer idEntradaProduto, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM EntradaProdutoItem entity WHERE entity.entradaProduto.idEntradaProduto = :instanceIdEntradaProduto AND entity.produto.idProduto = :relationIdProduto")
  public int deleteProduto(@Param(value="instanceIdEntradaProduto") java.lang.Integer instanceIdEntradaProduto, @Param(value="relationIdProduto") java.lang.Integer relationIdProduto);

  /**
   * Foreign Key fornecedor
   * @generated
   */
  @Query("SELECT entity FROM EntradaProduto entity WHERE entity.fornecedor.idFornecedor = :idFornecedor")
  public Page<EntradaProduto> findEntradaProdutosByFornecedor(@Param(value="idFornecedor") java.lang.Integer idFornecedor, Pageable pageable);

}
