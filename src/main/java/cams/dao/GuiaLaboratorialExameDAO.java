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
@Repository("GuiaLaboratorialExameDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface GuiaLaboratorialExameDAO extends JpaRepository<GuiaLaboratorialExame, java.lang.Integer> {

  /**
   * Obtém a instância de GuiaLaboratorialExame utilizando os identificadores
   * 
   * @param idGuiaLaboratorialExame
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM GuiaLaboratorialExame entity WHERE entity.idGuiaLaboratorialExame = :idGuiaLaboratorialExame")
  public GuiaLaboratorialExame findOne(@Param(value="idGuiaLaboratorialExame") java.lang.Integer idGuiaLaboratorialExame);

  /**
   * Remove a instância de GuiaLaboratorialExame utilizando os identificadores
   * 
   * @param idGuiaLaboratorialExame
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM GuiaLaboratorialExame entity WHERE entity.idGuiaLaboratorialExame = :idGuiaLaboratorialExame")
  public void delete(@Param(value="idGuiaLaboratorialExame") java.lang.Integer idGuiaLaboratorialExame);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorialResultado entity WHERE entity.guiaLaboratorialExame.idGuiaLaboratorialExame = :idGuiaLaboratorialExame")
  public Page<GuiaLaboratorialResultado> findGuiaLaboratorialResultado(@Param(value="idGuiaLaboratorialExame") java.lang.Integer idGuiaLaboratorialExame, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.exameLaudo FROM GuiaLaboratorialResultado entity WHERE entity.guiaLaboratorialExame.idGuiaLaboratorialExame = :idGuiaLaboratorialExame")
  public Page<ExameLaudo> listExameLaudo(@Param(value="idGuiaLaboratorialExame") java.lang.Integer idGuiaLaboratorialExame, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM GuiaLaboratorialResultado entity WHERE entity.guiaLaboratorialExame.idGuiaLaboratorialExame = :instanceIdGuiaLaboratorialExame AND entity.exameLaudo.idExameLaudo = :relationIdExameLaudo")
  public int deleteExameLaudo(@Param(value="instanceIdGuiaLaboratorialExame") java.lang.Integer instanceIdGuiaLaboratorialExame, @Param(value="relationIdExameLaudo") java.lang.Integer relationIdExameLaudo);

  /**
   * Foreign Key exameLaboratorial
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorialExame entity WHERE entity.exameLaboratorial.idExameLaboratorial = :idExameLaboratorial")
  public Page<GuiaLaboratorialExame> findGuiaLaboratorialExamesByExameLaboratorial(@Param(value="idExameLaboratorial") java.lang.Integer idExameLaboratorial, Pageable pageable);

  /**
   * Foreign Key guiaLaboratorial
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorialExame entity WHERE entity.guiaLaboratorial.idGuiaLaboratorio = :idGuiaLaboratorio")
  public Page<GuiaLaboratorialExame> findGuiaLaboratorialExamesByGuiaLaboratorial(@Param(value="idGuiaLaboratorio") java.lang.Integer idGuiaLaboratorio, Pageable pageable);

}
