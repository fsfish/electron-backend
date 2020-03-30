package com.electron.mfs.pg.gateway.service.dto;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.electron.mfs.pg.gateway.domain.TransactionInfo} entity.
 */
public class TransactionInfoDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 5)
    private String transactionPropertyCode;

    @NotNull
    @Size(max = 100)
    private String value;

    @NotNull
    private Boolean active;


    private Long transactionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionPropertyCode() {
        return transactionPropertyCode;
    }

    public void setTransactionPropertyCode(String transactionPropertyCode) {
        this.transactionPropertyCode = transactionPropertyCode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TransactionInfoDTO transactionInfoDTO = (TransactionInfoDTO) o;
        if (transactionInfoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), transactionInfoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TransactionInfoDTO{" +
            "id=" + getId() +
            ", transactionPropertyCode='" + getTransactionPropertyCode() + "'" +
            ", value='" + getValue() + "'" +
            ", active='" + isActive() + "'" +
            ", transaction=" + getTransactionId() +
            "}";
    }
}
