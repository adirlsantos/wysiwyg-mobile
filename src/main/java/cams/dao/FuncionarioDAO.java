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
@Repository("FuncionarioDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface FuncionarioDAO extends JpaRepository<Funcionario, java.lang.Integer> {

  /**
   * Obtém a instância de Funcionario utilizando os identificadores
   * 
   * @param idFuncionario
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Funcionario entity WHERE entity.idFuncionario = :idFuncionario")
  public Funcionario findOne(@Param(value="idFuncionario") java.lang.Integer idFuncionario);

  /**
   * Remove a instância de Funcionario utilizando os identificadores
   * 
   * @param idFuncionario
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Funcionario entity WHERE entity.idFuncionario = :idFuncionario")
  public void delete(@Param(value="idFuncionario") java.lang.Integer idFuncionario);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SaidaProduto entity WHERE entity.funcionario.idFuncionario = :idFuncionario")
  public Page<SaidaProduto> findSaidaProduto(@Param(value="idFuncionario") java.lang.Integer idFuncionario, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.setor FROM SaidaProduto entity WHERE entity.funcionario.idFuncionario = :idFuncionario")
  public Page<Setor> listSetor(@Param(value="idFuncionario") java.lang.Integer idFuncionario, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM SaidaProduto entity WHERE entity.funcionario.idFuncionario = :instanceIdFuncionario AND entity.setor.idSetor = :relationIdSetor")
  public int deleteSetor(@Param(value="instanceIdFuncionario") java.lang.Integer instanceIdFuncionario, @Param(value="relationIdSetor") java.lang.Integer relationIdSetor);

  /**
   * Foreign Key municipio
   * @generated
   */
  @Query("SELECT entity FROM Funcionario entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Funcionario> findFuncionariosByMunicipio(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

  /**
   * Foreign Key setor
   * @generated
   */
  @Query("SELECT entity FROM Funcionario entity WHERE entity.setor.idSetor = :idSetor")
  public Page<Funcionario> findFuncionariosBySetor(@Param(value="idSetor") java.lang.Integer idSetor, Pageable pageable);

}
