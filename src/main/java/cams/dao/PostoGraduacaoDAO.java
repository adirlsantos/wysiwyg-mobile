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
@Repository("PostoGraduacaoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface PostoGraduacaoDAO extends JpaRepository<PostoGraduacao, java.lang.Integer> {

  /**
   * Obtém a instância de PostoGraduacao utilizando os identificadores
   * 
   * @param idPostoGraduacao
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM PostoGraduacao entity WHERE entity.idPostoGraduacao = :idPostoGraduacao")
  public PostoGraduacao findOne(@Param(value="idPostoGraduacao") java.lang.Integer idPostoGraduacao);

  /**
   * Remove a instância de PostoGraduacao utilizando os identificadores
   * 
   * @param idPostoGraduacao
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM PostoGraduacao entity WHERE entity.idPostoGraduacao = :idPostoGraduacao")
  public void delete(@Param(value="idPostoGraduacao") java.lang.Integer idPostoGraduacao);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Soldo entity WHERE entity.postoGraduacao.idPostoGraduacao = :idPostoGraduacao")
  public Page<Soldo> findSoldo(@Param(value="idPostoGraduacao") java.lang.Integer idPostoGraduacao, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Socio entity WHERE entity.postoGraduacao.idPostoGraduacao = :idPostoGraduacao")
  public Page<Socio> findSocio(@Param(value="idPostoGraduacao") java.lang.Integer idPostoGraduacao, Pageable pageable);

}
