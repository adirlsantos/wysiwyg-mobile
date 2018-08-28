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
@Repository("ExameFichaDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ExameFichaDAO extends JpaRepository<ExameFicha, java.lang.Integer> {

  /**
   * Obtém a instância de ExameFicha utilizando os identificadores
   * 
   * @param idExameFicha
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ExameFicha entity WHERE entity.idExameFicha = :idExameFicha")
  public ExameFicha findOne(@Param(value="idExameFicha") java.lang.Integer idExameFicha);

  /**
   * Remove a instância de ExameFicha utilizando os identificadores
   * 
   * @param idExameFicha
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ExameFicha entity WHERE entity.idExameFicha = :idExameFicha")
  public void delete(@Param(value="idExameFicha") java.lang.Integer idExameFicha);



  /**
   * Foreign Key exameLaboratorial
   * @generated
   */
  @Query("SELECT entity FROM ExameFicha entity WHERE entity.exameLaboratorial.idExameLaboratorial = :idExameLaboratorial")
  public Page<ExameFicha> findExameFichasByExameLaboratorial(@Param(value="idExameLaboratorial") java.lang.Integer idExameLaboratorial, Pageable pageable);

}
