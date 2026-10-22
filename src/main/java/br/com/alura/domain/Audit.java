package br.com.alura.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Audit {
  @Id
  private Long id;
  private String cnpj;
  private String situacaoCadastral;

  public Audit(Long id, String cnpj, String situacaoCadastral) {
    this.id = id;
    this.cnpj = cnpj;
    this.situacaoCadastral = situacaoCadastral;
  }

  public Audit() {
  }

  public Long getId() {
    return id;
  }

  public String getCnpj() {
    return cnpj;
  }

  public String getSituacaoCadastral() {
    return situacaoCadastral;
  }
}
