package JDBCteamProject.vo;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode

public class PlaceAdressVo {
    private int address_seq;
    private String address;
    private int place_seq;

}
