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
@Repository("AtividadeMedicaDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface AtividadeMedicaDAO extends JpaRepository<AtividadeMedica, java.lang.Integer> {

  /**
   * Obtém a instância de AtividadeMedica utilizando os identificadores
   * 
   * @param idAtividadeMedica
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM AtividadeMedica entity WHERE entity.idAtividadeMedica = :idAtividadeMedica")
  public AtividadeMedica findOne(@Param(value="idAtividadeMedica") java.lang.Integer idAtividadeMedica);

  /**
   * Remove a instância de AtividadeMedica utilizando os identificadores
   * 
   * @param idAtividadeMedica
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM AtividadeMedica entity WHERE entity.idAtividadeMedica = :idAtividadeMedica")
  public void delete(@Param(value="idAtividadeMedica") java.lang.Integer idAtividadeMedica);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Clinica entity WHERE entity.atividadeMedica.idAtividadeMedica = :idAtividadeMedica")
  public Page<Clinica> findClinica(@Param(value="idAtividadeMedica") java.lang.Integer idAtividadeMedica, Pageable pageable);

}
