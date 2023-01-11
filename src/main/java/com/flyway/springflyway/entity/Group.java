package com.flyway.springflyway.entity;


import lombok.*;
import javax.persistence.*;
import java.util.Objects;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "savinggroup")
public class Group {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "number")
    private String number;

    @Column(name = "logo_index")
    private Integer logoIndex;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "location_lat")
    private Double locationLat;

    @Column(name = "location_long")
    private Double locationLong;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "govt_reg_number")
    private String govtRegNumber;

    @Column(name = "partner_id")
    private String partnerId;

    @Column(name = "type")
    private Integer type;

    @Column(name = "previous_cycles")
    private Integer previousCycles;

    @Column(name = "disabled")
    private Boolean disabled;

    @Column(name = "app_version")
    private String appVersion;

    @Column(name = "new_col_1")
    private String newCol1;

    @Column(name = "new_col_2")
    private String newCol2;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Group group = (Group) o;
        return logoIndex == group.logoIndex && id.equals(group.id) && Objects.equals(number, group.number) && Objects.equals(name, group.name) && Objects.equals(location, group.location) && Objects.equals(locationLat, group.locationLat) && Objects.equals(locationLong, group.locationLong) && Objects.equals(countryCode, group.countryCode) && Objects.equals(govtRegNumber, group.govtRegNumber) && Objects.equals(partnerId, group.partnerId) && Objects.equals(type, group.type) && Objects.equals(previousCycles, group.previousCycles) && Objects.equals(disabled, group.disabled) && Objects.equals(appVersion, group.appVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, number, logoIndex, name, location, locationLat, locationLong, countryCode, govtRegNumber, partnerId, type, previousCycles, disabled, appVersion);
    }
}