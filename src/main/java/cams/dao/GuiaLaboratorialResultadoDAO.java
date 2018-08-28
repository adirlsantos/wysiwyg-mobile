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
@Repository("GuiaLaboratorialResultadoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface GuiaLaboratorialResultadoDAO extends JpaRepository<GuiaLaboratorialResultado, java.lang.Integer> {

  /**
   * Obtém a instância de GuiaLaboratorialResultado utilizando os identificadores
   * 
   * @param idGuiaLaboratorialResultado
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM GuiaLaboratorialResultado entity WHERE entity.idGuiaLaboratorialResultado = :idGuiaLaboratorialResultado")
  public GuiaLaboratorialResultado findOne(@Param(value="idGuiaLaboratorialResultado") java.lang.Integer idGuiaLaboratorialResultado);

  /**
   * Remove a instância de GuiaLaboratorialResultado utilizando os identificadores
   * 
   * @param idGuiaLaboratorialResultado
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM GuiaLaboratorialResultado entity WHERE entity.idGuiaLaboratorialResultado = :idGuiaLaboratorialResultado")
  public void delete(@Param(value="idGuiaLaboratorialResultado") java.lang.Integer idGuiaLaboratorialResultado);



  /**
   * Foreign Key exameLaudo
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorialResultado entity WHERE entity.exameLaudo.idExameLaudo = :idExameLaudo")
  public Page<GuiaLaboratorialResultado> findGuiaLaboratorialResultadosByExameLaudo(@Param(value="idExameLaudo") java.lang.Integer idExameLaudo, Pageable pageable);

  /**
   * Foreign Key guiaLaboratorialExame
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorialResultado entity WHERE entity.guiaLaboratorialExame.idGuiaLaboratorialExame = :idGuiaLaboratorialExame")
  public Page<GuiaLaboratorialResultado> findGuiaLaboratorialResultadosByGuiaLaboratorialExame(@Param(value="idGuiaLaboratorialExame") java.lang.Integer idGuiaLaboratorialExame, Pageable pageable);

}
