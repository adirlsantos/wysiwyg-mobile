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
@Repository("TipoDependenteDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface TipoDependenteDAO extends JpaRepository<TipoDependente, java.lang.Integer> {

  /**
   * Obtém a instância de TipoDependente utilizando os identificadores
   * 
   * @param idTipoDependente
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TipoDependente entity WHERE entity.idTipoDependente = :idTipoDependente")
  public TipoDependente findOne(@Param(value="idTipoDependente") java.lang.Integer idTipoDependente);

  /**
   * Remove a instância de TipoDependente utilizando os identificadores
   * 
   * @param idTipoDependente
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TipoDependente entity WHERE entity.idTipoDependente = :idTipoDependente")
  public void delete(@Param(value="idTipoDependente") java.lang.Integer idTipoDependente);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Dependente entity WHERE entity.tipoDependente.idTipoDependente = :idTipoDependente")
  public Page<Dependente> findDependente(@Param(value="idTipoDependente") java.lang.Integer idTipoDependente, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.socio FROM Dependente entity WHERE entity.tipoDependente.idTipoDependente = :idTipoDependente")
  public Page<Socio> listSocio(@Param(value="idTipoDependente") java.lang.Integer idTipoDependente, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Dependente entity WHERE entity.tipoDependente.idTipoDependente = :instanceIdTipoDependente AND entity.socio.idSocio = :relationIdSocio")
  public int deleteSocio(@Param(value="instanceIdTipoDependente") java.lang.Integer instanceIdTipoDependente, @Param(value="relationIdSocio") java.lang.Integer relationIdSocio);

}
