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
@Repository("ExameLaboratorialDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ExameLaboratorialDAO extends JpaRepository<ExameLaboratorial, java.lang.Integer> {

  /**
   * Obtém a instância de ExameLaboratorial utilizando os identificadores
   * 
   * @param idExameLaboratorial
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ExameLaboratorial entity WHERE entity.idExameLaboratorial = :idExameLaboratorial")
  public ExameLaboratorial findOne(@Param(value="idExameLaboratorial") java.lang.Integer idExameLaboratorial);

  /**
   * Remove a instância de ExameLaboratorial utilizando os identificadores
   * 
   * @param idExameLaboratorial
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ExameLaboratorial entity WHERE entity.idExameLaboratorial = :idExameLaboratorial")
  public void delete(@Param(value="idExameLaboratorial") java.lang.Integer idExameLaboratorial);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorialExame entity WHERE entity.exameLaboratorial.idExameLaboratorial = :idExameLaboratorial")
  public Page<GuiaLaboratorialExame> findGuiaLaboratorialExame(@Param(value="idExameLaboratorial") java.lang.Integer idExameLaboratorial, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ExameLaudo entity WHERE entity.exameLaboratorial.idExameLaboratorial = :idExameLaboratorial")
  public Page<ExameLaudo> findExameLaudo(@Param(value="idExameLaboratorial") java.lang.Integer idExameLaboratorial, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ExameFicha entity WHERE entity.exameLaboratorial.idExameLaboratorial = :idExameLaboratorial")
  public Page<ExameFicha> findExameFicha(@Param(value="idExameLaboratorial") java.lang.Integer idExameLaboratorial, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.guiaLaboratorial FROM GuiaLaboratorialExame entity WHERE entity.exameLaboratorial.idExameLaboratorial = :idExameLaboratorial")
  public Page<GuiaLaboratorial> listGuiaLaboratorial(@Param(value="idExameLaboratorial") java.lang.Integer idExameLaboratorial, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM GuiaLaboratorialExame entity WHERE entity.exameLaboratorial.idExameLaboratorial = :instanceIdExameLaboratorial AND entity.guiaLaboratorial.idGuiaLaboratorio = :relationIdGuiaLaboratorio")
  public int deleteGuiaLaboratorial(@Param(value="instanceIdExameLaboratorial") java.lang.Integer instanceIdExameLaboratorial, @Param(value="relationIdGuiaLaboratorio") java.lang.Integer relationIdGuiaLaboratorio);

}
