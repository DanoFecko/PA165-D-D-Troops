package cz.muni.fi.pa165.w2018.dndtroops.api.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * DTO form storing searched name
 *
 * @author MArek Valko
 */
public class SearchNameDTO {
    @NotNull
    @Size(min=1)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SearchNameDTO)) return false;
        SearchNameDTO that = (SearchNameDTO) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
