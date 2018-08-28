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
@Repository("ContribuicaoMensal1DAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ContribuicaoMensal1DAO extends JpaRepository<ContribuicaoMensal1, java.lang.Integer> {

  /**
   * Obtém a instância de ContribuicaoMensal1 utilizando os identificadores
   * 
   * @param idContribuicao
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ContribuicaoMensal1 entity WHERE entity.idContribuicao = :idContribuicao")
  public ContribuicaoMensal1 findOne(@Param(value="idContribuicao") java.lang.Integer idContribuicao);

  /**
   * Remove a instância de ContribuicaoMensal1 utilizando os identificadores
   * 
   * @param idContribuicao
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ContribuicaoMensal1 entity WHERE entity.idContribuicao = :idContribuicao")
  public void delete(@Param(value="idContribuicao") java.lang.Integer idContribuicao);



}
