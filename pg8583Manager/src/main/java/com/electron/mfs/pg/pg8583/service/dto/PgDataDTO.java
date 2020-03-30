package com.electron.mfs.pg.pg8583.service.dto;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.electron.mfs.pg.pg8583.domain.PgData} entity.
 */
public class PgDataDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 5)
    private String code;

    @Size(max = 100)
    private String longLabel;

    @Size(max = 50)
    private String shortLabel;

    @Size(max = 255)
    private String comment;

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

    public String getLongLabel() {
        return longLabel;
    }

    public void setLongLabel(String longLabel) {
        this.longLabel = longLabel;
    }

    public String getShortLabel() {
        return shortLabel;
    }

    public void setShortLabel(String shortLabel) {
        this.shortLabel = shortLabel;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

        PgDataDTO pgDataDTO = (PgDataDTO) o;
        if (pgDataDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), pgDataDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PgDataDTO{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", longLabel='" + getLongLabel() + "'" +
            ", shortLabel='" + getShortLabel() + "'" +
            ", comment='" + getComment() + "'" +
            ", active='" + isActive() + "'" +
            "}";
    }
}
