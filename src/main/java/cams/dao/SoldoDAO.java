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
@Repository("SoldoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface SoldoDAO extends JpaRepository<Soldo, java.lang.Integer> {

  /**
   * Obtém a instância de Soldo utilizando os identificadores
   * 
   * @param idSoldo
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Soldo entity WHERE entity.idSoldo = :idSoldo")
  public Soldo findOne(@Param(value="idSoldo") java.lang.Integer idSoldo);

  /**
   * Remove a instância de Soldo utilizando os identificadores
   * 
   * @param idSoldo
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Soldo entity WHERE entity.idSoldo = :idSoldo")
  public void delete(@Param(value="idSoldo") java.lang.Integer idSoldo);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Socio entity WHERE entity.soldo.idSoldo = :idSoldo")
  public Page<Socio> findSocio(@Param(value="idSoldo") java.lang.Integer idSoldo, Pageable pageable);

  /**
   * Foreign Key postoGraduacao
   * @generated
   */
  @Query("SELECT entity FROM Soldo entity WHERE entity.postoGraduacao.idPostoGraduacao = :idPostoGraduacao")
  public Page<Soldo> findSoldosByPostoGraduacao(@Param(value="idPostoGraduacao") java.lang.Integer idPostoGraduacao, Pageable pageable);

}
