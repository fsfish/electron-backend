package com.electron.mfs.pg.gateway.service.dto;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.electron.mfs.pg.gateway.domain.PgApplication} entity.
 */
public class PgApplicationDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 5)
    private String code;

    @NotNull
    @Size(max = 50)
    private String label;

    @Size(max = 5)
    private String partnerCode;

    @NotNull
    private Boolean active;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PgApplicationDTO pgApplicationDTO = (PgApplicationDTO) o;
        if (pgApplicationDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), pgApplicationDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PgApplicationDTO{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", label='" + getLabel() + "'" +
            ", partnerCode='" + getPartnerCode() + "'" +
            ", active='" + isActive() + "'" +
            "}";
    }
}
