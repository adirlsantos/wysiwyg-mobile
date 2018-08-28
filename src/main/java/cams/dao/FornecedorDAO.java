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
@Repository("FornecedorDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface FornecedorDAO extends JpaRepository<Fornecedor, java.lang.Integer> {

  /**
   * Obtém a instância de Fornecedor utilizando os identificadores
   * 
   * @param idFornecedor
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Fornecedor entity WHERE entity.idFornecedor = :idFornecedor")
  public Fornecedor findOne(@Param(value="idFornecedor") java.lang.Integer idFornecedor);

  /**
   * Remove a instância de Fornecedor utilizando os identificadores
   * 
   * @param idFornecedor
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Fornecedor entity WHERE entity.idFornecedor = :idFornecedor")
  public void delete(@Param(value="idFornecedor") java.lang.Integer idFornecedor);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM EntradaProduto entity WHERE entity.fornecedor.idFornecedor = :idFornecedor")
  public Page<EntradaProduto> findEntradaProduto(@Param(value="idFornecedor") java.lang.Integer idFornecedor, Pageable pageable);

  /**
   * Foreign Key municipio
   * @generated
   */
  @Query("SELECT entity FROM Fornecedor entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Fornecedor> findFornecedorsByMunicipio(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

}
