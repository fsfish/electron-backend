package com.electron.mfs.pg.pg8583.service.dto;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.electron.mfs.pg.pg8583.domain.PgResponseCode} entity.
 */
public class PgResponseCodeDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 5)
    private String code;

    @NotNull
    @Size(max = 50)
    private String label;

    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

        PgResponseCodeDTO pgResponseCodeDTO = (PgResponseCodeDTO) o;
        if (pgResponseCodeDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), pgResponseCodeDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PgResponseCodeDTO{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", label='" + getLabel() + "'" +
            ", description='" + getDescription() + "'" +
            ", active='" + isActive() + "'" +
            "}";
    }
}
