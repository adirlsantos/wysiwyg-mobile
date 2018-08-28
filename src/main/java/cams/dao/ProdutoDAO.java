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
@Repository("ProdutoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ProdutoDAO extends JpaRepository<Produto, java.lang.Integer> {

  /**
   * Obtém a instância de Produto utilizando os identificadores
   * 
   * @param idProduto
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Produto entity WHERE entity.idProduto = :idProduto")
  public Produto findOne(@Param(value="idProduto") java.lang.Integer idProduto);

  /**
   * Remove a instância de Produto utilizando os identificadores
   * 
   * @param idProduto
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Produto entity WHERE entity.idProduto = :idProduto")
  public void delete(@Param(value="idProduto") java.lang.Integer idProduto);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM EntradaProdutoItem entity WHERE entity.produto.idProduto = :idProduto")
  public Page<EntradaProdutoItem> findEntradaProdutoItem(@Param(value="idProduto") java.lang.Integer idProduto, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SaidaProdutoItem entity WHERE entity.produto.idProduto = :idProduto")
  public Page<SaidaProdutoItem> findSaidaProdutoItem(@Param(value="idProduto") java.lang.Integer idProduto, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.entradaProduto FROM EntradaProdutoItem entity WHERE entity.produto.idProduto = :idProduto")
  public Page<EntradaProduto> listEntradaProduto(@Param(value="idProduto") java.lang.Integer idProduto, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM EntradaProdutoItem entity WHERE entity.produto.idProduto = :instanceIdProduto AND entity.entradaProduto.idEntradaProduto = :relationIdEntradaProduto")
  public int deleteEntradaProduto(@Param(value="instanceIdProduto") java.lang.Integer instanceIdProduto, @Param(value="relationIdEntradaProduto") java.lang.Integer relationIdEntradaProduto);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.saidaProduto FROM SaidaProdutoItem entity WHERE entity.produto.idProduto = :idProduto")
  public Page<SaidaProduto> listSaidaProduto(@Param(value="idProduto") java.lang.Integer idProduto, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM SaidaProdutoItem entity WHERE entity.produto.idProduto = :instanceIdProduto AND entity.saidaProduto.idSaidaProduto = :relationIdSaidaProduto")
  public int deleteSaidaProduto(@Param(value="instanceIdProduto") java.lang.Integer instanceIdProduto, @Param(value="relationIdSaidaProduto") java.lang.Integer relationIdSaidaProduto);

}
