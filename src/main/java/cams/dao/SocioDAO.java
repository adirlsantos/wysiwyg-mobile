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
@Repository("SocioDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface SocioDAO extends JpaRepository<Socio, java.lang.Integer> {

  /**
   * Obtém a instância de Socio utilizando os identificadores
   * 
   * @param idSocio
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Socio entity WHERE entity.idSocio = :idSocio")
  public Socio findOne(@Param(value="idSocio") java.lang.Integer idSocio);

  /**
   * Remove a instância de Socio utilizando os identificadores
   * 
   * @param idSocio
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Socio entity WHERE entity.idSocio = :idSocio")
  public void delete(@Param(value="idSocio") java.lang.Integer idSocio);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Viuva entity WHERE entity.socio.idSocio = :idSocio")
  public Page<Viuva> findViuva(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ContribuicaoMensal entity WHERE entity.socio.idSocio = :idSocio")
  public Page<ContribuicaoMensal> findContribuicaoMensal(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedica entity WHERE entity.socio.idSocio = :idSocio")
  public Page<GuiaMedica> findGuiaMedica(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM AverbacaoValor entity WHERE entity.socio.idSocio = :idSocio")
  public Page<AverbacaoValor> findAverbacaoValor(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorial entity WHERE entity.socio.idSocio = :idSocio")
  public Page<GuiaLaboratorial> findGuiaLaboratorial(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Dependente entity WHERE entity.socio.idSocio = :idSocio")
  public Page<Dependente> findDependente(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.filial FROM GuiaLaboratorial entity WHERE entity.socio.idSocio = :idSocio")
  public Page<Filial> listFilial(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM GuiaLaboratorial entity WHERE entity.socio.idSocio = :instanceIdSocio AND entity.filial.idFilial = :relationIdFilial")
  public int deleteFilial(@Param(value="instanceIdSocio") java.lang.Integer instanceIdSocio, @Param(value="relationIdFilial") java.lang.Integer relationIdFilial);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.tipoDependente FROM Dependente entity WHERE entity.socio.idSocio = :idSocio")
  public Page<TipoDependente> listTipoDependente(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Dependente entity WHERE entity.socio.idSocio = :instanceIdSocio AND entity.tipoDependente.idTipoDependente = :relationIdTipoDependente")
  public int deleteTipoDependente(@Param(value="instanceIdSocio") java.lang.Integer instanceIdSocio, @Param(value="relationIdTipoDependente") java.lang.Integer relationIdTipoDependente);

  /**
   * Foreign Key empresa
   * @generated
   */
  @Query("SELECT entity FROM Socio entity WHERE entity.empresa.idEmpresa = :idEmpresa")
  public Page<Socio> findSociosByEmpresa(@Param(value="idEmpresa") java.lang.Integer idEmpresa, Pageable pageable);

  /**
   * Foreign Key motivoAfastamento
   * @generated
   */
  @Query("SELECT entity FROM Socio entity WHERE entity.motivoAfastamento.idMotivoAfastamento = :idMotivoAfastamento")
  public Page<Socio> findSociosByMotivoAfastamento(@Param(value="idMotivoAfastamento") java.lang.Integer idMotivoAfastamento, Pageable pageable);

  /**
   * Foreign Key municipio
   * @generated
   */
  @Query("SELECT entity FROM Socio entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Socio> findSociosByMunicipio(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

  /**
   * Foreign Key postoGraduacao
   * @generated
   */
  @Query("SELECT entity FROM Socio entity WHERE entity.postoGraduacao.idPostoGraduacao = :idPostoGraduacao")
  public Page<Socio> findSociosByPostoGraduacao(@Param(value="idPostoGraduacao") java.lang.Integer idPostoGraduacao, Pageable pageable);

  /**
   * Foreign Key soldo
   * @generated
   */
  @Query("SELECT entity FROM Socio entity WHERE entity.soldo.idSoldo = :idSoldo")
  public Page<Socio> findSociosBySoldo(@Param(value="idSoldo") java.lang.Integer idSoldo, Pageable pageable);

}
