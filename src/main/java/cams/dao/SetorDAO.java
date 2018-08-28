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
@Repository("SetorDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface SetorDAO extends JpaRepository<Setor, java.lang.Integer> {

  /**
   * Obtém a instância de Setor utilizando os identificadores
   * 
   * @param idSetor
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Setor entity WHERE entity.idSetor = :idSetor")
  public Setor findOne(@Param(value="idSetor") java.lang.Integer idSetor);

  /**
   * Remove a instância de Setor utilizando os identificadores
   * 
   * @param idSetor
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Setor entity WHERE entity.idSetor = :idSetor")
  public void delete(@Param(value="idSetor") java.lang.Integer idSetor);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SaidaProduto entity WHERE entity.setor.idSetor = :idSetor")
  public Page<SaidaProduto> findSaidaProduto(@Param(value="idSetor") java.lang.Integer idSetor, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Funcionario entity WHERE entity.setor.idSetor = :idSetor")
  public Page<Funcionario> findFuncionario_2(@Param(value="idSetor") java.lang.Integer idSetor, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.funcionario FROM SaidaProduto entity WHERE entity.setor.idSetor = :idSetor")
  public Page<Funcionario> listFuncionario(@Param(value="idSetor") java.lang.Integer idSetor, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM SaidaProduto entity WHERE entity.setor.idSetor = :instanceIdSetor AND entity.funcionario.idFuncionario = :relationIdFuncionario")
  public int deleteFuncionario(@Param(value="instanceIdSetor") java.lang.Integer instanceIdSetor, @Param(value="relationIdFuncionario") java.lang.Integer relationIdFuncionario);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.municipio FROM Funcionario entity WHERE entity.setor.idSetor = :idSetor")
  public Page<Municipio> listMunicipio(@Param(value="idSetor") java.lang.Integer idSetor, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Funcionario entity WHERE entity.setor.idSetor = :instanceIdSetor AND entity.municipio.idMunicipio = :relationIdMunicipio")
  public int deleteMunicipio(@Param(value="instanceIdSetor") java.lang.Integer instanceIdSetor, @Param(value="relationIdMunicipio") java.lang.Integer relationIdMunicipio);

}
