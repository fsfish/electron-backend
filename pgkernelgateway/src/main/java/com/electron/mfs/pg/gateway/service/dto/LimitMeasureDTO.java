package com.electron.mfs.pg.gateway.service.dto;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.electron.mfs.pg.gateway.domain.LimitMeasure} entity.
 */
public class LimitMeasureDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 100)
    private String label;

    @NotNull
    private Boolean active;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

        LimitMeasureDTO limitMeasureDTO = (LimitMeasureDTO) o;
        if (limitMeasureDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), limitMeasureDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "LimitMeasureDTO{" +
            "id=" + getId() +
            ", label='" + getLabel() + "'" +
            ", active='" + isActive() + "'" +
            "}";
    }
}
