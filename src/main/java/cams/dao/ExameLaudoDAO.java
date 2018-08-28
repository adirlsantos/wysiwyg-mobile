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
@Repository("ExameLaudoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ExameLaudoDAO extends JpaRepository<ExameLaudo, java.lang.Integer> {

  /**
   * Obtém a instância de ExameLaudo utilizando os identificadores
   * 
   * @param idExameLaudo
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ExameLaudo entity WHERE entity.idExameLaudo = :idExameLaudo")
  public ExameLaudo findOne(@Param(value="idExameLaudo") java.lang.Integer idExameLaudo);

  /**
   * Remove a instância de ExameLaudo utilizando os identificadores
   * 
   * @param idExameLaudo
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ExameLaudo entity WHERE entity.idExameLaudo = :idExameLaudo")
  public void delete(@Param(value="idExameLaudo") java.lang.Integer idExameLaudo);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorialResultado entity WHERE entity.exameLaudo.idExameLaudo = :idExameLaudo")
  public Page<GuiaLaboratorialResultado> findGuiaLaboratorialResultado(@Param(value="idExameLaudo") java.lang.Integer idExameLaudo, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.guiaLaboratorialExame FROM GuiaLaboratorialResultado entity WHERE entity.exameLaudo.idExameLaudo = :idExameLaudo")
  public Page<GuiaLaboratorialExame> listGuiaLaboratorialExame(@Param(value="idExameLaudo") java.lang.Integer idExameLaudo, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM GuiaLaboratorialResultado entity WHERE entity.exameLaudo.idExameLaudo = :instanceIdExameLaudo AND entity.guiaLaboratorialExame.idGuiaLaboratorialExame = :relationIdGuiaLaboratorialExame")
  public int deleteGuiaLaboratorialExame(@Param(value="instanceIdExameLaudo") java.lang.Integer instanceIdExameLaudo, @Param(value="relationIdGuiaLaboratorialExame") java.lang.Integer relationIdGuiaLaboratorialExame);

  /**
   * Foreign Key exameLaboratorial
   * @generated
   */
  @Query("SELECT entity FROM ExameLaudo entity WHERE entity.exameLaboratorial.idExameLaboratorial = :idExameLaboratorial")
  public Page<ExameLaudo> findExameLaudosByExameLaboratorial(@Param(value="idExameLaboratorial") java.lang.Integer idExameLaboratorial, Pageable pageable);

}
