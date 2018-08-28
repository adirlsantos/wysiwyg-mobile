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
@Repository("FilialBancoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface FilialBancoDAO extends JpaRepository<FilialBanco, java.lang.Integer> {

  /**
   * Obtém a instância de FilialBanco utilizando os identificadores
   * 
   * @param idFilialBanco
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM FilialBanco entity WHERE entity.idFilialBanco = :idFilialBanco")
  public FilialBanco findOne(@Param(value="idFilialBanco") java.lang.Integer idFilialBanco);

  /**
   * Remove a instância de FilialBanco utilizando os identificadores
   * 
   * @param idFilialBanco
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM FilialBanco entity WHERE entity.idFilialBanco = :idFilialBanco")
  public void delete(@Param(value="idFilialBanco") java.lang.Integer idFilialBanco);



  /**
   * Foreign Key filial
   * @generated
   */
  @Query("SELECT entity FROM FilialBanco entity WHERE entity.filial.idFilial = :idFilial")
  public Page<FilialBanco> findFilialBancosByFilial(@Param(value="idFilial") java.lang.Integer idFilial, Pageable pageable);

  /**
   * Foreign Key layout
   * @generated
   */
  @Query("SELECT entity FROM FilialBanco entity WHERE entity.layout.idLayout = :idLayout")
  public Page<FilialBanco> findFilialBancosByLayout(@Param(value="idLayout") java.lang.Integer idLayout, Pageable pageable);

}
