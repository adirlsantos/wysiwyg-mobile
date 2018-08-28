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
@Repository("AverbacaoValorDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface AverbacaoValorDAO extends JpaRepository<AverbacaoValor, java.lang.Integer> {

  /**
   * Obtém a instância de AverbacaoValor utilizando os identificadores
   * 
   * @param idAverbacaoValor
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM AverbacaoValor entity WHERE entity.idAverbacaoValor = :idAverbacaoValor")
  public AverbacaoValor findOne(@Param(value="idAverbacaoValor") java.lang.Integer idAverbacaoValor);

  /**
   * Remove a instância de AverbacaoValor utilizando os identificadores
   * 
   * @param idAverbacaoValor
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM AverbacaoValor entity WHERE entity.idAverbacaoValor = :idAverbacaoValor")
  public void delete(@Param(value="idAverbacaoValor") java.lang.Integer idAverbacaoValor);



  /**
   * Foreign Key socio
   * @generated
   */
  @Query("SELECT entity FROM AverbacaoValor entity WHERE entity.socio.idSocio = :idSocio")
  public Page<AverbacaoValor> findAverbacaoValorsBySocio(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

}
