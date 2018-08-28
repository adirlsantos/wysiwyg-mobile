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
@Repository("AverbacaoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface AverbacaoDAO extends JpaRepository<Averbacao, java.lang.Integer> {

  /**
   * Obtém a instância de Averbacao utilizando os identificadores
   * 
   * @param idAverbacao
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Averbacao entity WHERE entity.idAverbacao = :idAverbacao")
  public Averbacao findOne(@Param(value="idAverbacao") java.lang.Integer idAverbacao);

  /**
   * Remove a instância de Averbacao utilizando os identificadores
   * 
   * @param idAverbacao
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Averbacao entity WHERE entity.idAverbacao = :idAverbacao")
  public void delete(@Param(value="idAverbacao") java.lang.Integer idAverbacao);



}
