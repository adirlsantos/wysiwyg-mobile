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
@Repository("SaidaProdutoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface SaidaProdutoDAO extends JpaRepository<SaidaProduto, java.lang.Integer> {

  /**
   * Obtém a instância de SaidaProduto utilizando os identificadores
   * 
   * @param idSaidaProduto
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM SaidaProduto entity WHERE entity.idSaidaProduto = :idSaidaProduto")
  public SaidaProduto findOne(@Param(value="idSaidaProduto") java.lang.Integer idSaidaProduto);

  /**
   * Remove a instância de SaidaProduto utilizando os identificadores
   * 
   * @param idSaidaProduto
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM SaidaProduto entity WHERE entity.idSaidaProduto = :idSaidaProduto")
  public void delete(@Param(value="idSaidaProduto") java.lang.Integer idSaidaProduto);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SaidaProdutoItem entity WHERE entity.saidaProduto.idSaidaProduto = :idSaidaProduto")
  public Page<SaidaProdutoItem> findSaidaProdutoItem(@Param(value="idSaidaProduto") java.lang.Integer idSaidaProduto, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.produto FROM SaidaProdutoItem entity WHERE entity.saidaProduto.idSaidaProduto = :idSaidaProduto")
  public Page<Produto> listProduto(@Param(value="idSaidaProduto") java.lang.Integer idSaidaProduto, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM SaidaProdutoItem entity WHERE entity.saidaProduto.idSaidaProduto = :instanceIdSaidaProduto AND entity.produto.idProduto = :relationIdProduto")
  public int deleteProduto(@Param(value="instanceIdSaidaProduto") java.lang.Integer instanceIdSaidaProduto, @Param(value="relationIdProduto") java.lang.Integer relationIdProduto);

  /**
   * Foreign Key funcionario
   * @generated
   */
  @Query("SELECT entity FROM SaidaProduto entity WHERE entity.funcionario.idFuncionario = :idFuncionario")
  public Page<SaidaProduto> findSaidaProdutosByFuncionario(@Param(value="idFuncionario") java.lang.Integer idFuncionario, Pageable pageable);

  /**
   * Foreign Key setor
   * @generated
   */
  @Query("SELECT entity FROM SaidaProduto entity WHERE entity.setor.idSetor = :idSetor")
  public Page<SaidaProduto> findSaidaProdutosBySetor(@Param(value="idSetor") java.lang.Integer idSetor, Pageable pageable);

}
